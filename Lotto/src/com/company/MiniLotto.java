package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MiniLotto {
    MaszynaLosujaca gra = new MaszynaLosujaca();

    public void MiniLotto() throws InterruptedException {
        int[] wylosowane = new int[0];
        wylosowane = losujLiczby();
        int[] liczby = new int[0];
        liczby = wprowadzLiczby();
        int licznik = 0;
        licznik = porownajLiczby(liczby, wylosowane);
        wypiszDane(liczby);
        wypiszWylosowaneLiczby(wylosowane);
        System.out.println("Trafiłeś : " + licznik + "/5 liczb");
        if (licznik == 3) {
            System.out.println("Twoja wygrana: 20 zł");
        } else if (licznik == 4) {
            System.out.println("Twoja wygrana to: 240 zł");
        } else if (licznik == 5) {
            System.out.println("\"Gratulacje! Wygarłeś głowną nagrodę: 5 300 zł");

        } else {
            System.out.print("Twoja wygrana to: 0 zł \n"
                    + "Spóbuj ponownie!\n\n");
            gra.wyswietlMenu();
            gra.opcje();
        }

    }

    static int[] wprowadzLiczby() {
        Scanner skaner = new Scanner(System.in);
        int[] liczby = new int[5];
        try {
            for (int i = 0; i < liczby.length; i++) {
                do {
                    System.out.println("Podaj " + (i + 1) + " liczbę: ");
                    liczby[i] = skaner.nextInt();
                    if (liczby[i] > 42 || liczby[i] < 1) {
                        System.out.println("Wprowadziłeś błedne dane Liczba powinna być z zakresu 1-42");

                    }

                } while (liczby[i] > 42 || liczby[i] < 1);
            }
        }catch(Exception e){
            System.out.println("Błędne dane");
        }
        return liczby;
    }

    static void wypiszDane(int[] liczby) {
        System.out.println("Twoje liczby: " + Arrays.toString(liczby));

    }

    static void wypiszWylosowaneLiczby(int[] wylosowane) throws InterruptedException {

        for (int i = 0; i < wylosowane.length; i++) {
            System.out.println("Wylosowane liczby to: " + wylosowane[i]);

            TimeUnit.SECONDS.sleep(1);
        }
    }

    static int[] losujLiczby() {
        Random randomGenerator = new Random();
        int[] wylosowane = new int[6];
        for (int i = 0; i < 6; i++) {
            wylosowane[i] = (randomGenerator.nextInt(42) + 1);

        }

        return wylosowane;
    }

    static int porownajLiczby(int[] liczby, int[] wylosowane) {
        int licznik = 0;
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < wylosowane.length; j++) {
                if (liczby[i] == wylosowane[j]) {
                    licznik++;
                }
            }
        }
        return licznik;
    }

}
