package homeworks.hw1.scooter;
import java.util.ArrayList;
import java.util.List;
public class RentalCompany {
    private int uid = 0;

    List<Scooter> scooters = new ArrayList<>();

    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter: scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false); // Mark the scooter as rented
                break;
            }
        }
    }



    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooter.setAvailable(true); // Mark the scooter as available

                break;
            }
        }

    }

    public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter.toString()); // Display information about each scooter
        }
    }
}
