package testtask;
public class Trapezium extends Figure{
    /*
    a - верхняя сторона
    b - нижняя сторона
    h - высота
    */
    private double a, b, h;
    /*
    aplha, beta - градусы при основании трапеции
    */
    private int  alpha, beta;
    public Trapezium(double upperSide, double downSide, double height, String color) {
        super("Трапеция", color);
        a = upperSide;
        b = downSide;
        h = height;
        alpha = (int)(10+(Math.random()*90));
        beta = 180 - alpha;
    }
    
    /*
    Возвражает параметры: верхняя сторона, нижняя, левая, правая, высота
    */
    public double[] getSidesLength(){
        return new double[]{a, b, Math.abs(h/Math.sin(alpha)), Math.abs(h/Math.sin(beta)), h};
    }
    
    public double getSideLength(String side){
        switch(side){
            case "top": return a;
            case "bottom": return b;
            case "left": return Math.abs(h/Math.sin(alpha));
            case "right": return Math.abs(h/Math.sin(beta));
            default: return 0;
        }
    }
    
    @Override
    public double getArea() {
        return ((a + b)/2)*h;
    }

    @Override
    public String[] getParameters() {
        return new String[]{getType(),
                            String.valueOf(getArea()),
                            String.valueOf(getSidesLength()[0]),
                            String.valueOf(getSidesLength()[1]),
                            String.valueOf(getSidesLength()[2]),
                            String.valueOf(getSidesLength()[3]),
                            getColor() 
        };
    }

    @Override
    public void display() {
        String sides[] = new String[]{"top", "bottom", "left", "right"};
        String side = sides[0+(int)(Math.random()*3)];
        System.out.printf("Фигура: %s, площадь: %.2f кв.ед, длина стороны %s: %.2f ед., цвет: %s\n", 
                          getType(), getArea(), side, getSideLength(side), getColor());
    }
    
}
