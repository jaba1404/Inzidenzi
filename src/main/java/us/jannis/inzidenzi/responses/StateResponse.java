package us.jannis.inzidenzi.responses;

import com.google.gson.annotations.SerializedName;
import us.jannis.inzidenzi.enums.State;

public class StateResponse {

    @SerializedName("AdmUnitId")
    private State state;

    @SerializedName("Fallzahl")
    private int totalCases;

    @SerializedName("LAN_ew_EWZ")
    private int citizens;

    @SerializedName("Aktualisierung")
    private long updated;

    @SerializedName("faelle_100000_EW")
    private double casesPer100kCitizens;

    @SerializedName("Death")
    private long deaths;

    @SerializedName("cases7_bl_per_100k")
    private double incidencePer100kCitizens;

    @SerializedName("cases7_bl")
    private double casesInLastSevenDays;

    @SerializedName("death7_bl")
    private double deathsInLastSevenDays;

    @Override
    public String toString() {
        return "StateResponse{" +
                "state=" + state +
                ", totalCases=" + totalCases +
                ", citizens=" + citizens +
                ", updated=" + updated +
                ", casesPer100kCitizens=" + casesPer100kCitizens +
                ", deaths=" + deaths +
                ", incidencePer100kCitizens=" + incidencePer100kCitizens +
                ", casesInLastSevenDays=" + casesInLastSevenDays +
                ", deathsInLastSevenDays=" + deathsInLastSevenDays +
                '}';
    }

    public State getState() {
        return state;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public int getCitizens() {
        return citizens;
    }

    public long getUpdated() {
        return updated;
    }

    public double getCasesPer100kCitizens() {
        return casesPer100kCitizens;
    }

    public long getDeaths() {
        return deaths;
    }

    public double getIncidencePer100kCitizens() {
        return incidencePer100kCitizens;
    }

    public double getCasesInLastSevenDays() {
        return casesInLastSevenDays;
    }

    public double getDeathsInLastSevenDays() {
        return deathsInLastSevenDays;
    }
}
