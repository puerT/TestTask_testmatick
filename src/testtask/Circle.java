package testtask;
public class Circle extends Figure{
    private double radius;
    
    Circle(double radius, String color){
        super("Круг", color);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override
    public String getType() {
        return super.getType();
    }
    
    @Override
    public String getColor(){
        return super.getColor();
    }
    
    @Override
    public String[] getParameters(){
        return new String[]{getType(),
                            String.valueOf(getArea()),
                            String.valueOf(getRadius()),
                            getColor() 
        };
    }

    @Override
    public void display() {
        System.out.printf("Фигура: %s, площадь: %.2f кв.ед, радиус: %.2f ед., цвет: %s\n", 
                          getType(), getArea(), getRadius(), getColor());
    }
    
}
