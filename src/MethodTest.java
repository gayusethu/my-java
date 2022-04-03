public class MethodTest {
    public static void main(String[] args) {
        System.out.println("before");print();
        System.out.println("after");
    }

    public static int print() {
        if(1!=2) return 1;
        else
            return 1;
    }
}
