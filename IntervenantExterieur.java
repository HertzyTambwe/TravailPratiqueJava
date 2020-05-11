public class IntervenantExterieur extends Enseignant 
{
    public IntervenantExterieur(String nom,int nbHeureIntervenantExterieur) 
    {
        super(nom,nbHeureIntervenantExterieur);
    }

    public int hc(){
        return nbHeureTotal;
    }
    // public int retribution(){
    //     return hc() * 35;
    // }
}