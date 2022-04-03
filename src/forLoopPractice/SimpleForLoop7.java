package forLoopPractice;

public class SimpleForLoop7 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println("i="+i);
            for (int j = 10; j >= 0; j--) {

                System.out.println("j="+j);
                for(int k = 10;k>=10;k--){
                    System.out.println("k="+k);
                }
            }
        }
    }
}