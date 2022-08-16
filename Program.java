import java.util.List;

public class Program {


    public static void main(String[] args) {

        FigureCollection collection = new FigureCollection();

        try {
            Triangle triangle = new Triangle(5,10,5);
            double per = triangle.perimeter();
            double sq = triangle.area();
            collection.addFigure(triangle);
            System.out.println("triangle " + per);
            System.out.println("triangle " + sq);
            System.out.println();


        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

        try{
            Circle circle = new Circle(5);
            double circumferenceLength = circle.circumferenceLength();
            double areaCircle = circle.area();
            System.out.println("circle " + circumferenceLength);
            System.out.println("circle " + areaCircle);
            System.out.println();
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

        try{
            Square square = new Square(9);
            double perimeterSquare = square.perimeter();
            double areaSquare = square.area();
            System.out.println("square " + perimeterSquare);
            System.out.println("square " + areaSquare);
            System.out.println();
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

        try{
            Rectangle rectangle = new Rectangle(5,9);
            double perimeterRectangle = rectangle.perimeter();
            double areaRectangle = rectangle.area();

            System.out.println("rectangle " + perimeterRectangle);
            System.out.println("rectangle " + areaRectangle);
            System.out.println();

        } catch (IllegalArgumentException e){
            System.out.println(e);
        }



    }
}
