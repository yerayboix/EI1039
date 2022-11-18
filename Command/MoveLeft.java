package Command;

public class MoveLeft implements Command {
    BeeBotMejorado beeBot;

    public MoveLeft(BeeBotMejorado beeBot){
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.turnLeft();
    }
}
