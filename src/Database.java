import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class Database {
    private ArrayList<Student> listOfStudents;

    public Database() {
        this.listOfStudents = new ArrayList<>();
    }

    public void initialize() {
        System.out.println("how many students you wanna add ?");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        add(numberOfStudents);
    }

    private void add(int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you need to add name & gradeLevel of the " + numberOfStudents + " Students");

        for(int i = 0 ; i < numberOfStudents ; i++)
        {
            System.out.printf("Name of student %d", i+1);
            String name = scanner.next();
            System.out.printf("GradeLevel(FRESHMAN-JUNIOR-SENIOR) %d :", i+1);
            GradeLevel gradeLevel = GradeLevel.valueOf(scanner.next().toUpperCase(Locale.ENGLISH));
            System.out.println("enter balance: ");
            double balance = scanner.nextDouble();
            Student addedStudent = new Student(name,gradeLevel,balance);
            generateStudentId(addedStudent);
            listOfStudents.add(addedStudent);
        }
    }
    public void generateStudentId(Student student)
    {
        String hash = String.valueOf(student.hashCode());
        hash = hash.substring(0,4);
        if(student.getGradeLevel() == GradeLevel.FRESHMAN)
            student.setId("1"+hash);

        else if(student.getGradeLevel() == GradeLevel.JUNIOR)
            student.setId("2"+hash);

        else if(student.getGradeLevel() == GradeLevel.SENIOR)
            student.setId("3"+hash);
        else
            student.setId("0"+hash);
    }
    public Student getStudentById(String id)
    {
        for(int i = 0  ; i < this.listOfStudents.size(); i++)
        {
            if(listOfStudents.get(i).getId().equals(id))
                return listOfStudents.get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        return "" + listOfStudents;
    }
}
