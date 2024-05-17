package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("정적 호출");
        DecoData.staticCall();

        System.out.println("인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
