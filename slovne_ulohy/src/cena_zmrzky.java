import java.util.Scanner;

public class cena_zmrzky {
    public static double cena(int pocet){
        if (pocet % 2 == 0 ) {
            return pocet * 1.5;
        } else {
            return pocet * 1.25;
        }
    // druha varianta return cena % 2 == 0 ? pocet * 1.5 : pocet * 1.25;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pocet = 0;
        System.out.println("zadej pocet kopecku");
        pocet = scanner.nextInt();
        System.out.println("cena je: " + cena(pocet));


    }
}

