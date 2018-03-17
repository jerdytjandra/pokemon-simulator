package pokemon;

public class Charmander extends Pokemon
{
    Charmander(String name, String type, int health, int attack, int defense, int power_points){
        super();
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.power_points = power_points; 
    }
    
    public int growl(){
        System.out.println(this.name + " growls ");
        return 20;
    }
    
    public int scratch(){
        System.out.println(this.name + " scratches ");
        return 10;
    }
    
    
}
