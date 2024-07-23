package org.example.easyquiz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class ResultController {

    @FXML
    public Label remarks, marks, markstext, correcttext, wrongtext;

    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    @FXML
    private void initialize() {
        correcttext.setText("Correct answers: "+String.valueOf(QuizController.correct));
        wrongtext.setText("Incorrect answers: "+String.valueOf(QuizController.wrong));
        markstext.setText(String.valueOf(QuizController.correct) + " Marks scored");

        marks.setText(QuizController.correct + "/10");

        float correctfloat = (float) QuizController.correct / 10;
        correct_progress.setProgress(correctfloat);

        float wrongfloat = (float) QuizController.wrong / 10;
        wrong_progress.setProgress(wrongfloat);

        int correct = QuizController.correct;
        if(correct < 2) {
            remarks.setText("You've failed!");
        } else if(correct < 3) {
            remarks.setText("You've done pretty well");
        } else {
            remarks.setText("Welcome to the team!");
        }
    }

}
