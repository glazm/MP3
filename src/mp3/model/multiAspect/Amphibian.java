package mp3.model.multiAspect;

import java.time.LocalDate;

public class Amphibian extends Animal{
    private double envTemp;
    private boolean hasTail;

    public Amphibian(String name, int age, String region, AnimalNutrition nutrition,LocalDate lastHunt, LocalDate lastEscape,double envTemp,boolean hasTail) {
        super(name, age, region, nutrition,lastHunt,lastEscape);
        setEnvTemp(envTemp);
        setHasTail(hasTail);
    }

    @Override
    public double bodyTemp() {
       if ((envTemp/15.5)>1.5){
           return 15.5 * 1.5;
       }else if ((envTemp/15.5)<0.5){
            return 15.5 * 0.5;
       }
       return (envTemp/15.5)*15.5;
    }

    public double getEnvTemp() {
        return envTemp;
    }

    public void setEnvTemp(double envTemp) {
        this.envTemp = envTemp;
    }

    public boolean getHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return super.getName()+", "+
                super.getAge()+", "+
                super.getRegion()+", "+super.getNutrition()+", "+super.getLastHunt()+", "+super.getLastEscape()+", "+getEnvTemp()+", "+getHasTail();
    }
}
