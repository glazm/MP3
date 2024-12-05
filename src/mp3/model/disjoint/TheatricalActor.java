package mp3.model.disjoint;

public class TheatricalActor extends Actor {
    private String play;

    public TheatricalActor(String firstName, String lastName, long income, long fans, String play) {
        super(firstName, lastName, income, fans);
        setPlay(play);
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    @Override
    public String toString() {
        return super.toString() +", " +
                play;
    }
}
