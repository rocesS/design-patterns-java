package Facade;

public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

     void drawCircle(){
        circle.draw();
    }
     void drawRectangle(){
        rectangle.draw();
    }
     void drawSquare(){
        square.draw();
    }
}
