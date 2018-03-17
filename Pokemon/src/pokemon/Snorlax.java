package pokemon;

public class Snorlax extends Pokemon
{    
    Snorlax(String name, String type, int health, int attack, int defense, int power_points){
        super();
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.power_points = power_points;        
    }

    public int headbutt(){
        System.out.println(this.name+" tackles ");
        return 30;
    }
    
    public int punch(){
        System.out.println(this.name+" punches ");
        return 50;
    }
            
}
