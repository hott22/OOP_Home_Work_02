public class Triangle extends Figure{
    private int firstSide;
    private int secondSide;
    private int thirdCathet;


    public Triangle(int firstSide, int secondSide, int thirdSide) throws IllegalArgumentException{
        if(firstSide + secondSide <= thirdSide ||
                    secondSide + thirdSide <= firstSide ||
                    firstSide + thirdSide <= secondSide || firstSide < 1 || secondSide < 1 || thirdSide < 1) {
            throw new IllegalArgumentException("exception");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdCathet = thirdSide;
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdCathet;
    }



    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdCathet));
    }
}
