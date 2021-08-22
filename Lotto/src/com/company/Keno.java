package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Keno {
    MaszynaLosujaca gra = new MaszynaLosujaca();

    public void grajwKeno() throws InterruptedException {
        int[] wylosowane = new int[0];
        wylosowane = losujLiczby();
        int[] liczby = new int[0];
        liczby = wprowadzLiczby();
        int licznik = 0;
        licznik = porownajLiczby(liczby, wylosowane);
        wypiszDane(liczby);
        wypiszWylosowaneLiczby(wylosowane);
        System.out.println("Trafiłeś : " + licznik + "/20 liczb");
        if (licznik == 10 && liczby.length == 10) {
            System.out.println("Gratulacje! Wygarłeś głowną nagrodę: 100 000 zł!");
        } else if (licznik == 9 && liczby.length == 10) {
            System.out.println("Twoja wygrana to: 10 000 zł");
        } else if (licznik == 8 && liczby.length == 10) {
            System.out.println("Twoja wygrana to: 150 zł");
        } else if (licznik == 7 && liczby.length == 10) {
            System.out.println("Twoja wygrana to: 55zł");
        } else if (licznik == 6 && liczby.length == 10) {
            System.out.println("Twoja wygrana to: 5 zł");
        } else if (licznik == 5 && liczby.length == 10) {
            System.out.println("Twoja wygrana to: 2 zł");
        } else if (licznik == 0 && liczby.length == 10) {
            System.out.println("Twoja wygrana to: 4 zł");
        } else if (licznik == 9 && liczby.length == 9) {
            System.out.println("Twoja wygrana to: 40 000 zł");
        } else if (licznik == 8 && liczby.length == 9) {
            System.out.println("Twoja wygrana to: 650 zł");
        } else if (licznik == 7 && liczby.length == 9) {
            System.out.println("Twoja wygrana to: 65 zł");
        } else if (licznik == 6 && liczby.length == 9) {
            System.out.println("Twoja wygrana to: 50 zł");
        } else if (licznik == 5 && liczby.length == 9) {
            System.out.println("Twoja wygrana to: 6 zł");
        } else if (licznik == 4 && liczby.length == 9) {
            System.out.println("Twoja wygrana to: 2 zł");
        } else if (licznik == 8 && liczby.length == 8) {
            System.out.println("Twoja wygrana to: 7 500 zł");
        } else if (licznik == 7 && liczby.length == 8) {
            System.out.println("Twoja wygrana to: 325 zł");
        } else if (licznik == 6 && liczby.length == 8) {
            System.out.println("Twoja wygrana to: 50 zł");
        } else if (licznik == 5 && liczby.length == 8) {
            System.out.println("Twoja wygrana to: 6 zł");
        } else if (licznik == 4 && liczby.length == 8) {
            System.out.println("Twoja wygrana to: 3 zł");
        } else if (licznik == 3 && liczby.length == 8) {
            System.out.println("Twoja wygrana to: 2 zł");
        } else if (licznik == 7 && liczby.length == 7) {
            System.out.println("Twoja wygrana to: 1000 zł");
        } else if (licznik == 6 && liczby.length == 7) {
            System.out.println("Twoja wygrana to: 60 zł");
        } else if (licznik == 5 && liczby.length == 7) {
            System.out.println("Twoja wygrana to: 6 zł");
        } else if (licznik == 4 && liczby.length == 7) {
            System.out.println("Twoja wygrana to: 3 zł");
        } else if (licznik == 3 && liczby.length == 7) {
            System.out.println("Twoja wygrana to: 2 zł");
        } else if (licznik == 6 && liczby.length == 6) {
            System.out.println("Twoja wygrana to: 275 zł");
        } else if (licznik == 5 && liczby.length == 6) {
            System.out.println("Twoja wygrana to: 48 zł");
        } else if (licznik == 4 && liczby.length == 6) {
            System.out.println("Twoja wygrana to: 5 zł");
        } else if (licznik == 3 && liczby.length == 6) {
            System.out.println("Twoja wygrana to: 2 zł");
        } else if (licznik == 5 && liczby.length == 5) {
            System.out.println("Twoja wygrana to: 120 zł");
        } else if (licznik == 4 && liczby.length == 5) {
            System.out.println("Twoja wygrana to: 10 zł");
        } else if (licznik == 3 && liczby.length == 5) {
            System.out.println("Twoja wygrana to: 5 zł");
        } else if (licznik == 4 && liczby.length == 4) {
            System.out.println("Twoja wygrana to: 33 zł");
        } else if (licznik == 3 && liczby.length == 4) {
            System.out.println("Twoja wygrana to: 4 zł");
        } else if (licznik == 2 && liczby.length == 4) {
            System.out.println("Twoja wygrana to: 2 zł");
        } else if (licznik == 3 && liczby.length == 3) {
            System.out.println("Twoja wygrana to: 11 zł");
        } else if (licznik == 2 && liczby.length == 3) {
            System.out.println("Twoja wygrana to: 4 zł");
        } else if (licznik == 2 && liczby.length == 2) {
            System.out.println("Twoja wygrana to: 11 zł");
        } else if (licznik == 1 && liczby.length == 1) {
            System.out.println("Twoja wygrana to: 3 zł");
        } else {
            System.out.println("Twoja wygrana to: 0 zł \n"
                    + "Spóbuj ponownie");
            gra.wyswietlMenu();
            gra.opcje();
        }

    }

    static int[] wprowadzLiczby() {
        Scanner skaner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Ile liczb chcesz wytypować? (1-10)");
            x = skaner.nextInt();

            if (x > 10 || x < 1) {
                System.out.println("Wprowadziłeś błedne dane. ");

            }

        } while (x > 10 || x < 1);

        int[] liczby = new int[x];
        for (int i = 0; i < liczby.length; i++) {
            do {
                System.out.println("Podaj " + (i + 1) + " liczbę: ");
                liczby[i] = skaner.nextInt();
                if (liczby[i] > 70 || liczby[i] < 1) {
                    System.out.print("Wybrałeś niepoprawną liczbę\n"
                            + "Spóbuj ponownie, wybierając liczbę z zakresu 1-70.\n");

                }

            } while (liczby[i] > 70 || liczby[i] < 1);
        }
        return liczby;
    }

    static void wypiszDane(int[] liczby) {
        System.out.println("Twoje liczby: " + Arrays.toString(liczby));

    }

    static void wypiszWylosowaneLiczby(int[] wylosowane) throws InterruptedException {

        System.out.println("Wylosowane liczby to: ");
        for (int i = 0; i < wylosowane.length; i++) {
            System.out.println( wylosowane[i]);

            TimeUnit.SECONDS.sleep(1);
        }
    }

    static int[] losujLiczby() {
        Random randomGenerator = new Random();
        int[] wylosowane = new int[20];
        for (int i = 0; i < 20; i++) {
            wylosowane[i] = (randomGenerator.nextInt(70) + 1);

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
