package us.jannis.inzidenzi.enums;

import com.google.gson.annotations.SerializedName;

public enum State {

    @SerializedName(value = "Bundesrepublik Deutschland", alternate = "0")
    BUNDESREPUBLIK_DEUTSCHLAND(0, "Bundesrepublik Deutschland", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Coat_of_arms_of_Germany.svg/461px-Coat_of_arms_of_Germany.svg.png"),
    @SerializedName(value = "Schleswig-Holstein", alternate = "1")
    SCHLESWIG_HOLSTEIN(1, "Schleswig-Holstein", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/DEU_Schleswig-Holstein_COA.svg/800px-DEU_Schleswig-Holstein_COA.svg.png"),
    @SerializedName(value = "Hamburg", alternate = "2")
    HAMBURG(2, "Hamburg", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/DEU_Hamburg_COA.svg/800px-DEU_Hamburg_COA.svg.png"),
    @SerializedName(value = "Niedersachsen", alternate = "3")
    NIEDERSACHSEN(3, "Niedersachsen", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Coat_of_arms_of_Lower_Saxony.svg/800px-Coat_of_arms_of_Lower_Saxony.svg.png"),
    @SerializedName(value = "Bremen", alternate = "4")
    BREMEN(4, "Bremen", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bremen_Wappen%28Mittel%29.svg/800px-Bremen_Wappen%28Mittel%29.svg.png"),
    @SerializedName(value = "Nordrhein-Westfalen", alternate = "5")
    NORDRHEIN_WESTFALEN(5, "Nordrhein-Westfalen", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Coat_of_arms_of_North_Rhine-Westfalia.svg/800px-Coat_of_arms_of_North_Rhine-Westfalia.svg.png"),
    @SerializedName(value = "Hessen", alternate = "6")
    HESSEN(6, "Hessen", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Coat_of_arms_of_Hesse.svg/800px-Coat_of_arms_of_Hesse.svg.png"),
    @SerializedName(value = "Rheinland-Pfalz", alternate = "7")
    RHEINLAND_PFALZ(7, "Rheinland-Pfalz", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Coat_of_arms_of_Rhineland-Palatinate.svg/800px-Coat_of_arms_of_Rhineland-Palatinate.svg.png"),
    @SerializedName(value = "Baden-Wuerttemberg", alternate = "8")
    BADEN_WUERTTEMBERG(8, "Baden-Württemberg", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Coat_of_arms_of_Baden-W%C3%BCrttemberg_%28lesser%29.svg/800px-Coat_of_arms_of_Baden-W%C3%BCrttemberg_%28lesser%29.svg.png"),
    @SerializedName(value = "Bayern", alternate = "9")
    BAYERN(9, "Bayern", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Bayern_Wappen.svg/800px-Bayern_Wappen.svg.png"),
    @SerializedName(value = "Saarland", alternate = "10")
    SAARLAND(10, "Saarland", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Wappen_des_Saarlands.svg/800px-Wappen_des_Saarlands.svg.png"),
    @SerializedName(value = "Berlin", alternate = "11")
    BERLIN(11, "Berlin", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Coat_of_arms_of_Berlin.svg/800px-Coat_of_arms_of_Berlin.svg.png"),
    @SerializedName(value = "Brandenburg", alternate = "12")
    BRANDENBURG(12, "Brandenburg", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Brandenburg_Wappen.svg/800px-Brandenburg_Wappen.svg.png"),
    @SerializedName(value = "Mecklenburg-Vorpommern", alternate = "13")
    MECKLENBURG_VORPOMMERN(13, "Mecklenburg-Vorpommern", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Coat_of_arms_of_Mecklenburg-Western_Pomerania_%28great%29.svg/800px-Coat_of_arms_of_Mecklenburg-Western_Pomerania_%28great%29.svg.png"),
    @SerializedName(value = "Sachsen", alternate = "14")
    SACHSEN(14, "Sachsen", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Coat_of_arms_of_Saxony.svg/800px-Coat_of_arms_of_Saxony.svg.png"),
    @SerializedName(value = "Sachsen-Anhalt", alternate = "15")
    SACHSEN_ANHALT(15, "Sachsen-Anhalt", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Wappen_Sachsen-Anhalt.svg/800px-Wappen_Sachsen-Anhalt.svg.png"),
    @SerializedName(value = "Thueringen", alternate = "16")
    THUERINGEN(16, "Thüringen", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Coat_of_arms_of_Thuringia.svg/800px-Coat_of_arms_of_Thuringia.svg.png");


    private final int id;
    private final String displayName;
    private final String blazonUrl;

    State(int id, String displayName, String blazonUrl) {
        this.id = id;
        this.displayName = displayName;
        this.blazonUrl = blazonUrl;
    }

    public String getBlazonUrl() {
        return blazonUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getId() {
        return id;
    }
}
