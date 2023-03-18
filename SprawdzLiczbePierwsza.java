import java.util.Scanner;

public class SprawdzLiczbePierwsza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia: ");
        int liczba = scanner.nextInt();
        scanner.close();

        boolean czyPierwsza = true;

        if (liczba < 2) {
            czyPierwsza = false;
        } else {
            for (int i = 2; i <= Math.sqrt(liczba); i++) {
                if (liczba % i == 0) {
                    czyPierwsza = false;
                    break;
                }
            }
        }

        if (czyPierwsza) {
            System.out.println(liczba + " jest liczbą pierwszą");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą");
        }
    }

}
