package mp3.model;

import mp3.model.abstractClass.Mobile;
import mp3.model.abstractClass.Phone;
import mp3.model.abstractClass.Stationary;
import mp3.model.disjoint.Actor;
import mp3.model.disjoint.MovieStar;
import mp3.model.disjoint.TheatricalActor;

public class Main {
    public static void main(String[]args){
        System.out.println("*DISJOINT*");
        Actor actor = new Actor("John","Johnsky",90000,300000);
        MovieStar movieStar = new MovieStar("Phil","Good",130000,450000,"New Hit Movie");
        TheatricalActor theatricalActor = new TheatricalActor("Howard","Coward",45000,25000,"Classic Play");

        System.out.println("    "+actor.toString());
        System.out.println("    "+movieStar.toString());
        System.out.println("    "+theatricalActor.toString());

        System.out.println("*ABSTRACT CLASS*");
        Phone phone1 = new Mobile("NokiaE50","Orange",50,true,1.5);
        Phone phone2 = new Stationary("Motorola135D","Plus",150,false,.25);

        System.out.println("    "+phone1.toString()+", "+phone1.getCallCost());
        System.out.println("    "+phone2.toString()+", "+phone2.getCallCost());

    }
}
