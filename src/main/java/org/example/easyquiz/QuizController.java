package org.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class QuizController {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    public void initialize() {
        loadQuestions();
    }

    private void loadQuestions() {
        if (counter == 0) {
            question.setText("1. What is the correct way to declare a variable to store an integer value in Java?");
            opt1.setText("int num;");
            opt2.setText("integer num;");
            opt3.setText("num int;");
            opt4.setText("number int;");
        }  else if (counter == 1) {
            question.setText("2. Which of the following is the correct syntax for a for loop in Java?");
            opt1.setText("for (i = 0; i < 10; i++)");
            opt2.setText("for (int i = 0; i < 10; i++)");
            opt3.setText("for int (i = 0; i < 10; i++)");
            opt4.setText("for (int i = 0, i < 10, i++)");
        } else if (counter == 2) {
            question.setText("3. Which of the following methods is used to print something to the console in Java?");
            opt1.setText("System.out.print()");
            opt2.setText("System.print()");
            opt3.setText("print.console()");
            opt4.setText("console.print()");
        }else if (counter == 3) {
            question.setText("4. Which of the following is a valid Java data type?");
            opt1.setText("integer");
            opt2.setText("float");
            opt3.setText("double precision");
            opt4.setText("number int;");
        } else if (counter == 4) {
            question.setText("5. Which of the following is the keyword used to create a new object in Java?");
            opt1.setText("create");
            opt2.setText("new");
            opt3.setText("construct");
            opt4.setText("make");
        }
    }

    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct++;
        } else {
            wrong++;
        }

        if (counter == 4) {
            try{
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
            }

        } else {
            counter++;
            loadQuestions();
        }
    }

    boolean checkAnswer(String answer) {
        if (counter == 0 && answer.equals("int num;")) {
            return true;
        } else if (counter == 1 && answer.equals("for (int i = 0; i < 10; i++)")) {
            return true;
        } else if (counter == 2 && answer.equals("System.out.print()")) {
            return true;
        } else if (counter == 3 && answer.equals("float")) {
            return true;
        } else {
            return false;
        }
    }


    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct++;
        } else {
            wrong++;
        }

        if (counter == 4) {
            try{
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
            }

        } else {
            counter++;
            loadQuestions();
        }

    }
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct++;
        } else {
            wrong++;
        }

        if (counter == 4) {
            try{
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
            }

        } else {
            counter++;
            loadQuestions();
        }

    }
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct++;
        } else {
            wrong++;
        }

        if (counter == 4) {
            try{
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
            }

        } else {
            counter++;
            loadQuestions();
        }

    }

}