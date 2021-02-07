package OOPs;

public class StudentClient {
    public static void main(String[] args){
        Student s = new Student();

        // Below scanario is incorrect, hence will make changes in the class
        // s.setAge(-10);

        // Exception can be handled using 2 ways: 1) throw 2) try/catch - advantage progam doesnt terminate
        System.out.println(s.getAge());

        try{
            s.setAge(-1);
            System.out.println("After error, this wont be executed");
        }
        catch (Exception e){
            System.out.println("In Catch block");
        }

        System.out.println("Program is terminated");
    }
}
