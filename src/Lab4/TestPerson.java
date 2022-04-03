package Lab4;

public class TestPerson {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.eat();
        p1.sleep();

        Person krish=new Person();
        krish.age=7;
        krish.eat();
        krish.sleep();

        Person sethu=new Person();
        sethu.age=41;
        sethu.eat();
        sethu.sleep();

        Person papa=new Person();
        papa.age=-1;
        papa.eat();
        papa.sleep();


    }

}