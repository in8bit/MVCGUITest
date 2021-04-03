public class Model {
    private String url ="";
    private String filename ="";
    private int depth;
    private String progress ="";

    public Model(String url, String filename, int depth) {
        this.url = url;
        this.filename = filename;
        this.depth = depth;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getFileName() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}