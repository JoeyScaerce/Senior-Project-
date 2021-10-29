import java.util.regex.*;
import java.util.Scanner;

public class check {

  public void getUserInput() {
    Scanner input = new Scanner(System.in);
    String a = input.nextLine();
  }

  public void getCheck(){
    System.out.println("Hello world!");
    String regex = "i";
    String actualString = "i";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(actualString);

    boolean matches = matcher.matches();

    System.out.println(actualString + " " + regex + " " + matches);
  }
  
}