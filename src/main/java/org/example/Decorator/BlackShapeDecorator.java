package Decorator;

class BlackShapeDecorator extends ShapeDecorator {

    BlackShapeDecorator(final Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(final Shape decoratedShape){
        System.out.println("Border Color: black");
    }
}
