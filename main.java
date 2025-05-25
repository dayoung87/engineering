package softwareEngineering;

public class main {
    public static void main(String[] args) {
        User user = new User();
        VideoApp app = new VideoApp();
        user.searchAndPlayVideo(app, "고양이", 1);
    }
}
