package DesignPattern.HelloDesignPattern.src.InterpreterPattern;

import java.text.ParseException;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
    
}