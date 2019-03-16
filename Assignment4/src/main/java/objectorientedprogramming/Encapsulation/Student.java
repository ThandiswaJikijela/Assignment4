package objectorientedprogramming.Encapsulation;
//Encapsulation
public class Student {
    private int studentNo;
    private String name;

    public int getStudentNo(int studentNo) {
        return studentNo;
    }

    public String getName(String name) {
        return name;
    }

}

   /*class Encapsulation{
        public static void main(String[] args) {

            Student stud = new Student();
            stud.setStudentNo(210765534);
            stud.setName("Gabe");
            stud.setSurname("Press");

            System.out.println(stud.getStudentNo());
            System.out.println(stud.getName());
            System.out.println(stud.getSurname());
        }

    }
*/
