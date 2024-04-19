package homeworks.hw1.scooter;

public class ScooterRentalTester {
    /**
     * Tester class to demonstrate scooter rental scenario.
     */


        public static void main(String[] args) {
            // Create a rental company
            RentalCompany rentalCompany = new RentalCompany();

            // Add a scooter to the rental company
            Scooter scooter = new Scooter();
            scooter.setModel("Sparrow X10");
            rentalCompany.addScooter(scooter);

            // Rent the scooter and go from home to the university
            rentalCompany.rentScooter(scooter.getId());
            System.out.println("Scooter rented. Going from home to the university...");
            simulateTravel(60); // Simulate travel time (in minutes)
            rentalCompany.returnScooter(scooter.getId(), 41.7121106, 44.7489232); // University coordinates

            // Wait for 1 hour
            System.out.println("Waiting for 1 hour...");
            try {
                Thread.sleep(60 * 60 * 1000); // Sleep for 1 hour
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Rent the scooter again and go back home
            rentalCompany.rentScooter(scooter.getId());
            System.out.println("Scooter rented again. Going from the university back home...");
            simulateTravel(30); // Simulate travel time (in minutes)
            rentalCompany.returnScooter(scooter.getId(), 41.721189, 44.729296);

            System.out.println("Scooter returned near home. Rental process completed.");
        }

        /**
         * Simulates travel time.
         *

         */
        private static void simulateTravel(int minutes) {
            try {
                Thread.sleep(minutes * 60 * 1000); // Convert minutes to milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


