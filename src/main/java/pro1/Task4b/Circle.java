package pro1.Task4b;

public class Circle<T extends Number>
{
    private T radius;
    public Circle(T radius) {
        this.radius = radius;
    }
    public T getRadius(){
        return radius;
    }
    public double getArea() {
        return Math.PI
                * radius.doubleValue()
                * radius.doubleValue();
    }
}