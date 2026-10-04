import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();

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
        //Question 5
        inverseTableau(tableau);

        System.out.println("Tableau inversé :");

        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
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


// 3.3 Menu d'exercices

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Choisissez un exercice :");
            System.out.println("1 - Règle graduée");
            System.out.println("2 - Nombres premiers");
            System.out.println("3 - Manipulations sur un tableau");
            System.out.println("0 - Quitter");

            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    regle();
                    break;

                case 2:
                    nombrePremier();
                    break;

                case 3:
                    initialisationTableau();
                    break;

                case 0:
                    System.out.println("Fin du programme");
                    break;

                default:
                    System.out.println("Choix incorrect");
            }

        } while (choix != 0);
    }


// 3.4 Chaînes de caractères

    // Exercice 3.4.1 - Rechercher un caractère

    //Question 1
    public static boolean cherche(char c, String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                return true;
            }
        }

        return false;
    }

    //Question 2
    public static int cherchePosition(char c, String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }


    // Exercice 3.4.2 - Distance de Hamming

    public static int hamming(String mot1, String mot2) {

        if (mot1.length() != mot2.length()) {
            return -1;
        }

        int distance = 0;

        for (int i = 0; i < mot1.length(); i++) {

            if (mot1.charAt(i) != mot2.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }


    // Exercice 3.4.3 - Suppression d'une chaîne de caractères

    public static String suppression(char c, String s) {

        String resultat = "";
        boolean supprime = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c && supprime == false) {
                supprime = true;
            } else {
                resultat = resultat + s.charAt(i);
            }
        }

        return resultat;
    }


    // Exercice 3.4.4 - Scrabble

    public static boolean scrabble(String mot, String lettresDisponibles) {

        String lettresRestantes = lettresDisponibles;

        for (int i = 0; i < mot.length(); i++) {

            char lettre = mot.charAt(i);

            if (cherche(lettre, lettresRestantes) == false) {
                return false;
            }

            lettresRestantes = suppression(lettre, lettresRestantes);
        }

        return true;
    }


    // Exercice 3.4.5 - Anagrammes

    public static boolean anagramme(String u, String v) {

        if (u.length() != v.length()) {
            return false;
        }

        String lettresRestantes = v;

        for (int i = 0; i < u.length(); i++) {

            char lettre = u.charAt(i);

            if (cherche(lettre, lettresRestantes) == false) {
                return false;
            }

            lettresRestantes = suppression(lettre, lettresRestantes);
        }

        return true;
    }


    // Exercice 3.4.6 - Calculatrice

    public static int somme(String s) {

        if (s.length() == 0) {
            return -1;
        }

        if (s.charAt(0) == '+' || s.charAt(s.length() - 1) == '+') {
            return -1;
        }

        int somme = 0;
        int nombre = 0;

        for (int i = 0; i < s.length(); i++) {

            char caractere = s.charAt(i);

            if (caractere >= '0' && caractere <= '9') {

                nombre = nombre * 10 + (caractere - '0');

            } else if (caractere == '+') {

                if (i > 0 && s.charAt(i - 1) == '+') {
                    return -1;
                }

                somme = somme + nombre;
                nombre = 0;

            } else {
                return -1;
            }
        }

        somme = somme + nombre;

        return somme;
    }

}