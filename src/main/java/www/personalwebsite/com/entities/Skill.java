package www.personalwebsite.com.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Skill {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String style;



    public Skill(int id, String name, String style) {
        this.id=id;
        this.name = name;
        this.style = style;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWidth() {
        return style;
    }

    public void setWidth(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}

