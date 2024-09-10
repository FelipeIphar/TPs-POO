public class Principito {

    private String Actitud;
    private String Personalidad;

    public String getActitud(){
        return Actitud;
    }

    public String getPersonalidad(){
        return Personalidad;
    }

    public void setActitud(String newActitud){
        this.Actitud = newActitud;
    }

    public void setPersonalidad(String newPersonalidad){
        this.Personalidad = newPersonalidad;
    }

    public Principito(String Act, String Pers){
        setActitud(Act);
        setPersonalidad(Pers);
    }

    public Principito(){
        
    }
    
}
