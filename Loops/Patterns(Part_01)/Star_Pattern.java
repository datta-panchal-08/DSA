// Print A Star Pattern
//    *
//    * *
//    * * *
//    * * * *
public class Star_Pattern {
    public static void main(String args[]) {

        for (int lines = 1; lines <= 4; lines++) {
            for (int stars = 1; stars <= lines; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
