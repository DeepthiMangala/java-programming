public class ComputerCourse extends Course {
    public ComputerCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Computer Course: " + getCourseName()
                + " | Code: " + getCourseCode());
    }
}