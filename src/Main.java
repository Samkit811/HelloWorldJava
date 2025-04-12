public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        FirstClass obj = new FirstClass();
        obj.hello();
        obj.num = 100;

        FirstClass.greeting("Jay");

        System.out.println(obj.hashCode()); //1554547125

        FirstClass obj1 = new FirstClass();
        obj1.num = 100;

        System.out.println("Compare to itself " + obj.equals(obj));

        System.out.println("Compare to other " + obj.equals(obj1));
    }
}