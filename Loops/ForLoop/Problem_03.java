// Reverse The Given Number Using For Loop
package Loops.ForLoop;

public class Problem_03 {
    public static void main(String args[]) {
        int n = 10899;
        int rev = 0;

        for (int i = n; n > 0; i--) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }

}
