package Command;

public class MoveRight implements Command{
    BeeBotMejorado beeBot;

    public MoveRight(BeeBotMejorado beeBot){
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.turnRight();
    }
}
