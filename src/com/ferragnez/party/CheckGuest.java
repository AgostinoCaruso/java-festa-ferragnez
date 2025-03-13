package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner inputUtente = new Scanner(System.in);

        // array creata e inizializzata
        String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // chiedere all'utente come si chiama
        System.out.println("Immetta il tuo nome per vedere se puoi partecipare alla festa: ");
        String nomeUtente = inputUtente.nextLine();
        nomeUtente = nomeUtente.trim();
        boolean isPresente = false;

        // verificare che il nome sia presente nella lista
        for (int i = 0; i < listaInvitati.length; i++) {
            System.out.println("nome inserito: " + nomeUtente + ", nome iterato: " +
                    listaInvitati[i]);
            if (listaInvitati[i].equals(nomeUtente)) {
                isPresente = true;
                break;
            }
        }

        // Bonus
        int whileContatore = 0;
        while (!isPresente && whileContatore < listaInvitati.length) {
            if (listaInvitati[whileContatore].equals(nomeUtente)) {
                isPresente = true;
                break;
            }
            whileContatore++;
        }

        if (isPresente == true) {
            System.out.println("Sei invitato alla festa");
        } else {
            System.out.println("Ti chiediamo caldamente di portarci un pandoro se vuoi entrare");
        }
        inputUtente.close();
    }
}
