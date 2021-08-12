package DesignPattern.HelloDesignPattern.src.MediatorPattern;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}