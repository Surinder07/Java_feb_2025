package mar22.exceptions.custom;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message) {
        super(message);
    }
}
