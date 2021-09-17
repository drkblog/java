package ar.com.drk.jdk17;

public class HelloWorld {

    static void testInstanceOf(final Object object) {
        if (object instanceof Integer integer) {
            System.out.println(integer);
        }
    }
    public static void main(String[] args) {
        testInstanceOf(12345);
    }
}
