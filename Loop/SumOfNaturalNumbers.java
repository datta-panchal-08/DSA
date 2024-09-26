import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter <= num) {
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
