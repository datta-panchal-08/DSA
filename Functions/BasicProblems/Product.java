package Functions.BasicProblems;

import java.util.Scanner;

public class Product {
    public static int getProduct(int a ,int b){
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("You Entered "+" First Number : "+num1+" Second Number : "+num2); 
        int result = getProduct(num1, num2);
        System.out.println("Product Of Two Numbers Is  : "+result);  
    }
}
