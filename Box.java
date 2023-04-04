// Здесь в классе Вох определены три конструктора
public class Box {
    double width;
    double height;
    double depth;
// Это конструктор для Вох .
    Box (double w , double h , double d ) {
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}
class OverLoadCons{
    public static void main(String[] args) {
        Box box1 = new Box(10,20, 15);
        Box box2 = new Box();
        Box box3 = new Box(7);
        double volume;

        volume = box1.volume();
        System.out.println("Объем коробки box1 " + volume);

        volume = box2.volume();
        System.out.println("Объем коробки box2 " + volume);

        volume = box3.volume();
        System.out.println("Объем коробки box3 " + volume);
    }
}
/*
Объем коробки box1 3000.0
Объем коробки box2 -1.0
Объем коробки box3 343.0
 */