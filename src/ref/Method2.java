package ref;

public class Method2 {
    public static void main(String[] args){
        Student student1 = createStudent("Tom", 16, 90);
        Student student2 = createStudent("Harry", 15, 85);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student st = new Student();
        st.name = name;
        st.age = age;
        st.grade = grade;

        return st;
    }
    static void printStudent(Student st){
        System.out.println(st.name+" - " + st.age + " - " + st.grade);
    }
}
