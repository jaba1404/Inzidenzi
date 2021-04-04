package us.jannis.inzidenzi.enums;

import com.google.gson.annotations.SerializedName;

public enum State {

    @SerializedName("Schleswig-Holstein")
    SCHLESWIG_HOLSTEIN(1, "Schleswig-Holstein", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/DEU_Schleswig-Holstein_COA.svg/800px-DEU_Schleswig-Holstein_COA.svg.png"),
    @SerializedName("Hamburg")
    HAMBURG(2, "Hamburg", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/DEU_Hamburg_COA.svg/800px-DEU_Hamburg_COA.svg.png"),
    @SerializedName("Niedersachsen")
    NIEDERSACHSEN(3, "Niedersachsen", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Coat_of_arms_of_Lower_Saxony.svg/800px-Coat_of_arms_of_Lower_Saxony.svg.png"),
    @SerializedName("Bremen")
    BREMEN(4, "Bremen", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bremen_Wappen%28Mittel%29.svg/800px-Bremen_Wappen%28Mittel%29.svg.png"),
    @SerializedName("Nordrhein-Westfalen")
    NORDRHEIN_WESTFALEN(5, "Nordrhein-Westfalen", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Coat_of_arms_of_North_Rhine-Westfalia.svg/800px-Coat_of_arms_of_North_Rhine-Westfalia.svg.png"),
    @SerializedName("Hessen")
    HESSEN(6, "Hessen", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Coat_of_arms_of_Hesse.svg/800px-Coat_of_arms_of_Hesse.svg.png"),
    @SerializedName("Rheinland-Pfalz")
    RHEINLAND_PFALZ(7, "Rheinland-Pfalz", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Coat_of_arms_of_Rhineland-Palatinate.svg/800px-Coat_of_arms_of_Rhineland-Palatinate.svg.png"),
    @SerializedName("Baden-Wuerttemberg")
    BADEN_WUERTTEMBERG(8, "Baden-Württemberg", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Coat_of_arms_of_Baden-W%C3%BCrttemberg_%28lesser%29.svg/800px-Coat_of_arms_of_Baden-W%C3%BCrttemberg_%28lesser%29.svg.png"),
    @SerializedName("Bayern")
    BAYERN(9, "Bayern", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Bayern_Wappen.svg/800px-Bayern_Wappen.svg.png"),
    @SerializedName("Saarland")
    SAARLAND(10, "Saarland", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Wappen_des_Saarlands.svg/800px-Wappen_des_Saarlands.svg.png"),
    @SerializedName("Berlin")
    BERLIN(11, "Berlin", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Coat_of_arms_of_Berlin.svg/800px-Coat_of_arms_of_Berlin.svg.png"),
    @SerializedName("Brandenburg")
    BRANDENBURG(12, "Brandenburg", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Brandenburg_Wappen.svg/800px-Brandenburg_Wappen.svg.png"),
    @SerializedName("Mecklenburg-Vorpommern")
    MECKLENBURG_VORPOMMERN(13, "Mecklenburg-Vorpommern", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Coat_of_arms_of_Mecklenburg-Western_Pomerania_%28great%29.svg/800px-Coat_of_arms_of_Mecklenburg-Western_Pomerania_%28great%29.svg.png"),
    @SerializedName("Sachsen")
    SACHSEN(14, "Sachsen", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Coat_of_arms_of_Saxony.svg/800px-Coat_of_arms_of_Saxony.svg.png"),
    @SerializedName("Sachsen-Anhalt")
    SACHSEN_ANHALT(15, "Sachsen-Anhalt", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Wappen_Sachsen-Anhalt.svg/800px-Wappen_Sachsen-Anhalt.svg.png"),
    @SerializedName("Thueringen")
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
