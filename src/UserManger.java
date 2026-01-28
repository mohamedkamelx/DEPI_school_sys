import java.util.ArrayList;
import java.util.Scanner;
public class UserManger {
    Scanner sc=new Scanner(System.in);
    private ArrayList<Student> studentsDatabase = new ArrayList<Student>();
    private ArrayList<Instructor> instructorDatabase = new ArrayList<>();
    void createStudent(){
        System.out.println("enter the name of the student you want to create");
        String name=sc.nextLine();
        int id=sc.nextInt();
        int level=sc.nextInt();
        Student student = new Student(name,id,level);
        studentsDatabase.add(student);
    }

    void createInstructor(String name,int id,Course subject){
        Instructor instructor = new Instructor(name,id,subject);
        instructorDatabase.add(instructor);
    }
    Student getStudent(int id){
        for (int i = 0; i <studentsDatabase.size() ; i++) {

            if(studentsDatabase.get(i).id==id){
                return studentsDatabase.get(i);
            }

        }
        System.out.println("not found");
        return null;
    }

    ArrayList<Student> getStudents(){
        return  studentsDatabase;
    }
    void removeStudent(int id){
        for (int i = 0; i <studentsDatabase.size() ; i++) {
            if(studentsDatabase.get(i).id==id){
                studentsDatabase.remove(i);
                return;
            }

        }
        System.out.println("not found");
    }

}
