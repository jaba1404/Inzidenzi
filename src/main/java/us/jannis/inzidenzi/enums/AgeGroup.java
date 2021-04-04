package us.jannis.inzidenzi.enums;

import com.google.gson.annotations.SerializedName;

public enum AgeGroup {

    @SerializedName("A00-A04")
    A0_A4(0, 4, "A00-A04"),
    @SerializedName("A05-A14")
    A5_A14(5, 14, "A05-A14"),
    @SerializedName("A15-A34")
    A15_A34(15, 34, "A15-A34"),
    @SerializedName("A35-A59")
    A35_A59(35, 59, "A35-A59"),
    @SerializedName("A60-A79")
    A60_A79(60, 79, "A60-A79"),
    @SerializedName("80+")
    A80_A999(80, 999, "80+"),
    @SerializedName("Unknown")
    UNKNOWN(0, 999, "Unknown");

    private final int minimumAge;
    private final int maximumAge;
    private final String displayString;

    AgeGroup(int minimumAge, int maximumAge, String displayString) {
        this.minimumAge = minimumAge;
        this.maximumAge = maximumAge;
        this.displayString = displayString;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public String getDisplayString() {
        return displayString;
    }
}
