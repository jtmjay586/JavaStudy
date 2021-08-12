package DesignPattern.HelloDesignPattern.src.StrategyPattern;

public class main {
    public static void main(String[] args) throws Exception {
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();
    }
}
