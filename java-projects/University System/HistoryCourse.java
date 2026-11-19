public class HistoryCourse extends Course {
    public HistoryCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("History Course: " + getCourseName()
                + " | Code: " + getCourseCode());
    }
}
