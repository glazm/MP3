package mp3.model.multiInheritance;

public class DJImplementation extends Musician implements DJ{
    private String mixer;
    private boolean isDrumAndBase;

    public DJImplementation(String firstName, String lastName, int experienceInAge, String mixer, boolean isDrumAndBase) {
        super(firstName, lastName, experienceInAge);
        setMixer(mixer);
        setIsDrumAndBase(isDrumAndBase);
    }

    @Override
    public String getMixer() {
        return mixer;
    }

    @Override
    public void setMixer(String mixer) {
        this.mixer = mixer;
    }

    @Override
    public boolean getIsDrumAndBase() {
        return isDrumAndBase;
    }

    @Override
    public void setIsDrumAndBase(boolean isDrumAndBase) {
        this.isDrumAndBase = isDrumAndBase;
    }

    @Override
    public long getMusicTempo() {
        if(isDrumAndBase == true){
            return 180;
        }
        return 140;
    }

    @Override
    public String toString() {
        return super.getFirstName()+", "+
                super.getLastName()+", "+
                super.getExperienceInAge()+", "+
                getMixer()+", "+
                getIsDrumAndBase();
    }
}
