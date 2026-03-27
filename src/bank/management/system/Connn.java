package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            // Use an embedded DB so the project runs without requiring MySQL locally.
            // Data is stored in the local folder as ./bankSystem.*.
            connection = DriverManager.getConnection("jdbc:h2:./bankSystem;AUTO_SERVER=TRUE");
            statement = connection.createStatement();
            initSchema();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private void initSchema() throws SQLException {
        // Table schemas are created to match the insert/select patterns used throughout the app.
        statement.executeUpdate(
                "CREATE TABLE IF NOT EXISTS login (" +
                        "formno VARCHAR(50), " +
                        "card_number VARCHAR(20), " +
                        "pin VARCHAR(10)" +
                        ")"
        );

        statement.executeUpdate(
                "CREATE TABLE IF NOT EXISTS signup (" +
                        "formno VARCHAR(50), " +
                        "name VARCHAR(100), " +
                        "fname VARCHAR(100), " +
                        "dob VARCHAR(50), " +
                        "gender VARCHAR(10), " +
                        "email VARCHAR(100), " +
                        "marital VARCHAR(20), " +
                        "address VARCHAR(200), " +
                        "city VARCHAR(100), " +
                        "pincode VARCHAR(20), " +
                        "state VARCHAR(100)" +
                        ")"
        );

        statement.executeUpdate(
                "CREATE TABLE IF NOT EXISTS Signuptwo (" +
                        "formno VARCHAR(50), " +
                        "rel VARCHAR(50), " +
                        "cate VARCHAR(50), " +
                        "inc VARCHAR(50), " +
                        "edu VARCHAR(50), " +
                        "occ VARCHAR(50), " +
                        "pan VARCHAR(50), " +
                        "addhar VARCHAR(50), " +
                        "scitizen VARCHAR(10), " +
                        "eAccount VARCHAR(10)" +
                        ")"
        );

        statement.executeUpdate(
                "CREATE TABLE IF NOT EXISTS signupthree (" +
                        "formno VARCHAR(50), " +
                        "atype VARCHAR(50), " +
                        "cardno VARCHAR(20), " +
                        "pin VARCHAR(10), " +
                        "fac VARCHAR(200)" +
                        ")"
        );

        statement.executeUpdate(
                "CREATE TABLE IF NOT EXISTS bank (" +
                        "pin VARCHAR(10), " +
                        "\"date\" VARCHAR(80), " +
                        "\"type\" VARCHAR(20), " +
                        "amount INT" +
                        ")"
        );
    }
}
