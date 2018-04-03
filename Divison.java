
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


public class Divison {
    public static void  display(String a){
       
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL); 
      
     
        stage.setTitle("Bangladesh Details");
       
         Label label=new Label(a);
        
         Button b1=new Button("Dhaka");
         Button b2=new Button("Rajshahi");
         
         Button b3=new Button("Barsal");
          Button b4=new Button("Rangpur");
           Button b5=new Button("khulna");
           Button b6=new Button("Chittagong");
           Button b7=new Button("Sylhet");
           Button b8=new Button("Mymensingh");
            Button button =new Button(" close ");
            b1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
            b2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
              b3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
              b4.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
              b5.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b6.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,25));
              b7.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b8.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,20));
              button.setFont(Font.font("Times New Roma",FontWeight.SEMI_BOLD,FontPosture.ITALIC,20));
              b1.setOnAction(e->District.dhaka());
              b2.setOnAction(e->Rajshahi.district());
              b3.setOnAction(e->Barsal.district());
              b4.setOnAction(e->Rangpur.district());
              b5.setOnAction(e->Khulna.distric());
              b6.setOnAction(e->Chittagong.district());
              b7.setOnAction(e->Sylhet.district());
              b8.setOnAction(e->Mymensingh.district());
         button.setOnAction(e->stage.close());
         b1.setPrefSize(160, 55);
           b2.setPrefSize(160, 55);
             b3.setPrefSize(160, 55);
               b4.setPrefSize(160, 55);
                 b5.setPrefSize(160, 55);
                   b6.setPrefSize(160, 55);
                     b7.setPrefSize(160, 55);
                       b8.setPrefSize(160, 55);
                       
         label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.REGULAR,100));
         VBox layout=new VBox(10);
         layout.setStyle("-fx-background-color:blue;");
         button.setAlignment(Pos.BOTTOM_RIGHT);
         layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,button);
         layout.setAlignment(Pos.CENTER);
         Scene scene=new Scene(layout,960,690);
         stage.setScene(scene);
         stage.showAndWait();
}}
