public class Principito {
    private String actitud;
    private String personalidad;

    //Getters
    public String getActitud () {
        return actitud;
    }
    public String getPersonalidad () {
        return personalidad;
    }

    //Setters
    public void setActitud (String newActitud) {
        this.actitud = newActitud;
    }
    public void setPersonalidad (String newPersonalidad) {
        this.personalidad = newPersonalidad;
    }


    
    public Principito () {}

    public Principito (String act, String perso) {
        setActitud(act);
        setPersonalidad(perso);
    }
    
}
