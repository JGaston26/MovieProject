import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class MovieCollection {
    private ArrayList<Movie> movies;
    Scanner scan;
    public MovieCollection(){
        movies = new ArrayList<>();
        scan = new Scanner(System.in);
    }
    public void start(){
            readData();
        System.out.println(movies.get(1).getOverview());
    }
    private void readData() {
        try {
            File myFile = new File("src//movies_data.csv");
            Scanner fileScanner = new Scanner(myFile);
            fileScanner.nextLine();
            while (fileScanner.hasNext()) {
                String data = fileScanner.nextLine();
                String[] splitData = data.split(",");
                String title = splitData[0];
                String cast = splitData[1];
                ArrayList<String> castList = split(cast);
                String director = splitData[2];
                String overview = splitData[3];
                String runtime = splitData[4];
                String userRating = splitData[5];
                Movie allMovies = new Movie(title,castList,director,overview,runtime,userRating);
                movies.add(allMovies);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    private void menu(){
        System.out.println("Welcome to the movie collection!");
        String menuOption = "";

        while (!menuOption.equals("q")) {
            System.out.println("------------ Main Menu ----------");
            System.out.println("- search (t)itles");
            System.out.println("- search (c)ast");
            System.out.println("- (q)uit");
            System.out.print("Enter choice: ");
            menuOption = scan.nextLine();

            if (menuOption.equals("t")) {
                searchTitles();
            } else if (menuOption.equals("c")) {
                searchCast();
            } else if (menuOption.equals("q")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }
    private ArrayList<String> split(String names){
        ArrayList<String> namesArray = new ArrayList<String>();
        String[] namesList = names.split("\\|");
        for(int i = 0; i < namesList.length; i ++){
            namesArray.add(namesList[i]);
        }
        return namesArray;
    }
    public static void selectionSortWordList(ArrayList<Movie> movie) {
        for(int i = 0; i < movie.size(); i++) {
            int min_index = i;
            for (int j = i + 1; j < movie.size(); j++) {
                if (movie.get(j).getTitle().compareTo(movie.get(min_index).getTitle()) < 0) {
                    min_index = j;
                }
            }
            Movie temp = movie.get(i);
            movie.set(i, movie.get(min_index));
            movie.set(min_index, temp);
        }
    }

    private String[] searchTitles(){

    }
    private void searchCast(){

    }

}
