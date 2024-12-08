package mp3.model.disjoint;

public class MovieStar extends Actor{
    private String movie;

    public MovieStar(String firstName, String lastName, long income, long fans, String movie) {
        super(firstName, lastName, income, fans);
        setMovie(movie);
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return  super.toString() +", " +
                movie;
    }
}
