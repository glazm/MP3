package mp3.model.abstractClass;

public abstract class Phone {
    private String name;
    private String provider;
    private float callDuration;

    public Phone(String name, String provider, float callDuration) {
        setName(name);
        setProvider(provider);
        setCallDuration(callDuration);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public float getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(float callDuration) {
        this.callDuration = callDuration;
    }

    public abstract float getCallCost();
}
