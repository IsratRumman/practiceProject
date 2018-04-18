package data.model;

public class student {
    private Integer studentId;
    private String studentName;

    public student() {
    }

    public Integer getstudentId() {
        return studentId;
    }

    public void setstudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getstudentName() {
        return studentName;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }
}
