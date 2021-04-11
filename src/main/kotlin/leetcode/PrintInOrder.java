package leetcode;

public class PrintInOrder {

    public static void main(String[] args) {
        new Thread(() -> new Foo().first()).start();
        new Thread(() -> new Foo().second()).start();
        new Thread(() -> new Foo().third()).start();
    }

}


class Foo {
    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third");
    }


}
