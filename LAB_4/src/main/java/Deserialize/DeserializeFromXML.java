package Deserialize;

import SelStudent.SelStudent;
import Student.*;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DeserializeFromXML {


    private static final String SERIALIZED_FILE_NAME="SecondSerial.xml";

    public static void main(String[] args) {
        XMLDecoder decoder1=null;
        try {
            decoder1=new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File dvd.xml not found");
        }
        SelStudent listNewStud=(SelStudent)decoder1.readObject();
        System.out.println(listNewStud.getStudents().get(1));

      //  ArrayList<Studet> arr1 = new ArrayList<Studet>();

    }
}
