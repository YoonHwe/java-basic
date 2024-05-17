package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
//        DecoUtil utils = new DecoUtil1();
        //[option + command + v] : introduce variable
        String deco = DecoUtil2.deco(s);

        System.out.println("before : " + s);
        System.out.println("before : " + deco);
    }
}
