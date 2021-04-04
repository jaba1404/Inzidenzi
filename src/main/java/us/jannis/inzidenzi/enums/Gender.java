package us.jannis.inzidenzi.enums;

import com.google.gson.annotations.SerializedName;

public enum Gender {

    @SerializedName("M")
    MALE("M", "Männlich"),

    @SerializedName("W")
    FEMALE("W", "Weiblich");

    private final String gender;
    private final String displayName;

    Gender(String gender, String displayName) {
        this.gender = gender;
        this.displayName = displayName;
    }

    public String getGender() {
        return gender;
    }

    public String getDisplayName() {
        return displayName;
    }
}
