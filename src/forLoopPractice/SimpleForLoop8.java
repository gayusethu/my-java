package forLoopPractice;

public class SimpleForLoop8 {
    public static void main(String[] args) {
        System.out.println("---------Increment by 1------");

        for (int i = 0; i <= 100; i++) {
            System.out.println("i=" + i);
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("-------Increment 5------");
        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println("i=" + i);
            System.out.println(i);

        }

    }
}

