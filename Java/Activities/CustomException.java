package Activities;

public class CustomException extends Throwable {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }
}
