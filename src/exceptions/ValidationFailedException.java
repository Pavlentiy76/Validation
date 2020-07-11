package exceptions;

public class ValidationFailedException extends RuntimeException {

    public ValidationFailedException() {
    }

    public ValidationFailedException(String message) {
        super(message);
    }
}
