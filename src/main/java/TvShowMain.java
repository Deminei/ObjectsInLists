import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShow = new ArrayList<>();


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
