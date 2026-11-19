public class ScienceCourse extends Course {
    public ScienceCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Science Course: " + getCourseName()
                + " | Code: " + getCourseCode());
    }
}
