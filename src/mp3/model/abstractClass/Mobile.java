package mp3.model.abstractClass;

public class Mobile extends Phone{
    private boolean fiveGReady;
    private double mobileCallCost;

    public Mobile(String name, String provider, float callDuration, boolean fiveGReady, double mobileCallCost) {
        super(name, provider, callDuration);
        setFiveGReady(fiveGReady);
        setMobileCallCost(mobileCallCost);
    }

    public boolean getFiveGReady() {
        return fiveGReady;
    }

    public void setFiveGReady(boolean fiveGReady) {
        this.fiveGReady = fiveGReady;
    }

    public double getMobileCallCost() {
        return mobileCallCost;
    }

    public void setMobileCallCost(double mobileCallCost) {
        this.mobileCallCost = mobileCallCost;
    }

    @Override
    public float getCallCost() {
        return (float)getMobileCallCost() * super.getCallDuration();
    }

    @Override
    public String toString() {
        return  super.getName()+", "+
                super.getProvider()+", "+
                super.getCallDuration()+", "+
                getFiveGReady() +", "+
                + getMobileCallCost();
    }
}
