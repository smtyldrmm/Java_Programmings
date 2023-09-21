package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state +" " + zipCode;
        System.out.println(address);
    }
}
/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode

Use concatenation to print the full shipping address

    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125


 */
