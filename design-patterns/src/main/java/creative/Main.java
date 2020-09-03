package creative;

import creative.builder.domain.Account;
import creative.builder.domain.Address;
import creative.builder.domain.Name;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> middleNames = new ArrayList<>();
        middleNames.add("Kuba");
        middleNames.add("Janek");
        Name name = new Name.Builder()
                .firstname("Jacob")
                .middleNames(middleNames)
                .surname("Rambo")
                .build();
        System.out.println(name);

        Address address = new Address.Builder()
                .city("Warsaw")
                .street("Pulawska")
                .zipCode("02-508")
                .houseNumber(53)
                .build();
        System.out.println(address);

        Account account = new Account.Builder()
                .address(address)
                .email("test@test.com")
                .id(1)
                .build();
        System.out.println(account);
    }
}
