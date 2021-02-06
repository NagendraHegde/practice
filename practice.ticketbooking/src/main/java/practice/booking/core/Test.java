package practice.booking.core;

public class Test implements TestInterface {

    public static void main(String[] args) {

        try {
            System.out.println("try");
            return;
        } catch (Exception e) {
            System.out.println("exception catch");
        } finally {
//            try {
//                System.out.println("finally enter");
//                int x = 100 / 0;
//            } catch (Exception e) {
//                System.out.println("inside exception");
//            } finally {
//                System.out.println("inside finally");
//            }

            int x = 100 / 0;
            System.out.println("finally exit");

        }
        System.out.println("afterall");

        Test t = new Test();
        t.method1();
    }

    @Override
    public void method1() {
        System.out.println("hi");
    }

    public void method1(int x){
        System.out.println("overloaded");
    }
}
