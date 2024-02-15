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
    public void Start(){

    }
    private void readData() {
        try {
            File myFile = new File("src//movies_data.csv");
            Scanner fileScanner = new Scanner(myFile);
            fileScanner.nextLine();
            while (fileScanner.hasNext()) {
                String data = fileScanner.nextLine();
                String[] splitData = data.split(",");


            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
