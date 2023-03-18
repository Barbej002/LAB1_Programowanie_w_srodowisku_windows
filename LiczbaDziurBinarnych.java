import java.util.Scanner;

public class LiczbaDziurBinarnych {

    public static void main(String[] args) {

        // Pobierz od użytkownika liczbę binarną
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę binarną: ");
        String binarna = scanner.nextLine();
        scanner.close();

        // Zlicz dziury binarne
        int liczbaDziur = 0;
        boolean czyWTrakcieDziury = false;
        for (int i = 0; i < binarna.length(); i++) {
            if (binarna.charAt(i) == '1') {
                if (czyWTrakcieDziury) {
                    // Jeśli kończymy dziurę, to zwiększamy licznik dziur
                    liczbaDziur++;
                }
                czyWTrakcieDziury = false;
            } else {
                czyWTrakcieDziury = true;
            }
        }

        // Wyświetl wynik
        System.out.println("Liczba dziur binarnych: " + liczbaDziur);
    }
}
