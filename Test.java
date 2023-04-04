// Объекты можно передавать методам
public class Test {
    int a, b;

    Test(int a, int b){
        this.a = a;
        this.b = b;
    }

    boolean equalsTo(Test obj){
        if (obj.a == a && obj.b == b) return true;
        else return false;
    }
}
class PassObj{
    public static void main(String[] args) {
        Test test1 = new Test(100, 200);
        Test test2 = new Test(100, 200);
        Test test3 = new Test(-1, -1);

        System.out.println("test1 == test2: " + test1.equalsTo(test2));
        System.out.println("test2 == test3: " + test2.equalsTo(test3));
    }
}
/*
test1 == test2: true
test2 == test3: false
 */