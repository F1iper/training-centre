package creative.builder;

import java.util.List;

public class Account {

    private int id;
    private String email;
    private String firstname;
    private List<String> middleNames;
    private String surname;
    private int houseNumber;
    private String street;
    private String zipCode;
    private String city;

    public Account(int id, String email, String firstname, List<String> middleNames, String surname, int houseNumber, String street, String zipCode, String city) {

        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.middleNames = middleNames;
        this.surname = surname;
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }
}
