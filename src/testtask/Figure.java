package testtask;
public abstract class Figure {
    private String type;
    private String color;
    
    Figure(String type, String color){
        this.color = color;
        this.type = type;
    }
    public  String getType(){
        return type;
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();
    public abstract String[] getParameters();
    public abstract void display();
}
