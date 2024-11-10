

public class startStop {

    public static String startStopFunct(int a, int b) {
        double soucet = a;
        double avg = 0;
        int counter = 1;
        for ( int i = a+1; i <= b; i++) {
            soucet += i;
            counter++;
        }
        avg = soucet / counter;
        return "soucet = " + soucet + " , prumer= " + avg;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        String vysledek = startStopFunct(a, b);
        System.out.println(vysledek);
    }
}
