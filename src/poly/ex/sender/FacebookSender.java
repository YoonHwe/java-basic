package poly.ex.sender;

public class FacebookSender implements Sender{
    @Override
    public void sendMessage(String param) {
        System.out.println("Facebook에 발송합니다 : " + param);
    }
}
