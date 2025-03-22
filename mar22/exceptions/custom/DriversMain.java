package mar22.exceptions.custom;

public class DriversMain {
    public static void main(String[] args) {
        LicenceAuthority licenceAuthority = new LicenceAuthority();

        try {
            licenceAuthority.carDrive();
        }
        catch (InvalidAgeException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
