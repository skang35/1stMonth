package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ClientGUI extends Application
{

private Label label;
private TextField tf;
private TextField tfServer, tfPort;
private Button login, logout, whoIsIn;
private TextArea ta;
private boolean connected;
private Client client;
private int defaultPort = 1500;
private String defaultHost = "192.168.1.21";

final HBox hb = new HBox();
final HBox hb2 = new HBox();
final HBox hb3 = new HBox();

final VBox vbox = new VBox();
final VBox vbox2 = new VBox();


public static void main(String[] args) {
    launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {

    Scene scene = new Scene(new Group());
    primaryStage.setTitle("Client GUI");
    primaryStage.setWidth(740);
    primaryStage.setHeight(400);


    Label hostLabel = new Label("Server Address");
    hostLabel.setFont(new Font("Arial", 12));
    TextField localHost = new TextField();
    localHost.setPromptText("Server Address");
    localHost.setEditable(true);
    tfServer = localHost;


    final TextField portNo = new TextField();
    Label portLabel = new Label("Port Number");
    portLabel.setFont(new Font("Arial", 12));
    portNo.setPromptText("Port No ");
    portNo.setEditable(true);
    tfPort = portNo;

    final TextField userName = new TextField();
    Label userLabel = new Label("Nick Name");
    userLabel.setFont(new Font("Arial", 12));
    userName.setPromptText("Nick Name");
    userName.setEditable(true);



    final Button loginButton = new Button("Login");
    this.login = loginButton;
    loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username = tf.getText().trim();
                if(username.length() == 0)
                    return;
                String server = tfServer.getText().trim();
                if(server.length() == 0)
                    return;
                String portNumber = tfPort.getText().trim();
                if(portNumber.length() == 0)
                    return;
                int port = 0;
                try {
                    port = Integer.parseInt(portNumber);
                }
                catch(Exception en) {
                    return; 
                }

                if(!client.start()) 
                    return;
                tf.setText("");
                label.setText("Enter your message below");
                connected = true;
            }
        });

    final Button logoutButton = new Button("logout");
    this.logout = logoutButton;
    logoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                client.sendMessage(new ChatMessage(ChatMessage.LOGOUT, ""));
                return;
            }
        });

    final Button whoIsIn = new Button("whoIsIn");
    this.whoIsIn = whoIsIn;
    whoIsIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                client.sendMessage(new ChatMessage(ChatMessage.WHOISIN, ""));               
                return;
            }
        });


    final Button sendButton = new Button("Send");
    sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                client.sendMessage(new ChatMessage(ChatMessage.MESSAGE, tf.getText()));             
                tf.setText("");
                return;
            }
        });

    final TextField chatMessage = new TextField();
    chatMessage.setPromptText("Enter Your Chat Message Here");

    final TextArea chatRoom = new TextArea();
    chatRoom.setPromptText("Welcome to the Chat room");
    chatRoom.setEditable(false);

    hb.setSpacing(3);
    hb.setPadding(new Insets(10, 0, 0, 10));
    hb.getChildren().addAll(hostLabel, localHost, portLabel, portNo, userLabel, userName);

    hb2.setSpacing(5);
    hb2.setPadding(new Insets(10, 0, 0, 10));
    hb2.getChildren().addAll(loginButton, logoutButton, whoIsIn);

    hb3.setSpacing(5);
    hb3.setPadding(new Insets(10, 0, 0, 10));
    hb3.getChildren().addAll(chatMessage, sendButton);

    vbox.setSpacing(5);
    vbox.setPadding(new Insets(10, 0, 0, 10));
    vbox.getChildren().addAll(hb3, chatRoom);

    vbox2.setSpacing(5);
    vbox2.setPadding(new Insets(10, 0, 0, 10));
    vbox2.getChildren().addAll(hb, vbox, hb2);


    ((Group) scene.getRoot()).getChildren().addAll(vbox2);

    primaryStage.setScene(scene);
    primaryStage.show();
}


void append(String str) {
    ta.appendText(str);
    ta.positionCaret(ta.getText().length() - 1);
}
void connectionFailed() {
    login.setDisable(false);
    logout.setDisable(true);
    whoIsIn.setDisable(true);
    label.setText("Enter your username below");
    tf.setText("Anonymous");
    tfPort.setText("" + defaultPort);
    tfServer.setText(defaultHost);
    tfServer.setEditable(false);
    tfPort.setEditable(false);
    connected = false;
}

}