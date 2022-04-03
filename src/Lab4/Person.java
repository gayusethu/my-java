package Lab4;

public class Person {
    int age;
    String name;

    public void eat() {
        if (age > 1 && age < 40) {
            System.out.println(" eat less");
        } else if (age > 40) {
            System.out.println("eat more");
        } else {
            System.out.println("age problem");
        }


    }

    public void sleep() {
        if (age < 40) {
            System.out.println("Sleep more");
        } else {
            System.out.println("Sleep less");
        }
    }
}
