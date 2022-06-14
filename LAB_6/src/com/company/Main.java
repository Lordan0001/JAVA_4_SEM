package com.company;


import Commands.CreateAndFill;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        //подключение
String userName = "root";
String password = "MysqlRoot";
String connectionUrl = "jdbc:mysql://localhost:3306/test";


        CreateAndFill createAndFill = new CreateAndFill();
        createAndFill.Create(userName,password,connectionUrl);
        createAndFill.Fill(userName,password,connectionUrl);
        createAndFill.Show(userName,password,connectionUrl);


    }
}
