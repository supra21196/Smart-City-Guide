package Main.java.Data;

public class HousingRequest {
    private String name;
    private String email;
    private String number;
    
    private boolean isResolved;

    public HousingRequest(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;
        
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

  

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }
}