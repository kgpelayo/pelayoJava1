import java.util.*;

public class pelayoJava1 {
  public static void main(String[] args){
    //to get input
    Scanner sc= new Scanner(System.in); 
    
    //initialize movie
    movie test = new movie();
    
    System.out.println("Programmed by: Khublei Mo Satori G. Pelayo\n");
    
    System.out.println("Enter Movie Title: ");
      String ntitle = sc.nextLine();
      System.out.println("   "+ntitle);
      test.setTitle(ntitle);
      
    System.out.println("Enter Synopsis: ");
      String nsynopsis = sc.nextLine();
      System.out.println("   "+nsynopsis);
      test.setSynopsis(nsynopsis);
      
    System.out.println("What is its MPAAA Rating: ");
      String nmpaa = sc.nextLine();
      System.out.println("   "+nmpaa);
      test.setmpaa(nmpaa);
      
    System.out.println("What is the Genre: ");
      String ngenres = sc.nextLine();
      System.out.println("   "+ngenres);
      test.setGenres(ngenres);
      
    System.out.println("What is the Director's First Name: ");
      String dfname = sc.nextLine();
      System.out.println("   "+dfname);
    System.out.println("What is the Director's Last Name: ");
      String dlname = sc.nextLine();
      System.out.println("   "+dlname);
      test.setDirectors(dfname, dlname);
      
    System.out.println("What is the Main Actor's First Name: ");
      String afname = sc.nextLine();
      System.out.println("   "+afname);
    System.out.println("What is the Main Actor's Last Name: ");
      String alname = sc.nextLine();
      System.out.println("   "+alname);
      test.setActors(afname, alname);
      
      test.printMovie();
    
  }
}