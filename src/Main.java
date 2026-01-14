public class Main {
    public static void main(String[] args) {

        /*int[] numbers = {10,20,30,40,50};
        String [] fruits = new String[3];

        System.out.println("Numbers: " + numbers[2] 
            + " Fruits: " + fruits[2]);*/

        Person person = new Person("Faustillo", 15, 1);

        Pet pet1 = new Pet("misinguillo", "Cat");
        Pet pet2 = new Pet("Rafa", "rat");

        person.addpet(new Pet("Keylor", "My dog"));
        person.addpet(pet2);
       

       if (person.addpet(pet1)) {
            IOManage.readMessage("Pet added susccessfully");
            
       }else{
            IOManage.readMessage("Failed to add pet bro");
       }

       if (person.removePet(pet1)) {
            IOManage.readMessage("Pet remove successfully");
       }else{
            IOManage.readMessage("Failed to remove pet");
       }

       if (person.updatePets(pet2, 0)) {
            IOManage.readMessage("your pets has been update successfully");
       }else{
            IOManage.readMessage("Failed to uptade pets");
       }
       

       if (person.getPets().length == 0) {
            IOManage.readMessage("No pets found");
       }else{
            for (Pet pet : person.getPets()) {
                IOManage.readMessage(pet.getPetName());
            }
       }
    }
}
