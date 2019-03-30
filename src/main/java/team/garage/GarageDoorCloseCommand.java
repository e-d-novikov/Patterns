package team.garage;

import team.Command;

public class GarageDoorCloseCommand implements Command {

    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.stop();
        door.down();
        door.lightOff();
    }

    public void undo() {
        door.lightOn();
        door.up();
        door.stop();
    }
}
