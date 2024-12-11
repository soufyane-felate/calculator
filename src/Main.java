import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String op;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("\n"+
                                "+ : pour l'addition\n" +
                                "- : pour la soustraction\n" +
                                "* : pour la multiplication\n" +
                                "/ : pour la division\n" +
                                "p : pour calculer la puissance\n" +
                                "r : pour calculer la racine carrée\n" +
                                "f : pour calculer le factorielle\n" +
                                "q : pour quitter\n"
                );

                System.out.println("Operateur : ");
                op = sc.nextLine();

                if (op.equals("q")) {
                    break;
                }
                if (!isValidOperator(op)) {
                    System.err.println("Operateur invalide.");
                    continue;
                }

                double n1 = 0, n2 = 0;
                boolean validInput = false;

                while (!validInput) {
                    System.out.print("Entrer le nombre 1 : ");
                    try {
                        n1 = sc.nextDouble();
                        validInput = true;
                    } catch (Exception e) {
                        System.out.println("Entrer un nombre valide !");
                        sc.nextLine();
                    }
                }

                if (!op.equals("f") && !op.equals("r")) {
                    validInput = false;
                    while (!validInput) {
                        System.out.print("Entrer le nombre 2 : ");
                        try {
                            n2 = sc.nextDouble();
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Entrer un nombre valide !");
                            sc.nextLine();
                        }
                    }
                }

                sc.nextLine();

                switch (op) {
                    case "/":
                        if (n2 == 0) {
                            System.err.println("Erreur : Division par zero.");
                        } else {
                            System.out.println(n1 + " / " + n2 + " = " + calculator.Division(n1, n2));
                        }
                        break;
                    case "+":
                        System.out.println(n1 + " + " + n2 + " = " + calculator.Addition(n1, n2));
                        break;
                    case "-":
                        System.out.println(n1 + " - " + n2 + " = " + calculator.Soustraction(n1, n2));
                        break;
                    case "*":
                        System.out.println(n1 + " * " + n2 + " = " + calculator.Multiplication(n1, n2));
                        break;
                    case "p":
                        System.out.println(n1 + " ^ " + n2 + " = " + calculator.Puissance(n1, n2));
                        break;
                    case "f":
                        if (n1 < 0 || n1 != (int) n1) {
                            System.out.println("Erreur : Le factoriel est defini pour les entiers positifs.");
                        } else {
                            System.out.println("Le factoriel de " + (int) n1 + " est : " + calculator.factorielle((int) n1));
                        }
                        break;
                    case "r":
                        if (n1 < 0) {
                            System.out.println("Erreur : La racine carree d'un nombre negatif n est pas definie.");
                        } else {
                            System.out.println("Racine carrée de " + n1 + " : " + calculator.Racine(n1));
                        }
                        break;
                    default:
                        System.err.println("Operateur invalide.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number");
                sc.nextLine();
            }
        }
        sc.close();

    }
    private static boolean isValidOperator(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("p") || op.equals("r") || op.equals("f");
    }
}
