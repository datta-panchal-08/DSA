import java.util.Scanner;

//// Keep Entering Number Till User Enters A Multiple Of 10 Using Continue Keyword

public class Do_While_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Your Number");
            int n = sc.nextInt();
            System.out.println();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
