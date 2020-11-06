package application;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import javafx.application.Application;


public class Client {
	
	// 소켓이 있어야지 클라언트와 네트워크상에서 통신할 수 있음.
	Socket socket;
	
	// 생성자 생성
	public Client(Socket socket) {
		this.socket = socket;
		
		receive();
	}
	// 클라이언트로부터 메세지를 전달받는 메소드.
	public void receive() {
		// 작업 생성은 Runnable 인터페이스를 사용한다 run()메서드는 리턴값이 없다.
		
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				try {
					// 반복적으로 클라이언트에게 내용을 받을 수 있도록 while문 생성
					while(true) {
						// 어떤 내용을 전달 받을 수 있도록 inputStream객체 사용
						InputStream in = socket.getInputStream();
						
						// 버퍼를 사용해 한번에 512byte까지 받을 수 있도록 설정
						byte[] buffer = new byte[512]; // 512개의 byte를 받는다.
						// 메세지의 크기
						int length = in.read(buffer);
						
						while(length == -1) throw new IOException(); // 예외 처리
						
						System.out.println("[메세지 수신 성공]"
											+ socket.getRemoteSocketAddress()
											+ ":" + Thread.currentThread().getName());
						// 전달받은 값을 한글도 포함 할 수 있도록 UTF-8 설정
						
						String message = new String(buffer, 0, length, "UTF-8");
						
						// 전달받은 메세지를 다른 클라이언트들에게 보낼 수 있도록 만들어 줍니다.
						
						for(Client client : Main.clients) {
								client.send(message);
						} // for:48
					}//while: 28
				}// try: 26 
				catch(Exception e) {
						try {
							System.out.println("메세지 수신 오류}"
									+ socket.getRemoteSocketAddress()
									+ ":" + Thread.currentThread().getName());		
						}// try: 54
						catch(Exception e2) {
							e2.printStackTrace();
						}
				}// catch: 53
			}//run: 25
		};//Runnable: 23
		// 메인함수에 있는 스레드풀에 서밋을 해줍니다.
		// 즉 스레드풀에 만들어진 하나의 스레드를 등록
		Main.threadPool.submit(thread);
	} //receive(): 20
	
	// 클라이언트에게 메세지를 전송하는 메소드
	public void send(String message) {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				try {
					OutputStream out = socket.getOutputStream();
					byte[] buffer = message.getBytes("UTF-8");
					// 버퍼에 담긴 내용을 서버에서 클라이언트에게 전송
					
						out.write(buffer);
						out.flush();
				}// try 75
				catch(Exception e) {
					try {
						System.out.println("[메세지 송수신 오류}"
								+ socket.getRemoteSocketAddress()
									+ ":" + Thread.currentThread().getName());
						Main.clients.remove(Client.this);
						socket.close();
					} // try 84
					catch(Exception e2) {
						e2.printStackTrace();
					}// catch 91
				}//catch 83
			}//run:74
		};//Runnable : 72
		Main.threadPool.submit(thread);
	}// send:70
}



