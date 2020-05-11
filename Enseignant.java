public class Enseignant {
   protected String nom;
   protected int nbHeureTotal;
   
   public Enseignant(String nom, int nbHeureTotal) 
   {
      this.nom = nom;
      this.nbHeureTotal = nbHeureTotal;
   }
   public String nom() {
      return "Le nom du prof est : "+ nom;
   }
   public int hc() {
      if (nbHeureTotal <= 192) {
         return 0;
      }
      return nbHeureTotal - 192;
   }
   public int retribution() {
      return hc() * 35;
   }
}