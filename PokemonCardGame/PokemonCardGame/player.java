
/**
 * Players are given all necessary things fo this game to run.
 *
 * @author Zach Zimmerman
 * @version 1.24.18
 */
public class player
{
    int health = 100;
    deck d = new deck();
    private String name;
    private String choice = "attack";
    public void setName(String t){
        name = t;
        System.out.println(name);
    }

    public void attack(){
        //random damage
        int damage = (int) (Math.random() * 35);
        System.out.println(damage);
        
        //attack a specific pokemon
    }

    public void defend(){
        //player becomes "invinsible" for 1 round. Cannot be use twice in a row. 
        //If used twice print p.name + " defended but it failed." and end turn
    }

    public void turn(){
        //choose what to do; attack, defend, item?
        if(choice == "attack"){
            //choose who to attack
            this.attack();
        }
        else if (choice == "defend"){
            this.defend();
        }
        else if (choice == "item"){
            System.out.println("You used a potion.");
        }
    }
}
