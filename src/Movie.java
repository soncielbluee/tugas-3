package After.src;

class Movie {
    private String title;
    private boolean watched;

    public Movie(String title) {
        this.title = title;
        this.watched = false;
    }

    public String getTitle() {
        return title;
    } //5

    public boolean isWatched() {
        return watched;
    } //5

    public void markAsWatched() {
        this.watched = true;
    }

    @Override
    public String toString() {
        return title + (watched ? " (ditonton)" : "");
    }
}