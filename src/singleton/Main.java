package singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("两个实例是同一个！");
        } else {
            System.out.println("两个实例不是同一个！");
        }
    }
}
