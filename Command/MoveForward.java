package Command;

public class MoveForward implements Command{
    BeeBotMejorado beeBot;

    public MoveForward(BeeBotMejorado beeBot){
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.moveForward();
    }
}
