package Decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();


        Shape blackCircle = new BlackShapeDecorator(new Circle());

        Shape blackRectangle = new BlackShapeDecorator(new Rectangle());
        System.out.println("\n\nCircle with normal border");
        circle.draw();

        System.out.println("\nCircle of black border");
        blackCircle.draw();

        System.out.println("\nRectangle of black border");
        blackRectangle.draw();
    }
}
