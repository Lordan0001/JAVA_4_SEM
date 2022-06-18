package Dean;

import SelStudent.SelStudent;
import Student.*;
import University.*;
import com.company.Main.*;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dean extends University  {
   /* Student st1 = new Student("Vladislav", "Bialitski", Curs.First, FormOfEducation.Day, 8);
    Student st2 = new Student("Masha", "Vorontsova", Curs.Second, FormOfEducation.Night, 9);
    Student st3 = new Student("Vladimir", "Vorontsov", Curs.Third, FormOfEducation.Night, 4);
    Student st4 = new Student("Nikita", "Petrov", Curs.Fourth, FormOfEducation.Day, 10);
    Student st5 = new Student("Pete", "Djonson", Curs.Second, FormOfEducation.Night, 5);
    Student st6 = new Student("Adam", "Arivs", Curs.Second, FormOfEducation.Night, 7);*/
    // st1.ShowForm();

    //ArrayList<Student> ls = new ArrayList<Student>();


    public int compare(Student a, Student b) {
        return a.SecondName.compareTo(b.SecondName);
    }


    public void ShowDayForm(ArrayList<Student> ss) {
        for (Student s: ss) {
            if (s.StFormOfEducation == FormOfEducation.Day){
              s.ShowStudent();
            }
        }

    }


    public void ShowNightForm(ArrayList<Student> ss) {
        for (Student s: ss) {
            if (s.StFormOfEducation == FormOfEducation.Night){
                s.ShowStudent();
            }
        }

    }

    public void ShowCursCount(ArrayList<Student> ss) {
        int firstCurs = 0;
        int secondCurs = 0;
        int thirdCurs = 0;
        int fourthCurs = 0;
        for (Student s : ss) {

            if (s.StCurs == Curs.First) {
                firstCurs++;
            }
            if (s.StCurs == Curs.Second) {
                secondCurs++;
            }
            if (s.StCurs == Curs.Third) {
                thirdCurs++;
            }
            if (s.StCurs == Curs.Fourth) {
                fourthCurs++;
            }
        }
        System.out.println("На первом курсе: " + firstCurs);
        System.out.println("На втором курсе: " + secondCurs);
        System.out.println("На третем курсе: " + thirdCurs);
        System.out.println("На четвёртом курсе: " + fourthCurs);
    }
    public void SortSecondName(ArrayList<Student> list){
        Collections.sort(list, new SortBySecondName());
        for (Student ss: list) {
            ss.ShowStudent();

        }

    }
    public void FillList(ArrayList<Student> qq) {
        // qq = new ArrayList<Student>();
        Student st1 = new Student("Vladislav", "Bialitski", Curs.First, FormOfEducation.Day, 8);
        Student st2 = new Student("Masha", "Vorontsova", Curs.Second, FormOfEducation.Night, 9);
        Student st3 = new Student("Vladimir", "Vorontsov", Curs.Third, FormOfEducation.Night, 4);
        Student st4 = new Student("Nikita", "Petrov", Curs.Fourth, FormOfEducation.Day, 10);
        Student st5 = new Student("Pete", "Djonson", Curs.Second, FormOfEducation.Night, 5);
        Student st6 = new Student("Adam", "Arivs", Curs.Second, FormOfEducation.Night, 7);
        qq.add(st1);
        qq.add(st2);
        qq.add(st3);
        qq.add(st4);
        qq.add(st5);
        qq.add(st6);
    }

    public void SerializeInFile (SelStudent sl, ArrayList<Student> qq){
        sl.setStudents(qq);
        XMLEncoder encoder = null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("SecondSerial.xml")));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File");
        }
        encoder.writeObject(sl);
        encoder.close();
    }
    public void DesirialzeInList(SelStudent sl, ArrayList<Student> qq){
        final String SERIALIZED_FILE_NAME="SecondSerial.xml";
        XMLDecoder decoder1=null;
        try {
            decoder1=new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File dvd.xml not found");
        }

        // System.out.println(listNewStud1.getStudents().get(1));
         sl=(SelStudent)decoder1.readObject();

        for (int i = 0; i < 6 ; i++) {//плохое, но рабочее условие
            qq.add((Student) sl.getStudents().get(i));
        }
    }

}
