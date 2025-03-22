package mar15.abst;

public class HondaCivic extends Car{
    @Override
    public void run() {
        System.out.println("Honda car runns... fast");
    }

    @Override
    public void brake() {
        System.out.println("Honda car brakes ");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda Civic accelerate....");
    }

    public boolean hasCarPlay(){
        System.out.println("Carplay");
        return true;
    }
}

/*
any non abstract class inherits from abstract class , must implement
all abstract methods...


 */