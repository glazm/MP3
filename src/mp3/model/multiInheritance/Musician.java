package mp3.model.multiInheritance;

public abstract class Musician {
    private String firstName;
    private String lastName;
    private int experienceInAge;


    public Musician(String firstName, String lastName, int experienceInAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInAge = experienceInAge;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExperienceInAge() {
        return experienceInAge;
    }

    public void setExperienceInAge(int experienceInAge) {
        this.experienceInAge = experienceInAge;
    }


    public abstract long getMusicTempo();
}
