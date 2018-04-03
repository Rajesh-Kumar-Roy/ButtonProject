
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


public class Gazipur {
    public static void upazila(){
    Stage stage=new Stage();
    stage.initModality(Modality.APPLICATION_MODAL);
  
    Label l1=new Label();
    l1.setText("Gazipur");
   Text t = new Text (10, 20, "Upozila");
   
    t.setFill(Color.ROYALBLUE);
    t.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
    Label l2=new Label("Kaliakair");
    Label l3=new Label("Kaliganj");
    Label l4=new Label("Kapasia");
    Label l5=new Label("Tongi");
    Label l6=new Label("Sreepur");
  
    l1.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     l2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      l3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       l4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        l5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        l6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        
        
     
    VBox layout=new VBox();
       
    
    
   
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#FF8C00");
  layout.getChildren().addAll(t,l1,l2,l3,l4,l5,l6); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Gazipur District");
    stage.setScene(scene);
    stage.showAndWait();
    
}
}
