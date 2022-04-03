package Lab2;

public class Test2 {

    public static void main(String[] args) {
        int a=10;
         a=11;
        System.out.println("main");
        x();
        Test21.z();

    }
    public static void x(){
        int b=11;
        System.out.println("x");
        y();
    }
    public static void  y(){
        int a=12;
        System.out.println("y");
    }
}

