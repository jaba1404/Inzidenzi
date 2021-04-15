package us.jannis.inzidenzi.util.github;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import us.jannis.inzidenzi.util.HttpUtil;
import us.jannis.inzidenzi.util.github.reponses.CommitResponse;
import us.jannis.inzidenzi.util.github.reponses.ContentResponse;

import java.io.IOException;
import java.util.HashMap;

public class Repository {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private final String owner;
    private final String repo;
    private final String baseUrl;

    public Repository(String owner, String repo) {
        this.owner = owner;
        this.repo = repo;
        this.baseUrl = "https://api.github.com/repos/" + owner + "/" + repo + "/";
    }

    public ContentResponse[] getContents(String path) throws IOException {
        return (ContentResponse[]) HttpUtil.toObject(HttpUtil.getRequest(baseUrl + "contents/" + path, new HashMap<>()), ContentResponse[].class);
    }

    public CommitResponse getLatestCommit(String branch) throws IOException {
        return (CommitResponse) HttpUtil.toObject(HttpUtil.getRequest(baseUrl + "commits/" + branch, new HashMap<>()), CommitResponse.class);
    }

    public CommitResponse[] getCommits() throws IOException {
        return (CommitResponse[]) HttpUtil.toObject(HttpUtil.getRequest(baseUrl + "commits", new HashMap<>()), CommitResponse[].class);
    }

}
