package mp3.model.multiAspect;

import mp3.exception.ValException;

import java.time.LocalDate;

public abstract class Animal {
    private String name;
    private int age;
    private String region;

    private LocalDate lastHunt;
    private LocalDate lastEscape;

    private AnimalNutrition nutrition;

    public Animal(String name, int age, String region, AnimalNutrition nutrition,LocalDate lastHunt,LocalDate lastEscape) {
        this.name = name;
        this.age = age;
        this.region = region;

        if(nutrition!=null) {
            this.nutrition = nutrition;
        }else{
            throw new ValException("Animal need type of nutrition");
        }

        if(nutrition == AnimalNutrition.CARNIVORE) {
            this.lastHunt = lastHunt;
        }
        if(nutrition == AnimalNutrition.HERBIVORE) {
            this.lastEscape = lastEscape;
        }
    }

    public abstract double bodyTemp();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LocalDate getLastHunt() {
        return lastHunt;
    }

    public void setLastHunt(LocalDate lastHunt) {
        this.lastHunt = lastHunt;
    }

    public LocalDate getLastEscape() {
        return lastEscape;
    }

    public void setLastEscape(LocalDate lastEscape) {
        this.lastEscape = lastEscape;
    }

    public AnimalNutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(AnimalNutrition nutrition) {
        this.nutrition = nutrition;
    }

    public void hunt(){
        if(nutrition == AnimalNutrition.CARNIVORE) {
            setLastHunt(LocalDate.now());
        }else {
            throw new ValException("Herbivore doesn't hunt");
        }
    }

    public void seekShelter(){
        if(nutrition == AnimalNutrition.HERBIVORE) {
            setLastEscape(LocalDate.now());
        }else{
            throw new ValException("Carnivore don't need to hide");
        }
    }
}
