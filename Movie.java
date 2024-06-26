public class Movie {

    String name;
    int stars;
    boolean watched;

    Movie(String name) {
        this.name = name;
    }

    Movie(String name, int stars, boolean watched) {
        this.name = name;
        this.stars = stars;
        this.watched = watched;
    }

    @Override
    public String toString() {
        if (watched) {
            return name + ". You have watched this movie and rated it " + stars + " stars.";
        }
        else {
            return name + ". You have not watched this movie.";
        }
    }
}
