import java.util.ArrayList;

public class Fasl {



        Course subjectName ;
        int level;

        Instructor instructor;
        ArrayList<Student> stuList=new ArrayList<>();
        //----------------------------------------------------------------
        Fasl (Course subjectName, int level, Instructor instructor) {
            this.subjectName = subjectName;
            this.level = level;
            this.instructor = instructor;


        }
//---------------------------------------------------------------------------

        void addStudent(Student student){

            this.stuList.add(student);

        }


        void removeStudent(Student student){
            for (int i = 0; i <stuList.size() ; i++) {
                if(stuList.get(i).id==student.id){
                    stuList.remove(i);
                    return;
                }

            }
            System.out.println("not found");
        }



    }


