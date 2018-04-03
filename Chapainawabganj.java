
package buttonprojcet;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Chapainawabganj {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Chapai Nawabganj Sadar");
             Label label2=new Label("Nachole");
              Label label3=new Label("Shibganj");
               Label label4=new Label("Gomastapur");
                Label label5=new Label("Bholahat");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#F0F8FF");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Chapainawabganj District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}
