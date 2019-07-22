package javacore.exercise.lesson43;

import java.sql.*;
import java.util.ArrayList;

public class jdbcIntro {



    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;


        try {

            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("delete from city where id = ?");
            statement.setInt(1,4094);
            statement.executeUpdate();
            System.out.println("Kayıt Silindi..");

        }catch (SQLException ex){
            dbHelper.showErrorMessage(ex);
            ex.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }


    public static void selectDemo()  throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;


        try {

            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select code,name,continent,region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()){
                countries.add(new Country(resultSet.getString("code"),resultSet.getString("name"),resultSet.getString("country"),resultSet.getString("region")));

            }


        }catch (SQLException ex){
            dbHelper.showErrorMessage(ex);
            ex.printStackTrace();
        }finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;


        try {

            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("insert into city (Name ,CountryCode,District,Population) values('Düzce','TUR','Düzce',5000)");
            statement.executeUpdate();
            System.out.println("Kayıt Eklendi");

        }catch (SQLException ex){
            dbHelper.showErrorMessage(ex);
            ex.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;


        try {

            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("update city set population=80000 where id=4094");
            statement.executeUpdate();
            System.out.println("Kayıt Güncellendi");

        }catch (SQLException ex){
            dbHelper.showErrorMessage(ex);
            ex.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }


}
