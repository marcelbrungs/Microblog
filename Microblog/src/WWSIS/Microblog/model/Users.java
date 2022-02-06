package WWSIS.Microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="user")
public class User {


    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int user_Id;
    @Column (name="user_name", nullable = false)
    private String userName;
    @Column (name="user_lastname", nullable = false)
    private String userlastname;
    @Column (name="user_email", nullable = false)
    private String email;
    @Column (name="user_paassword", nullable = false)
    private String paassword;
    @Column (name="sign_Date", nullable = false)
    private Timestamp signDate;

    public User(int userId, String userName,  String userlastname, String email,  String paassword, Timestamp signDate) {
        this.user_Id = userId;
        this.userlastname = userlastname;
        this.email = email;
        this.userName = userName;
        this.paassword = paassword;
        this.signDate = signDate;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserlastname() {
        return userlastname;
    }

    public void setUserlastname(String userlastname) {
        this.userlastname = userlastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaassword() {
        return paassword;
    }

    public void setPaassword(String paassword) {
        this.paassword = paassword;
    }

    public Timestamp getsignDate() {
        return signDate;
    }

    public void setsignDate(Timestamp signDate) {
        this.signDate = signDate;
    }
}