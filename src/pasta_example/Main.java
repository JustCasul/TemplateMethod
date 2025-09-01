package pasta_example;

public class Main
{
   public static void main(String[] args)
   {
      PastaRecipe spaghetti = new Spaghetti();
      spaghetti.makePasta();

      System.out.println();

      PastaRecipe penne = new Penne();
      penne.makePasta();
   }
}
