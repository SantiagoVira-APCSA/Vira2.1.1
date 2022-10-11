public class Student {
    private String name;
    private int age;
    private double workEthic, assignmentsLeft;

    public Student(String studentName, int studentAge, double studentWorkEthic, double studentAssignmentsLeft){
        name = studentName;
        age = studentAge;
        workEthic = studentWorkEthic;
        assignmentsLeft = studentAssignmentsLeft;
    }

    public void introduce(){
        System.out.println("Hey there! My name is "+name+" and I am " + age + " years old and I am a student!");
    }

    public void focus(){
        workEthic++;
        System.out.println("I'm getting focused!");
    }

    public void completeAssignment(){
        workEthic += 0.5;
        assignmentsLeft -= 1;
        if(assignmentsLeft == 0) System.out.println("I'm done with homework!");
        else System.out.println("Another assignment done!");

    }
}
