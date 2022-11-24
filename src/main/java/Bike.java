public class Bike {
    public int gear;
    public int speed;

    public Bike(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString()
    {
        System.out.println("No of gears are " + gear );
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

