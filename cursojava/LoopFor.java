package cursojava;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++ ) {
            System.out.println("O valor de i: " + i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println("O valor de i: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        int count = 0;
        for (; count < 5; ) {
            System.out.println("Count: " + count);
            count += 2;
        }
    }
}
