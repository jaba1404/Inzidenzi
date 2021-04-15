package us.jannis.inzidenzi.responses;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class OWIDResponse {

    @SerializedName("new_deaths_smoothed")
    private BigDecimal newDeathsSmoothed;
    @SerializedName("new_cases_smoothed_per_million")
    private BigDecimal newCasesSmoothedPerMillion;
    @SerializedName("people_vaccinated_per_hundred")
    private BigDecimal peopleVaccinatedPerHundred;
    @SerializedName("population_density")
    private BigDecimal populationDensity;
    @SerializedName("weekly_hosp_admissions_per_million")
    private BigDecimal weeklyHospAdmissionsPerMillion;
    @SerializedName("aged_70_older")
    private BigDecimal aged70Older;
    @SerializedName("total_vaccinations")
    private BigDecimal totalVaccinations;
    @SerializedName("diabetes_prevalence")
    private BigDecimal diabetesPrevalence;
    @SerializedName("total_vaccinations_per_hundred")
    private BigDecimal totalVaccinationsPerHundred;
    @SerializedName("positive_rate")
    private BigDecimal positiveRate;
    @SerializedName("gdp_per_capita")
    private BigDecimal gdpPerCapita;
    @SerializedName("total_cases")
    private BigDecimal totalCases;
    @SerializedName("median_age")
    private BigDecimal medianAge;
    @SerializedName("new_vaccinations_smoothed_per_million")
    private BigDecimal newVaccinationsSmoothedPerMillion;
    @SerializedName("total_deaths_per_million")
    private BigDecimal totalDeathsPerMillion;
    @SerializedName("new_tests_smoothed_per_thousand")
    private BigDecimal newTestsSmoothedPerThousand;
    @SerializedName("weekly_icu_admissions")
    private BigDecimal weeklyIcuAdmissions;
    @SerializedName("weekly_hosp_admissions")
    private BigDecimal weeklyHospAdmissions;
    private BigDecimal population;
    @SerializedName("male_smokers")
    private BigDecimal maleSmokers;
    @SerializedName("new_tests")
    private BigDecimal newTests;
    @SerializedName("tests_per_case")
    private BigDecimal testsPerCase;
    @SerializedName("total_tests_per_thousand")
    private BigDecimal totalTestsPerThousand;
    @SerializedName("new_vaccinations_smoothed")
    private BigDecimal newVaccinationsSmoothed;
    private String continent;
    @SerializedName("total_cases_per_million")
    private BigDecimal totalCasesPerMillion;
    @SerializedName("life_expectancy")
    private BigDecimal lifeExpectancy;
    @SerializedName("new_deaths_per_million")
    private BigDecimal newDeathsPerMillion;
    @SerializedName("new_vaccinations")
    private BigDecimal newVaccinations;
    @SerializedName("new_cases_per_million")
    private BigDecimal newCasesPerMillion;
    @SerializedName("aged_65_older")
    private BigDecimal aged65Older;
    @SerializedName("cardiovasc_death_rate")
    private BigDecimal cardiovascDeathRate;
    @SerializedName("new_deaths_smoothed_per_million")
    private BigDecimal newDeathsSmoothedPerMillion;
    @SerializedName("hosp_patients_per_million")
    private BigDecimal hospPatientsPerMillion;
    @SerializedName("extreme_poverty")
    private BigDecimal extremePoverty;
    @SerializedName("new_tests_per_thousand")
    private BigDecimal newTestsPerThousand;
    @SerializedName("human_development_index")
    private BigDecimal humanDevelopmentIndex;
    @SerializedName("last_updated_date")
    private String lastUpdatedDate;
    @SerializedName("female_smokers")
    private BigDecimal femaleSmokers;
    @SerializedName("handwashing_facilities")
    private BigDecimal handwashingFacilities;
    @SerializedName("icu_patients")
    private BigDecimal icuPatients;
    @SerializedName("tests_units")
    private String testsUnits;
    @SerializedName("hospital_beds_per_thousand")
    private BigDecimal hospitalBedsPerThousand;
    @SerializedName("people_vaccinated")
    private BigDecimal peopleVaccinated;
    @SerializedName("icu_patients_per_million")
    private BigDecimal icuPatientsPerMillion;
    @SerializedName("people_fully_vaccinated_per_hundred")
    private BigDecimal peopleFullyVaccinatedPerHundred;
    @SerializedName("hosp_patients")
    private BigDecimal hospPatients;
    @SerializedName("new_cases")
    private BigDecimal newCases;
    @SerializedName("new_cases_smoothed")
    private BigDecimal newCasesSmoothed;
    @SerializedName("weekly_icu_admissions_per_million")
    private BigDecimal weeklyIcuAdmissionsPerMillion;
    @SerializedName("stringency_index")
    private BigDecimal stringencyIndex;
    @SerializedName("new_tests_smoothed")
    private BigDecimal newTestsSmoothed;
    @SerializedName("total_deaths")
    private BigDecimal totalDeaths;
    @SerializedName("new_deaths")
    private BigDecimal newDeaths;
    @SerializedName("people_fully_vaccinated")
    private BigDecimal peopleFullyVaccinated;
    @SerializedName("reproduction_rate")
    private BigDecimal reproductionRate;
    private String location;
    @SerializedName("total_tests")
    private BigDecimal totalTests;

    public BigDecimal getNewDeathsSmoothed() {
        return newDeathsSmoothed;
    }

    public BigDecimal getNewCasesSmoothedPerMillion() {
        return newCasesSmoothedPerMillion;
    }

    public BigDecimal getPeopleVaccinatedPerHundred() {
        return peopleVaccinatedPerHundred;
    }

    public BigDecimal getPopulationDensity() {
        return populationDensity;
    }

    public BigDecimal getWeeklyHospAdmissionsPerMillion() {
        return weeklyHospAdmissionsPerMillion;
    }

    public BigDecimal getAged70Older() {
        return aged70Older;
    }

    public BigDecimal getTotalVaccinations() {
        return totalVaccinations;
    }

    public BigDecimal getDiabetesPrevalence() {
        return diabetesPrevalence;
    }

    public BigDecimal getTotalVaccinationsPerHundred() {
        return totalVaccinationsPerHundred;
    }

    public BigDecimal getPositiveRate() {
        return positiveRate;
    }

    public BigDecimal getGdpPerCapita() {
        return gdpPerCapita;
    }

    public BigDecimal getTotalCases() {
        return totalCases;
    }

    public BigDecimal getMedianAge() {
        return medianAge;
    }

    public BigDecimal getNewVaccinationsSmoothedPerMillion() {
        return newVaccinationsSmoothedPerMillion;
    }

    public BigDecimal getTotalDeathsPerMillion() {
        return totalDeathsPerMillion;
    }

    public BigDecimal getNewTestsSmoothedPerThousand() {
        return newTestsSmoothedPerThousand;
    }

    public BigDecimal getWeeklyIcuAdmissions() {
        return weeklyIcuAdmissions;
    }

    public BigDecimal getWeeklyHospAdmissions() {
        return weeklyHospAdmissions;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public BigDecimal getMaleSmokers() {
        return maleSmokers;
    }

    public BigDecimal getNewTests() {
        return newTests;
    }

    public BigDecimal getTestsPerCase() {
        return testsPerCase;
    }

    public BigDecimal getTotalTestsPerThousand() {
        return totalTestsPerThousand;
    }

    public BigDecimal getNewVaccinationsSmoothed() {
        return newVaccinationsSmoothed;
    }

    public String getContinent() {
        return continent;
    }

    public BigDecimal getTotalCasesPerMillion() {
        return totalCasesPerMillion;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public BigDecimal getNewDeathsPerMillion() {
        return newDeathsPerMillion;
    }

    public BigDecimal getNewVaccinations() {
        return newVaccinations;
    }

    public BigDecimal getNewCasesPerMillion() {
        return newCasesPerMillion;
    }

    public BigDecimal getAged65Older() {
        return aged65Older;
    }

    public BigDecimal getCardiovascDeathRate() {
        return cardiovascDeathRate;
    }

    public BigDecimal getNewDeathsSmoothedPerMillion() {
        return newDeathsSmoothedPerMillion;
    }

    public BigDecimal getHospPatientsPerMillion() {
        return hospPatientsPerMillion;
    }

    public BigDecimal getExtremePoverty() {
        return extremePoverty;
    }

    public BigDecimal getNewTestsPerThousand() {
        return newTestsPerThousand;
    }

    public BigDecimal getHumanDevelopmentIndex() {
        return humanDevelopmentIndex;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public BigDecimal getFemaleSmokers() {
        return femaleSmokers;
    }

    public BigDecimal getHandwashingFacilities() {
        return handwashingFacilities;
    }

    public BigDecimal getIcuPatients() {
        return icuPatients;
    }

    public String getTestsUnits() {
        return testsUnits;
    }

    public BigDecimal getHospitalBedsPerThousand() {
        return hospitalBedsPerThousand;
    }

    public BigDecimal getPeopleVaccinated() {
        return peopleVaccinated;
    }

    public BigDecimal getIcuPatientsPerMillion() {
        return icuPatientsPerMillion;
    }

    public BigDecimal getPeopleFullyVaccinatedPerHundred() {
        return peopleFullyVaccinatedPerHundred;
    }

    public BigDecimal getHospPatients() {
        return hospPatients;
    }

    public BigDecimal getNewCases() {
        return newCases;
    }

    public BigDecimal getNewCasesSmoothed() {
        return newCasesSmoothed;
    }

    public BigDecimal getWeeklyIcuAdmissionsPerMillion() {
        return weeklyIcuAdmissionsPerMillion;
    }

    public BigDecimal getStringencyIndex() {
        return stringencyIndex;
    }

    public BigDecimal getNewTestsSmoothed() {
        return newTestsSmoothed;
    }

    public BigDecimal getTotalDeaths() {
        return totalDeaths;
    }

    public BigDecimal getNewDeaths() {
        return newDeaths;
    }

    public BigDecimal getPeopleFullyVaccinated() {
        return peopleFullyVaccinated;
    }

    public BigDecimal getReproductionRate() {
        return reproductionRate;
    }

    public String getLocation() {
        return location;
    }

    public BigDecimal getTotalTests() {
        return totalTests;
    }
}
