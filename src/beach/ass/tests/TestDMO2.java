package beach.ass.tests;

import beach.ass.models.Passenger;
import beach.ass.models.PassengerClass;
import beach.ass.models.Sex;

public class TestDMO2 {

    public static void test() {
        var passenger = new Passenger(
                "Abbing, Mr Anthony",
                PassengerClass.FIRST_CLASS,
                25,
                Sex.MALE,
                true
        );
        System.out.println(passenger);
    }
}
