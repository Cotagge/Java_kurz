import java.util.Scanner;

public class zadavaniCislaAzPoQ {
    public static void main(String[] args) {
        double soucet = 0;
        double prumer = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("zadej cislo nebo q pro ukonceni");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                counter++;
                soucet += number;
            } catch (NumberFormatException e) {
                System.out.println("neplatny vstup, zadejte cislo");
            }


            }
        if (counter > 0) {


            prumer = soucet / counter;
            System.out.println("soucet je: " + soucet + " prumer je: " + prumer);
        } else {
            System.out.println("polibsi elipsy");
        }
    }
}
