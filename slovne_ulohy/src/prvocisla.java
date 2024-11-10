public class prvocisla {

    public static boolean prvocislo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) { //Stačí kontrolovat dělitelnost od 2 až po hodnotu √n. Pokud nenajdeme žádného dělitele v tomto rozmezí, můžeme být jisti, že žádný další dělitel neexistuje, a číslo je tedy prvočíslo.
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <=1000; i++) {


                if (prvocislo(i)) {
                    System.out.println("prvocislo: " + i);
                }
                }

        }
    }

