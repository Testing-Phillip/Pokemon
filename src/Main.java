public class Main {
    public static void main(String[] args) {
/**      declare and initialize objects notes
*        classname var(object's name) = new classname() (Creates the object itself)
*        assignment works from right to left
*        first creates new Pokemon()
*        next sets it equal to the Pokemon variable (p1)
*        Var and methods are encapsulated within the object and changing the var in one object does not affect the variables in another
*        Classes blueprints for an editable entity this case pokemon
*        then we use that class to create objects of the class that have var and methods
*/
//        Pokemon p1 = new Pokemon();
//        p1.name = "Pikachu";
//
//        Pokemon p2 = new Pokemon();
//        p2.name = "Charmander";
//
//        p2.attack();
//
//        System.out.print(p1.name+" "+p1.level);
//        System.out.print("\n"+p2.name+" "+p2.level);
//        if (p1.level<p2.level) {
//            System.out.println("\n"+p2.name + " wins");
//        }else System.out.println("\n" + p1.name + " wins");
//    }
        Pokemon p1 = new Pokemon("Pikachu", 15);{//args are passed into parentheses and will represent constructors
        System.out.print(p1.level); // ref Pokemon constructor for variables
        }
    }
}


