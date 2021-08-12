package DesignPattern.HelloDesignPattern.src.VisitorPattern;

public interface Element {
    public abstract void accept(Visitor v);
}