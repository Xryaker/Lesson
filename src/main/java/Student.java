public class Student {
    private String family;
    private String name;
    private int age;
    private int id;
    private int level;
    public static String str = "Human";

    public int getAge() {
        return age;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void modifyLevel(int mark) {
        if ((mark < 10) && (mark > 0)) {
            this.level = this.level + mark;
        }
    }

    public Student(String family, String name, int age) {
        int id;
        this.family = family;
        this.name = name;
        this.age = validate(age);
        this.id = (int) (Math.random() * 1000);
        this.level = 0;
    }

    private int validate(int age) {
        if ((age > 15) && (age < 55)) {
            return age;
        }
        return 16;
    }

    public Student(String family, String name, int age, int id) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.id = id;
        this.level = 0;
    }

    public Student() {
        System.out.println("constructor");
        this.family = "Antonov";
        this.name = "Anton";
        this.age = 16;
        this.id = 778882;
        this.level = 100;
    }

    public void print() {
        System.out.println("FAMILY " + this.family);
        System.out.println("NAME " + this.name);
        System.out.println("AGE " + this.age);
        System.out.println("ID " + this.id);
        System.out.println(str);
    }
}
