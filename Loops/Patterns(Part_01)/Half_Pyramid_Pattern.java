// Print Half Pyrami Pattern
public class Half_Pyramid_Pattern {
    public static void main(String args[]) {
        // Outer Loop
        for (int i = 1; i <= 4; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
