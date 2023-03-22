package beach.ass.models;

public class Passenger {
    private String name;
    private PassengerClass passengerClass;
    private double age;
    private Sex sex;
    private boolean survived;

    public Passenger(String name, PassengerClass passengerClass, double age, Sex sex, boolean survived) {
        this.name = name;
        this.passengerClass = passengerClass;
        this.age = age;
        this.sex = sex;
        this.survived = survived;
    }

    @Override
    public String toString() {
        return String.format("Passenger [name=\"%s\", survived=\"%s\"]", name, survived);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PassengerClass getPassengerClass() {
        return passengerClass;
    }

    public void setPassengerClass(PassengerClass passengerClass) {
        this.passengerClass = passengerClass;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isSurvived() {
        return survived;
    }

    public void setSurvived(boolean survived) {
        this.survived = survived;
    }
}
