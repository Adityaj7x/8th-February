package jaxb.VehicleDekho;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    public static final String username = "root";
    public static final String password = "addyy2709";
    public static final String url = "jdbc:mysql://localhost:3306/vehicles";

    public static void putInDatabase(List<Vehicle> vehicleList) {

        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);
            Statement statement = con.createStatement();
            for (Vehicle car : vehicleList) {
                statement.execute("INSERT INTO `vehicles`.`cars` (`id`, `brand`, `name`) VALUES (null , '"
                        + car.getBrand() + "', '" + car.getName() + "');");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Vehicle> getFromDatabase() throws SQLException {
        Connection con = DriverManager.getConnection(
                url, username, password);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM vehicles.cars;");
        List<Vehicle> vehicle = new ArrayList<>();

        while (rs.next()) {
            Vehicle e = new Vehicle();
            // e.setEmployeeId(rs.getInt(1));
            e.setBrand(rs.getString(2));
            e.setName(rs.getString(3));

            vehicle.add(e);
        }
        return vehicle;
    }
}
