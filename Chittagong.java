
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


public class Chittagong {
     public static void district(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
      Button b1=new Button("Brahmanbaria");
        
       Button b2=new Button("Comilla") ; 
    Button b3=new Button("Chandpur ");
    Button b4 =new Button("Lakshmipur" );
    Button b5=new Button ("Noakhali");
    Button b6=new Button("Feni");
       Button b7=new Button("Khagrachhari");
          Button b8=new Button("Rangamati");
             Button b9=new Button("Bandarban");
                Button b10=new Button("Chittagong");
                   Button b11=new Button("Cox's Bazar");
                      
                         Button b12=new Button("close");
                           
                               
                
   
    b1.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b2.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b3.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b4.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b5.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b6.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b7.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b8.setFont(Font.font("Times New ROman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b9.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b10.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b11.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b12.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
   
   b1.setPrefSize(110, 37);
    b2.setPrefSize(110, 37);
    b3.setPrefSize(110, 37);
    b4.setPrefSize(110, 37);
    b5.setPrefSize(110, 37);
    b6.setPrefSize(110, 37);
    b7.setPrefSize(110, 37);
    b8.setPrefSize(110, 37);
    b9.setPrefSize(110, 37);    b11.setPrefSize(100, 37);
    b10.setPrefSize(110, 37);
    b12.setPrefSize(100, 37);
   b12.setOnAction(e->stage.close());

    VBox layout=new VBox();
    
    Label label=new Label("District");
    label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,80));
    layout.setStyle("-fx-background-color:#54626F;");
    layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12);
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(6);
    Scene scene =new Scene(layout,900,650);
    stage.setTitle("Division Details");
    stage.setScene(scene);
    stage.showAndWait();
}}
