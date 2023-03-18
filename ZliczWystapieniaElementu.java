import java.util.Scanner;

//Zliczanie wystapien danego elementu w tablicy
//www.algorytm.org
public class ZliczWystapieniaElementu {

    public static void main(String[] args) {
        int b;
        int c;
        int suma = 0;

//Pobierz rozmiar tablicy
        System.out.println("Podaj ile elementów ma tablica");
        Scanner zczytaj = new Scanner(System.in);
        b = zczytaj.nextInt();

//Pobierz element do zliczania
        System.out.println("Podaj zliczany element");
        c = zczytaj.nextInt();

//Utworz tablice
        int[] a = new int[b];

//Pobierz elementy do tablicy
        for (int i=0; i<b; i++) {
            System.out.println("Podaj "+i+" element");
            a[i] = zczytaj.nextInt();
        }
        zczytaj.close();

//Przeszukaj tablice
        for (int i=0; i<a.length; i++){
            if (c==a[i]){
                suma++;
            }
        }

//Wypisz wynik
        if(suma==1){
            System.out.println("element występuje "+suma+" raz");
        }
        else{
            System.out.println("element występuje "+suma+" razy");
        }

    }

}