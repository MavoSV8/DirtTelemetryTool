package dirtRally20.telem;

public class Car {
    private float velocity;
    private float gear;
    private float RPMs;
    private float stageTime;
    private float maxRPM;
    private float clutch;
    private float accelerator;
    private float brake;

    public float getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(float accelerator) {
        this.accelerator = accelerator;
    }

    public float getBrake() {
        return brake;
    }

    public void setBrake(float brake) {
        this.brake = brake;
    }

    public float getClutch() {
        return clutch;
    }

    public void setClutch(float clutch) {
        this.clutch = clutch;
    }

    public float getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(float maxRPM) {
        this.maxRPM = maxRPM;
    }




    public float getStageTime() {
        return stageTime;
    }

    public void setStageTime(float stageTime) {
        this.stageTime = stageTime;
    }



    public void setGear(float gear) {
        this.gear = gear;
    }

    public void setRPMs(float RPMs) {
        this.RPMs = RPMs;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getGear() {
        return gear;
    }

    public float getRPMs() {
        return RPMs;
    }

    public float getVelocity() {
        return velocity;
    }
}
