package org.usfirst.frc.team537.robot.joysticks;

public class JoystickBox extends IJoystick {
  public class Buttons {
    public static final int RIGHT_RAMP_DOWN = 1;
    public static final int LEFT_RAMP_DOWN = 2;
    public static final int LEFT_RAMP_UP = 3;
    public static final int RIGHT_RAMP_UP = 4;
    public static final int CUBE_UP = 5;
    public static final int CUBE_DOWN = 6;
    public static final int CUBE_OUT = 7;
    public static final int CUBE_IN = 8;
    public static final int DEPLOY_LEFT_RAMP = 9;
    public static final int DEPLOY_RIGHT_RAMP = 10;
  }
  public JoystickBox(int port) {
    super(port);
  }
  public String getJoystickType() {
    return "Box";
  }
}
