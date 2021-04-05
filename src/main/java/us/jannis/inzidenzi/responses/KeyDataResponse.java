package us.jannis.inzidenzi.responses;

import com.google.gson.annotations.SerializedName;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.enums.State;

public class KeyDataResponse {

    @SerializedName("AdmUnitId")
    private District district;

    @SerializedName("BundeslandId")
    private State state;

    @SerializedName("AnzFall")
    private int totalCases;

    @SerializedName("AnzTodesfälle")
    private int totalDeaths;

    @SerializedName("AnzGenesen")
    private int totalRecovered;

    @SerializedName("AnzFallNeu")
    private int newCasesToYesterday;

    @SerializedName("AnzTodesfallNeu")
    private int newDeathsToYesterday;

    @SerializedName("AnzGenesenNeu")
    private int newRecoversToYesterday;

    @SerializedName("AnzAktiv")
    private int activeCases;

    @SerializedName("AnzAktivNeu ")
    private int newActiveCasesToYesterday;

    @SerializedName("AnzFall7T")
    private double sevenDayCasesSum;

    @SerializedName("Inz7T")
    private double sevenDayIncidence;

    @Override
    public String toString() {
        return "KeyDataResponse{" +
                "district=" + district +
                ", state=" + state +
                ", totalCases=" + totalCases +
                ", totalDeaths=" + totalDeaths +
                ", totalRecovered=" + totalRecovered +
                ", newCasesToYesterday=" + newCasesToYesterday +
                ", newDeathsToYesterday=" + newDeathsToYesterday +
                ", newRecoversToYesterday=" + newRecoversToYesterday +
                ", activeCases=" + activeCases +
                ", newActiveCasesToYesterday=" + newActiveCasesToYesterday +
                ", sevenDayCasesSum=" + sevenDayCasesSum +
                ", sevenDayIncidence=" + sevenDayIncidence +
                '}';
    }

    public District getDistrict() {
        return district;
    }

    public State getState() {
        return state;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public double getTotalRecovered() {
        return totalRecovered;
    }

    public int getNewCasesToYesterday() {
        return newCasesToYesterday;
    }

    public int getNewDeathsToYesterday() {
        return newDeathsToYesterday;
    }

    public int getNewRecoversToYesterday() {
        return newRecoversToYesterday;
    }

    public int getActiveCases() {
        return activeCases;
    }

    public int getNewActiveCasesToYesterday() {
        return newActiveCasesToYesterday;
    }

    public double getSevenDayCasesSum() {
        return sevenDayCasesSum;
    }

    public double getSevenDayIncidence() {
        return sevenDayIncidence;
    }
}
