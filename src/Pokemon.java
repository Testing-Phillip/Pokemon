//this class becomes a blueprint for creating objects
public class Pokemon {
    String name;
    int level;
    Pokemon(){ //this is the constructor you want it to have the same name as the class
        level = 1; // when a pokemon is created the level is set to int = 1
        // this method will have no return type
    }
    Pokemon(String pName, int pLevel){
        name = pName;//var in the class equal to the parameters that gets passed into the method
        level = pLevel;
    }
    void attack() {
        System.out.println(name + " attack!");
    }
}
