import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(
                    "+ : pour l'addition\n" +
                            "- : pour la soustraction\n" +
                            "* : pour la multiplication\n" +
                            "/ : pour la division\n" +
                            "p : pour calculer la puissance\n" +
                            "r : pour calculer le racine carree\n" +
                            "f : pour calculer le factorielle\n" +
                            "q : pour quitter\n"
            );

            System.out.println("Operateur : ");
            op = sc.nextLine();

            if (op.equals("q")) {
                break;
            }

            System.out.print("Entrer le nombre 1 : ");
            double n1 = sc.nextDouble();
            sc.nextLine();

            if (!op.equals("f") && !op.equals("r")) {
                System.out.print("Entrer le nombre 2 : ");
                double n2 = sc.nextDouble();
                sc.nextLine();

                switch (op) {
                    case "/":
                        System.out.println(n1+" / "+n2+" = "+calculator.Division(n1, n2));
                        break;
                    case "+":
                        System.out.println(calculator.Addition(n1, n2));
                        break;
                    case "-":
                        System.out.println(calculator.Soustraction(n1, n2));
                        break;
                    case "*":
                        System.out.println(calculator.Multiplication(n1, n2));
                        break;
                    case "p":
                        System.out.println(calculator.Puissance(n1, n2));
                        break;
                    default:
                        System.err.println("Invalid operator");
                        break;
                }
            } else {
                switch (op) {
                    case "f":
                        System.out.println("Le factorielle de " + n1 + " est : " + calculator.Factorielle((int) n1));
                        break;
                    case "r":
                        System.out.println("Racine Carre de "+n1+" : "+calculator.Racine(n1));
                        break;
                    default:
                        System.err.println("Invalid operator");
                        break;
                }
            }
        } while (true);

        sc.close();
    }
}