package beach.ass.models;

public enum Sex {
    MALE("male"),
    FEMALE("female");

    public final String label;

    Sex(String label) {
        this.label = label;
    }
}
