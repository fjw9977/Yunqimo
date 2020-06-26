package PO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="admin")
public class Admin implements Serializable {
    private int ID;
    private String username;
    private String password;
    private String admin_roleid;
    private String admin_rolename;

    public Admin(){

    }

    public Admin(int ID, String username, String password, String admin_roleid, String admin_rolename) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.admin_roleid = admin_roleid;
        this.admin_rolename = admin_rolename;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length=11)
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    @Column(length=30)

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(length=30)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Column(length=1)
    public String getAdmin_roleid() {
        return admin_roleid;
    }

    public void setAdmin_roleid(String admin_roleid) {
        this.admin_roleid = admin_roleid;
    }
    @Column(length=30)
    public String getAdmin_rolename() {
        return admin_rolename;
    }

    public void setAdmin_rolename(String admin_rolename) {
        this.admin_rolename = admin_rolename;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", admin_roleid='" + admin_roleid + '\'' +
                ", admin_rolename='" + admin_rolename + '\'' +
                '}';
    }
}
