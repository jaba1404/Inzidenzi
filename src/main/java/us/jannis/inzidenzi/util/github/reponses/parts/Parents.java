package us.jannis.inzidenzi.util.github.reponses.parts;

import com.google.gson.annotations.SerializedName;

public class Parents {
    @SerializedName("html_url")
    private String htmlUrl;
    private String sha;
    private String url;

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getSha() {
        return sha;
    }

    public String getUrl() {
        return url;
    }
}
