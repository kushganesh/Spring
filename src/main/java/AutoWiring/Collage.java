package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Collage {
    private String name;
    @Autowired
    @Qualifier("ps1")
    private Professors professors;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "name='" + name + '\'' +
                ", professors=" + professors +
                '}';
    }

    public void setProfessors(Professors professors) {
        this.professors = professors;
    }
}
