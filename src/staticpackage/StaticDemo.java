package staticpackage;

public class StaticDemo {
    public static void main(String[] args) {
        StaticExampleClass s1 = new StaticExampleClass("bmw");
        System.out.println("Make of car is: " + s1.getMake());
        //System.out.println("This is instance no: " + s1.getInstanceNum());
        System.out.println("This is instance no: " + StaticExampleClass.getInstanceNum());

        StaticExampleClass s2= new StaticExampleClass("benz");
        System.out.println("Make of car is: " + s2.getMake());
        //System.out.println("This is instance no: " + s2.getInstanceNum());
        System.out.println("This is instance no: " + StaticExampleClass.getInstanceNum());

    }
}
