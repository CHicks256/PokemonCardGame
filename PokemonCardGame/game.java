
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class game
{
    player p1 = new player();
    player p2 = new player();
    static deck d = new deck();
    static int numOfPlayers = 2;
    static boolean p1Turn = false;
    static boolean p2Turn = false;
    static int playerTurn = (int)(Math.random() * numOfPlayers);
    static boolean gameInProgress = true;

    public static void play(){
        d.shuffle();
        player p1 = new player();
        player p2 = new player();
        //give players pokemon
        p1.setName(d.shuffledPokemon.get(0));
        d.shuffledPokemon.remove(0);
        p2.setName(d.shuffledPokemon.get(0));
        d.shuffledPokemon.remove(0);
        
        while (p1.health >= 0 || p2.health >= 0){
            if (playerTurn == 1){ 
                p1Turn = true;
            }
            else{
                p2Turn = true;
            }
            
            while (p1Turn){
                p1.turn();
                p1Turn = false;
                p2Turn = true;
                break;
            }

            /**while (p2Turn){
                p2.turn();
                p2Turn = false;
                p1Turn = true;
                break;
            }**/
        }
    }

}
