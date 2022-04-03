public class Test {
    public static void main(String[] args) {
        int x=10;
        System.out.println(x);
        process( 12.5);
process(x);
    }

    private static void process(double v) {
        System.out.println(v);
    }

    public static void process(int y) {

        System.out.println(y);

    }
}
