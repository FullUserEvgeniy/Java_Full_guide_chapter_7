// Усовершенствованный класс Stack, в котором
// используется член length в типе массива
public class Stack {
    private int[] stk;
    private int tos;

    Stack(int size){
        stk = new int[size];
        tos = -1;
    }

    void push(int item){
        if (tos==stk.length-1) System.out.println("Стек полон");
        else stk[++tos] = item;
    }

    int pop(){
        if (tos<0) {
            System.out.println("\nСтек пуст");
            return 0;
        }else return stk[tos--];
    }
}
class TestStack2{
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        Stack stack2 = new Stack(8);

        for (int i = 0; i<6; i++) stack1.push(i);
        for (int i = 0; i<9; i++) stack2.push(i);

        System.out.println("Стек stack1 ");
        for (int i = 0; i<6; i++) System.out.print(stack1.pop() + " ");
        System.out.println();
        System.out.println("Стек stack2 ");
        for (int i = 0; i<9; i++) System.out.print(stack2.pop() + " ");
    }
}
/*
Стек полон
Стек полон
Стек stack1
4 3 2 1 0
Стек пуст
0
Стек stack2
7 6 5 4 3 2 1 0
Стек пуст
0
 */