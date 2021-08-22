package com.company;

import java.util.Scanner;

public class MaszynaLosujaca {
    static void wyswietlMenu() {

        System.out.print("\nWitaj w programie - symulacja lotto. "
                + "Wybierz rodzaj gry, wybierając odpowiednią cyfrę z menu poniżej:\n"
                + "Duże lotto -  1\n"
                + "Mni Lotto -  2\n"
                + "Keno - 3\n"
                + "Koniec programu - 4\n"
        );
    }

    static void opcje() throws InterruptedException {
        String opcja = "";
        Scanner skaner = new Scanner(System.in);
        opcja = skaner.nextLine();

        if (opcja.equalsIgnoreCase("1")) {
            System.out.println("");
            System.out.println("***********************  DUŻE LOTTO **************************");
            System.out.print("Witamy w grze Duże lotto. Wybierz kolejno 6 liczb z zakresu 1-49.\n"
                    + "Twoja szansa głownej wygranej to 1:13 983 816\n");
            System.out.println("");
            DuzeLotto duzeLotto = new DuzeLotto();
            duzeLotto.DuzeLotto();

        } else if (opcja.equalsIgnoreCase("2")) {
            System.out.println("");
            System.out.println("*************************** MINI LOTTO *************************");
            System.out.println("Witamy w grze Mini lotto. Wybierz kolejno 5 liczb z zakresu 1-42.\n"
                    + "Twoja szansa głownej wygranej to 1:850 668\n");
            System.out.println("");
            MiniLotto miniLotto = new MiniLotto();
            miniLotto.MiniLotto();
        } else if (opcja.equalsIgnoreCase("3")) {
            System.out.println("");
            System.out.println("********************************* KENO **********************************");
            System.out.print("Witamy w grze Keno. W Keno możesz wybrać od 1 do 10 liczb ze zbioru 1-70.\n"
                    + "Losowanych jest 20 liczb. Zdecyduj, ile liczb chcesz obstawić – maksymalnie 10.\n"
                    + "Od wyboru ilości obstawianych liczb zależy wysokość wygranej i szansa na jej trafienie\n");
            System.out.println("");
            Keno keno = new Keno();
            keno.grajwKeno();

        } else if (opcja.equalsIgnoreCase("4")) {
            System.out.println("");
            System.out.println("Dziękujemy za współpracę");
        } else {
            System.out.println("Nie rozumiem - spróbuj ponownie");
            opcje();
        }
    }

}
