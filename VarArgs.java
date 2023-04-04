// Демонстрация использования аргументов переменной длины
public class VarArgs {
    static void vaTest(int ... v){
        System.out.println("Количество аргументов = " + v.length);
        System.out.println("Содержимое: ");
        for (int x : v) System.out.println(x);
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
/*
Количество аргументов = 1
Содержимое:
10
Количество аргументов = 3
Содержимое:
1
2
3
Количество аргументов = 0
Содержимое: 
 */