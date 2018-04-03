
package buttonprojcet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class ButtonProjcet extends Application{
public void start(Stage primaryStage){
    StackPane pane=new StackPane();
    pane.setId("pane");
    Button button=new Button("Bangladesh");
    button.setPrefSize(200.10, 80.1);
    
    button.setOnAction(e->Divison.display("Division")); 
    
    pane.getChildren().add(button);
   
    button.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC, 32));
    pane.setStyle("-fx-background-color:#006A4E");
    Scene scene=new Scene(pane,960,600);
    scene.getStylesheets().addAll(this.getClass().getResource("Bangladesh.css").toExternalForm());
    primaryStage.setTitle("Bangladesh Details");
    primaryStage.setScene(scene);
    primaryStage.show();
    
}
    
    public static void main(String[] args) {
       Application.launch(args);
    }
    
}
