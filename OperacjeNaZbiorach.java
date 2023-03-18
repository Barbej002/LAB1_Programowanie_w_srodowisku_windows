import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OperacjeNaZbiorach {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Wprowadzanie elementów pierwszego zbioru
        System.out.print("Podaj elementy pierwszego zbioru oddzielone spacją: ");
        String[] zbior1_str = scanner.nextLine().split(" ");
        Set<Integer> zbior1 = new HashSet<Integer>();
        for (String s : zbior1_str) {
            zbior1.add(Integer.parseInt(s));
        }

        // Wprowadzanie elementów drugiego zbioru
        System.out.print("Podaj elementy drugiego zbioru oddzielone spacją: ");
        String[] zbior2_str = scanner.nextLine().split(" ");
        Set<Integer> zbior2 = new HashSet<Integer>();
        for (String s : zbior2_str) {
            zbior2.add(Integer.parseInt(s));
        }

        // Operacje na zbiorach
        Set<Integer> suma = new HashSet<Integer>(zbior1);
        suma.addAll(zbior2);

        Set<Integer> roznicaAB = new HashSet<Integer>(zbior1);
        roznicaAB.removeAll(zbior2);

        Set<Integer> czescWspolna = new HashSet<Integer>(zbior1);
        czescWspolna.retainAll(zbior2);

        Set<Integer> roznicaSymetryczna = new HashSet<Integer>(zbior1);
        roznicaSymetryczna.addAll(zbior2);
        Set<Integer> tmp = new HashSet<Integer>(zbior1);
        tmp.retainAll(zbior2);
        roznicaSymetryczna.removeAll(tmp);

        // Wyświetlenie wyników
        System.out.println("Suma zbiorów: " + suma);
        System.out.println("Różnica zbiorów A-B: " + roznicaAB);
        System.out.println("Część wspólna zbiorów: " + czescWspolna);
        System.out.println("Różnica symetryczna zbiorów: " + roznicaSymetryczna);

    }

}
