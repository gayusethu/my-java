package forLoopPractice;

public class Edureka {
    public static void pyramidPattern(int input) {
        for (int row = 0; row < input; row++) //outer loop for number of rows(input)
        {
//            for (int column = input - row; column > 1; column--) //inner loop for spaces
//            {
//                System.out.print(" "); //print space
//            }
//            for (int j = 0; j <= row; j++) //inner loop for number of columns
//            {
//                System.out.print("* "); //print star
//            }
//
//            System.out.println(); //ending line after each row
            for (int column = 0; column < input; column++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

    public static void main(String args[]) //driver function
    {
        int n = 5;
        pyramidPattern(n);
    }
}