public class Car {

    private boolean engine = true;
    private int cylinder;
    private String name;
    private int wheels = 4;



    public Car(int cylinder, String name)
    {
      this.cylinder = 0;
      this.name = "";

    }


    public String startEngine()
    {
       return "The car's engine is starting";
    }


    public String accelerate()
    {
       return "The car is accelerating";
    }


    public String brake()
    {
        return "The car is braking";
    }


    public int getCylinder() {
        return cylinder;
    }


    public String getName() {
        return name;
    }


}
