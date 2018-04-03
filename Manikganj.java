
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


public class Manikganj {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Manikganj Sadar");
             Label label2=new Label("Singair");
              Label label3=new Label("Daulatpur");
               Label label4=new Label("Saturia");
                Label label5=new Label("Ghior");
                Label label6=new Label("Shivalaya");
                Label label7=new Label("Harirampur");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
         label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
          label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#00ffbf");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Manikganj District");
    stage.setScene(scene);
    stage.showAndWait();
    
        
    }
}
