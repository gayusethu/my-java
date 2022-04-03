public class Demo {
    public static void main(String[] args) {
        Person sethu = new Person();
        Person gayu = new Person();

        sethu.name = "Sethu";
        gayu.name = "Gayu";

        System.out.println(sethu.name);
        System.out.println(gayu.name);

        System.out.println("-------------");
        sethu.age= 32;
        System.out.println("sethus age is");
        System.out.println(sethu.age);

        System.out.println("-------------");

        System.out.println("gayus age is");
        System.out.println(gayu.age);

        System.out.println("-------------");
        System.out.println("sethus age is");
        System.out.println(sethu.age);

    }

}
