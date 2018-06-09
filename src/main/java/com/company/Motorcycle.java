

public class Motorcycle extends Bicycle{

    public int pedalNum;
    public String gasTank;
    public String motor;
    public String className = this.getClass().getName();

    // one constructor
    public Motorcycle(int pedalNum,String wheelShape, int wheelNum, String seatShape, String gasTank, String motor)
    {
        super(pedalNum,wheelShape, wheelNum, seatShape);

       this.pedalNum = pedalNum;
        this.gasTank = gasTank;
        this.motor = motor;
    }

    // one method
    public void print()
    {
        super.print();
        System.out.println(className+ "'s Pedal number is: " + pedalNum);
        System.out.println(className+ "'s Gas Tank is: " + gasTank);
        System.out.println(className+ "'s Motor is: " + motor);
    }

}
