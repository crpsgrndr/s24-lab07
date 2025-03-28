package frogger;


public class Main {
    public static void main(String[] args) {
        boolean[] occupiedSpots = {false, false, true, false};
        Road road = new Road(occupiedSpots);

        Records records = new Records();
        FroggerID id = new FroggerID("Usukhbayar", "Orosoo", "99112233", "12345", "CA", "F");
        Frogger frogger = new Frogger(road, 0, records, id);
        System.out.println("Initial Position: " + frogger.getPosition());

        System.out.println("Try move forward: " + frogger.move(true));
        System.out.println("Try move backward: " + frogger.move(false));

        frogger.move(true); 
        frogger.move(true); 
        System.out.println("Manually set to position 2 and try forward: " + (frogger.move(true)));

        System.out.println("Final Position: " + frogger.getPosition());

        System.out.println("Try recording frogger: " + frogger.recordMyself());
        System.out.println("Try recording again (duplicate): " + frogger.recordMyself());
    }
} 
