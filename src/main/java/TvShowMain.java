import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShow = new ArrayList<>();
        TvShow tvshow1 = new TvShow("The Sad and the tired", 898476, "Psychological thriller");
        TvShow tvshow2 = new TvShow("Put that thing back where it came from or so help me...", 1);
        TvShow tvshow3 = new TvShow("Reconsider your life choices!");
        tvShow.add(tvshow1);
        tvShow.add(tvshow2);
        tvShow.add(tvshow3);

        while (true) {
            System.out.print("Name of the show: ");
            String showName = scanner.nextLine();

            if (showName.trim().isEmpty()) {
                break;
            }

            System.out.print("How many episodes? ");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            tvShow.add(new TvShow(showName, episodes, genre));
        }

        for (TvShow tvShows: tvShow) {
            System.out.println(tvShows);
        }
    }
}
