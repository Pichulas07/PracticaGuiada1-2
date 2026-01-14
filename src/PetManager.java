public class PetManager {
    
    //Atributos
    private int size;
    private Pet[] pets;


    //Constructor
    public PetManager(int numberOfPets) {
        size = 0;
        pets = new Pet[numberOfPets];
    }

    //Get
    public Pet[] getPets() {
        return pets;
    }

    //Set
    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    //GetSize
     public int getSize() {
        return size;
    }

    //Metodo add
    public boolean addPet(Pet pet){
        if(pet != null){
            for (int i = 0; i < pets.length; i++) {
                if (pets[i] == null) {
                    pets[i] = pet;
                    size++;
                    return true;
                }
            }
        }
        return false;
    }


   
    
}
