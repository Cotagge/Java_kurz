import java.util.Scanner;

public class piskv {
    private static char[] pole = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    private static char aktualniHrac = 'O';
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vítejte ve hře Piškvorky!");
        System.out.println("Hráči se střídají v tazích. Použijte čísla 1-9 pro umístění svého symbolu.");
        vypisPole();

        while (!jeKonecHry()) {
            int pozice = získejTah();
            proved_tah(pozice);
            vypisPole();
            if (jeVitez()) {
                System.out.println("Gratulujeme! Hráč " + aktualniHrac + " vyhrál!");
                break;
            }
            if (jeRemiza()) {
                System.out.println("Hra skončila remízou!");
                break;
            }
            zmenHrace();
        }
        scanner.close();
    }

    private static void vypisPole() {
        System.out.println("\nAktuální stav hry:");
        System.out.println(" " + pole[0] + " | " + pole[1] + " | " + pole[2] + " ");
        System.out.println("-----------");
        System.out.println(" " + pole[3] + " | " + pole[4] + " | " + pole[5] + " ");
        System.out.println("-----------");
        System.out.println(" " + pole[6] + " | " + pole[7] + " | " + pole[8] + " ");
    }

    private static int získejTah() {
        int pozice;
        while (true) {
            System.out.println("\nHráč " + aktualniHrac + " je na tahu (1-9): ");
            try {
                pozice = scanner.nextInt();
                if (pozice >= 1 && pozice <= 9) {
                    pozice--; // převod na index 0-8
                    if (pole[pozice] == ' ') {
                        return pozice;
                    } else {
                        System.out.println("Toto pole je již obsazené!");
                    }
                } else {
                    System.out.println("Neplatný tah! Zadejte číslo 1-9.");
                }
            } catch (Exception e) {
                System.out.println("Neplatný vstup! Zadejte číslo 1-9.");
                scanner.nextLine(); // vyčištění bufferu
            }
        }
    }

    private static void proved_tah(int pozice) {
        pole[pozice] = aktualniHrac;
    }

    private static void zmenHrace() {
        aktualniHrac = (aktualniHrac == 'O') ? 'X' : 'O';
    }

    private static boolean jeVitez() {
        // kontrola řádků
        for (int i = 0; i < 9; i += 3) {
            if (pole[i] != ' ' && pole[i] == pole[i + 1] && pole[i] == pole[i + 2]) {
                return true;
            }
        }
        // kontrola sloupců
        for (int i = 0; i < 3; i++) {
            if (pole[i] != ' ' && pole[i] == pole[i + 3] && pole[i] == pole[i + 6]) {
                return true;
            }
        }
        // kontrola diagonál
        if (pole[0] != ' ' && pole[0] == pole[4] && pole[0] == pole[8]) return true;
        if (pole[2] != ' ' && pole[2] == pole[4] && pole[2] == pole[6]) return true;

        return false;
    }

    private static boolean jeRemiza() {
        for (char c : pole) {
            if (c == ' ') return false;
        }
        return true;
    }

    private static boolean jeKonecHry() {
        return jeVitez() || jeRemiza();
    }
}

