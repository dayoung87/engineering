package softwareEngineering;

class VideoServer {
    public java.util.List<String> searchVideos(String keyword) {
        System.out.println("[VideoServer] 검색 요청 수신: " + keyword);
        java.util.List<String> results = new java.util.ArrayList<>();
        results.add(keyword + " 영상 1");
        results.add(keyword + " 영상 2");
        results.add(keyword + " 영상 3");
        return results;
    }
}