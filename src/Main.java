public class Main {
    public static void main(String[] args) {

        /*int[] numbers = {10,20,30,40,50};
        String [] fruits = new String[3];

        System.out.println("Numbers: " + numbers[2] 
            + " Fruits: " + fruits[2]);*/

        Person p = new Person("Faustillo", 15, 5);

       //System.out.println("Name pet 1: " + p.getPets());

       if (p.addpet(new Pet("misinguillo", "Cat"))) {
            IOManage.readMessage("Pet added susccessfully");
            
       }else{
            IOManage.readMessage("Failed to add pet bro");
       }

        for (Pet pet : p.getPetManager().getPets()) {
            if (pet != null) {
                IOManage.readMessage(pet.getPetName());
            }
        }
    }
}
