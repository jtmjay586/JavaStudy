package DesignPattern.HelloDesignPattern.src.TemplateMethodPattern;

public abstract class AbstSoldierConscriptionHelper {
    protected abstract Citizen conscriptionCitizen(); //시민들 중 마린이 될 수 있는 조건의 시민 징집합니다.

    protected abstract void training(Citizen citizen); //징집된 군인들을 훈련합니다.

    protected abstract void supplyEquipment(Soldier soldier); //보직을 시민에서 병사로 변경합니다.

    protected abstract Soldier changeOfPosition(Citizen citizen); //장비를 보급합니다.

    public Soldier conscription() { // 시민들을 징집해서 병사로 만들어 주세요.
        Citizen citizen = conscriptionCitizen();
        training(citizen);
        Soldier soldier = changeOfPosition(citizen);
        supplyEquipment(soldier);
        return soldier;
    }
}