package controller;
import data.model.student;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "studentcontroller")
public class Studentcontroller {
    private student student = new student();

    public student getStudent() {
        return student;
    }

    public void setStudent(student student) {
        this.student = student;
    }
    public String isNextPage(){
        return "success";
    }
}
