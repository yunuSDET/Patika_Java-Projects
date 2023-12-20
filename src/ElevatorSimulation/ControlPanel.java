package ElevatorSimulation;

import java.util.List;

public class ControlPanel {
    private int targetButton;
    private boolean openCloseButton;
    private boolean emergencyButton;

    public ControlPanel() {

        this.openCloseButton = false;
        this.emergencyButton = false;
    }

    public void pressTargetBtn(int targetButton){
        this.targetButton=targetButton;
    }

    @Override
    public String toString() {
        return "ControlPanel{" +
                "Target floor =" + targetButton +
                ", Is the door open =" + openCloseButton +
                ", Emergency =" + emergencyButton +
                '}';
    }
}
