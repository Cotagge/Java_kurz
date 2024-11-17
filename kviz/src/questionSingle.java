import java.time.LocalDate;

public class questionSingle {
    private String question;
    private LocalDate[] options;
    private int correctAnswerIndex;

    public questionSingle(String question, LocalDate[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public void printQuestionSingle() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ") " + options[i]);
        }
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == correctAnswerIndex;

    }
}
