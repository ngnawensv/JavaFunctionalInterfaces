package passageValeurs;

public class PassageParValeurObject {
    public static void main(String[] args) {
        Student student =new  Student("Samuel");
        Student studentOne =new  Student("Ngnawen");

        System.out.println("Student name Step 1 "+student.getName());
        studentAssignement(student);
        System.out.println("Student name Step 2 "+student.getName());

        System.out.println("Student name for update Step 1 "+studentOne.getName());
        studentUpdate(studentOne);
        System.out.println("Student name for update Step 2 "+studentOne.getName());
    }

    private static void studentAssignement(Student student) {
        student=new Student("Vermon");
        System.out.println("Student name inside method "+student.getName());

    }

    private static void studentUpdate(Student studentOne) {
        studentOne.setName("Vermon".toUpperCase());
        System.out.println("Student name inside method "+studentOne.getName());

    }
}
