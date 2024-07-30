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
    public void startQuiz(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        registerUser(scanner.nextLine());
        for(int i=0; i<quiz.getQuestions().size();i++){
            System.out.println("You have solved " +this.user.trackProgress(this.quiz)+" questions so far!!");
            System.out.println("Question " + (i+1) + ":");
            System.out.println("-----------------------------");
            quiz.getQuestions().get(i).displayQuestion();
            System.out.print("Type in your answer: ");
            String answer = scanner.nextLine();
            user.recordAnswer(quiz.getQuestions().get(i),answer);
            if(quiz.getQuestions().get(i).isCorrectAnswer(answer)){
                System.out.println("Correct Answer");
            }else{
                System.out.println("Incorrect Answer");
            }
            System.out.println("-----------------------------------------------------------------------");
        }
        System.out.println("Your final score is: "+quiz.calculateScore(user)+"/"+quiz.getQuestions().size());
        scanner.close();

    }



    private void registerUser(String name){
        this.user = new User(name);
    }

    private void createQuiz(){
        int numberOfQuestions = (int) (Math.random()*this.questionsBank.size()) +1;
        while(numberOfQuestions>0){
            quiz.addQuestion(this.questionsBank.remove((int) (Math.random()*this.questionsBank.size())));
            numberOfQuestions--;
        }
    }

    private void createQuestionsBank(){
        questionsBank.add(new Question("The capital of Croatia?", List.of("Zagreb", "Zurich", "Livi", "Lativ"), "Zagreb"));
        questionsBank.add(new Question("The capital of Egypt?", List.of("Cairo", "Caizo", "Alexandria", "Sinai"), "Cairo"));
        questionsBank.add(new Question("The capital of Brazil?", List.of("Brazili", "Brazil", "Brasilia", "Brasil"), "Brasilia"));
        questionsBank.add(new Question("The green planet in the solar system is?", List.of("Mars", "Uranus", "Venus", "Earth"), "Uranus"));
    }

    public static void main(String[] args) {
        new QuizApplication().runApp();

    }
}
