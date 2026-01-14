public class PetManager {
    
    //Atributos
    private int size;
    private Pet[] pets;


    //Constructor
    public PetManager(int numberOfPets) {
        size = 0;
        pets = new Pet[numberOfPets];
    }

    //Metodo Get
    public Pet[] getPets() {

        Pet[] newPets = new Pet[size];

        for (int i = 0; i < size; i++) {
            newPets[i] = pets[i];
        }

        return newPets;
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
            grow();
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


    //Corrimiento a la izquierda
    private void moveToLeft(int index){
        for (int i = index; i < size; i++) {
            if (pets[i] != null) {
                pets[i] = pets[i+1];
            }
        }
    }

    //Metodo remove
    public boolean removePets(Pet pet){
        for (int i = 0; i < size; i++) {
            if (pets[i].equals(pet)) {
                moveToLeft(i);
                pets[pets.length -1] = null;
                size--;
                return  true;
            }
        }
        return false;
    }

    //Metodo updatePets
    public boolean updatePets(Pet pet, int index){
        if (index >= 0 && index < size && pet != null) {
            pets[index] = pet;
            return true;
        }
        return false;
    }

    //Metodo grow
    private void grow(){
        if (size == pets.length) {
            Pet[] petsGrow = new Pet[pets.length * 2];

            for (int i = 0; i < size; i++) {
                petsGrow[i] = pets[i];
            }

            pets = petsGrow;
        }
    }
}
