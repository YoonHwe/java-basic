package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // MemberConstruct member1 = new MemberConstruct(); //에러 : 생성자 형식
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};
        for(MemberConstruct mc : members){
            System.out.println(mc.name+" , " + mc.age +" , " + mc.grade);
        }
    }
}
