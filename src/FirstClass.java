public class FirstClass {

    public int num;

    public void hello(){
        System.out.println("Say Hello");
    }

    public static void greeting(String name){
        System.out.println("Hello, "+ name);
    }

    public boolean equals(FirstClass obj) {
        return this.num == obj.num;
    }
}
