package PokemonCardGame;


/**
 * Write a description of class player here.
 *
 * @author Zach Zimmerman
 * @version 1.24.18
 */
public class player
{
    int health = 100;
    String name;
    public void attack(){
        int damage = (int) (Math.random() * 35);
        //debug code
        /**for (int x = 0; x < 10; x++){
            int damage = (int)(Math.random() * (35));
            System.out.println(damage);
        }**/
    }

    public void defend(){

    }
    
    public void turn(){
        
    }
}
