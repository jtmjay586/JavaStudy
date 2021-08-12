package DesignPattern.HelloDesignPattern.src.VisitorPattern;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}