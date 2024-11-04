package Functions.BasicProblems;

import java.util.Scanner;

public class BinomialCofficient {
    public static int factorial(int num) {
        int factorial = 1;
            for (int i = 1; i <=num; i++) {
                factorial *= i;
            }
        return factorial;
    }

    public static int binomialCofficient(int r , int n){
        int fact_r = factorial(r);
        int fact_n = factorial(n);
        int res = n-r;
        int fact_nmr = factorial(res);
        int bionocoff = fact_n /(fact_r * fact_nmr);
        return bionocoff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("You Entered : "+"first = "+num1+" Second = "+num2);
        System.out.println("Bionominal Cofficient Of Number Is : "+binomialCofficient(num1, num2)); 
    }
}
