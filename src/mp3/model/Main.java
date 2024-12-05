package mp3.model;

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
    }
}
