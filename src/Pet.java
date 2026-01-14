public class Pet {

    //Atributos
    private String petName;
    private String type;

    //Constructores

    public Pet(){
        this("", "");
    }

    public Pet(String petName, String type) {
        this.petName = petName;
        this.type = type;
    }

    //Getters
    public String getPetName() {
        return petName;
    }
    
    public String getType() {
        return type;
    }

    //Setters
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}
