package PO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="studentms")
public class Student implements Serializable {
    private  int count;
    private long studentID;
    private String password;
    private String name;
    private String sex;
    private String birthday;
    private String university;
    private String grade;
    private String department;
    private String major;

    public Student(){

    }

    public Student(int count, long studentID, String password, String name, String sex, String birthday, String university, String grade, String department, String major) {
        this.count = count;
        this.studentID = studentID;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.university = university;
        this.grade = grade;
        this.department = department;
        this.major = major;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length=11)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    @Column(length=11)
    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }


    @Column(length=30)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(length=20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(length=1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(length=0)
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Column(length=20)
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    @Column(length=5)
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Column(length=30)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Column(length=30)
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "count=" + count +
                ", studentID=" + studentID +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", university='" + university + '\'' +
                ", grade='" + grade + '\'' +
                ", department='" + department + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
