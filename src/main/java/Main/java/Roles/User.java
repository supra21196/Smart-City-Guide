/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.java.Roles;

/**
 *
 * @author sukhadapradhan
 */
public class User {
    private String username;
    private String email;
    private String password;
    private boolean housingPermission;
    private boolean parkingPermission;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        housingPermission=false;
        parkingPermission=false;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public boolean CheckPassword(String pass)
    {
        if(password.equals(pass))
        {
            return true;
        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHousingPermission(boolean housingPermission) {
        this.housingPermission = housingPermission;
    }

    public boolean getHousingPermission() {
        return housingPermission;
    }

    public boolean getParkingPermission() {
        return parkingPermission;
    }

    public void setParkingPermission(boolean parkingPermission) {
        this.parkingPermission = parkingPermission;
    }
}
