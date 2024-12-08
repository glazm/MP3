package mp3.model.multiInheritance;

public class Guitarist extends Musician{
    private String guitar;
    private boolean isTired;

    public Guitarist(String firstName, String lastName, int experienceInAge, String guitar, boolean isTired) {
        super(firstName, lastName, experienceInAge);
        setGuitar(guitar);
        setIsTired(isTired);
    }

    public String getGuitar() {
        return guitar;
    }

    public void setGuitar(String guitar) {
        this.guitar = guitar;
    }

    public boolean getIsTired() {
        return isTired;
    }

    public void setIsTired(boolean isTired){
        this.isTired = isTired;
    }

    @Override
    public long getMusicTempo() {
        if(isTired == true){
            return 100;
        }
        return 130;
    }

    @Override
    public String toString() {
        return  super.getFirstName()+", "+
                super.getLastName()+", "+
                super.getExperienceInAge()+", "+
                getGuitar()+", "+
                getIsTired();
    }
}
