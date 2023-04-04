// пример использования рекурсии

public class RecTest {
    int[] values;

    RecTest(int i){
        values = new int[i];
    }
    void printArray(int i){
        if (i == 0) return;
        else printArray(i-1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
class Recurtion2{
    public static void main(String[] args) {
        RecTest recTest = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) recTest.values[i] = i;

        recTest.printArray(10);
    }
}
/*
[0] 0
[1] 1
[2] 2
[3] 3
[4] 4
[5] 5
[6] 6
[7] 7
[8] 8
[9] 9
 */