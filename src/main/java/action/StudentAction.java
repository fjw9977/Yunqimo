package action;
import PO.Student;
import com.opensymphony.xwork2.ActionSupport;
import Dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;



public  class StudentAction  extends ActionSupport implements SessionAware{
    private Student stu;
    private Map<String,Object> session;
    List<Student> stuList;
    List<String> deptList;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public void setDeptList(List<String> deptList){this.deptList = deptList;}
    //学生登录
    public String execute() throws Exception {
        String hql="from Student where StudentID=?0 and password=?1";
        System.out.println(hql);
        //HQL查询验证身份
        Session hbnSession = HbnUtils.getSession();
        System.out.println(stu.getStudentID());

        hbnSession.beginTransaction();
        Student student=(Student) hbnSession.createQuery(hql)
                .setParameter(0,stu.getStudentID()).setParameter(1,stu.getPassword()).uniqueResult();
        System.out.println(student);
        hbnSession.getTransaction().commit();
        if (student==null){
            System.out.println("student is null");
            return  "login";
        }
        else{
            session.put("studentName",student.getName());
            System.out.println("studentName is :"+student.getName());
            return "success";
        }
    }
    //HQL查询所有学生信息
    public String findAll(){
        String hql = "from Student";
        System.out.println(hql);

        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        stuList = hbnSession.createQuery(hql).list();
        session.put("stuList",this.stuList);
        hbnSession.getTransaction().commit();
        if (stuList!=null){
            return "success";
        }else
            return "error";
    }
    //查询信电学院信息
    public String findXin(){
        String hql = "from Student where department =:department";
        System.out.println(hql);
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        stuList = hbnSession.createQuery(hql).setParameter("department","信息与电气工程学院").list();
        session.put("stuList",this.stuList);
        if (stuList!=null){
            return "success";
        }else
            return "error";
    }
    //HQL查询所有学生个人信息
    public String findStudent(){
        String hql = "from Student where studentID =:ID";
        System.out.println(hql);
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        stuList = hbnSession.createQuery(hql).
                setParameter("ID",stu.getStudentID()).list();
        session.put("stuList",this.stuList);
        if (stuList!=null){
            return "success";
        }else
            return "error";

    }

    //姓名查询学生信息
    public String findByName() {

        String hql = "from Student where name like :tname";
        System.out.println(hql);
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        stuList = hbnSession.createQuery(hql).
                setParameter("tname","%"+stu.getName()+"%").list();
        if (stuList!=null){
            return "success";
        }else
            return "error";

    }
    //信电根据姓名查询名字
    public String findByXinName(){
        String hql = "from Student where name like :tname and department =:department";
        System.out.println(hql);
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        stuList = hbnSession.createQuery(hql).
                setParameter("tname","%"+stu.getName()+"%").setParameter("department","信息与电气工程学院").list();
        if (stuList!=null){
            return "success";
        }else
            return "errors";
    }
    //修改学生信息
    public String update(){
        try {
            Session hbnSession = HbnUtils.getSession();
            hbnSession.beginTransaction();
            System.out.println(stu);
            hbnSession.update(stu);
            hbnSession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
    //修改密码
    public String updatePassword(){
        try {
            Session hbnSession = HbnUtils.getSession();
            hbnSession.beginTransaction();
            System.out.println(stu);
            hbnSession.update(stu);
            hbnSession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "errors";
        }
    }
    //添加学生信息
    public String insert(){
        try {
            Session hbnSession = HbnUtils.getSession();
            hbnSession.beginTransaction();
            System.out.println(stu);
            hbnSession.save(stu);
            hbnSession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
    //删除学生信息
    public String delete(){
        try {
            Session hbnSession = HbnUtils.getSession();
            hbnSession.beginTransaction();
            System.out.println(stu);
            hbnSession.delete(stu);
            hbnSession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public List<String> getDeptList() {
        return deptList;
    }
}
