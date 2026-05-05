 class Student {
    String name;
    int roll;
    int marks;
}


public class testxv {
    public static void main (String a[]){
        Student s1 = new Student();
        s1.name="Raghaw";
        s1.roll=1;
        s1.marks=88;

        Student s2= new Student();
        s2.name="Harsh";
        s2.roll=2;
        s2.marks=92;

        Student s3 = new Student();
        s3.name= "Amrit";
        s3.roll=3;
        s3.marks=65;

        Student students []= new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for (int i=0;i<students.length;i++){
        //     System.out.println(students[i].name+":" + students[i].marks);
        // }
        // Enhanced for loop 
        for(Student s: students){
            System.out.println(s.name + ":" + s.marks);
        }
        
        




    }
    
}
