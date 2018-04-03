
package buttonprojcet;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Mymensingh {
     public static void district(){
        Stage stage =new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Jamalpur");
        Button b2 =new Button("Mymensingh");
        Button b3=new Button("Sherpur");
        Button b4=new Button("Netrokona");
       
        Button b7=new Button("Close");
        b1.setPrefSize(200,55);
                b2.setPrefSize(200,55);
                        b3.setPrefSize(200,55);
                                b4.setPrefSize(200,55);
                                 
                                   b7.setPrefSize(160,55);
                             b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
   
        b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,25));
      b7.setOnAction(e->stage.close());
        
        Label label=new Label("District");

        VBox layout=new VBox();
        
         label.setFont(Font.font("Times New Roman", FontWeight.BLACK,FontPosture.ITALIC, 90));
         layout.setSpacing(9);
         layout.setStyle("-fx-background-color:#D1001C;");
        layout.getChildren().addAll(label,b1,b2,b3,b4,b7);
        layout.setAlignment(Pos.CENTER);
        Scene scene=new Scene(layout,960,600);
        stage.setTitle("Details About Mymensingh");
        stage.setScene(scene);
        stage.showAndWait();
}
}
