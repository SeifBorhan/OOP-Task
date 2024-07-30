import java.util.*;

public class User {
    private String name;
    private Map<Question,String> responses;

    public User(String name){
        this.name=name;
        this.responses = new HashMap<>();
    }


    public Map<Question, String> getResponses() {
        return responses;
    }

    public void recordAnswer(Question question, String answer){
        responses.put(question,answer);
    }

    public String trackProgress(Quiz quiz){
        return (responses.size())+"/"+quiz.getQuestions().size();
    }
}
