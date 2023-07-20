package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;


public class RobotContainer {
    XboxController ManipulatorXbox = new XboxController(0);
    XboxController DriverXbox = new XboxController(1);

    public void startShuffleBoard(){
        ShuffleboardTab statTab = Shuffleboard.getTab("Statistics");
        
        statTab.add("pwm port number ", Constants.RollerBarMotorPort);
        ShuffleboardLayout facePress = Shuffleboard.getTab("Statistics")
            .getLayout("Face Press", BuiltInLayouts.kList)
            .withSize(1,4);
        facePress.add("Y button ", ManipulatorXbox.getYButtonPressed());
        facePress.add("B button ", ManipulatorXbox.getBButtonPressed());
        facePress.add("A button ", ManipulatorXbox.getAButtonPressed());
        facePress.add("X button ", ManipulatorXbox.getXButtonPressed());

        ShuffleboardLayout DPad = Shuffleboard.getTab("Statistics")
            .getLayout("DPad Press -1 = not pressed", BuiltInLayouts.kList)
            .withSize(2,2);
        DPad.add("Left X ", ManipulatorXbox.getLeftX()); // For the dpad controls, I wasn't sure exactly what the buttons were called so this mght be wrong
        DPad.add("Left Y ", ManipulatorXbox.getLeftY());
        DPad.add("Right X ", ManipulatorXbox.getRightX());
        DPad.add("Right Y ", ManipulatorXbox.getRightY());

        ShuffleboardLayout leftJoy = Shuffleboard.getTab("Statistics")
        .getLayout("LeftJoy Moved", BuiltInLayouts.kList)
        .withSize(1,1);
        leftJoy.add("If Pressed", ManipulatorXbox.getLeftStickButtonPressed());

        ShuffleboardLayout rightJoy = Shuffleboard.getTab("Statistics")
        .getLayout("rightJoy Moved", BuiltInLayouts.kList)
        .withSize(1,1);
        rightJoy.add("If Pressed", ManipulatorXbox.getRightStickButtonPressed());
    }
 
    public RobotContainer(){
        startShuffleBoard();

    }
}
