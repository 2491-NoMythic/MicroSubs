package frc.robot.pnumatics;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SinglePnumaticSubsystem extends SubsystemBase {

    private Solenoid solenoid;

    public SinglePnumaticSubsystem(int channel) {
        this(new PnumaticsConfig(channel));
    }

    public SinglePnumaticSubsystem(PnumaticsConfig pnumaticsConfig) {
        solenoid = new Solenoid(pnumaticsConfig.getPnumaticsType(), pnumaticsConfig.getChannel1());
    }

    public void moveSolenoid(SolenoidState state) {
        solenoid.set(state.getValue());
    }

    public SolenoidState getState() {
        return SolenoidState.fromValue(solenoid.get());
    }

}
