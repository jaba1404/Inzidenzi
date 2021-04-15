package us.jannis.inzidenzi.responses;

import com.google.gson.annotations.SerializedName;

public class JHKDataResponse {

    @SerializedName("Long_")
    private double longitude;
    @SerializedName("Recovered")
    private int recovered;
    @SerializedName("Country_Region")
    private String countryRegion;
    @SerializedName("FIPS")
    private String fips;
    @SerializedName("Last_Update")
    private String lastUpdate;
    @SerializedName("Case_Fatality_Ratio")
    private float caseFatalityRatio;
    @SerializedName("Combined_Key")
    private String combinedKey;
    @SerializedName("Province_State")
    private String provinceState;
    @SerializedName("Active")
    private int active;
    @SerializedName("Incident_Rate")
    private float incidentRate;
    @SerializedName("Deaths")
    private int deaths;
    @SerializedName("Confirmed")
    private int confirmed;
    @SerializedName("Admin2")
    private String admin2;
    @SerializedName("Lat")
    private double lat;


    @Override
    public String toString() {
        return "JHKDataResponse{" +
                "longitude='" + longitude + '\'' +
                ", recovered='" + recovered + '\'' +
                ", countryRegion='" + countryRegion + '\'' +
                ", fips='" + fips + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", caseFatalityRatio='" + caseFatalityRatio + '\'' +
                ", combinedKey='" + combinedKey + '\'' +
                ", provinceState='" + provinceState + '\'' +
                ", active='" + active + '\'' +
                ", incidentRate='" + incidentRate + '\'' +
                ", deaths='" + deaths + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", admin2='" + admin2 + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }

    public double getLongitude() {
        return longitude;
    }

    public int getRecovered() {
        return recovered;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public String getFips() {
        return fips;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public float getCaseFatalityRatio() {
        return caseFatalityRatio;
    }

    public String getCombinedKey() {
        return combinedKey;
    }

    public String getProvinceState() {
        return provinceState;
    }

    public int getActive() {
        return active;
    }

    public float getIncidentRate() {
        return incidentRate;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public String getAdmin2() {
        return admin2;
    }

    public double getLat() {
        return lat;
    }
}
