public class BMW extends Car{
    public int seatHeight;
    public BMW(int gear, int speed,
                 int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        int a=0;
        int b=0;
        seatHeight = newValue;
         try{
            int a=10;b=0;c=0;

        }catch(Exception e){
        }
        try{
            int a=10;b=0;c=0;

        }catch(Exception e){
        }
    }
    public int getLength(String[] strings) {

        int length = 0;
        if (strings == null || strings.length == 0) return 0;

        for (String str : strings) {
            length += str.length();
        }
 try{
            int a=10;b=0;c=0;

        }catch(Exception e){
        }
        return length;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
