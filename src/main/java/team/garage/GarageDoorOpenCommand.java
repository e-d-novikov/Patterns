package team.garage;

import team.Command;

public class GarageDoorOpenCommand implements Command {

    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.lightOn();
        door.up();
        door.stop();
    }

    public void undo() {
        door.stop();
        door.down();
        door.lightOff();
    }
}
