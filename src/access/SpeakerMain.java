package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.showVolume();

        System.out.println("volume 필드 직접 접근");
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
