package SelStudent;

import java.util.ArrayList;
import java.util.List;

public class SelStudent {

    public SelStudent(){}
    private List students = new ArrayList();

    public List getStudents(){
        return students;
    }
    public void setStudents(List students){
        this.students = students;
    }
/*    public String toString(){
        String movies="";
        for(SelStudent movie:getStudents()){
            movies += movie.getName()+", ";
        }
        return movies;
    }*/

}
