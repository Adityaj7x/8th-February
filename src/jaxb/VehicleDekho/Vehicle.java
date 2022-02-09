package jaxb.VehicleDekho;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vehicle {
    private String brand;
    private String name;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
