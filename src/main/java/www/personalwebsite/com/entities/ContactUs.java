package www.personalwebsite.com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactUs {
    @Id
    @GeneratedValue
    private int id;
    private String fullName;
    private String email;
    private String Description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ContactUs(String fullName, String email, String description) {
        this.fullName = fullName;
        this.email = email;
        Description = description;
    }
}
