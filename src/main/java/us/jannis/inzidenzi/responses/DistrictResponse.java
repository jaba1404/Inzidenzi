package us.jannis.inzidenzi.responses;

import com.google.gson.annotations.SerializedName;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.enums.State;

public class DistrictResponse {

    @SerializedName("AdmUnitId")
    private District district;

    @SerializedName("BL")
    private State state;

    @SerializedName("EWZ")
    private int citizens;

    @SerializedName("death_rate")
    private double deathRate;

    @SerializedName("cases")
    private int cases;

    @SerializedName("deaths")
    private int deaths;

    @SerializedName("cases_per_100k")
    private double casesPer100k;

    @SerializedName("cases_per_population")
    private double affectedRate;

    @SerializedName("last_update")
    private String lastUpdated;

    @SerializedName("cases7_per_100k")
    private double incidence;

    @SerializedName("cases7_lk")
    private double totalCasesInLast7Days;

    @SerializedName("recovered")
    private int recovered;

    @Override
    public String toString() {
        return "DistrictResponse{" +
                "district=" + district +
                ", state=" + state +
                ", citizens=" + citizens +
                ", deathRate=" + deathRate +
                ", cases=" + cases +
                ", deaths=" + deaths +
                ", casesPer100k=" + casesPer100k +
                ", affectedRate=" + affectedRate +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", incidence=" + incidence +
                ", totalCasesInLast7Days=" + totalCasesInLast7Days +
                ", recovered=" + recovered +
                '}';
    }

    public District getDistrict() {
        return district;
    }

    public State getState() {
        return state;
    }

    public int getCitizens() {
        return citizens;
    }

    public double getDeathRate() {
        return deathRate;
    }

    public int getCases() {
        return cases;
    }

    public int getDeaths() {
        return deaths;
    }

    public double getCasesPer100k() {
        return casesPer100k;
    }

    public double getAffectedRate() {
        return affectedRate;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public double getIncidence() {
        return incidence;
    }

    public double getTotalCasesInLast7Days() {
        return totalCasesInLast7Days;
    }

    public int getRecovered() {
        return recovered;
    }
}
