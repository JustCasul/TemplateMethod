package pasta_example;

abstract class PastaRecipe
{
   public abstract void addSauce();

   public abstract void addPasta();

   private void boilWater()
   {
      System.out.println("Water boiling");
   }

   private void cookPasta()
   {
      System.out.println("Pasta cooked");
   }

   private void drainWater()
   {
      System.out.println("Water draining");
   }

   public final void makePasta() {
      boilWater();
      addPasta(); // Variable Schritt
      cookPasta();
      drainWater();
      addSauce();  // Variable Schritt
   }
}
