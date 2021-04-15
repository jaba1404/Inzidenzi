package us.jannis.inzidenzi.util.github.reponses;

import com.google.gson.annotations.SerializedName;
import us.jannis.inzidenzi.util.github.reponses.parts.GitLinks;


public class ContentResponse {

    private String path;
    private Integer size;
    @SerializedName("_links")
    private GitLinks Links;
    @SerializedName("html_url")
    private String htmlUrl;
    private String name;
    @SerializedName("download_url")
    private String downloadUrl;
    @SerializedName("git_url")
    private String gitUrl;
    private String type;
    private String sha;
    private String url;

    public String getPath() {
        return path;
    }

    public Integer getSize() {
        return size;
    }

    public GitLinks getLinks() {
        return Links;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getName() {
        return name;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public String getType() {
        return type;
    }

    public String getSha() {
        return sha;
    }

    public String getUrl() {
        return url;
    }

}
