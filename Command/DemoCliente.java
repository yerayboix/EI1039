package Command;

public class DemoCliente {
    public static void main(String[] args) {
        BeeBot beeBot = new BeeBot();
        BeeBotMejorado beeBotMejorado = new BeeBotMejorado();
        beeBot.setCommand(new MoveForward(beeBotMejorado));
        beeBot.buttonWasPressed();
        beeBot.setCommand(new MoveLeft(beeBotMejorado));
        beeBot.buttonWasPressed();
        beeBot.setCommand(new MoveForward(beeBotMejorado));
        beeBot.buttonWasPressed();
        beeBot.setCommand(new MoveForward(beeBotMejorado));
        beeBot.buttonWasPressed();
        beeBot.setCommand(new MoveRight(beeBotMejorado));
        beeBot.buttonWasPressed();

        System.out.println("--------BeeBot Mejorado-------------");
        beeBotMejorado.setCommand(new MoveForward(beeBotMejorado));
        beeBotMejorado.setCommand(new MoveLeft(beeBotMejorado));
        beeBotMejorado.setCommand(new MoveForward(beeBotMejorado));
        beeBotMejorado.setCommand(new MoveForward(beeBotMejorado));
        beeBotMejorado.setCommand(new MoveRight(beeBotMejorado));
        beeBotMejorado.removeLastAction();
        beeBotMejorado.buttonWasPressed();

    }
}
