package frc.robot.pnumatics;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DoublePnumaticSubsystem extends SubsystemBase {

    private DoubleSolenoid solenoid;

    public DoublePnumaticSubsystem(int channel1, int channel2) {
        this(new PnumaticsConfig(channel1, channel2));
    }

    public DoublePnumaticSubsystem(PnumaticsConfig pnumaticsConfig) {
        solenoid = new DoubleSolenoid(pnumaticsConfig.getPnumaticsType(), pnumaticsConfig.getChannel1(), pnumaticsConfig.getChannel2());
    }

    public void moveSolenoid(SolenoidState state) {
        solenoid.set(state.getKValue());
    }

    public SolenoidState getState() {
        return SolenoidState.fromKValue(solenoid.get());
    }

}
