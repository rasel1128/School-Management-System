/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class SaveTeacherInfoController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField teacher_id;
    @FXML
    private TextField designation;
    @FXML
    private TextField qualification;
    @FXML
    private TextField phone;
    @FXML
    private TextField email;
    @FXML
    private TextField dept;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void home(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("MainMenu.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new SaveTeacherInfoController.scene(root2));
           stage.setTitle("Creative Campus");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Admin.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new SaveTeacherInfoController.scene(root2));
           stage.setTitle("Creative Campus");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void save(ActionEvent event) {
         final String FNAME =teacher_id.getText();
		ArrayList<String> list_copy = new ArrayList<>();
                String text1 = name.getText();
                String text2 = teacher_id.getText();
                 String text3 = designation.getText();
                String text4 = qualification.getText();
                String text5 = phone.getText();
                 String text6 = email.getText();
                String text7 =dept.getText();
		list_copy.add (text1);
		list_copy.add (text2);
                list_copy.add (text3);
               
		list_copy.add (text4);
               
                list_copy.add (text5);
               
		list_copy.add (text6);
               
                list_copy.add (text7);
                
		try ( BufferedWriter bw = 
				new BufferedWriter (new FileWriter (FNAME)) ) 
		{			
			for (String line : list_copy) {
				bw.write (line + "\n");
			}
			
			bw.close ();
			
		} catch (IOException e) {
		} 
    }
    private static class scene extends Scene {

        public scene(Parent root1) {
            super(root1);
        }
    }
}
