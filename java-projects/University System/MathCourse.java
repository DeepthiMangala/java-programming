public class MathCourse extends Course {
    public MathCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Math Course: " + getCourseName()
                + " | Code: " + getCourseCode());
    }
}











