public class Main {
    public static void main(String[] args) {

        /*int[] numbers = {10,20,30,40,50};
        String [] fruits = new String[3];

        System.out.println("Numbers: " + numbers[2] 
            + " Fruits: " + fruits[2]);*/

        Person p = new Person("Faustillo", 15, 2);

       //System.out.println("Name pet 1: " + p.getPets());

        for (Pet pet : p.getPetManager().getPets()) {
            System.out.println(pet.getPetName());
        }
    }
}
