package application;

import com.sun.security.ntlm.Client;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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



public class ServerGUI extends Application {

final HBox hb = new HBox();

final VBox vbox = new VBox();
final VBox vbox2 = new VBox();

private Button stopStart;
private TextArea chat, event;
private TextField tPortNumber;
private Server server;

final ObservableList<Client> data = FXCollections.observableArrayList();
final ObservableList<String> names = FXCollections.observableArrayList();


public static void main(String[] args) {
    launch(args);
}


@Override
public void start(Stage primaryStage) throws Exception {

    Scene scene = new Scene(new Group());
    primaryStage.setTitle("Server GUI");
    primaryStage.setWidth(530);
    primaryStage.setHeight(490);



    final TextField portNo = new TextField();
    Label portLabel = new Label("Port Number");
    portLabel.setFont(new Font("Arial", 12));
    portNo.setPromptText("Port No ");
    portNo.setEditable(true);

    final Button startandStop = new Button("Start");
    startandStop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                startStopButton() ;

            }
        });

    final TextArea chatArea = new TextArea();
    chatArea.setPromptText("Chat Room");
    chatArea.setEditable(false);


    final TextArea eventLog = new TextArea();
    eventLog.setPromptText("Event Log");
    eventLog.setEditable(false);
    eventLog.setScrollTop(100);

    hb.setSpacing(3);
    hb.setPadding(new Insets(10, 0, 0, 10));
    hb.getChildren().addAll(portLabel, portNo, startandStop);
    hb.setCenterShape(true);

    vbox.setSpacing(5);
    vbox.setPadding(new Insets(10, 0, 0, 10));
    vbox.getChildren().addAll(chatArea, eventLog);

    vbox2.setSpacing(5);
    vbox2.setPadding(new Insets(10, 0, 0, 10));
    vbox2.getChildren().addAll(hb,vbox);


    ((Group) scene.getRoot()).getChildren().addAll(vbox2);

    primaryStage.setScene(scene);
    primaryStage.show();
}


    public void startStopButton(){
        if(server != null) {
            server.stop();
            server = null;
            stopStart.setText("Start");
            return;
        }  
        int port;
        try {
            port = Integer.parseInt(tPortNumber.getText().trim());
        }
        catch(Exception er) {
            appendEvent("Invalid port number");
            return;
        }
        server = new Server(port, this);
        new ServerRunning().start();
        stopStart.setText("Stop");
        tPortNumber.setEditable(false);
    }


void appendRoom(String str) {
    chat.appendText(str);
    chat.positionCaret(chat.getText().length() - 1);
}

void appendEvent(String str) {
        event.appendText(str);
        event.positionCaret(chat.getText().length() - 1);
}

class ServerRunning extends Thread {
    public void run() {
        server.start();       
        stopStart.setText("Start");
        tPortNumber.setEditable(true);
        appendEvent("Server crashed\n");
        server = null;
    }
}

}