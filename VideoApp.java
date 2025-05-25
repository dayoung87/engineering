package softwareEngineering;

class VideoApp {
    private VideoServer server = new VideoServer();
    private VideoPlayer player = new VideoPlayer();
    private java.util.List<String> searchResults;

    public void search(String keyword) {
        System.out.println("[VideoApp] 사용자 검색어 입력: " + keyword);
        searchResults = server.searchVideos(keyword);
        displayResults();
    }

    public void selectVideo(int index) {
        if (searchResults == null || index >= searchResults.size()) {
            System.out.println("[VideoApp] 유효하지 않은 영상 선택");
            return;
        }
        String selectedVideo = searchResults.get(index);
        System.out.println("[VideoApp] 사용자가 영상을 선택함: " + selectedVideo);
        player.play(selectedVideo);
        notifyUser(selectedVideo);
    }

    private void displayResults() {
        System.out.println("[VideoApp] 검색 결과:");
        for (int i = 0; i < searchResults.size(); i++) {
            System.out.println("  " + i + ": " + searchResults.get(i));
        }
    }

    private void notifyUser(String video) {
        System.out.println("[VideoApp] 영상 '" + video + "' 재생이 시작되었습니다.");
    }
}