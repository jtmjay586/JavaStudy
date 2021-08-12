package DesignPattern.HelloDesignPattern.src.CommandPattern;

import java.util.Stack;

public class MacroCommand implements Command {
    private final Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    //추가
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    //마지막 명령 삭제
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    //명령 전체 삭제
    public void clear() {
        commands.clear();
    }

}