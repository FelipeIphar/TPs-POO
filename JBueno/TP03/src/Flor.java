public class Flor {
    
    private String Actitud;
    private String Apariencia;

    public String getActitud(){
        return Actitud;
    }

    public String getApariencia(){
        return Apariencia;
    }

    public void setActitud(String newActitud){
        this.Actitud = newActitud;
    }

    public void setApariencia(String newApariencia){
        this.Apariencia = newApariencia;
    }

    public Flor(String Act, String Apa){
        setActitud(Act);
        setApariencia(Apa);
    }

    public Flor(){
        
    }



}
