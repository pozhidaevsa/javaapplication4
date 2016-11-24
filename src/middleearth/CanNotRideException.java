package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */
public class CanNotRideException extends Exception {
    public CanNotRideException() {
        super("Can not ride horse");
    }

    public CanNotRideException(String msg) {
        super(msg);
    }
}
