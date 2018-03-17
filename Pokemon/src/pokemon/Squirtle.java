package pokemon;

public class Squirtle extends Pokemon
{ 
    Squirtle(String name, String type, int health, int attack,int defense, int power_points){
        super();
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.power_points = power_points;
    }

    public int tackle(){
        System.out.println(this.name + " tackles ");
        return 10;
    }
    
    public int tail_whip(){
        System.out.println(this.name+" tail whip ");
        return 20;
    }
    
    
    
}
