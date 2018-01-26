
/**
 * Write a description of class deck here.
 *
 * @author Zach Zimmerman
 * @version 1.24.18
 */
import java.util.Random;
import java.util.ArrayList;
public class deck
{
    Random random = new Random();
    //pokenon array
    String [] pokemon = {"Eevee", "Growlithe", "Cyndaquil",
            "Natu", "Ralts", "Torchic", "Riolu", "Piplup", "Zorua",
            "Sewaddle", "Honedge", "Bunnelby", "Rockruff","Jangmo'o"};
    ArrayList<String> shuffledPokemon = new ArrayList<String>();
    int index = random.nextInt(pokemon.length);
/**
    public void shuffle(){
        //shuffles pokemon into an ArrayList
        for (String i : pokemon){
            index = random.nextInt(pokemon.length);
            shuffledPokemon.add(pokemon[index]);
            //This should fix the problem of Pokemon being in the shuffled array twice, however
            //remove won't recognize index as an integer, even though it is
            //pokemon.remove(1);
        }
        //debug code
        //System.out.print(shuffledPokemon.get(0));
        //System.out.print(shuffledPokemon.size());
        System.out.println(shuffledPokemon);
    }

    
    //debug method
    public static void main(){
        deck d = new deck();
        d.shuffle();
    }
**/
      public void shuffle(String [] pokemon){
        shuffledPokemon.clear();
          //shuffles pokemon into an ArrayList
        for (int i = 0; i < pokemon.length; i++){
            int r = (int)(Math.random() * (pokemon.length - 1));   
            String temp = pokemon[r];
            pokemon[r] = pokemon[i];
            pokemon[i] = temp;
        }
        for (int i = 0; i<pokemon.length; i++){
         shuffledPokemon.add(pokemon[i]);
        }
        System.out.println(shuffledPokemon);
        
        //debug code
        //System.out.print(shuffledPokemon.get(0));
        //System.out.print(shuffledPokemon.size());
    } 
}
