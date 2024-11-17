import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counterWrong = 0;
        System.out.println("Welcome in quiz");
        System.out.println("there are just four question");
        Scanner scanner = new Scanner(System.in);

        //question one using date
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate tommorrow = today.plusDays(1);
        LocalDate[] options1 = {today, yesterday, tommorrow};

        //question one is just based on index of q.
        questionSingle firstQ = new questionSingle("What date is today?", options1, 1);

        firstQ.printQuestionSingle();
        int answer = scanner.nextInt();
        if (firstQ.checkAnswer(answer)) {
            System.out.println("correct answer");
        } else {
            System.out.println("wrong answer");
            counterWrong++;
            System.out.println("you've got " + counterWrong + " mistakes");
        }

        scanner.nextLine(); //emptying buffer


        //question two is based on equality of strings
        HashMap<String, String> options2 = new HashMap<>();
        options2.put("a", "Earth");
        options2.put("b", "Pluto");
        options2.put("c", "Mars");

        QuestionSingleQABC secondQ = new QuestionSingleQABC("What is name of our planet?", options2, "Earth");

        secondQ.printQuestionSingleQABC();
        String answer2 = scanner.nextLine();
        if (secondQ.checkQuestionSingleQABC(answer2)) {
            System.out.println("Correct Answer");
        } else {
            System.out.println("Wrong answer");
            counterWrong++;
            System.out.println("you've got " + counterWrong + " mistakes");
        }

        // question three is based on corelation of hasMap and array with cycle while true
        HashMap<String, String> options3 = new HashMap<>();
        options3.put("a", "Mercury");
        options3.put("b", "Venus");
        options3.put("c", "Earth");
        options3.put("d", "Mars");

        String[] correctAnswers = {"b", "c"};

        QuestionMultiple thirdQ = new QuestionMultiple(
                "Which of these planets have atmosphere? (select all that apply)",
                options3,
                correctAnswers
        );

        boolean isCorrect = false;
        while (!isCorrect) {
            thirdQ.printQuestionMultiple();
            String answer3 = scanner.nextLine();
            if (thirdQ.checkAnswers(answer3)) {
                System.out.println("Correct Answer");
                isCorrect = true;
            } else {
                System.out.println("Wrong answer");
                counterWrong++;
                System.out.println("you've got " + counterWrong + " mistakes");
            }
        }

    }
}
