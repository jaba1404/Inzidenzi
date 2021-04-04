package us.jannis.inzidenzi.responses;

import com.google.gson.annotations.SerializedName;
import us.jannis.inzidenzi.enums.AgeGroup;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.enums.Gender;
import us.jannis.inzidenzi.enums.State;

public class AttributeResponse {

    @SerializedName("IdBundesland")
    private int stateId;
    @SerializedName("Bundesland")
    private State state;
    @SerializedName("Landkreis")
    private District district;
    @SerializedName("Altersgruppe")
    private AgeGroup ageGroup;
    @SerializedName("Geschlecht")
    private Gender gender;
    @SerializedName("AnzahlFall")
    private int numberOfCases;
    @SerializedName("AnzahlTodesfall")
    private int numberOfDeaths;
    @SerializedName("ObjectId")
    private int objectId;
    @SerializedName("Meldedatum")
    private long reportingDate;
    @SerializedName("IdLandkreis")
    private int districtId;
    @SerializedName("Datenstand")
    private String dataStatus;
    @SerializedName("NeuerFall")
    private int newCases;
    @SerializedName("NeuerTodesfall")
    private int newDeahts;
    @SerializedName("Refdatum")
    private long refDate;
    @SerializedName("NeuGenesen")
    private int newRecovered;
    @SerializedName("AnzahlGenesen")
    private int numberOfRecoveries;
    @SerializedName("IstErkrankungsbeginn")
    private int isBeginningOfIllness;
    @SerializedName("Altersgruppe2")
    private AgeGroup ageGroup2;

    @Override
    public String toString() {
        return "AttributeResponse{" +
                "stateId=" + stateId +
                ", state='" + state + '\'' +
                ", district=" + district +
                ", ageGroup=" + ageGroup +
                ", gender='" + gender + '\'' +
                ", numberOfCases=" + numberOfCases +
                ", numberOfDeaths=" + numberOfDeaths +
                ", objectId=" + objectId +
                ", reportingDate=" + reportingDate +
                ", districtId='" + districtId + '\'' +
                ", dataStatus='" + dataStatus + '\'' +
                ", newCases=" + newCases +
                ", newDeahts=" + newDeahts +
                ", refDate=" + refDate +
                ", newRecovered=" + newRecovered +
                ", numberOfRecoveries=" + numberOfRecoveries +
                ", isBeginningOfIllness=" + isBeginningOfIllness +
                ", ageGroup2=" + ageGroup2 +
                '}';
    }

    public int getStateId() {
        return stateId;
    }

    public State getState() {
        return state;
    }

    public District getDistrict() {
        return district;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public Gender getGender() {
        return gender;
    }

    public int getNumberOfCases() {
        return numberOfCases;
    }

    public int getNumberOfDeaths() {
        return numberOfDeaths;
    }

    public int getObjectId() {
        return objectId;
    }

    public long getReportingDate() {
        return reportingDate;
    }

    public int getDistrictId() {
        return districtId;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public int getNewCases() {
        return newCases;
    }

    public int getNewDeahts() {
        return newDeahts;
    }

    public long getRefDate() {
        return refDate;
    }

    public int getNewRecovered() {
        return newRecovered;
    }

    public int getNumberOfRecoveries() {
        return numberOfRecoveries;
    }

    public int getIsBeginningOfIllness() {
        return isBeginningOfIllness;
    }

    public AgeGroup getAgeGroup2() {
        return ageGroup2;
    }
}
