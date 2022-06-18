package com.company;


import Student.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SaxParser extends DefaultHandler {

    Student employee = new Student();
    String thisElement = "";

    public Student getResult(){ return employee; };
    @Override
    public void startDocument() throws SAXException {
        System.out.println("----> Start parse XML...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("----> Stop parse XML...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        thisElement = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(thisElement.equals("FirstName")){
            employee.FirstName = (new String(ch,start,length));
        }

      else  if(thisElement.equals("SecondName")){
            employee.SecondName = (new String(ch,start,length));
        }

        else if(thisElement.equals("StCurs")){
            employee.StCurs = Curs.valueOf(new String(ch, start, length));
        }
        else if(thisElement.equals("StFormOfEducation")){
            employee.StFormOfEducation = FormOfEducation.valueOf(new String(ch, start, length));
        }

        else  if(thisElement.equals("StGrade")){
            employee.StGrade = Integer.parseInt(new String(ch,start,length));
        }


    }
}