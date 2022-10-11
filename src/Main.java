public class Main {
    public static void main(String[] args) {
        Student santiago = new Student("Santiago", 16, 1, 10);
        santiago.introduce();
        for(int i=0; i<10; i++){
            santiago.completeAssignment();
            if(i%4 == 0){
                santiago.focus();
            }
        }
    }
}