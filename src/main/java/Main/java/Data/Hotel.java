/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.java.Data;

/**
 *
 * @author sukhadapradhan
 */
public class Hotel {
    private String city;
    private String name;
    private String website;
    private String image;

    public Hotel(String city, String name, String website,String im) {
        this.city = city;
        this.name = name;
        this.website = website;
        image =im;
        
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    public String getImage() {
        return image;
    }

    private double longitude;
    private double latitude;
    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

}
