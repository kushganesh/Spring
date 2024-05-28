package Java_Configuration_File;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Spring {

    @Bean
    public Student std() {
        Student student = new Student();
        student.setId(101);
        student.setName("Ganesh");
        student.setRollNumber("0191CS201064");
        student.setSemester("8th");
        return student;
    }

    @Bean
    public  Student std1()
    {
        Student s1= new Student();
        s1.setId(102);
        s1.setName("Ganesh");
        s1.setSemester("4th");
        s1.setRollNumber("0191CS201064");
        return  s1;
    }
}
