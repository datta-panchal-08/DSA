// print number from 1 to n using while loop

import java.util.Scanner;

class Problem_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.err.print(counter + " ");
            counter++;
        }
    }
}