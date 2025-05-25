package softwareEngineering;

class User {
    public void searchAndPlayVideo(VideoApp app, String keyword, int videoIndex) {
        app.search(keyword);
        app.selectVideo(videoIndex);
    }
}
