/* Expected output: 0, 2, 4, 6, 8 */

public class Loop1 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 8; i += 2) {
            System.out.print(i + " ");
        }
    }
}