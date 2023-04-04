// передача аргументов
// объекты передаются через ссылки на них
public class Test2 {
    int a, b;

    Test2(int a, int b){
        this.a = a;
        this.b = b;
    }

    void meth(Test2 obj){
        obj.a *= 2;
        obj.b /= 2;
    }
}
class PassObjRef{
    public static void main(String[] args) {
        Test2 test2 = new Test2(15, 20);

        System.out.println("test2.a = " + test2.a + " test2.b = " + test2.b + " до вызова метода meth()");

        test2.meth(test2);

        System.out.println("test2.a = " + test2.a + " test2.b = " + test2.b + " после вызова метода meth()");
    }
}
/*
test2.a = 15 test2.b = 20 до вызова метода meth()
test2.a = 30 test2.b = 10 после вызова метода meth()

При передаче методу ссылки на объект сама ссылка передается с применением вызова по
значению. Но поскольку передаваемое значение относится к объекту, копия этого значения
по-прежнему будет ссылаться на тот же объект, что и соответствующий аргумент.
 */