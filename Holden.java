public class Holden extends Car
{

    public Holden (int cylinder, String name)
    {
        super(cylinder, name);
    }


    @Override
    public String startEngine()
    {
        return "The Holden's engine is starting";
    }


    @Override
    public String accelerate()
    {
        return "The Holden is accelerating";
    }


    @Override
    public String brake()
    {
        return "The Holden is braking";
    }

}

