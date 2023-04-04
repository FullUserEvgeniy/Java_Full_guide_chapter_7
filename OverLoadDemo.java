public class OverLoadDemo {
    void test(){
        System.out.println("Параметры отсутствуют");
    }
    void test(int a){
        System.out.println("Параметр int: " + a);
    }
    void test(int a, int b){
        System.out.println("Параметры int a: " + a + " int b: " + b);
    }
    double test(double a){
        System.out.println("Параметр double a: " + a);
        return a * a;
    }
}
// Демонстрация перегрузки методов
class OverLoad{
    public static void main(String[] args) {
        OverLoadDemo overLoadDemo = new OverLoadDemo();

        overLoadDemo.test();
        overLoadDemo.test(10);
        overLoadDemo.test(10, 20);
        double result = overLoadDemo.test(123.25);
        System.out.println("Результат вызова overLoadDemo.test(123.25): " + result);
    }
}
/*
Параметры отсутствуют
Параметр int: 10
Параметры int a: 10 int b: 20
Параметр double a: 123.25
Результат вызова overLoadDemo.test(123.25): 15190.5625
 */