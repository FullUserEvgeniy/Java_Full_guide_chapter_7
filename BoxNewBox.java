// Здесь класс Вох позволяет один объект инициализировать другим
public class BoxNewBox {
    double width;
    double height;
    double depth;

    BoxNewBox(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    BoxNewBox(BoxNewBox obj){
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    BoxNewBox(){
        width = height = depth = -1;
    }

    BoxNewBox(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
class OverLoadCons2{
    public static void main(String[] args) {
        BoxNewBox boxNewBox1 = new BoxNewBox(10, 20, 15);
        BoxNewBox boxNewBox2 = new BoxNewBox();
        BoxNewBox boxNewBox3 = new BoxNewBox(7);
        BoxNewBox boxNewBox4 = new BoxNewBox(boxNewBox1);

        System.out.println("Объем коробки boxNewBox1: " + boxNewBox1.volume());
        System.out.println("Объем коробки boxNewBox2: " + boxNewBox2.volume());
        System.out.println("Объем коробки boxNewBox3: " + boxNewBox3.volume());
        System.out.println("Объем коробки boxNewBox4: " + boxNewBox4.volume());
    }
}
/*
Объем коробки boxNewBox1: 3000.0
Объем коробки boxNewBox2: -1.0
Объем коробки boxNewBox3: 343.0
Объем коробки boxNewBox4: 3000.0
 */