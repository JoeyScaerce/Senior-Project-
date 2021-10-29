import java.util.Locale;
import java.util.Scanner;
//import java.util.StringTokenizer;
import java.util.Scanner;

public class Reader {
    
    //StringBuilder sb = new StringBuilder();
    check apple = new check();
    // bug #1 when X spotted all instance of X replaced to the new value
    Scanner input = new Scanner(System.in);
    public void checker() {
      do{
        System.out.print("type in the word >> ");
        String user_input = input.nextLine();
        
        String newWord = user_input.toLowerCase(Locale.ROOT);

        // basic
        newWord = newWord.replaceAll("yes", "si");
        newWord = newWord.replaceAll("and", "y");
        newWord = newWord.replaceAll("is", "es");
        /*for(int i = 0; i < newWord.length(); i++){
          if(newWord.charAt(i) == 'i'){
            if(Character.isWhitespace(newWord.charAt(i-1)) == true){
              newWord = newWord.replaceAll("i", "mi");// use to help debug #1
            }
          }
        }*/
        newWord = newWord.replaceAll("i", "mi");// use to help debug #1
        newWord = newWord.replaceAll("my", "mi");
        newWord = newWord.replaceAll("name", "nombre");
        newWord = newWord.replaceAll("because", "porque");

        // favorite & hates
        newWord = newWord.replaceAll("hate", "odio");
        newWord = newWord.replaceAll("love", "encanta");
        newWord = newWord.replaceAll("like", "gusta");

        // family & friends
        newWord = newWord.replaceAll("mom", "madre");
        newWord = newWord.replaceAll("dad", "padre");
        newWord = newWord.replaceAll("friend", "amigo");
        // object & activies
        newWord = newWord.replaceAll("to drink", "beber");
        newWord = newWord.replaceAll("to dance", "bailar");
        newWord = newWord.replaceAll("to sing", "cantar");
        newWord = newWord.replaceAll("to hunt", "cazar");
        newWord = newWord.replaceAll("to cook", "cocinar");
        newWord = newWord.replaceAll("to eat", "comer");
        newWord = newWord.replaceAll("to run", "correr");
        newWord = newWord.replaceAll("to draw", "dibujar");
        newWord = newWord.replaceAll("to sleep", "dormir");
        newWord = newWord.replaceAll("to write", "escribir");
        newWord = newWord.replaceAll("to music", "escuchar musica");

        // days of the week
        newWord = newWord.replaceAll("monday", "lunes");
        newWord = newWord.replaceAll("tuesday", "martes");
        newWord = newWord.replaceAll("wednesday", "miercoles");
        newWord = newWord.replaceAll("thursday", "jueves");
        newWord = newWord.replaceAll("friday", "viernes");
        newWord = newWord.replaceAll("saturday", "sabado");
        newWord = newWord.replaceAll("sunday", "domingo");
        newWord = newWord.replaceAll("i am", "soy");
        newWord = newWord.replaceAll("year old", "anos");

        // position
        newWord = newWord.replaceAll("have", "tengo");

        // unorganized / other
        newWord = newWord.replaceAll("i really love", "me gusta mucho");
        //newWord = newWord.replaceAll("drink", "beber");
        newWord = newWord.replaceAll("water", "agua");

        System.out.println(newWord);
      }while(true);
        
    }


     /* do {

            String temp = words.nextToken();
            temp = temp.toLowerCase(Locale.ROOT);
            System.out.println(temp);

            if (temp.equals("and")) {
                newWord.replaceAll("and", "y");
            }
        }while (words.hasMoreTokens());*/
}
