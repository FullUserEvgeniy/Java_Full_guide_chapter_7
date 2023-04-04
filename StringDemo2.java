// Демонстрация работы нескольких методов класса String
public class StringDemo2 {
    public static void main(String[] args) {
        String str1 = "Первая строка";
        String str2 = "Вторая строка";
        String str3 = str1;

        System.out.println("Длина строки str1 = " + str1.length());
        System.out.println("Символ по индексу 3 в строке str1 = " + str1.charAt(3));

        if (str1.equals(str2)) System.out.println("Строка str1 равна строке str2");
        else System.out.println("Строка str1 не равна строке str2");

        if (str1.equals(str3)) System.out.println("Строка str1 равна строке str3");
        else System.out.println("Строка str1 не равна строке str3");
    }
}
/*
Длина строки str1 = 13
Символ по индексу 3 в строке str1 = в
Строка str1 не равна строке str2
Строка str1 равна строке str3
 */