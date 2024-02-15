import java.util.ArrayList;
import java.util.Scanner;
public class Movie {
    private String title;
    private ArrayList<String> cast;
    private String director;
    private String overview;
    private int runTime;
    private double userRating;
    private Scanner scan;

    public Movie(String title, ArrayList<String> cast, String director, String overview, int runTime, double userRating){
        cast = new ArrayList<String>();
        scan = new Scanner(System.in);
        this.title = title;
        this.director = director;
        this.overview = overview;
        this.runTime = runTime;
        this.userRating = userRating;
    }

    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public String getOverview(){
        return overview;
    }
    public int getRunTime(){
        return runTime;
    }
    public double getUserRating(){
        return runTime;
    }
}
