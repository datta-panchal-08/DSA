public class PrintReverseOfNumber {
    public static void main(String[] args) {
        int number = 15541;

        while (number > 0) {

            int lastdigit = number % 10;
            System.out.print(lastdigit + "");
            number = number / 10;
        }
        System.out.println();
    }
}
