package mp3.model.dynamic;

import mp3.exception.ValException;

import java.time.LocalDate;

public class VehicleImplementation implements Car, Motorbike, Vehicle{
    private String brand;
    private LocalDate dateOfProduction;
    private int numOfWheels;

    private String inflatableVest;
    private Boolean motorbikeHelmet;

    private Integer howManySeats;
    private Integer howManyAirbags;

    private VehicleType vehicleType;

    public VehicleImplementation(String brand, LocalDate dateOfProduction, int numOfWheels, String inflatableVest, boolean motorbikeHelmet, int howManySeats, int howManyAirbags, VehicleType vehicleType) {
        setVehicleType(vehicleType);

        setBrand(brand);
        setDateOfProduction(dateOfProduction);
        setNumOfWheels(numOfWheels);

        if(vehicleType == VehicleType.MOTORBIKE) {
            setInflatableVest(inflatableVest);
            setMotorbikeHelmet(motorbikeHelmet);
        }
        if(vehicleType == VehicleType.CAR) {
            setHowManySeats(howManySeats);
            setHowManyAirbags(howManyAirbags);
        }

    }

    @Override
    public int getHowManySeats() {
        if(vehicleType == VehicleType.CAR) {
            return howManySeats;
        }else{
            throw new ValException("Motorbike don't use this function");
        }
    }

    @Override
    public void setHowManySeats(int howManySeats) {
        if(vehicleType == VehicleType.CAR){
            this.howManySeats = howManySeats;
        }else{
            throw new ValException("Motorbike don't use this function");
        }
    }

    @Override
    public int getHowManyAirbags() {
        if(vehicleType == VehicleType.CAR) {
            return howManyAirbags;
        }else{
            throw new ValException("Motorbike don't use this function");
        }
    }

    @Override
    public void setHowManyAirbags(int howManyAirbags) {
        if(vehicleType == VehicleType.CAR) {
            this.howManyAirbags = howManyAirbags;
        }else{
            throw new ValException("Motorbike don't use this function");
        }
    }

    @Override
    public String getInflatableVest() {
        if(vehicleType == VehicleType.MOTORBIKE) {
            return inflatableVest;
        }else{
            throw new ValException("Car don't need inflatable vest for safety measures");
        }
    }

    @Override
    public void setInflatableVest(String inflatableVest) {
        if(vehicleType == VehicleType.MOTORBIKE) {
            this.inflatableVest = inflatableVest;
        }else{
            throw new ValException("Car don't need inflatable vest for safety measures");
        }
    }

    @Override
    public boolean getMotorbikeHelmet() {
        if(vehicleType == VehicleType.MOTORBIKE) {
            return motorbikeHelmet;
        }else{
            throw new ValException("Car don't need motorbike helmet for safety measures");
        }
    }

    @Override
    public void setMotorbikeHelmet(boolean motorbikeHelmet) {
        if(vehicleType == VehicleType.MOTORBIKE) {
            this.motorbikeHelmet=motorbikeHelmet;
        }else{
            throw new ValException("Car don't need motorbike helmet for safety measures");
        }
    }

    @Override
    public String safetyMeasures() {
        String result="";

        if (vehicleType == VehicleType.CAR) {
            if(howManyAirbags>=howManySeats) {
                result += "There is proper amount of airbags per seats";
            }else{
                result +="Lacking required amount of airbags, no Safety Measures";
            }
        }

        if(vehicleType == VehicleType.MOTORBIKE){
            if(motorbikeHelmet == true) {
                result += "All safety measures are met";
            }else{
                result +="No motorbike helmet, no Safety Measures";
            }
        }

        return result;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public boolean isMotorbikeHelmet() {
        return motorbikeHelmet;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    private void setVehicleType(VehicleType vehicleType) {
        if(vehicleType != null) {
            this.vehicleType = vehicleType;
        }else{
            throw new ValException("Vehicle type is needed");
        }
    }

    public void beCar(int howManySeats, int howManyAirbags){
        //validation is needed
//        if(howManySeats != null && howManyAirbags != null) {    ??
            this.howManySeats = howManySeats;
            this.howManyAirbags = howManyAirbags;

        this.inflatableVest = null;
        this.motorbikeHelmet = null;
        setVehicleType(VehicleType.CAR);

//        }else{
//            throw new ValException("Need all arguments required by Car");
//        }
    }

    public void beMotorbike(String inflatableVest, boolean motorbikeHelmet){
        //validation is needed
        this.inflatableVest = inflatableVest;
        this.motorbikeHelmet = motorbikeHelmet;

        this.howManySeats = null;
        this.howManyAirbags = null;
        setVehicleType(VehicleType.MOTORBIKE);
    }


    @Override
    public String toString() {
        if(vehicleType == VehicleType.CAR){
            return getBrand()+", "+
                    getDateOfProduction()+", "+
                    getNumOfWheels()+", "+
                    getHowManySeats()+", "+
                    getHowManyAirbags()+", "+
                    getVehicleType();

        }else if(vehicleType == VehicleType.MOTORBIKE){
            return getBrand()+", "+
                    getDateOfProduction()+", "+
                    getNumOfWheels()+", "+
                    getInflatableVest()+", "+
                    getMotorbikeHelmet()+", "+
                    getVehicleType();
        }
        return getBrand()+", "+
                getDateOfProduction()+", "+
                getNumOfWheels();
    }
}
