// возвращение объекта из метода
public class Test3 {
    int a;
    Test3(int a){
        this.a = a;
    }
    Test3 incrByTen(){
        Test3 temp = new Test3(2);
        return temp;
    }
}
class RetObj{
    public static void main(String[] args) {
        Test3 test1 = new Test3(2);
        Test3 test2;

        test2 = test1.incrByTen();

        System.out.println("test1.a = " + test1.a);
        System.out.println("test2.a = " + test2.a);
    }
}
/*
test1.a = 2
test2.a = 2
 */