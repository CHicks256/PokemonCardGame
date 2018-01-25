package PokemonCardGame;


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
    //int deckLength = pokemon.length;
    ArrayList<String> shuffledPokemon = new ArrayList<String>();
    int index = random.nextInt(pokemon.length);
    public void shuffle(){
        //shuffles pokemon into an ArrayList
        for (String i : pokemon){
            index = random.nextInt(pokemon.length);
            shuffledPokemon.add(pokemon[index]);
        }
        //System.out.print(pokemon[index]);
        //deck d = new deck();
        //d.deal();
        //debug code
    }

    public void deal(){
        //Gives each player a pokemon
        player p1 = new player();
        p1.name = shuffledPokemon.get(0);
        shuffledPokemon.remove(0);
        System.out.println(p1.name);
    }
    //debug method
    public static void main(){
        deck d = new deck();
        d.shuffle();
        player p1 = new player();
        p1.attack();
        p1.name = d.shuffledPokemon.get(0);
        System.out.println(p1.name);
    }

}
