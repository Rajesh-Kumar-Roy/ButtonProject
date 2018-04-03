
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


public class Dinajpur {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Dinajpur Sadar");
             Label label2=new Label("Birampur");
              Label label3=new Label("Biral");
               Label label4=new Label("Phulbari");
                Label label5=new Label("Hakimpur");
                Label label6=new Label("Khansama");
                Label label7=new Label("Nawabganj");
                Label label8=new Label("Parbatipur");
                Label label9=new Label("Birganj");
                Label label10=new Label("Kaharole");
                Label label11=new Label("Chirirbandar");
                Label label12=new Label("Ghoraghat");
                Label label13=new Label("Bochaganj");
             
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
               label10.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                 label11.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                 label12.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                 label13.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                
                      
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#66FF00");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13); 
  
    Scene scene=new Scene(layout,990,650);
 
    stage.setTitle("Details About Dinajpur District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}
