class Students{
    String name;
    int id;
    static int total_Students=0;
    Students(String name,int id){
        this.name=name;
        this.id=id;
        total_Students++;
    }
    void displayStudent() {
        System.out.println("Name: " + name + ", Roll No: " + id);
    }
    static void getTotalStudents() {
        System.out.println("Total Students: " + total_Students);
    }
}

public class Registration{ 
    public static void main(String[] args) {
        Students s1 = new Students("Jaswanth", 101);
        Students s2 = new Students("Rahul", 102);
        Students s3 = new Students("Anjali", 103);

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        System.out.println("-------------------");

        Students.getTotalStudents();
    }
}