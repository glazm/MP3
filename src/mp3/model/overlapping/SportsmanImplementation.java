package mp3.model.overlapping;

import mp3.exception.ValException;

import java.util.EnumSet;

public class SportsmanImplementation implements Swimmer, Biker, Sportsman{
    private String firstName;
    private String lastName;
    private int age;

    private String swimmingSuit;

    private String bikeType;

    private EnumSet<SportsmanType> sportsmanTypes;

    public SportsmanImplementation(String firstName, String lastName
            , int age, String swimmingSuit, String bikeType
            , EnumSet<SportsmanType> sportsmanTypes) {
        setSportsmanTypes(sportsmanTypes);

        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);

        if(sportsmanTypes.contains(SportsmanType.SWIMMER)) {
            setSwimmingSuit(swimmingSuit);
        }
        if(sportsmanTypes.contains(SportsmanType.BIKER)) {
            setBikeType(bikeType);
        }
    }

    private void setSportsmanTypes(EnumSet<SportsmanType> sportsmanTypes){
        if(sportsmanTypes != null && !sportsmanTypes.isEmpty()) {
            this.sportsmanTypes = sportsmanTypes;
        } else{
            throw new ValException("Sportsman Type is needed");
        }
    }

    @Override
    public String getBikeType() {
        if(sportsmanTypes.contains(SportsmanType.BIKER)) {
            return bikeType;
        } else {
            throw new ValException("Swimmer doesn't need a bike to swim");
        }
    }

    @Override
    public void setBikeType(String bikeType) {
        if(sportsmanTypes.contains(SportsmanType.BIKER)) {
            this.bikeType = bikeType;
        } else {
            throw new ValException("Swimmer doesn't need a bike to swim");
        }
    }

    @Override
    public String getEquipment() {
        String result="";

        if (sportsmanTypes.contains(SportsmanType.BIKER)) {
            result += "Bike type: "+getBikeType()+" ";
        }

        if(sportsmanTypes.contains(SportsmanType.SWIMMER)){
            result += "Swimming suit: "+getSwimmingSuit()+" ";
        }

        return result;
    }

    @Override
    public String getSwimmingSuit() {
        if(sportsmanTypes.contains(SportsmanType.SWIMMER)) {
            return swimmingSuit;
        } else {
            throw new ValException("Biker doesn't need a swimming suit");
        }

    }

    @Override
    public void setSwimmingSuit(String swimmingSuit) {
        if(sportsmanTypes.contains(SportsmanType.SWIMMER)) {
            this.swimmingSuit = swimmingSuit;
        } else {
            throw new ValException("Biker doesn't need a swimming suit");
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if(!sportsmanTypes.contains(SportsmanType.BIKER)){
            return getFirstName() + ", " +
                    getLastName() + ", " +
                    getAge() + ", "+
                    "Swimming suit: " + getSwimmingSuit();
        }else if(!sportsmanTypes.contains(SportsmanType.SWIMMER)){
            return getFirstName() + ", " +
                    getLastName() + ", " +
                    getAge() + ", "+
                    "Bike type: " + getBikeType();
        }
        return  getFirstName() + ", " +
                getLastName() + ", " +
                getAge() + ", "+
                "Swimming suit: " + getSwimmingSuit() + ", " +
                "Bike type: " + getBikeType();
    }
}
