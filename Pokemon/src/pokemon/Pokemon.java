package pokemon;

import java.util.Random;

public abstract class Pokemon {
        public String name;
        public String type;
        public int health;
        public int attack;
        public int defense;
        public int power_points;
    
        Pokemon(){}
    
        Pokemon(String name, String type, int health, int attack, int defense, int power_points){
            this.name = name;
            this.type = type;
            this.health = health;
            this.attack = attack;
            this.defense = defense;
            this.power_points = power_points;
        }
        
        public void setName(String name){
            this.name = name;
        }        
        
        public void setHealth(int health){
            this.health = health;
        }        
        
        public String getName(){
            return this.name;
        }
        
        public void pokemonData(){
        System.out.println("Name: "+this.name);
        System.out.println("Type: "+this.type);
        System.out.println("Health: "+this.health);
        System.out.println("Attack: "+this.attack);
        System.out.println("Defense level: "+this.defense);
        System.out.println("Power points: "+this.power_points);
        }        

    int tackle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int tail_whip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int growl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int scratch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int punch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int headbutt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
