public class UniversityApp{
	public static void main(String[] args){
		
		University u = new University("University of Jaffna");
		
		Course c1 = new MathCourse("M101", "Mathematics");
        Course c2 = new ScienceCourse("S101", "Physics");
        Course c3 = new EnglishCourse("E101", "English");
        Course c4 = new ComputerCourse("C101", "Programming");
        Course c5 = new HistoryCourse("H101", "History");
		
		Student s1 = new Student(101, "Amal");
        Student s2 = new Student(102, "Kamal");
        Student s3 = new Student(103, "Nimal");
        Student s4 = new Student(104, "Sunil");
        Student s5 = new Student(105, "Nadee");
        Student s6 = new Student(106, "Kavya");
        Student s7 = new Student(107, "Ravi");
        Student s8 = new Student(108, "Mala");
        Student s9 = new Student(109, "Saman");
        Student s10 = new Student(110, "Tharushi");
		
		university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);
        university.addStudent(s4);
        university.addStudent(s5);
        university.addStudent(s6);
        university.addStudent(s7);
        university.addStudent(s8);
        university.addStudent(s9);
        university.addStudent(s10);
		
		 s1.addCourse(c1);
        s1.addCourse(c2);

        s2.addCourse(c2);
        s2.addCourse(c3);

        s3.addCourse(c3);
        s3.addCourse(c4);

        s4.addCourse(c4);
        s4.addCourse(c5);

        s5.addCourse(c1);
        s5.addCourse(c3);

        s6.addCourse(c2);
        s6.addCourse(c5);

        s7.addCourse(c1);
        s7.addCourse(c4);

        s8.addCourse(c3);
        s8.addCourse(c5);

        s9.addCourse(c2);
        s9.addCourse(c4);

        s10.addCourse(c1);
        s10.addCourse(c5);

        // Test 1: Attempt to add a third course
        System.out.println("\n--- Test 1: Course Limit ---");
        s1.addCourse(c3);

        // Test 2: Attempt to add the same course twice
        System.out.println("\n--- Test 2: Duplicate Course ---");
        s1.addCourse(c1);

        // Test 3: Attempt to add a null course
        System.out.println("\n--- Test 3: Null Course ---");
        s2.addCourse(null);

        // Test 4: Attempt to add a duplicate student
        System.out.println("\n--- Test 4: Duplicate Student ---");
        university.addStudent(new Student(101, "Another Amal"));

        // Test 5: Search for an existing student
        System.out.println("\n--- Test 5: Find Student ---");
        Student found = university.findStudent(105);

        if (found != null) {
            System.out.println("Found: " + found.getStudentName());
        } else {
            System.out.println("Student not found.");
        }

        // Test 6: Search for a nonexistent student
        System.out.println("\n--- Test 6: Missing Student ---");
        found = university.findStudent(999);

        if (found != null) {
            System.out.println("Found: " + found.getStudentName());
        } else {
            System.out.println("Student ID 999 not found.");
        }

        // Test 7: Attempt to add a null student
        System.out.println("\n--- Test 7: Null Student ---");
        university.addStudent(null);

        // Test 8: Display all students and their courses
        System.out.println("\n--- Test 8: All Student Records ---");
        university.displayAllStudents();
    }
}
	}
}