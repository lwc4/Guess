
package guessgame;

import java.util.*;

public class GuessGame {

    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        String user = "";
        String words[] = {"dragons","dog","cat","kangaroo","death"};
        int random = (int) (Math.floor(Math.random()*5)+1);
        random = random - 1;
        String word = words[random];
        Scanner input = new Scanner(System.in);
        while(x < 5 && !user.equals(word)){
            System.out.println("You have " + y + " guesses to guess the word\nThe word has " + word.length() + " letters:");
            if(y == 3){
                if(word.equals(words[0])){
                    System.out.println("Fire breathing dinosaur");
                }
                else if(word.equals(words[1])){
                    System.out.println("woof");
                }
                else if(word.equals(words[2])){
                    System.out.println("meow");
                }
                else if(word.equals(words[3])){
                    System.out.println("great boxer from down under");
                }
                else{
                    System.out.println("not life, but...");
                }
            }
            user = input.nextLine();
            x++;
            y--;
        }
        if(user.equals(word)){
            System.out.println("Congrats!");
        }
        else{
            System.out.println("Boo!  You Lost!");
        }   
     }
}
