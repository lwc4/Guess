
package guessgame;

import java.util.*;
import javax.swing.JOptionPane;

public class GuessGame {

    public static void main(String[] args) {
        int y = 5;
        String sentinel = "999";
        String user = "";
        String words[] = {"dragons","dog","cat","kangaroo","death"};
        int random = (int) (Math.floor(Math.random()*5)+1);
        random = random - 1;
        String word = words[random];

        while(!user.equals(word) && !user.equals(sentinel)){
            user = JOptionPane.showInputDialog(null, "Try to guess the word! (Enter 999 to quit)\nThe word has " + word.length() + " letters:");
            if(y == 3){
                if(word.equals(words[0])){
                    JOptionPane.showMessageDialog(null, "Hint: Fire breathing dinosaur");
                }
                else if(word.equals(words[1])){
                    JOptionPane.showMessageDialog(null, "Hint: Woof");
                }
                else if(word.equals(words[2])){
                    JOptionPane.showMessageDialog(null, "Hint: Meow");
                }
                else if(word.equals(words[3])){
                    JOptionPane.showMessageDialog(null, "Hint: Great boxer from down under");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hint: Not life, but...");
                }  
            }
            y--;
            if(user.equals(sentinel))
                {
                    JOptionPane.showMessageDialog(null, "You quit the game!");
                    break;
                }
            if(user.equals(word)){
            JOptionPane.showMessageDialog(null, "Congrats, you guessed the word!!");
        }
 
        }
        
          
     }
}
