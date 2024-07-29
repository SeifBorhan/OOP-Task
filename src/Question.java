import java.util.*;

public class Question {
    private String text;
    private List<String> possibleAnswers;
    private String correctAnswer;

    public Question(String text, List<String> possibleAnswers, String correctAnswer) {
        this.text = text;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }


    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }

    public void displayQuestion(){
        System.out.println(this.text);
        this.possibleAnswers.forEach(s -> System.out.print(s + "   "));
        System.out.print("/n");
    }


}
