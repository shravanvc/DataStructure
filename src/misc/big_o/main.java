package misc.big_o;

public class main {
    public static void main(String[] args) {

        PrintItems(10);
    }

    static void PrintItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }
}
