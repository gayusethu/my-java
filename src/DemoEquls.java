
public class DemoEquls {
    public static void main(String[] args) {

        String a = "apple";
        String b = "orange";

        boolean c = a.equals(b);


        System.out.println(c);
        boolean checkEquals = checkEquals(a, b);


        System.out.println(c);

    }

    private static boolean checkEquals(String firstString, String secondString) {
        if (firstString == secondString)
            return true;
        else
            return false;
    }
}