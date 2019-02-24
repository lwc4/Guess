
package guessgame;

import java.util.*;
import javax.swing.JOptionPane;

public class GuessGame {

     public static void main(String[] args) {
        // TODO code application logic here
      
        int y = 5;
        String sentinel = "999";
        String user = "";
        String words[] = {"dragons","dog","cat","kangaroo","octopus", "death"};
        int random = randomInt();
        String word = words[random];
        
        int difficulty;
        difficulty = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter selection for difficulty level...\n 1 - Easy \n 2 - Medium \n 3- Hard"));

        // EASY --------------------------------------------------------------
        if(difficulty == 1){
        
        while(!user.equals(word) && !user.equals(sentinel)){
            user = JOptionPane.showInputDialog(null, " EASY: Try to guess the word! (Enter 999 to quit)\nThe word has " + word.length() + " letters:");
            if(y == 3){
                if(word.equals(words[0])){
                    JOptionPane.showMessageDialog(null, "Hint: Hereo's slay these fire breathing reptile beasts, often to save a princess trapped in a castle");
                }
                else if(word.equals(words[1])){
                    JOptionPane.showMessageDialog(null,  "Hint: These animals are pets, they woof, they bark, \nthey pee on fire extinguishers, they love bones and other treats");
                }
                else if(word.equals(words[2])){
                    JOptionPane.showMessageDialog(null, "Hint: These pets go Meow, they love to scratch a post, \nuse a litter box and can catch mice very effectively");
                }
                else if(word.equals(words[3])){
                    JOptionPane.showMessageDialog(null, "Hint: These Australian animals hop upright on big hind legs");
                }
                else if(word.equals(words[4])){
                    JOptionPane.showMessageDialog(null, "Hint: These sea creatures have 8 long arms and can shoot inkjets when threatened");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hint: When a creature reaches the end of its life, it has entered this. \nThe Grim Reaper is the symbol of this event");
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
        } // END EASY........................
        
        
        // ----- MEDIUM ---------------------------------
        if(difficulty == 2){
        
        while(!user.equals(word) && !user.equals(sentinel)){
            user = JOptionPane.showInputDialog(null, "MEDIUM: Try to guess the word! (Enter 999 to quit)\nThe word has " + word.length() + " letters:");
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
                  else if(word.equals(words[4])){
                    JOptionPane.showMessageDialog(null, "Hint: Underwater Camoflauge masters, with beaks..");
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
        } // End MEDIUM ........................
        
        // HARD ...........................................
        if(difficulty == 3){
        
        while(!user.equals(word) && !user.equals(sentinel)){
            user = JOptionPane.showInputDialog(null, "HARD- Try to guess the word! (Enter 999 to quit)\nThe word has " + word.length() + " letters:");
            if(y == 3){
                if(word.equals(words[0])){
                    JOptionPane.showMessageDialog(null, "Hint: Scales, fire");
                }
                else if(word.equals(words[1])){
                    JOptionPane.showMessageDialog(null, "Hint: K minus (5 + 4)");
                }
                else if(word.equals(words[2])){
                    JOptionPane.showMessageDialog(null, "Hint: Felida");
                }
                else if(word.equals(words[3])){
                    JOptionPane.showMessageDialog(null, "Hint: Macropodidae");
                }
                  else if(word.equals(words[4])){
                    JOptionPane.showMessageDialog(null, "Inky cephalopod");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hint: The truth I have been seeking — this truth is _____. Yet _____ is also a seeker. Forever seeking me. So — we have met at last. And I am prepared. I am at peace.  ");
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
        } // End Hard..............................
          
     }//Main
    
    public static int randomInt(){
         int maximum = 6;
         int minimum = 1;
         Random rn = new Random();
        int range = maximum - minimum + 1;
        int randomNum =  rn.nextInt(range) + minimum;
 
         return randomNum;}
    
}//SuperClass end
