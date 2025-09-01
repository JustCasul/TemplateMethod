package pasta_example.bad_example;

public class SpaghettiBad
{

   public void makeSpaghetti()
   {
      boilWater();
      addSpaghetti();
      cookPasta();
      drainWater();
      addSauce();
   }

   private void boilWater()
   {
      System.out.println("Water boiling");
   }

   private void addSpaghetti()
   {
      System.out.println("Adding Spaghetti");
   }

   private void cookPasta()
   {
      System.out.println("Pasta cooked");
   }

   private void drainWater()
   {
      System.out.println("Water draining");
   }

   private void addSauce()
   {
      System.out.println("Added tomato sauce");
   }
}