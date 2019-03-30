package team.fan;

import team.Command;

public class CellingFanOffCommand implements Command {

    CellingFan cellingFan;

    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    public void execute() {
        cellingFan.off();
    }

    public void undo() {

    }
}
