public class Lesson5 {
    public static void main(String[] args) {
        int hhhg = 55;

        Student student = new Student("Shevcko", "Vasiliy", 33);


//        System.out.println(student.age);
        String str = "Shevchenko";
        student.print();

        Student student1 = new Student(str, "Ivan", hhhg);
        student1.print();
        Student student2 = new Student("Tarasov", "Valeriy", 44, 947594943);
        student2.print();
        System.out.println("\n\n\n");
        Student.str = "Animal";
//        student.print();
//        student2.print();


       /// Student student3 = new Student();
//        student3.print();


        ////////////////encapsulation////////
        System.out.println(student.getAge());
        int mstudentage=student.getAge();
        mstudentage++;
        Eyes eyes = new Eyes("red",3,true,2);

        Cat cat=new Cat(12,"blue",false,'m',eyes);

    }

}
