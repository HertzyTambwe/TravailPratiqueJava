public class GestionHeureComplementaire {
    public static void main(String[] args) {

        Enseignant enseignant1 = new Enseignant("Emmanuel", 512);
        IntervenantExterieur intervenantExterieur1 = new IntervenantExterieur("Jhon", 150);
        IntervenantFac intervenantFac1 = new IntervenantFac("Andy", 120);

        System.out.println("====Conportement de l'objet enseignant=====");
        System.out.println("nom enseignant  :" + enseignant1.nom());
        System.out.println("le nombre d'heure complementaire :" + enseignant1.hc());
        System.out.println("La retribution  :" + enseignant1.retribution());
        System.out.println("====Conportement de l'objet intervenant Exterieure=====");
        System.out.println("nom intervenant Exterieure  :" + intervenantExterieur1.nom());
        System.out.println("le nombre d'heure complementaire  :" + intervenantExterieur1.hc());
        System.out.println("La retribution  :" + intervenantExterieur1.retribution());
        System.out.println("====Conportement de l'objet intervenant de Fac=====");
        System.out.println("nom intervenant de Fac  :" + intervenantFac1.nom());
        System.out.println("le nombre d'heure complementaire  :" + intervenantFac1.hc());
        System.out.println("La retribution  :" + intervenantFac1.retribution());
    }
}