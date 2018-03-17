package pokemon;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon() {};
        Charmander charmander = new Charmander("Charmander", "Fire", 100, 52, 43, 65);
        Squirtle squirtle = new Squirtle("Squirtle", "Water", 100, 48, 65, 43);
        Snorlax snorlax = new Snorlax("Snorlax", "Normal", 100, 60, 65, 30);        
        
        Pokemon pokemon1 = null;
        Pokemon pokemon2 = null;
        
        boolean looping = true;
        Scanner input = new Scanner(System.in);
        
        int damage = 0;
        int randomnum;
        
        while(looping){            
            System.out.print("Choose from these choices: \n[1]Choose a pokemon\n[2]Rename a pokemon\n[3]Fight a pokemon\n[4]Exit\n> ");            
            switch ( input.nextInt() ) {
                case 1:
                    System.out.print("HERE ARE THE POKEMONS: \n");
                    System.out.println("[1]");
                    charmander.pokemonData();
                    System.out.println("[2]");
                    squirtle.pokemonData();
                    System.out.println("[3]");
                    snorlax.pokemonData();
                    System.out.print("> ");
                    
                        switch ( input.nextInt() ) {
                            case 1:
                                System.out.println ( "Charmander." );
                                pokemon1 = charmander;
                                break;
                            case 2:
                                System.out.println ( "Squirtle.");
                                pokemon1 = squirtle;
                                break;
                            case 3:
                                System.out.println ( "Snorlax." );
                                pokemon1 = snorlax;
                                break;
                            default:
                                looping=false;
                                System.out.println("**ERROR**");
                        }   
                break;
            case 2:
                String newName;
                System.out.print("Your pokemon's new name: ");
                newName = input.next();
                System.out.println("New Name: "+newName);
                
                if(pokemon1 == charmander){
                    charmander.setName(newName);
                }
                else if(pokemon1 == squirtle){
                    squirtle.setName(newName);
                } 
                else if(pokemon1 == snorlax) {
                    snorlax.setName(newName);
                }
                else{
                    System.out.println("Null");
                }
                break;
            case 3:
                System.out.print("Which pokemon you wish to fight?"
                        + "\n[1]Charmander"
                        + "\n[2]Squirtle"
                        + "\n[3]Snorlax"
                        + "\n[4]Random"
                        + "\n> ");
                
                switch ( input.nextInt() ) {
                    case 1:
                        System.out.println("Charmander");
                        pokemon2 = charmander;
                        break;
                    case 2:
                        System.out.println("Squirtle");
                        pokemon2 = squirtle;
                        break;
                    case 3:
                        System.out.println("Snorlax");
                        pokemon2 = snorlax;
                        break;
                    case 4:
                        System.out.println("Random");
                        Random opponent = new Random();
                        int lawan;
                        
                        for(int counter=1; counter<=1; counter++){
                            lawan = 1+opponent.nextInt(2);
                            System.out.println(lawan);
                            if(lawan==1){
                                System.out.println("You will fight with charmander.");
                                pokemon2 = charmander;
                            }
                            
                            else if(lawan==2){
                                System.out.println("You will fight with squirtle.");
                                pokemon2 =  squirtle;
                            }
                            
                            else if(lawan==3){
                                System.out.println("You will fight with snorlax.");
                                pokemon2 = snorlax;
                            }
                        }
                        break;
                }
                System.out.println ( "Fight" );
                System.out.println(pokemon1.name+" begins fight with "+pokemon2.name+".");
            
                boolean loop = true;
                while(loop){
                        System.out.println(pokemon1.name + "'s health: " + pokemon1.health);
                        System.out.println(pokemon2.name + "'s health: " + pokemon2.health);
                        System.out.print("Choose: \n[1]Attack\n[2]Flee\n> ");
                        int selection = input.nextInt();
                        if (selection==1){
                        
                            if (pokemon1.type.equals("Fire")){
                                System.out.print("Choose your move: \n[1]Growl\n[2]Scratch\n> ");
                                int charmanderInput = input.nextInt();
                                    if(charmanderInput==1){
                                        damage = charmander.growl();
                                    }
                                    else if(charmanderInput==2){
                                        damage = charmander.scratch();
                                    }
                                    pokemon2.setHealth(pokemon2.health - damage);
                                    Random opponent = new Random();
                                    randomnum = opponent.nextInt(2) +1;
                                
                                        if(randomnum == 1 && pokemon2.getName().equals("Squirtle")){
                                            damage = pokemon2.tackle();
                                        }
                                        if(randomnum == 2 && pokemon2.getName().equals("Squirtle")){
                                            damage = pokemon2.tail_whip();
                                        }
                                        if(randomnum == 1 && pokemon2.getName().equals("Snorlax")){
                                            damage = pokemon2.punch();
                                        }
                                        if(randomnum == 2 && pokemon2.getName().equals("Snorlax")){
                                            damage = pokemon2.headbutt();
                                        }

                                            pokemon1.setHealth(pokemon1.health - damage);  
                                                if(pokemon1.health <= 0){
                                                    System.out.println(pokemon1.name +" has lost the fight\n");
                                                    loop = false;
                                                    looping = false;
                                                }
                                                else if(pokemon2.health <= 0){
                                                    System.out.println(pokemon2.name +" has lost the fight\n");
                                                    loop = false;
                                                    looping = false;
                                                }
                            }
                            else if(pokemon1.type.equals("Water")){
                                System.out.print("Choose your move: \n[1]Tackle\n[2]Tail whip\n> ");
                                int squirtleInput = input.nextInt();
                                    if(squirtleInput==1){
                                        damage = squirtle.tackle();
                                    }
                                    else if(squirtleInput==2){
                                        damage = squirtle.tail_whip();
                                    }

                                    pokemon2.setHealth(pokemon2.health - damage);
                                    Random opponent = new Random();
                                    randomnum = opponent.nextInt(2) +1;

                                        if(randomnum == 1 && pokemon2.getName().equals("Charmander")){
                                            damage = pokemon2.growl();
                                        }
                                        if(randomnum == 2 && pokemon2.getName().equals("Charmander"))
                                        {
                                            damage = pokemon2.scratch();
                                        }
                                        if(randomnum == 1 && pokemon2.getName().equals("Snorlax")){
                                            damage = pokemon2.punch();
                                        }
                                        if(randomnum == 2 && pokemon2.getName().equals("Snorlax")){
                                            damage = pokemon2.headbutt();
                                        }

                                        pokemon1.setHealth(pokemon1.health - damage);  
                                            if(pokemon1.health <= 0)
                                            {
                                                System.out.println(pokemon1.name +" has lost the fight\n");
                                                loop = false;
                                                looping = false;

                                            }
                                            else if(pokemon2.health <= 0)
                                            {
                                                System.out.println(pokemon2.name +" has lost the fight\n");
                                                loop = false;
                                                looping = false;
                                            }                        

                            }

                            else if(pokemon1.type.equals("Normal")){
                                System.out.print("Choose your move: \n[1]Head-butt\n[2]Punch\n> ");
                                int snorlaxInput = input.nextInt();
                                    if(snorlaxInput==1){
                                        damage = snorlax.headbutt();
                                    }
                                    else if(snorlaxInput==2){
                                        damage = snorlax.punch();
                                    }

                                    pokemon2.setHealth(pokemon2.health - damage);
                                    Random opponent = new Random();
                                    randomnum = opponent.nextInt(2) +1;

                                        if(randomnum == 1 && pokemon2.getName().equals("Charmander")){
                                            damage = pokemon2.growl();
                                        }
                                        if(randomnum == 2 && pokemon2.getName().equals("Charmander"))
                                        {
                                            damage = pokemon2.scratch();
                                        }
                                        if(randomnum == 1 && pokemon2.getName().equals("Squirtle")){
                                            damage = pokemon2.tackle();
                                        }
                                        if(randomnum == 2 && pokemon2.getName().equals("Squirtle")){
                                            damage = pokemon2.tail_whip();
                                        }

                                        pokemon1.setHealth(pokemon1.health - damage);  
                                            if(pokemon1.health <= 0)
                                            {
                                                System.out.println(pokemon1.name +" has lost the fight\n");
                                                loop = false;
                                                looping = false;

                                            }
                                            else if(pokemon2.health <= 0)
                                            {
                                                System.out.println(pokemon2.name +" has lost the fight\n");
                                                loop = false;
                                                looping = false;
                                            }                        

                            }
                        }
                        else if(selection==2){
                            System.out.println("You have successfully fled");
                            loop=false;
                        }
                }
                break;
            case 4:
                looping = false;
                break;
            default:
                looping = false;
            }
        }
    }
}