package misc.big_o;

public class main {
    public static void main(String[] args) {

        PrintItems(10,12);
    }

    static void PrintItems(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
