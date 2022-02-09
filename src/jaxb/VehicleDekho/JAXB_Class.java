package jaxb.VehicleDekho;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxb.VehicleDekho.Vehicles;

public class JAXB_Class {
    // Unmarshalling
    public static List<Vehicle> convertXmlToObject(String path) {

        File file = new File(path);

        JAXBContext jaxbcontext;

        try {
            JAXBContext context = JAXBContext.newInstance(Vehicles.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Vehicles vehicles = (Vehicles) unmarshaller.unmarshal(file);
            List<Vehicle> vehicle = vehicles.getVehicle();

            return vehicle;
        }

        catch (JAXBException e) {
            System.out.println(e);
        }

        return null;
    }
}