//Creare una classe Main con metodo main, in cui implementare il seguente programma:
//creare una nuova ArrayList dove salvare la lista dei desideri
//continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi
//ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare
//ad ogni iterazione aggiungere il desiderio alla lista
//al termine dell’inserimento ordinare la lista
//stampare a video la lista ordinata

package org.lessons.java.wish.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaDesideri = new ArrayList<String>();
		String desiderio;
		String scelta;

		do {
			System.out.println("Inserisci desiderio o diventa meno materialista inserendo X");
			scelta = sc.nextLine();

			if (!scelta.equalsIgnoreCase("x")) {
				desiderio = scelta;
				listaDesideri.add(desiderio);
				System.out.println("Finora hai desiderato: " + listaDesideri.size() + "cose!");
			}

		} while (!scelta.equalsIgnoreCase("x"));

		System.out.println("Lista in ordine di inserimento: " + "\n" + listaDesideri + "\n");

		Collections.sort(listaDesideri);
		System.out.println("Lista in ordine alfabetico: " + "\n" + listaDesideri);

	}
}
