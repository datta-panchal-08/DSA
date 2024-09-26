import java.util.Scanner;

public class PrintNumbersFrom_1_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        int counter = 1;
        while (counter <= num) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
