package Main.java.Data;

public class House {
    private String city;
    private String Category;
    private double price;
    private String image;
    private String Address;

    public House(String city, String category, double price, String adr, String im) {
        this.city = city;
        Category = category;
        this.price = price;
        image=im;
        Address=adr;
    }

    public String getImage() {
        return image;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setAddress(String adr){
          Address=adr;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public String getCategory() {
        return Category;
    }

    public double getPrice() {
        return price;
    }
    
    public String getAddress(){
        return Address;
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
