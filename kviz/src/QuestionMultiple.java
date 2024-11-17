import java.util.HashMap;

public class QuestionMultiple {
    private String question;
    private HashMap<String, String> options;
    private String[] correctAnswers; 

    public QuestionMultiple(String question, HashMap<String, String> options, String[] correctAnswers) {
        this.question = question;
        this.options = options;
        this.correctAnswers = correctAnswers;
    }

    public void printQuestionMultiple() {
        System.out.println("Choose one or more answers (write letters separated by comma, e.g.: a,b)");
        System.out.println(question);
        for (String key : options.keySet()) {
            System.out.println(key + ") " + options.get(key));
        }
    }

    public boolean checkAnswers(String userAnswer) {
        String[] userAnswers = userAnswer.toLowerCase().split(",");

        for (String answer : userAnswers) {
            answer = answer.trim();
            boolean isCorrect = false;
            for (String correct : correctAnswers) {
                if (answer.equals(correct.toLowerCase())) {
                    isCorrect = true;
                    break;
                }
            }
            if (!isCorrect) return false;
        }
        return true;
    }
}