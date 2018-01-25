
/**
 * Write a description of class player here.
 *
 * @author Zach Zimmerman
 * @version 1.24.18
 */
public class player
{
    int health = 100;
    deck d = new deck();
    game g = new game();
    private String name;
    String choice = "attack";
    public void setName(String t){
        name = t;
        System.out.println(name);
    }

    public void attack(){
        //random damage
        int damage = (int) (Math.random() * 35);
        System.out.println(damage);
        g.p1Turn = false;
        
        //attack a specific pokemon
    }

    public void defend(){

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
