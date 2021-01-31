public class Ford extends Car
{
    public Ford (int cylinder, String name)
    {
        super(cylinder, name);
    }

    @Override
    public String startEngine()
    {
        return "The Ford's engine is starting";
    }

    @Override
   public String accelerate()
    {
       return "The Ford is accelerating";
    }

    @Override
    public String brake()
    {
        return "The Ford is braking";
    }

}
