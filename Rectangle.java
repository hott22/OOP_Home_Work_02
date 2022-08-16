public class Rectangle extends Figure{
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide){
        if(firstSide < 1 || secondSide < 1){
            throw new IllegalArgumentException("exception");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;

    }



    @Override
    public double perimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double area() {

        return firstSide * secondSide;
    }
}
