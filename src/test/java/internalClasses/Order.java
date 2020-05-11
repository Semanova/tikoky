package internalClasses;

public class Order {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String postCode;
    private String city;
    private String country;
    private String note;


    public Order(String firstName, String lastName, String email,
                 String address, String postCode, String city, String country, String note) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
        this.note = note;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getNote() {
        return note;
    }


    public void setNote(String note) {
        this.note = note;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}


