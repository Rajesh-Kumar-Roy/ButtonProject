
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

public class District {
    public static void dhaka(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        
      Button b1=new Button("Dhaka");
        
       Button b2=new Button("Gazipur") ; 
    Button b3=new Button("Kishoreganj");
    Button b4 =new Button("Manikganj");
    Button b5=new Button ("Munshiganj");
    Button b6=new Button("Narayanganj");
       Button b7=new Button("Narsingdi");
          Button b8=new Button("Tangail");
             Button b9=new Button("Faridpur");
                Button b10=new Button("Gopalganj");
                   Button b11=new Button("Madaripur");
                      Button b12=new Button("Rajbari");
                         Button b13=new Button("Shariatpur");
         b1.setOnAction(e->Dhaka.upozila());                  
     b2.setOnAction(e->Gazipur.upazila());
       b3.setOnAction(e->Kishoreganj.upozila());
       b4.setOnAction(e->Manikganj.upozila());
   b5.setOnAction(e->Munshiganj.upozila());
   b6.setOnAction(e->Narayanganj.upozila());
   b7.setOnAction(e->Narsingdi.upozila());
   b8.setOnAction(e->Tangail.upozila());
   b9.setOnAction(e->Faridpur.upozila());
   b10.setOnAction(e->Gopalganj.upozila());
   b11.setOnAction(e->Madaripur.upozila());
   b12.setOnAction(e->Rajbari.upozila());
   b13.setOnAction(e->Shariatpur.upozila());
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
    b13.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
   b1.setPrefSize(100, 37);
    b2.setPrefSize(100, 37);
    b3.setPrefSize(100, 37);
    b4.setPrefSize(100, 37);
    b5.setPrefSize(100, 37);
    b6.setPrefSize(100, 37);
    b7.setPrefSize(100, 37);
    b8.setPrefSize(100, 37);
    b9.setPrefSize(100, 37);    b11.setPrefSize(100, 37);
    b10.setPrefSize(100, 37);
    b12.setPrefSize(100, 37);
    b13.setPrefSize(100, 37);

    VBox layout=new VBox();
    
    Label label=new Label("District");
    label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,90));
    layout.setStyle("-fx-background-color:#336699;");
    layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13);
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(7);
    Scene scene =new Scene(layout,900,650);
 

    stage.setScene(scene);
    stage.showAndWait();
    }
}
