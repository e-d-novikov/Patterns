package team;

import team.fan.CellingFan;
import team.fan.CellingFanOffCommand;
import team.fan.CellingFanOnCommand;
import team.garage.GarageDoor;
import team.garage.GarageDoorCloseCommand;
import team.garage.GarageDoorOpenCommand;
import team.light.Light;
import team.light.LightOffCommand;
import team.light.LightOnCommand;
import team.stereo.Stereo;
import team.stereo.StereoOffCommand;
import team.stereo.StereoOnWithCDCommand;
import team.tv.TV;
import team.tv.TVOffCommand;
import team.tv.TVOnCommand;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CellingFanOnCommand cellingFanOn = new CellingFanOnCommand(cellingFan);
        CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        Command[] partyOn = {livingRoomLightOn, tvOn, stereoOn};
        Command[] partyOff = {livingRoomLightOff, tvOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, cellingFanOn, cellingFanOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(4, stereoOn, stereoOff);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);

        /*remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();*/
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
