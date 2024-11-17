import java.util.HashMap;

public class QuestionSingleQABC {
    private String question;
    private HashMap<String, String> options;
    private String correctAnswers;

    public QuestionSingleQABC(String question, HashMap<String, String> options, String correctAnswers) {
        this.question = question;
        this.options = options;
        this.correctAnswers = correctAnswers;
    }

    public void setOptions(HashMap<String, String> options) {
        this.options = options;
    }

    public void printQuestionSingleQABC() {
        System.out.println("Type whole text of answer");
        for ( String key : options.keySet() ) {
            System.out.println(key + ") " + options.get(key));
        }

    }

    public boolean checkQuestionSingleQABC(String userAnwer) {
        return userAnwer.toLowerCase().equals(correctAnswers.toLowerCase());

}
}
