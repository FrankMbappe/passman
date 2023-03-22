package beach.ass.models;

public enum PassengerClass {
    FIRST_CLASS("1st"),
    SECOND_CLASS("2nd"),
    THIRD_CLASS("3rd");

    public final String label;

    PassengerClass(String label) {
        this.label = label;
    }
}
