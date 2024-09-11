public class Principito {
    private String actitud;
    private String personalidad;
    private Flor florDePrin;

    //Getters
    public String getActitud () {
        return actitud;
    }
    public String getPersonalidad () {
        return personalidad;
    }
    public Flor getFlor () {
        return florDePrin;
    }

    //Setters
    public void setActitud (String newActitud) {
        this.actitud = newActitud;
    }
    public void setPersonalidad (String newPersonalidad) {
        this.personalidad = newPersonalidad;
    }
    public void setFlor (Flor newFlor) {
        this.florDePrin = newFlor;
    }

    
    public Principito () {}

    public Principito (String act, String perso, Flor florPrin) {
        setActitud(act);
        setPersonalidad(perso);
        setFlor(florPrin);

    }
    
}
