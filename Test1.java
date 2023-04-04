// передача аргументов
// примитивные типы передаются по значению
public class Test1 {
    void meth(int i, int j){
        i *= 2;
        j /=2;
    }
}
class CallByValue{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int a = 15, b = 20;
        System.out.println("a = " + a + " b = " + b + " перед вызовом метода meth()");
        test1.meth(a, b);
        System.out.println("a = " + a + " b = " + b + " после вызовом метода meth()");
    }
}
/*
a = 15 b = 20 перед вызовом метода meth()
a = 15 b = 20 после вызовом метода meth()
 */