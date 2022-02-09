package jaxb.VehicleDekho;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vehicles {
    private List<Vehicle> vehicles;

    public List<Vehicle> getVehicle() {
        return vehicles;
    }

    public void setVehicle(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}