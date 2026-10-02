import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        nombrePremier();

    }
    // 3.1. Structures de contrôle

    // Exercice 3.1.1 - Règle graduée

    // Question 1
    public static void regle() {
// Contenu de la fonction
// Question 2
        Scanner scanner = new Scanner(System.in);
        int longueur;

        do {
            System.out.println("Longueur ?");
            longueur = scanner.nextInt();
        } while (longueur <= 0);
        // Question 3/4
        for (int i = 0; i < longueur; i++) {

            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }

        }
    }

    // Exercice 3.1.2 - Nombres premiers

    // Question 1
    public static void nombrePremier() {
// Question 2
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.println("Saisissez un entier positif :");
            nombre = scanner.nextInt();
        } while (nombre <= 0);
        // Question 3
        int compteur = 0;

        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                compteur++;
            }
        }
        if (compteur == 2) {
            System.out.println("Le nombre est premier");
        } else {
            System.out.println("Le nombre n'est pas premier");
        }
    }

// 3.2 Tableaux

    // Exercice 3.2.1 Manipulations sur un tableau

    public static void initialisationTableau() {

        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        //Question 1
        int minimum = tableau[0];
        int maximum = tableau[0];

        for (int i = 0; i < tableau.length; i++) {

            if (tableau[i] < minimum) {
                minimum = tableau[i];
            }

            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }
        }

        System.out.println("Minimum : " + minimum);
        System.out.println("Maximum : " + maximum);
        //Question 2
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme = somme + tableau[i];
        }

        System.out.println("Somme : " + somme);
        //Question 3
        System.out.println("Éléments pairs :");

        for (int i = 0; i < tableau.length; i++) {

            if (tableau[i] % 2 == 0) {
                System.out.println(tableau[i]);
            }
        }
        //Question 4
        System.out.println("Éléments d'indice pair :");

        for (int i = 0; i < tableau.length; i++) {

            if (i % 2 == 0) {
                System.out.println(tableau[i]);
            }
        }
    }

    //Question 5
    public static void inverseTableau(int[] tableau) {

        for (int i = 0; i < tableau.length / 2; i++) {

            int temporaire = tableau[i];

            tableau[i] = tableau[tableau.length - 1 - i];

            tableau[tableau.length - 1 - i] = temporaire;
        }
    }
}