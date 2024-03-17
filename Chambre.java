public class Chambre {
   public static int idChambre = 0 ; // numero de la chambre 
   public String type ;// suite , simple  / on peut la faire comme une hashmap
   public String forme ; //example : 2 separer / sinon on fait une enume et pur chaque valeur c'est un code wella bles collection 
   public double prix ; 
   private boolean isEmpthy; 

   public Chambre(String type , String forme , double prix , boolean isEmpthy){
    idChambre++;
    this.type = type ; 
    this.forme= forme; 
    this.prix = prix;
    this.isEmpthy = isEmpthy;
   }
   public boolean getIsEmpthy(){
    return isEmpthy;
   }
   public void setIsEmpthy(boolean isEmpthy){
    this.isEmpthy= isEmpthy;
   }



}
