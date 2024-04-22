package ref;

public class Method1 {
    public static void main(String[] args){
        Student student1 = new Student();
        initStudent(student1, "Tom", 16, 90);
        Student student2 = new Student();
        initStudent(student2, "Harry", 15, 85);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student st, String name, int age, int grade){
        st.name = name;
        st.age = age;
        st.grade = grade;
    }
    static void printStudent(Student st){
        System.out.println(st.name+" - " + st.age + " - " + st.grade);
    }
}
