package frc.robot.pnumatics;

import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class PnumaticsConfig {

    private PneumaticsModuleType moduleType;
    private int channel1;
    private int channel2;

    public PnumaticsConfig(int channel) {
        this(channel, 0);
    }

    public PnumaticsConfig(int channel1, int channel2) {
        this(channel1, channel2, PneumaticsModuleType.CTREPCM);
    }
    public PnumaticsConfig(int channel1, int channel2, PneumaticsModuleType moduleType) {
        this.channel1 = channel1;
        this.channel2 = channel2;
        this.moduleType = moduleType;
    }

    public PneumaticsModuleType getPnumaticsType() {
        return moduleType;
    }

    public int getChannel1() {
        return channel1;
    }

    public int getChannel2() {
        return channel2;
    }
}
