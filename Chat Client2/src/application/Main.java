package application;

import java.awt.Insets;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.graalvm.compiler.phases.common.NodeCounterPhase.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import jdk.tools.jlink.internal.Platform;

// CLIENT 2
public class Main extends Application {

	Socket socket;
	TextArea textArea;

	// �겢�씪�씠�뼵�듃 �봽濡쒓렇�옩 �룞�옉 硫붿냼�뱶(�뼱�뼡 IP濡�, �뼱�뼡 port濡� �젒�냽�븷吏� �젙�븳�떎)
	public void startClient(String IP, int port) {
		// �뒪�젅�뱶 媛앹껜 �깮�꽦
		Thread thread = new Thread() {
			public void run() {
				try {
					// socket 珥덇린�솕
					socket = new Socket(IP, port);
					receive();
				}catch(Exception e) {
					// �삤瑜섍� �깮湲대떎硫�
					if(!socket.isClosed()) {
						stopClient();
						System.out.println("[�꽌踰� �젒�냽�떎�뙣]");
						Platform.exit();
					}
				}
			}
		};
		thread.start();
	}

	// �겢�씪�씠�뼵�듃 �봽濡쒓렇�옩 醫낅즺 硫붿냼�뱶
	public void stopClient() {
		try {
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// �꽌踰꾨줈遺��꽣 硫붿꽭吏�瑜� �쟾�떖諛쏅뒗 硫붿냼�뱶
	public void receive() {
		// �꽌踰� �봽濡쒓렇�옩�쑝濡쒕��꽣 硫붿꽭吏�瑜� 怨꾩냽 �쟾�떖 諛쏆쓣 �닔 �엳�룄濡�
		while (true) {
			try {
				// �꽌踰꾨줈遺��꽣 硫붿꽭吏�瑜� �쟾�떖諛쏆쓣 �닔 �엳�룄濡�
				InputStream in = socket.getInputStream();
				byte[] buffer = new byte[512];
				int length = in.read(buffer);
				if(length == -1)
					throw new IOException();
				String message = new String(buffer, 0, length, "UTF-8");
				Platform.runLater(() -> {
					// textArea�뒗 gui�슂�냼以� �븯�굹濡� �솕硫댁뿉 �뼱�뼚�븳 硫붿꽭吏�瑜� �엯�젰諛쏆븯�뒗吏� 異쒕젰�빐 二쇰뒗 �슂�냼

					textArea.appendText(message);
				});	
			}catch(Exception e) {
				stopClient();
				break;
			}
		}
	}	

	// �꽌踰꾨줈 硫붿꽭吏�瑜� �쟾�넚�떆�궎�뒗 硫붿냼�뱶
	public void send(String message) {
		Thread thread = new Thread() {
			public void run() {
				try {
					OutputStream out = socket.getOutputStream();
					byte[] buffer = message.getBytes("UTF-8");
					out.write(buffer);
					out.flush();
				}catch(Exception e) {
					stopClient();
				}
			}
		};
		thread.start();
	}
	// �떎�젣濡� �봽濡쒓렇�옩�쓣 �룞�옉�떆�궎�뒗 硫붿꽌�뱶
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));

		HBox hbox = new HBox();
		hbox.setSpacing(5);

		TextField userName = new TextField();
		userName.setPrefWidth(150);
		userName.setPromptText("�땳�꽕�엫�쓣 �엯�젰�븯�꽭�슂");
		HBox.setHgrow(userName, Priority.ALWAYS);

		// �꽌踰꾩뿉 ip 二쇱냼媛� �뱾�뼱媛� �닔 �엳�룄濡�
		TextField IPText = new TextField("192.168.1.16");
		TextField portText = new TextField("9876");
		portText.setPrefWidth(80);

		hbox.getChildren().addAll(userName, IPText, portText);
		root.setTop(hbox);

		textArea = new TextArea();
		textArea.setEditable(false);
		root.setCenter(textArea);

		TextField input = new TextField();
		input.setPrefWidth(Double.MAX_VALUE);
		input.setDisable(true);

		input.setOnAction(event -> {
			send(userName.getText() + ": " + input.getText() + "\n");
			input.setText("");
			input.requestFocus();
		});
		Button sendButton = new Button("蹂대궡湲�");
		sendButton.setDisable(true);

		sendButton.setOnAction(event -> {
			send(userName.getText() + ":" + input.getText() + "\n");
			input.setText("");
			input.requestFocus();
		});
		Button connectionButton = new Button("�젒�냽�븯湲�");
		connectionButton.setOnAction(event -> {
		if(connectionButton.getText().equals("�젒�냽�븯湲�") ) {
				int port = 9876;
				try {
					port = Integer.parseInt(portText.getText());
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				startClient(IPText.getText(), port);
				Platform.runLater(() -> {
					textArea.appendText("[梨꾪똿諛� �젒�냽]\n");
				});
				connectionButton.setText("醫낅즺�븯湲�");
				input.setDisable(false);
				input.requestFocus();
			}else {
				stopClient();
				Platform.runLater(() -> {
					textArea.appendText("[梨꾪똿諛� �눜�옣]");
				});
					connectionButton.setText("�젒�냽�븯湲�");
					input.setDisable(true);
					sendButton.setDisable(true);
				}
			});
				BorderPane pane = new BorderPane();
				pane.setLeft(connectionButton);
				pane.setCenter(input);
				pane.setRight(sendButton);

				root.setBottom(pane);
				Scene scene = new Scene(root, 500, 500);
				primaryStage.setTitle("[梨꾪똿 �겢�씪�씠�뼵�듃] ");
				primaryStage.setScene(scene);
				primaryStage.setOnCloseRequest(event -> stopClient());
				primaryStage.show();

				connectionButton.requestFocus();
		
		}	
	
		// �봽濡쒓렇�옩�쓽 吏꾩엯�젒
		public static void main(String[] args) {
			launch(args);
		}

}