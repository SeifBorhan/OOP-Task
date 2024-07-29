import java.util.*;

public class Quiz {

    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question q){
        questions.add(q);
    }

    public void displayQuestions(){
        System.out.println("Type in the correct answer!");
        for(int i=0; i<questions.size();i++){
            System.out.println("Question " + i + ":");
            questions.get(i).displayQuestion();
        }
    }

    public int calculateScore(User u){
        int score=0;
        for (Map.Entry<Question, String> entry : u.getResponses().entrySet()) {
            Question question = entry.getKey();
            String answer = entry.getValue();
            if(question.isCorrectAnswer(answer)){
                score++;
            }
        }
        return score;
    }

}
