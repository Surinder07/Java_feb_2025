package mar18.multi;

public abstract class SmartPhone extends Camera implements Calculator, Clock{
    @Override
    public void calculate() {

    }

    @Override
    public void showTime() {

    }

    @Override
    public void takePictures() {
        System.out.println("this camera can takes pictures at 50MP");
    }
}
