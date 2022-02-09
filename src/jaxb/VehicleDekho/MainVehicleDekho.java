package jaxb.VehicleDekho;

import java.sql.SQLException;
import java.util.List;

public class MainVehicleDekho {
    public static void main(String[] args) throws SQLException {

        String path = "C:\\Users\\adida\\Desktop\\SevenX Intern\\Java\\vehicleDekho\\src\\data\\file\\datafile.xml";

        List<Vehicle> vehicle = JAXB_Class.convertXmlToObject(path);
        DatabaseConnection.putInDatabase(vehicle);
        List<Vehicle> vehicleList = DatabaseConnection.getFromDatabase();

        Display.printEmployeeInfo(vehicleList);

    }
}
