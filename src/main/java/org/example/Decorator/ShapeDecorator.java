package Decorator;

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    ShapeDecorator(final Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
