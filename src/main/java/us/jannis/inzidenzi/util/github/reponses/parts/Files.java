package us.jannis.inzidenzi.util.github.reponses.parts;

import com.google.gson.annotations.SerializedName;

public class Files {
    private String patch;
    private String filename;
    private Integer additions;
    private Integer deletions;
    private Integer changes;
    private String sha;
    @SerializedName("blob_url")
    private String blobUrl;
    @SerializedName("raw_url")
    private String rawUrl;
    private String status;
    @SerializedName("contents_url")
    private String contentsUrl;

    public String getPatch() {
        return patch;
    }

    public String getFilename() {
        return filename;
    }

    public Integer getAdditions() {
        return additions;
    }

    public Integer getDeletions() {
        return deletions;
    }

    public Integer getChanges() {
        return changes;
    }

    public String getSha() {
        return sha;
    }

    public String getBlobUrl() {
        return blobUrl;
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public String getStatus() {
        return status;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }
}
