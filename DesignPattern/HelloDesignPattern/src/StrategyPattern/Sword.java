package DesignPattern.HelloDesignPattern.src.StrategyPattern;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("검 공격");
    }
}