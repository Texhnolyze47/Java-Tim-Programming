package polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comedy," +
                    "S for Science Fiction, or Q to Quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.print("Enter movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }

    }
}
