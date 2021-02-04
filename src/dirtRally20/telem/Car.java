package dirtRally20.telem;

public class Car {
    private float velocity;
    private float gear;
    private float RPMs;
    private float stageTime;
    private float maxRPM;



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
