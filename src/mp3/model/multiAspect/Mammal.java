package mp3.model.multiAspect;

import java.time.LocalDate;

public class Mammal extends Animal{
    private boolean hungry;
    private boolean poisonous;

    public Mammal(String name, int age, String region, AnimalNutrition nutrition, LocalDate lastHunt, LocalDate lastEscape,boolean hungry,boolean poisonous) {
        super(name, age, region, nutrition,lastHunt,lastEscape);
        setHungry(hungry);
        setPoisonous(poisonous);
    }

    @Override
    public double bodyTemp() {
        if(hungry == true){
            return 35.6;
        }
        return 36.6;
    }

    public boolean getHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean getPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return super.getName()+", "+
                super.getAge()+", "+
                super.getRegion()+", "+super.getNutrition()+", "+super.getLastHunt()+", "+super.getLastEscape()+", "+getHungry()+", "+getPoisonous();
    }
}
