package DesignPattern.HelloDesignPattern.src.TemplateMethodPattern;

public class SteelArmor implements Armor{
    @Override
    public void defense() {
        System.out.println("갑옷방어!!");
    }
}