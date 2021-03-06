import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengerNumber() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.getPassengerNumber() < this.capacity){
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        if (this.getPassengerNumber() > 0) {
            this.passengers.remove(0);
        }
    }

    public void pickUp(BusStop busstop) {
        Person passenger = busstop.removePerson();
        if (passenger != null){
            addPassenger(passenger);
        }
    }
}
