
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


public class Rajshahi {
    public static void district(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Bogra");
        Button b2=new Button("Chapainawabganj");
         Button b3=new Button("Joypurhat");
          Button b4=new Button("Naogaon");
           Button b5=new Button("Natore");
            Button b6=new Button("Pabna");
             Button b7=new Button("Rajshahi");
              Button b8=new Button("Sirajganj");
              Button b9=new Button("Close");
              b1.setOnAction(e->Bogra.upozila());
                  b2.setOnAction(e->Chapainawabganj.upozila());
                  b3.setOnAction(e->Joypurhat.upozila());
                  b4.setOnAction(e->Naogaon.upozila());
                  b5.setOnAction(e->Natore.upozila());
                  b6.setOnAction(e->Pabna.upozila());
                  b7.setOnAction(e->Rajshahiup.upozila());
                  b8.setOnAction(e->Sirajganj.upozila());
              b1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
            b2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 17));
              b3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
              b4.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
              b5.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b6.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,25));
              b7.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b8.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,20));
              b1.setPrefSize(160, 55);
           b2.setPrefSize(160, 55);
             b3.setPrefSize(160, 55);
               b4.setPrefSize(160, 55);
                 b5.setPrefSize(160, 55);
                   b6.setPrefSize(160, 55);
                     b7.setPrefSize(160, 55);
                       b8.setPrefSize(160, 55);
                       b9.setPrefSize(80, 30);
                       b9.setOnAction(e->stage.close());
                     
              VBox layout=new VBox();
               Label label=new Label("District");
               label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,90));
              layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9);              
              layout.setSpacing(8);             
              layout.setStyle("-fx-background-color:yellow");
              layout.setAlignment(Pos.CENTER);
              Scene scene=new Scene(layout,960,800);
              stage.setTitle("Details About Rajshahi");
              stage.setScene(scene);
              stage.show();
              
           
        
    }
}
