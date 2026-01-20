package com.dev.practice.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Attribute {
    private String email;
    private String ssn;

    public Attribute(String email, String ssn) {
        this.email = email;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
class Address {
    private final String street;
    private final String city;
    private final String zipCode;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
    Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
}
 final class ImmutableEx1 {
    private final String name;
    private final Date dob;
     private final List<Address> personList;
     private final Attribute attribute;
     @Override
     public String toString() {
         return "ImmutableEx1{" +
                 "name='" + name + '\'' +
                 ", dob=" + dob +
                 ", personList=" + personList +", attribute="+attribute+
                 '}';
     }

    public String getName() {
        return name;
    }
    public Date getDob() {
        return (Date) dob.clone();
    }
    public Attribute getAttribute() {
         return new Attribute(attribute.getEmail(),attribute.getSsn());


    }
    public List<Address> getPersonList() {
        return new ArrayList<>(personList);
    }
    public ImmutableEx1(String name, Date dob, List<Address> personList,Attribute attribute) {
        this.name = name;
        this.dob = dob; //(Date)dob.clone();
        this.personList =  personList;//Collections.unmodifiableList(personList);
        this.attribute=attribute;
    }
}

public final class ImmutableEx {
    public static void main(String[] args) {
        Attribute attribute=new Attribute("dev@email","345635");
        //attribute.setEmail("dev@email");
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("123 Main St", "Springfield", "12345"));
        ImmutableEx1 immutableEx1=new ImmutableEx1("DEV",new Date(),addressList,attribute);
        System.out.println(immutableEx1);

        Attribute attribute1=new Attribute("kkkk","98989");
        //attribute1.setEmail("hahha");
        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(new Address("123 Main Stdev", "jajja", "79797"));
        Date ds= new Date();
        ds.setTime(0);
        ImmutableEx1 immutableEx2=new ImmutableEx1("DEV1",ds,addressList1,attribute1);
        System.out.println(immutableEx1);

    }

}