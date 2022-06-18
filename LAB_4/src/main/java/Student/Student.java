package Student;

import University.University;

public class Student extends University {
public Curs StCurs;
public FormOfEducation StFormOfEducation;
public int StGrade;

public Student(){

}

public Student(String FirstName,String SecondName,Curs curs,FormOfEducation form, int StGrade){
    this.FirstName = FirstName;
    this.SecondName = SecondName;
    this.StCurs = curs;
    this.StFormOfEducation = form;
    this.StGrade = StGrade;

}
@Override
public void ShowForm(){
    System.out.println("Форма: "+StFormOfEducation );
};




    public void ShowStudent(){
        System.out.println("Имя: "+FirstName+"\nФамилия: "+SecondName+"\nКурс: "+StCurs+"\nФорма обучения: "+ StFormOfEducation+"\n Средний балл: "+ StGrade);
    }
}


