package testtask;
public class Square extends Figure{
    private double sqSideLength;
    
    public Square(double sqSideLength, String color) {
        super("Квадрат", color);
        this.sqSideLength = sqSideLength;
    }
    
    public double getSideLength(){
        return sqSideLength;
    }
    
    @Override
    public double getArea() {
        return Math.pow(sqSideLength, 2);
    }

    @Override
    public String getType() {
        return super.getType();
    }
    
    @Override
    public String getColor() {
        return super.getColor();
    }
    
    @Override
    public String[] getParameters() {
        return new String[]{getType(),
                            String.valueOf(getArea()),
                            String.valueOf(getSideLength()),
                            getColor() 
        };
    }

    @Override
    public void display() {
        System.out.printf("Фигура: %s, площадь: %.2f кв.ед, длина стороны: %.2f ед., цвет: %s\n", 
                          getType(), getArea(), getSideLength(), getColor());
    }
    
}
