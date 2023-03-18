import java.util.Random;
import java.util.Scanner;

public class ZgadnijLiczbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int liczbaDoZganiecia = random.nextInt(100) + 1;
        System.out.println("Wymyśliłem liczbę z przedziału 1-100. Zgadnij co to za liczba");

        int liczbaOdUzytkonika;
        int iloscProb = 0;
        do {
            iloscProb++;
            System.out.print("Podaj liczbę: ");
            liczbaOdUzytkonika = scanner.nextInt();

            if (liczbaOdUzytkonika < liczbaDoZganiecia) {
                System.out.println("Podałeś za małą liczbę");
            } else if (liczbaOdUzytkonika > liczbaDoZganiecia) {
                System.out.println("Podałeś za dużą liczbę");
            } else {
                System.out.println("Gratuluję! Zgadłeś liczbę w " + iloscProb + " próbie");
            }
        } while (liczbaDoZganiecia != liczbaOdUzytkonika);

    }
}