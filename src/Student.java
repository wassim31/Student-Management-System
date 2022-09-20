import java.util.ArrayList;

public class Student {
    private String name;
    private GradeLevel gradeLevel;
    private String id;
    private Double balance;
    private ArrayList<Course> courseList;


    public Student(String name, GradeLevel gradeLevel,Double balance) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.balance = balance;
        this.courseList = new ArrayList<>();
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }
    public void addCourse(Course course)
    {
        if(this.getBalance() - course.getPrice() < 0)
            System.out.println("You don't have enough money to buy");
        else
            courseList.add(course);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + "\n" +
                "gradeLevel=" + gradeLevel + "\n" +
                "id='" + id + '\'' + "\n" +
                "balance=" + balance + "\n" +
                "courseList=" + courseList + "\n" +
                '}';
    }
}
