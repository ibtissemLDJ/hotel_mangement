public class Administrateur extends User{
    public boolean active ; 
    public Administrateur (String name , String lastName , String phoneNumber ,String email, boolean active ){
        super(name, lastName, phoneNumber, email);
        this.active= active ; 
    }
    
}
