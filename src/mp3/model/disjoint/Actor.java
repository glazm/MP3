package mp3.model.disjoint;

public class Actor {
    private String firstName;
    private String lastName;
    private long income;
    private long fans;

    public Actor(String firstName, String lastName, long income, long fans) {
        setFirstName(firstName);
        setLastName(lastName);
        setIncome(income);
        setFans(fans);
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

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public long getFans() {
        return fans;
    }

    public void setFans(long fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return  firstName + ", " +
                lastName  + ", " +
                income    + ", " +
                fans;
    }
}
