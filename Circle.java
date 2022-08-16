/**
 * Класс окружность
 */
public class Circle extends Figure{
    private int radius;

    /**
     * контруктор класса Circle
     * @param radius радиус окружности
     */
    public Circle(int radius){
        if(radius < 1){
            throw new IllegalArgumentException("exception");
        }
        this.radius = radius;
    }

    /**
     * метод вычисления длины окружности
     */
    public double circumferenceLength() {

        return 2 * Math.PI * radius;
    }

    /**
     * метод вычисления площади окружности
     */
    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return circumferenceLength();
    }
}
