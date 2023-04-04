// Демонстрация работы с внутренним классом
public class Outer {
    private int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println("display() : outer_x = " + outer_x);
        }
    }
}
class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
/*
display() : outer_x = 100
 */