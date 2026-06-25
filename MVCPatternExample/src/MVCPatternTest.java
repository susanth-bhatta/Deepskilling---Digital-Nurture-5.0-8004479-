public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student("Susanth", 101, "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(student, view);

        // Display Initial Details
        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update Student Details
        controller.setStudentName("Susanth");
        controller.setStudentId(3);
        controller.setStudentGrade("S");

        // Display Updated Details
        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}