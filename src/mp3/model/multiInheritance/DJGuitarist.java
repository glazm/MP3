package mp3.model.multiInheritance;

public class DJGuitarist extends Guitarist implements DJ{
    private String mixer;
    private boolean isDrumAndBase;

    public DJGuitarist(String firstName, String lastName, int experienceInAge, String guitar, boolean isTired,String mixer, boolean isDrumAndBase) {
        super(firstName, lastName, experienceInAge, guitar, isTired);
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

    public long getMusicTempo() {
        if(super.getIsTired() == true && isDrumAndBase == true){
            return 150;
        }else if(super.getIsTired() == false && isDrumAndBase == true){
            return 200;
        }else if(isDrumAndBase == false && super.getIsTired() == true){
            return 130;
        }
        return 140;
    }

    @Override
    public String toString() {
        return super.getFirstName()+", "+
                super.getLastName()+", "+
                super.getExperienceInAge()+", "+
                super.getGuitar()+", "+
                super.getIsTired()+", "+
                getMixer()+", "+
                getIsDrumAndBase();
    }
}
