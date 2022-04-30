package frc.robot.pnumatics;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public enum SolenoidState {
    IN(true, Value.kForward),
    OUT(false, Value.kReverse);

    private boolean value;
    private Value kValue;

    private SolenoidState(boolean value, Value kValue) {
        this.value = value;
        this.kValue = kValue;
    }

    public boolean getValue() {
        return value;
    }

    public Value getKValue() {
        return kValue;
    }

    public static SolenoidState fromValue(boolean value) {
        if (IN.getValue() == value) {
            return IN;
        }
        return OUT;
    }

    public static SolenoidState fromKValue(Value kValue) {
        if (IN.getKValue() == kValue) {
            return IN;
        }
        return OUT;
    }
}
