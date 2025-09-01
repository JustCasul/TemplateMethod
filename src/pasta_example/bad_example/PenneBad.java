package pasta_example.bad_example;

public class PenneBad
{
   public void makePenne()
   {
      boilWater();
      addPenne();
      cookPasta();
      drainWater();
      addSauce();
   }

   private void boilWater()
   {
      System.out.println("Water boiling");
   }

   private void addPenne()
   {
      System.out.println("Adding Penne");
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
      System.out.println("Added alfredo-sauce");
   }
}