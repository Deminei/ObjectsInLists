public class TvShow {
    public String name;
    public int episodes;
    public String genre;


    public TvShow(String showName, int episodes, String showGenre) {
        this.name = showName;
        this.episodes = episodes;
        this.genre = showGenre;
    }
    public TvShow(String showName, int episodes) {
        this.name = showName;
        this.episodes = episodes;
    }
    public TvShow(String showName) {
        this.name = showName;
    }


    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }
    public String getGenre(){

        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is "+ getName() +" with "+ getEpisodes() +" number of episodes. The genre is "+ getGenre();
    }
}
