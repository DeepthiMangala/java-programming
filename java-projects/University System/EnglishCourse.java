public class EnglishCourse extends Course {
    public EnglishCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("English Course: " + getCourseName()
                + " | Code: " + getCourseCode());
    }
}