package co.lumu.wordcounter.exceptions;

public class UpdateInfoError extends AssertionError{

    public UpdateInfoError(String message, Throwable cause) {
        super(message, cause);
    }
}
