/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class AdminController implements Initializable {

    @FXML
    private WebView website;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          final WebEngine web = website.getEngine();
        String urlweb = "http://www.google.com";
        web.load(urlweb);
        // TODO
    }    

    @FXML
    private void save_teacher(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
         FXMLLoader(getClass().getResource("SaveTeacherInfo.fxml"));
           Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new AdminController.scene(root2));
          stage.setTitle("Creative Campus");
          stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
      FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("MainMenu.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new AdminController.scene(root2));
           stage.setTitle("Creative Campus");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();  
    }

    @FXML
    private void webbutton(ActionEvent event) {
        final WebEngine web = website.getEngine();
        String urlweb = "http://www.youtube.com";
        web.load(urlweb);
    }
    private static class scene extends Scene {

        public scene(Parent root1) {
            super(root1);
        }
    }
}
