public class Car {
    public int gear;
    public int speed;

    public Car(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public Car(){}

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
	
	    System.out.println("Hello");
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
