public class Principito {

    private String Actitud;
    private String Personalidad;
    private Flor FlorPrincipito; //esta flor pertenece al principito


    //Getters
    public String getActitud(){
        return Actitud;
    }

    public String getPersonalidad(){
        return Personalidad;
    }

    public Flor getFlor(){
        return FlorPrincipito;
    }

    //Setters
    public void setActitud(String newActitud){
        this.Actitud = newActitud;
    }

    public void setPersonalidad(String newPersonalidad){
        this.Personalidad = newPersonalidad;
    }

    public void setFlor(Flor flor){
        this.FlorPrincipito = flor;
    }

    //Constructor Con una flor
    public Principito(String Act, String Pers, Flor flor){
        setActitud(Act);
        setPersonalidad(Pers);
        setFlor(flor);
        
    }

    //Constructor Vacio
    public Principito(){
        
    }

    
}
