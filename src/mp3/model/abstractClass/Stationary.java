package mp3.model.abstractClass;

public class Stationary extends Phone{
    private boolean isItRotary;
    private double stationaryCallCost;

    public Stationary(String name, String provider, float callDuration, boolean isItRotary, double stationaryCallCost) {
        super(name, provider, callDuration);
        setIsItRotary(isItRotary);
        setStationaryCallCost(stationaryCallCost);
    }

    public boolean getIsItRotary() {
        return isItRotary;
    }

    public void setIsItRotary(boolean itRotary) {
        isItRotary = itRotary;
    }

    public double getStationaryCallCost() {
        return stationaryCallCost;
    }

    public void setStationaryCallCost(double stationaryCallCost) {
        this.stationaryCallCost = stationaryCallCost;
    }

    @Override
    public float getCallCost() {
        return (float) getStationaryCallCost() * super.getCallDuration();
    }

    @Override
    public String toString() {
        return  super.getName()+", "+
                super.getProvider()+", "+
                super.getCallDuration()+", "+
                getIsItRotary() +", "+
                + getStationaryCallCost();
    }
}
