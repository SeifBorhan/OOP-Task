import java.util.*;
import java.lang.Math;


public class QuizApplication {
    private List<Question> questionsBank;
    private Quiz quiz;
    private User user;

    public QuizApplication(){
        this.quiz=new Quiz();
        this.questionsBank = new ArrayList<>();
    }

    public void runApp(){
        createQuestionsBank();
        createQuiz();
        startQuiz();
    }
    public void startQuiz(){}



    private void registerUser(String name){
        this.user.setName(name);
    }

    private void createQuiz(){
        int numberOfQuestions = (int) Math.random()*this.questionsBank.size();
        quiz.addQuestion(new Question("The green planet in the solar system is?", List.of("Mars", "Uranus", "Venus", "Earth"), "Uranus"));
    }

    private void createQuestionsBank(){
        questionsBank.add(new Question("The capital of Croatia?", List.of("Zagreb", "Zurich", "Livi", "Lativ"), "Zagreb"));
        questionsBank.add(new Question("The capital of Egypt?", List.of("Cairo", "Caizo", "Alexandria", "Sinai"), "Cairo"));
        questionsBank.add(new Question("The capital of Brazil?", List.of("Brazili", "Brazil", "Brasilia", "Brasil"), "Brasilia"));
        questionsBank.add(new Question("The green planet in the solar system is?", List.of("Mars", "Uranus", "Venus", "Earth"), "Uranus"));
    }

    private void displayQuiz(){}

    private void recordResponse(){}

    private void showProgress(){}

}
