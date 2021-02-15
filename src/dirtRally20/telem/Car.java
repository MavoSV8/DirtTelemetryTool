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

    private float longG,latG;

    private float suspensionFL,suspensionFR,suspensionRL,suspensionRR;

    private float brakeFL,brakeFR,brakeRL,brakeRR;

    private float tiresFL,tiresFR,tiresRL;

    public float getLongG() {
        return longG;
    }

    public void setLongG(float longG) {
        this.longG = longG;
    }

    public float getLatG() {
        return latG;
    }

    public void setLatG(float latG) {
        this.latG = latG;
    }

    public float getSuspensionFL() {
        return suspensionFL;
    }

    public void setSuspensionFL(float suspensionFL) {
        this.suspensionFL = suspensionFL;
    }

    public float getSuspensionFR() {
        return suspensionFR;
    }

    public void setSuspensionFR(float suspensionFR) {
        this.suspensionFR = suspensionFR;
    }

    public float getSuspensionRL() {
        return suspensionRL;
    }

    public void setSuspensionRL(float suspensionRL) {
        this.suspensionRL = suspensionRL;
    }

    public float getSuspensionRR() {
        return suspensionRR;
    }

    public void setSuspensionRR(float suspensionRR) {
        this.suspensionRR = suspensionRR;
    }

    public float getBrakeFL() {
        return brakeFL;
    }

    public void setBrakeFL(float brakeFL) {
        this.brakeFL = brakeFL;
    }

    public float getBrakeFR() {
        return brakeFR;
    }

    public void setBrakeFR(float brakeFR) {
        this.brakeFR = brakeFR;
    }

    public float getBrakeRL() {
        return brakeRL;
    }

    public void setBrakeRL(float brakeRL) {
        this.brakeRL = brakeRL;
    }

    public float getBrakeRR() {
        return brakeRR;
    }

    public void setBrakeRR(float brakeRR) {
        this.brakeRR = brakeRR;
    }

    public float getTiresFL() {
        return tiresFL;
    }

    public void setTiresFL(float tiresFL) {
        this.tiresFL = tiresFL;
    }

    public float getTiresFR() {
        return tiresFR;
    }

    public void setTiresFR(float tiresFR) {
        this.tiresFR = tiresFR;
    }

    public float getTiresRL() {
        return tiresRL;
    }

    public void setTiresRL(float tiresRL) {
        this.tiresRL = tiresRL;
    }

    public float getTiresRR() {
        return tiresRR;
    }

    public void setTiresRR(float tiresRR) {
        this.tiresRR = tiresRR;
    }

    private float tiresRR;





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
