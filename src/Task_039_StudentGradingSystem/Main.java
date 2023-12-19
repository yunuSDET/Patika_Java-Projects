package Task_039_StudentGradingSystem;

public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.30);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.25);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya, 0.20, 0.30, 0.25);
        s1.addBulkExamNote(50, 20, 40, 30, 40, 50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya, 0.20, 0.30, 0.25);
        s2.addBulkExamNote(100, 50, 40, 80, 60, 70);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya, 0.20, 0.30, 0.25);
        s3.addBulkExamNote(50, 20, 40, 30, 40, 50);
        s3.isPass();
    }

}
