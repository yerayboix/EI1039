package Command;


import java.util.LinkedList;
import java.util.Queue;

public class BeeBotMejorado {
    Queue<Command> actions = new LinkedList<Command>();
    Command lastMove;

    public BeeBotMejorado(){}

    public void moveForward() {
        System.out.println("Move Forward");
    }

    public void turnRight(){
        System.out.println("Move Right");

    }
    public void turnLeft(){
        System.out.println("Move Left");
    }

    public void setCommand(Command slot) {
        this.actions.add(slot);
        this.lastMove = slot;
    }

    public void buttonWasPressed(){
        while (!actions.isEmpty()){
            actions.remove().execute();
        }
    }

    public void removeLastAction(){
        if(lastMove != null){
            actions.remove(lastMove);
            lastMove = null;
        }
    }

}
