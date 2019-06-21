package oopsconcepts;

public class Car {
    // colour, make, model, year
    // These are states/attributes of the object "Car"
    private String colour;
    private String make;
    private String model;
    private int year;
    int speed;
    int gear;


    public Car() {
        this.speed = 0;
        this.gear = 0;
        System.out.println("Executing Constructor without any arguments");
    }

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Executing Constructor with any arguments");

    }

    // start engine, stop engine, increase speed, decrease speed
    //These are the behaviour of the object "Car"

    public void increaseSpeed() {
        System.out.println("Increasing the speed");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        } else {
            System.out.println("This is not a valid year");
        }
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

}
