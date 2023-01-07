package com.codegate01.vaccovid.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "rank",
        "Country",
        "Continent",
        "TwoLetterSymbol",
        "ThreeLetterSymbol",
        "Infection_Risk",
        "Case_Fatality_Rate",
        "Test_Percentage",
        "Recovery_Proporation",
        "TotalCases",
        "NewCases",
        "TotalDeaths",
        "NewDeaths",
        "TotalRecovered",
        "NewRecovered",
        "ActiveCases",
        "TotalTests",
        "Population",
        "one_Caseevery_X_ppl",
        "one_Deathevery_X_ppl",
        "one_Testevery_X_ppl",
        "Deaths_1M_pop",
        "Serious_Critical",
        "Tests_1M_Pop",
        "TotCases_1M_Pop"
})
@Entity(name = "Asia")
public class Asia implements Serializable {
    private final static long serialVersionUID = 1252410495782381927L;
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recordID", nullable = false)
    private Long recordId;
    @JsonProperty("id")
    public String id;
    @JsonProperty("rank")
    public Integer rank;
    @JsonProperty("Country")
    public String country;
    @JsonProperty("Continent")
    public String continent;
    @JsonProperty("TwoLetterSymbol")
    public String twoLetterSymbol;
    @JsonProperty("ThreeLetterSymbol")
    public String threeLetterSymbol;
    @JsonProperty("Infection_Risk")
    public Double infectionRisk;
    @JsonProperty("Case_Fatality_Rate")
    public Double caseFatalityRate;
    @JsonProperty("Test_Percentage")
    public Double testPercentage;
    @JsonProperty("Recovery_Proporation")
    public Double recoveryProporation;
    @JsonProperty("TotalCases")
    public Integer totalCases;
    @JsonProperty("NewCases")
    public Integer newCases;
    @JsonProperty("TotalDeaths")
    public Integer totalDeaths;
    @JsonProperty("NewDeaths")
    public Integer newDeaths;
    @JsonProperty("TotalRecovered")
    public String totalRecovered;
    @JsonProperty("NewRecovered")
    public Integer newRecovered;
    @JsonProperty("ActiveCases")
    public Integer activeCases;
    @JsonProperty("TotalTests")
    public String totalTests;
    @JsonProperty("Population")
    public String population;
    @JsonProperty("one_Caseevery_X_ppl")
    public Integer oneCaseeveryXPpl;
    @JsonProperty("one_Deathevery_X_ppl")
    public Integer oneDeatheveryXPpl;
    @JsonProperty("one_Testevery_X_ppl")
    public Integer oneTesteveryXPpl;
    @JsonProperty("Deaths_1M_pop")
    public Integer deaths1MPop;
    @JsonProperty("Serious_Critical")
    public Integer seriousCritical;
    @JsonProperty("Tests_1M_Pop")
    public Integer tests1MPop;
    @JsonProperty("TotCases_1M_Pop")
    public Integer totCases1MPop;
}
