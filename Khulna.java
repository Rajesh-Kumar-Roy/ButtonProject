
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


public class Khulna {
    public static void distric(){
         Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Bagerhat");
        Button b2=new Button("Chuadanga");
        Button b3=new Button("Jessore");
        Button b4=new Button("Jhenaidah");
        Button b5=new Button("Khulna");
        Button b6=new Button("Kushtia");
        Button b7=new Button("Magura");
        Button b8=new Button("Meherpur");
         Button b9=new Button("Narail");
          Button b10=new Button("Satkhira");
        Button b11=new Button("Close");
        b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
         b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
          b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
           b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
            b5.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
             b6.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27)); 
              b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
               b8.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
                b9.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,27));
                  b10.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,27));
                    b11.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,20));
             b11.setOnAction(e->stage.close());
                b1.setPrefSize(200, 55);
           b2.setPrefSize(200, 40);
             b3.setPrefSize(200, 40);
               b4.setPrefSize(200, 40);
                 b5.setPrefSize(200, 40);
                   b6.setPrefSize(200, 40);
                     b7.setPrefSize(200, 40);
                       b8.setPrefSize(200, 40);
                       b9.setPrefSize(200, 40);    
                       b10.setPrefSize(200, 40);   
                       b11.setPrefSize(150, 40);
             
        Label label=new Label("District");
        VBox layout=new VBox();
        layout.setStyle("-fx-background-color:#32AD61;");
        layout.setAlignment(Pos.CENTER);
       layout.setSpacing(7);
        label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,80));
        layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11);
        Scene scene=new Scene(layout,960,690);
        stage.setTitle("Details About Khulna Division ");
        stage.setScene(scene);
        stage.showAndWait();
    }
}
