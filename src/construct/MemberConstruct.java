package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age, int grade){
        System.out.println("생정자 호출 [name : " + name+", age : "+ age +", grade : "+grade+"]");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
