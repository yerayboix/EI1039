package Command;

public class DemoCliente {
    public static void main(String[] args) {
        /*Le paso el BeeBotMejorado porque si no tengo que hacer 3 clases mas para los movimientos y al final el BeeBot normal
        simplemente ejecuta el comando directamente*/
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
