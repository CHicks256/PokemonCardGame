
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
    player p3 = new player();
    deck d = new deck();
    public void play(){
        d.shuffle();
    }

}
