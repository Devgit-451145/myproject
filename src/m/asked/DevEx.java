package m.asked;

public class DevEx {
    DevEx () {
        System.out.println("const");
    }
    static {
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
    public static void main(String[] args) {
        System.out.println("hello");
        DevEx ex=new DevEx();
    }
}
