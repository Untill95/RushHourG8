package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    //für Startseite:

    //zum öffnen der Optionen

    public void press_start ( ActionEvent actionEvent ) throws IOException {
        Parent fieldParent = FXMLLoader.load(getClass().getResource("Spielfeld_leer.fxml"));
        Scene fieldScene = new Scene (fieldParent);

        Stage fenster = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        fenster.setScene(fieldScene);
        fenster.show();
    }

        //Methode zum öffnen der Regenl

    public void press_rules ( ActionEvent actionEvent ) throws IOException {
        Parent regelnParent = FXMLLoader.load(getClass().getResource("Regeln.fxml"));
        Scene regelnScene = new Scene(regelnParent);

        Stage fenster = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        fenster.setScene(regelnScene);
        fenster.show();
        }

        // Methode zum öffnen des Impressums

    public void press_imprint ( ActionEvent actionEvent ) throws IOException {
        Parent imprParent = FXMLLoader.load(getClass().getResource("Impressum.fxml"));
        Scene imprScene = new Scene(imprParent);

        Stage fenster = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        fenster.setScene(imprScene);
        fenster.show();
    }

    //zum öffnen der Optionen

    public void press_option ( ActionEvent actionEvent ) throws IOException {
        Parent optionParent = FXMLLoader.load(getClass().getResource("Optionen.fxml"));
        Scene optionScene = new Scene(optionParent);

        Stage fenster = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        fenster.setScene(optionScene);
        fenster.show();
    }

    // zurück für Regeln

    public void press_back ( ActionEvent actionEvent ) throws IOException {
        Parent startParent = FXMLLoader.load(getClass().getResource("Startseite.fxml"));
        Scene startScene = new Scene(startParent);

        Stage fenster = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        fenster.setScene(startScene);
        fenster.show();
    }




}











