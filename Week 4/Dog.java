public class Dog {
    public static void main (String[] args) {
        //In 2040 NASA are planning to send a dog to the moon in a rocket. Could be dangerous for the dog. Odds for the dog surviving are 10 to 1.
        int year = 2040; 
        byte odds = 10;
        String org = "NASA", animal = "dog", location = "moon", vehicle = "rocket";

        System.out.println("In "+year+" "+org+" are planning to send a "+
                            animal+" to the "+location+" in a "+vehicle+".");
        System.out.println("Could be dangerous for the "+animal+
                            ". Odds for the "+animal+" surviving are "+odds+" to 1.");
    }
}
