import java.util.Scanner;

public class Calculator {
    double Addition(double n1 , double n2)
    {
        return  n1+n2;
    }

    double Soustraction(double n1 , double n2)
    {
        return n1-n2;
    }

    double Multiplication(double n1 , double n2)
    {
        return n1*n2;

    }
    double Division(double n1 , double n2)
    {
        if (n2==0){
            System.out.println("Le nombre ne doit pas etre egal a 0 ");
        }
        return n1/n2;

    }
    double Puissance(double n1 , double n2)
    {
        double res= Math.pow(n1, n2);
        return res;
    }
    double  Racine(double n1 )
    {
        double res= Math.sqrt(n1);
        return res;
    }
    /*
    Fonction factorielle utilisant une methode Recursive
    int Factorielle(int n1) {
        if (n1 <= 1) {
            return 1;
        }
        return n1 * Factorielle(n1 - 1);
    }
     */
    // Fonction factorielle utilisant une methode simple
    int factorielle(int n1)
    {
        int f=1;
        for (int i =1;i<=n1;i++)
        {
            f*=i;
        }
        return f;
    }





}
