package Command;


public class BeeBot {
   Command command;

    public BeeBot(){}

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        this.command.execute();
    }
    public void moveForward() {
        System.out.println("Move Forward");
    }

    public void turnRight(){
        System.out.println("Move Right");

    }
    public void turnLeft(){
        System.out.println("Move Left");
    }
}
