package DesignPattern.HelloDesignPattern.src.DecoratorPattern;

public abstract class Border extends Display{
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}