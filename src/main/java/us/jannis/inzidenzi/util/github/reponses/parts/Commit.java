package us.jannis.inzidenzi.util.github.reponses.parts;

import com.google.gson.annotations.SerializedName;

public class Commit {
    @SerializedName("comment_count")
    private Integer commentCount;
    private Committer committer;
    private Author author;
    private Tree tree;
    private String message;
    private String url;
    private Verification verification;

    @Override
    public String toString() {
        return "Commit{" +
                "commentCount=" + commentCount +
                ", committer=" + committer +
                ", author=" + author +
                ", tree=" + tree +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", verification=" + verification +
                '}';
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public Committer getCommitter() {
        return committer;
    }

    public Author getAuthor() {
        return author;
    }

    public Tree getTree() {
        return tree;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }

    public Verification getVerification() {
        return verification;
    }
}
