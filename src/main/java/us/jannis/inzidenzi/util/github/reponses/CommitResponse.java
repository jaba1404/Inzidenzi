package us.jannis.inzidenzi.util.github.reponses;

import com.google.gson.annotations.SerializedName;
import us.jannis.inzidenzi.util.github.reponses.parts.*;

import java.util.Arrays;

public class CommitResponse {
    private Committer committer;
    private Stats stats;
    private Author author;
    @SerializedName("html_url")
    private String htmlUrl;
    private Commit commit;
    @SerializedName("comments_url")
    private String commentsUrl;
    private Files[] files;
    private String sha;
    private String url;
    @SerializedName("node_id")
    private String nodeId;
    private Parents[] parents;

    @Override
    public String toString() {
        return "CommitResponse{" +
                "committer=" + committer +
                ", stats=" + stats +
                ", author=" + author +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", commit=" + commit +
                ", commentsUrl='" + commentsUrl + '\'' +
                ", files=" + Arrays.toString(files) +
                ", sha='" + sha + '\'' +
                ", url='" + url + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", parents=" + Arrays.toString(parents) +
                '}';
    }

    public Committer getCommitter() {
        return committer;
    }

    public Stats getStats() {
        return stats;
    }

    public Author getAuthor() {
        return author;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public Commit getCommit() {
        return commit;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public Files[] getFiles() {
        return files;
    }

    public String getSha() {
        return sha;
    }

    public String getUrl() {
        return url;
    }

    public String getNodeId() {
        return nodeId;
    }

    public Parents[] getParents() {
        return parents;
    }
}
