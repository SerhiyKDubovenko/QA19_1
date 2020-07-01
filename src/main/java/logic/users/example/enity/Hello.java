package logic.users.example.enity;

import lombok.Data;

/**
 * @author Serhiy Dubovenko
 */

@Data
public class Hello {

    private boolean status;
    private String message;

    public Hello() {
    }

    public Hello(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
