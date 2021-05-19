package org.vspc.jsontutoria;

import java.util.Arrays;

public class Company {

    private int id;

    private String name;

    private String[] websites;

    private Address address;

    public Company(int id, String name, String[] websites, Address address) {
        this.id = id;
        this.name = name;
        this.websites = websites;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getWebsites() {
        return websites;
    }

    public void setWebsites(String[] websites) {
        this.websites = websites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", websites=" + Arrays.toString(websites) +
                ", address=" + address +
                '}';
    }
}

