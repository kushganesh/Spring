package DI_By_XML;

public class Student {
    private String id;
    private String name;
    private String rollNumber;
    private String semester;
    private Book book;


    public Student(String id, String name, String rollNumber, String semester, Book book) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.semester = semester;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", semester='" + semester + '\'' +
                ", book=" + book +
                '}';
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
}
