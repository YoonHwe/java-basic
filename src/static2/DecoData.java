package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public void instanceCall(){
        staticValue++;
        staticMethod();

        instanceValue++;
        instanceMethod();
    }
    public static void staticCall(){
        staticValue++; //정적변수에 접근
        //DecoData.staticValue++; 와 동일.
        staticMethod();
        //DecoData.staticMethod(); 와 동일.

        //instanceValue++; // => 인스턴스변수 접근 불가.. compile error
        //instanceMethod(); // => 접근 불가! compile error
    }

    private void instanceMethod(){
        System.out.println("instanceMethod");
    }

    private static void staticMethod(){
        System.out.println("staticMethod");
    }
}
