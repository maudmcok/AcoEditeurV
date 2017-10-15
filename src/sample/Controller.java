package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import sun.rmi.runtime.Log;

import java.nio.Buffer;

public class Controller {

    StringBuilder mytext;
    StringBuffer mybuffer = new StringBuffer(); ;

    @FXML
    Label AffichageT;

    @FXML
    TextArea textInputT;



    public void btCopier_Clicked(MouseEvent mouseEvent) {
        mybuffer.append(" ");
    }

    public void btColler_Clicked(MouseEvent mouseEvent) {
        System.out.println(""+mybuffer.length());
    }

    public void btCouper_Clicked(MouseEvent mouseEvent) {
    }

    public void btSelectionner_Clicked(MouseEvent mouseEvent) {
    }

    public void btSupp_Clicked(MouseEvent mouseEvent) {
    }


    public void insetText(KeyEvent keyEvent) {
        System.out.println(  keyEvent.getText() ) ;
        mybuffer.append(""+keyEvent.getText()) ;

      // System.out.println( textInputT.getText().toString());

        //mytext.append(textInputT.getText().toString())  ;
        AffichageT.setText(""+ mybuffer.toString());
    }

    public void btDellAll_Clicked(MouseEvent mouseEvent) {

        mybuffer.delete(0,mybuffer.length() ) ;
        AffichageT.setText(""+ mybuffer.toString());
        textInputT.setText("");
    }
}
