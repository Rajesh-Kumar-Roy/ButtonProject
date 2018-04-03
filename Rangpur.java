
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


public class Rangpur {
    public static void district(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Thakurgaon");
        Button b2=new Button("Dinajpur");
        Button b3=new Button("Rangpur");
        Button b4=new Button("Panchagarh");
        Button b5=new Button("Nilphamari");
        Button b6=new Button("Lalmonirhat");
        Button b7=new Button("Kurigram");
        Button b8=new Button("Gaibandha");
        Button b9=new Button("Close");
        b1.setOnAction(e->Thakurgaon.upozila());
        b2.setOnAction(e->Dinajpur.upozila());
        b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
         b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
          b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
           b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
            b5.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
             b6.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30)); 
              b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
               b8.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                b9.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,20));
             b9.setOnAction(e->stage.close());
                b1.setPrefSize(200, 55);
           b2.setPrefSize(200, 55);
             b3.setPrefSize(200, 55);
               b4.setPrefSize(200, 55);
                 b5.setPrefSize(200, 55);
                   b6.setPrefSize(200, 55);
                     b7.setPrefSize(200, 55);
                       b8.setPrefSize(200, 55);
                       b9.setPrefSize(90, 30);
             
        Label label=new Label("District");
        VBox layout=new VBox();
        layout.setStyle("-fx-background-color: 	#66B447;");
        layout.setAlignment(Pos.CENTER);
       layout.setSpacing(8);
        label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,90));
        layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9);
        Scene scene=new Scene(layout,960,690);
        stage.setTitle("Details About Rangpur Division ");
        stage.setScene(scene);
        stage.showAndWait();
    }
}
