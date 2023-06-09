// Простой пример использования рекурсии
// т.е. вызов метода из самого метода...
public class Factorial {
    int fact(int n){
        int result;
        if (n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
class Recursion{
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Факториал 3 = " + factorial.fact(3));
        System.out.println("Факториал 4 = " + factorial.fact(4));
        System.out.println("Факториал 5 = " + factorial.fact(5));
    }
}
/*
Факториал 3 = 6
Факториал 4 = 24
Факториал 5 = 120
 */