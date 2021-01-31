public class Mitsubishi extends Car
{
    public Mitsubishi (int cylinder, String name)
    {
        super(cylinder, name);
    }

    @Override
    public String startEngine()
    {
        return "The Mitsubishi's engine is starting";
    }


    @Override
    public String accelerate()
    {
        return "The Mitsubishi is accelerating";
    }


    @Override
    public String brake()
    {
        return "The Mitsubishi is braking";
    }

}
