package Commands;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.ZonedDateTime;

public class CreateAndFill {

    public void Create(String userName, String password, String connectionUrl ){
        try(FileWriter writer = new FileWriter("MyLog.txt", true))
        {
            // Date date = new Date();
            String ttime = ZonedDateTime.now().toString();
            // запись всей строки
            String text = "Создание базы данных: ";
            text+=ttime;
            writer.write(text);
            // запись по символам
            writer.append('\n');
            //writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(Connection connection = DriverManager.getConnection(connectionUrl,userName,password);
            Statement statement = connection.createStatement()) {
             statement.executeUpdate("drop table Books");
            statement.executeUpdate("create table Books(id int not null auto_increment primary key, name varchar(50) not null )");

            //вывод
            // System.out.println("We are connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void Fill(String userName, String password, String connectionUrl ){
        try(FileWriter writer = new FileWriter("MyLog.txt", true))
        {
            // Date date = new Date();
            String ttime = ZonedDateTime.now().toString();
            // запись всей строки
            String text = "Добавление данных из бд: ";
            text+=ttime;
            writer.write(text);
            // запись по символам
            writer.append('\n');
            //writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(Connection connection = DriverManager.getConnection(connectionUrl,userName,password);
            Statement statement = connection.createStatement()) {
            // statement.executeUpdate("drop table Books");

            statement.executeUpdate("insert into Books(name) value ('Fuck_Java')");
            statement.executeUpdate("insert into Books set name = 'fuck indeed'");
            //вывод

            //вывод
            // System.out.println("We are connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void Show(String userName, String password, String connectionUrl ){
        try(FileWriter writer = new FileWriter("MyLog.txt", true))
        {
           // Date date = new Date();
            String ttime = ZonedDateTime.now().toString();
            // запись всей строки
            String text = "Вывод данных из бд: ";
            text+=ttime;
            writer.write(text);
            // запись по символам
            writer.append('\n');
            //writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(connectionUrl,userName,password);
            Statement statement = connection.createStatement()) {


            //вывод
            ResultSet resultSet = statement.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println("____________________");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
