package Main.java.Data;

public class ParkingRequest {
    private String name;
    private String email;
    private String number;
    private String image;
    private boolean isResolved;

    public ParkingRequest(String name, String email, String number, String image) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.image = image;
        isResolved  =false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getImage() {
        return image;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }
}
