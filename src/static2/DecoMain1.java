package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil utils = new DecoUtil();
        //[option + command + v] : introduce variable
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("before : " + deco);
    }
}
