package sample;

import java.util.concurrent.ThreadLocalRandom;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    @FXML
    private ListView <randomNumbers> numListView;
    @FXML
    private TextField minNumTextField;
    @FXML
    private TextField maxNumTextField;
    @FXML
    private Label RandomNumbers;

    @Override
    //had issues creating the initialize method.
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*numListView.getSelectionModel().selectedItemProperty().addListener((ObservableValue < ? extends randomNumbers>)->){
            randomNumbers itemSelected = numListView.getSelectionModel().getSelectedItem().addListener();

        }*/


    }
    //Method that creates random number and puts it into the table:
    public void runButtonClicked(){

        int randomInt = ThreadLocalRandom.current().nextInt(1,52);
        randomNumbers newRandNum = new randomNumbers(minNumTextField.getText(), maxNumTextField.getText());
        numListView.getItems().add(newRandNum);
    }

    //Method to upload random number table to AWS database:
    public void loadButtonClicked(){


    }

    //Code to connect to AWS database:
    final String hostname = "exam1-coding-db.c705kd7ezyfn.us-east-1.rds.amazonaws.com";
    final String dbName = "exam1db";
    final String port = "3306";
    final String userName ="dherna44";
    final String password = "whwi189h$1!qy";
    final String AWS_URL = "jdbc:mysql://"+hostname+":"+port+"/"+dbName+"?user="+userName +"&password="+password;

}
