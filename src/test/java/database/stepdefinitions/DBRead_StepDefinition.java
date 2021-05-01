package database.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;

public class DBRead_StepDefinition {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2;user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";

    @Given("user connect to the database")
    public void user_connect_to_the_database() throws SQLException {
        connection= DriverManager.getConnection(url,username,password);

    }
    @Then("user gets {string} from  {string} table")
    public void user_gets_from_table(String string, String string2) throws SQLException {
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        resultSet=statement.executeQuery("SELECT "+string+" FROM "+string2);
    }

    @Then("user reads all rows in the {string} column")
    public void user_reads_all_rows_in_the_column(String string) throws SQLException {

        resultSet.next();
        // getting the data on the next row
        //resultSet.getObject("Prices");
        resultSet.next();
        Object object1=resultSet.getObject(string);
        System.out.println(object1);
        resultSet.next();

        String string1=resultSet.getString(string);
        System.out.println(string1);

        while ((resultSet.next())){
          Object obj=  resultSet.getObject(string);
            System.out.println(obj);
        }

    }




}
