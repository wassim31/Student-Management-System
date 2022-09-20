public class UserInterface {
    public static void main(String[] args) {
        Database database = new Database();
        database.initialize();
        Student student = database.getStudentById("21670");
        Course course = new ComputerScience("Computer Science");
        student.addCourse(course);
        System.out.println(database);

    }
}
