
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
            "Honedge", "Bunnelby", "Rockruff","Jangmo'o"};
    ArrayList<String> shuffledPokemon = new ArrayList<String>();
    int index = random.nextInt(pokemon.length);

    public void shuffle(){
        //shuffles pokemon into an ArrayList
        for (String i : pokemon){
            index = random.nextInt(pokemon.length);
            shuffledPokemon.add(pokemon[index]);
        }
        //debug code
            //System.out.print(shuffledPokemon.get(0));
            //System.out.print(shuffledPokemon.size());
    }

    //debug method
    public static void main(){
        deck d = new deck();
        d.shuffle();
    }

}
