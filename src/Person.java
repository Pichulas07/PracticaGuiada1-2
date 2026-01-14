public class Person {

    //Atributos
    private String name;
    private int age;
    private PetManager petManager;

    //Constructores
    public Person(){
        this("", 0, 5);
        petManager = new PetManager(5);
    }


    public Person(String name, int age, int numberOfPets) {
        this.name = name;
        this.age = age;
        petManager = new PetManager(numberOfPets);
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PetManager getPetManager() {
        return petManager;
    }


    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetManager(PetManager petManager) {
        this.petManager = petManager;
    }

    //Otros metodos
    public boolean addpet(Pet pet){
      return petManager.addPet(pet);
    }
    
}
