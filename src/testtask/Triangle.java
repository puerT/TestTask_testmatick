package testtask;
public class Triangle extends Figure{
    private double a, b, c;
    public Triangle(double a, double b, double c, String color) {
        super("Треугольник", color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private double[] getSidesLength() {
        return new double[]{a, b, c};
    }
    
    /**
     *   @param side Сторона, медиану к которой мы хотим вычислить
     */
    private double getMedianLength(char side){
        double a2 = Math.pow(a, 2),
               b2 = Math.pow(b, 2),
               c2 = Math.pow(c, 2);
        switch(side){
            case 'a': 
                return Math.sqrt((2*b2 + 2*c2 - a2)/4);
            case 'b':
                return Math.sqrt((2*a2 + 2*c2 - b2)/4);
            case 'c':
                return Math.sqrt((2*a2 + 2*b2 - c2)/4);
            default:
                return 0;
        }
    }
    
    @Override
    public double getArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    

    
    @Override
    public String[] getParameters() {
        return new String[]{getType(),
                            String.valueOf(getArea()),
                            String.valueOf(getSidesLength()[0]),
                            String.valueOf(getSidesLength()[1]),
                            String.valueOf(getSidesLength()[2]),
                            getColor() 
        };
    }

    @Override
    public void display() {
        char sides[] = new char[]{'a', 'b', 'c'};
        char side = sides[0+(int)(Math.random()*2)];
        System.out.printf("Фигура: %s, площадь: %.2f кв.ед, длина медины к стороне %s: %.2f ед., цвет: %s\n", 
                          getType(), getArea(), side, getMedianLength(side), getColor());
    }
}
