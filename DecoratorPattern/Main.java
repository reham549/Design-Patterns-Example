abstract class Sandwich {
     public abstract String getDescription();
      public abstract double getCost(); 
    }
class BasicSandwich extends Sandwich {
     @Override 
     public String getDescription()  {
         return "Basic Sandwich"; 
        }
@Override
public double getCost() {
    return 30.0;
 }
  }
abstract class SandwichDecorator extends Sandwich {
     protected Sandwich sandwich;
public SandwichDecorator(Sandwich sandwich) {
    this.sandwich = sandwich;
}
 }
class Cheese extends SandwichDecorator { 
    public Cheese(Sandwich sandwich) { super(sandwich); 

    }
@Override
public String getDescription() {
    return sandwich.getDescription() + " + Cheese";
}

@Override
public double getCost() {
    return sandwich.getCost() + 10.0;
}
}
class Olives extends SandwichDecorator {
     public Olives(Sandwich sandwich) { super(sandwich); 

     }
@Override
public String getDescription() {
    return sandwich.getDescription() + " + Olives";
}

@Override
public double getCost() {
    return sandwich.getCost() + 5.0;
 }
}
public class Main { 
    public static void main(String[] args) {
         Sandwich sandwich = new BasicSandwich();
    sandwich = new Cheese(sandwich);
    sandwich = new Olives(sandwich);

    System.out.println(sandwich.getDescription());
    System.out.println("Total price: " + sandwich.getCost());
 }
}