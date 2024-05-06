package construct;

public class MemberInitMain1 {
    public static void main(String[] args){
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
//        member2.name = "user2";
//        member2.age = 15;
//        member2.grade = 90;
        initMember(member1, "user2", 15, 90);

        MemberInit[] members = {member1, member2};

        for(MemberInit m : members){
            System.out.println("이름 : " + m.name + ", 나이 : " + m.age + ", 성적 : " +m.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
