package us.jannis.inzidenzi.util.github.reponses.parts;

public class Verification {
    private String reason;
    private String signature;
    private String payload;
    private Boolean verified;

    public String getReason() {
        return reason;
    }

    public String getSignature() {
        return signature;
    }

    public String getPayload() {
        return payload;
    }

    public Boolean getVerified() {
        return verified;
    }
}
