package mp3.model;

import mp3.model.abstractClass.Mobile;
import mp3.model.abstractClass.Phone;
import mp3.model.abstractClass.Stationary;
import mp3.model.disjoint.Actor;
import mp3.model.disjoint.MovieStar;
import mp3.model.disjoint.TheatricalActor;
import mp3.model.dynamic.VehicleImplementation;
import mp3.model.dynamic.VehicleType;
import mp3.model.multiAspect.Amphibian;
import mp3.model.multiAspect.AnimalNutrition;
import mp3.model.multiAspect.Mammal;
import mp3.model.multiInheritance.*;
import mp3.model.overlapping.SportsmanImplementation;
import mp3.model.overlapping.SportsmanType;


import java.time.LocalDate;
import java.util.EnumSet;

public class Main {
    public static void main(String[]args){
        System.out.println("*DISJOINT*");
        Actor actor = new Actor("John","Johnsky",90000,300000);
        MovieStar movieStar = new MovieStar("Phil","Good",130000,450000,"New Hit Movie");
        TheatricalActor theatricalActor = new TheatricalActor("Howard","Coward",45000,25000,"Classic Play");

        System.out.println("    "+actor);
        System.out.println("    "+movieStar);
        System.out.println("    "+theatricalActor);

        System.out.println("*ABSTRACT CLASS*");
        Phone phone1 = new Mobile("NokiaE50","Orange",50,true,1.5);
        Phone phone2 = new Stationary("Motorola135D","Plus",150,false,.25);

        System.out.println("    "+phone1);
        System.out.println("    "+phone1.getCallCost());
        System.out.println("    "+phone2);
        System.out.println("    "+phone2.getCallCost());

        System.out.println("*OVERLAPPING*");
        SportsmanImplementation swimmer = new SportsmanImplementation("Bob","Great",30,"Speedo",null, EnumSet.of(SportsmanType.SWIMMER));
        System.out.println("    "+swimmer.getEquipment());
        System.out.println("    "+swimmer+'\n');

        SportsmanImplementation biker = new SportsmanImplementation("Hans","Fast",23,null,"CROSS",EnumSet.of(SportsmanType.BIKER));
        System.out.println("    "+biker.getEquipment());
        System.out.println("    "+biker+'\n');

        SportsmanImplementation swimmerAndBiker = new SportsmanImplementation("George", "Joy",26,"BojoSwim","FastFastFast",EnumSet.of(SportsmanType.BIKER,SportsmanType.SWIMMER));
        System.out.println("    "+swimmerAndBiker.getEquipment());
        System.out.println("    "+swimmerAndBiker+'\n');

        SportsmanImplementation sportsmanWithoutEquipment = new SportsmanImplementation("Henry", "Sad",18,null,null,EnumSet.of(SportsmanType.BIKER,SportsmanType.SWIMMER));
        System.out.println("    "+sportsmanWithoutEquipment.getEquipment());
        System.out.println("    "+sportsmanWithoutEquipment);
        sportsmanWithoutEquipment.setBikeType("BMX");
        sportsmanWithoutEquipment.setSwimmingSuit("Ultra Speedo");
        System.out.println("    "+sportsmanWithoutEquipment.getEquipment());

        //Exceptions commented for clear test run of code
//        System.out.println("    "+swimmer.getBikeType());
//        System.out.println("    "+biker.getSwimmingSuit());

        System.out.println("*MULTI INHERITANCE*");
        Guitarist guitarist = new Guitarist("Tom","Head",30,"Ibanez",true);
        DJImplementation dj = new DJImplementation("Dominic","Cuban",5,"PIONEER",true);
        DJGuitarist djGuitarist = new DJGuitarist("Hanna","Fun",7,"Harley Benton",false,"Numark",true);

        System.out.println("    Guitarist info: "+guitarist);
        System.out.println("    guitar -> "+guitarist.getGuitar());
        System.out.println("    music tempo in bpm's -> "+guitarist.getMusicTempo()+'\n');

        System.out.println("    DJ info: "+dj);
        System.out.println("    mixer -> "+dj.getMixer());
        System.out.println("    music tempo in bpm's -> "+dj.getMusicTempo()+'\n');

        System.out.println("    DJGuitarist info: "+djGuitarist);
        System.out.println("    guitar -> "+djGuitarist.getGuitar());
        System.out.println("    mixer -> "+djGuitarist.getMixer());
        System.out.println("    music tempo in bpm's -> "+djGuitarist.getMusicTempo());

        System.out.println("*MULTI ASPECT INHERITANCE*");
        Amphibian frog = new Amphibian("Frog",5,"Europe", AnimalNutrition.HERBIVORE,null,null,2,false);
        Mammal human = new Mammal("Human",18,"Asia",AnimalNutrition.CARNIVORE, LocalDate.of(2020,9,15),null,false,false);

        System.out.println("    Frog info: "+frog);
        System.out.println("    body temperature -> "+frog.bodyTemp());
        frog.seekShelter();
        frog.setEnvTemp(25.5);
        System.out.println("    body temperature -> "+frog.bodyTemp());
        System.out.println("    after hidding: "+frog);
        System.out.println("    this frog is "+frog.getNutrition()+'\n');

        System.out.println("    Human info: "+human);
        System.out.println("    body temperature -> "+human.bodyTemp());
        human.hunt();
        human.setHungry(true);
        System.out.println("    body temperature -> "+human.bodyTemp());
        System.out.println("    after hunting: "+human);
        System.out.println("    this human is "+human.getNutrition());

        //Exceptions commented for clear test run of code
//        frog.hunt();
//        human.seekShelter();

        System.out.println("*DYNAMIC*");
        VehicleImplementation vehicle1 = new VehicleImplementation("Toyota",LocalDate.of(1999,7,15),4,null,false,4,5, VehicleType.CAR);
        VehicleImplementation vehicle2 = new VehicleImplementation("Honda",LocalDate.of(2012,4,20),2,"Helite Turtle",true,null,null, VehicleType.MOTORBIKE);
        VehicleImplementation vehicle3 = new VehicleImplementation("Fiat",LocalDate.of(2022,1,7),2,"Helite Turtle",false,3,2, VehicleType.MOTORBIKE);

        System.out.println("    Before change of vehicle: "+vehicle1);
        System.out.println("    "+vehicle1.safetyMeasures());
        vehicle1.beMotorbike("Dainese Smart",true);
        System.out.println("    After change of vehicle: "+vehicle1);
        System.out.println("    "+vehicle1.safetyMeasures()+'\n');

        System.out.println("    Before change of vehicle: "+vehicle2);
        System.out.println("    "+vehicle2.safetyMeasures());
        vehicle2.beCar(2,3);
        System.out.println("    After change of vehicle: "+vehicle2);
        System.out.println("    "+vehicle2.safetyMeasures()+'\n');

        System.out.println("    Before change of vehicle: "+vehicle3);
        System.out.println("    "+vehicle3.safetyMeasures());
        vehicle3.beCar(4,3);
        System.out.println("    After change of vehicle: "+vehicle3);
        System.out.println("    "+vehicle3.safetyMeasures()+'\n');

        //Exceptions commented for clear test run of code
//        System.out.println(vehicle3.getMotorbikeHelmet());
//        System.out.println(vehicle2.getInflatableVest());
//        System.out.println(vehicle1.getHowManyAirbags());
//        System.out.println(vehicle1.getHowManySeats());
//        vehicle3.beMotorbike(null,null);
//        vehicle1.beCar(null,null);

    }
}
