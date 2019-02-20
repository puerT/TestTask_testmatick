package testtask;

import java.util.ArrayList;
import java.util.List;

public class TestTask {
    //Список реализованных фигур
    enum AvailableFigures{
        Circle, Square, Triangle, Trapezium
    }
    
    private static String[] colors = new String[]{"Черный",
                                          "Белый", 
                                          "Красный", 
                                          "Синий", 
                                          "Зеленый", 
                                          "Фиолетовый",
                                          "Серый", 
                                          "Желтый"};
    
    public static void main(String[] args) {
        List<Figure> listOfFigures = new ArrayList<>();
        int count = 3+(int)(Math.random()*20);
        System.out.printf("Количество сгенерированных фигур: %d\n", count);
        while(count > 0){
            String ranColor = colors[randomInt(0, colors.length)];
            int figure = randomInt(0, AvailableFigures.values().length);
            //Случайным образом генерируем одну из доступных фигур
            switch(figure){
                case 0:
                    Circle circ = createCircle(ranColor);
                    listOfFigures.add(circ);
                    break;
                case 1: 
                    Square sq = createSquare(ranColor);
                    listOfFigures.add(sq);
                    break;
                case 2: 
                    Triangle tr = createTriangle(ranColor);
                    listOfFigures.add(tr);
                    break;
                case 3: 
                    Trapezium trapez = createTrapezium(ranColor);
                    listOfFigures.add(trapez);
                    break;
            }
            count--;
        }
        showFigures(listOfFigures);
    }
    
    public static void showFigures(List<Figure> list){
        for(int i = 0; i < list.size(); i++){
            list.get(i).display();
        }
    }
    public static Circle createCircle(String color){
        return new Circle(randomDouble(5, 50), color);
    }
    public static Square createSquare(String color){
        return new Square(randomDouble(5, 50), color);
    }
    public static Triangle createTriangle(String color){
        int a, b, c;
        a = randomInt(5, 50);
        b = randomInt(10, 50);
        c = randomInt(Math.abs(a - b), a + b);
        return new Triangle(a, b, c, color);
    }
    public static Trapezium createTrapezium(String color){
        double upp, dwn, height;
        upp = randomDouble(5, 50);
        dwn = upp + randomDouble(5, 50);
        height = randomDouble(40, 60);
        return new Trapezium(upp, dwn, height, color);
    }
    
    private static double randomDouble(int left, int rigth){
        return left + Math.random()*rigth;
    }
    private static int randomInt(int left, int right){
        return left + (int)(Math.random()*right);
    }
}
