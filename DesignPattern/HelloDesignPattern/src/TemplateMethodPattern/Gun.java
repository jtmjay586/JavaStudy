package DesignPattern.HelloDesignPattern.src.TemplateMethodPattern;

public class Gun implements Weapon{
    @Override
    public void attack() {
        System.out.println("빵야빵야");
    }
}