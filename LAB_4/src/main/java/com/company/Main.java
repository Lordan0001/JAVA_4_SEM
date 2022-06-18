package com.company;
import Dean.Dean;
import Student.*;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Logger;

import University.University;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class Main {
    // private static final Logger logger = Logger.getGlobal();
    private static final Logger logger2 = Logger.getLogger("FactorialException");
    static final Logger logger = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        Dean dean = new Dean();
        ArrayList<Student> studList = new ArrayList<Student>();
        dean.FillList(studList);

        // dean.ShowCursCount(studList);
        // dean.ShowDayForm(studList);
        // dean.ShowNightForm(studList);
        // dean.SortSecondName(studList);
        // dean.SortSecondName(studList);







        //ser
/*        SelStudent listNewStud = new SelStudent();
        dean.SerializeInFile(listNewStud,studList);


        //des

        SelStudent listNewStud1=new SelStudent();
        ArrayList<Student> finList = new ArrayList<Student>();
        dean.DesirialzeInList(listNewStud1,finList);

        //вывод
        for (int i = 0; i < finList.size(); i++) {
            finList.get(i).ShowStudent();

        }*/



        String pathXsd ="SecondSerial.xsd";
        String pathXml = "SecondSerial.xml";

        SchemaFactory factory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = null;
        try {
            schema = factory.newSchema(new StreamSource(pathXsd));
        } catch (SAXException e) {
            e.printStackTrace();
        }
        Validator validator = schema.newValidator();
        try {
            validator.validate(new StreamSource(pathXml));
        } catch (SAXException e) {
            e.printStackTrace();
        }
        //return true;

        System.out.println("\n\t\t* Парс объектов из XML:");
        SAXParserFactory Saxfactory = SAXParserFactory.newInstance();
        SAXParser parser = Saxfactory.newSAXParser();
        SaxParser saxp = new SaxParser();
        parser.parse(new File(pathXml), saxp);

        Student employeeXML = saxp.getResult();
        employeeXML.ShowStudent();
       // University.add(employeeXML);

    }

       /* try {
            int result = Factorial.getFactorial(2);
            System.out.println(result);
        } catch (FactorialException ex) {
             logger2.info("Факториал должен быть больше чем 1");
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }*/

    }

