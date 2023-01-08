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
    @Column(name = "id")
    public String id;
    @JsonProperty("rank")
    @Column(name = "Ranking")
    public int ranking;
    @JsonProperty("Country")
    @Column(name = "Country")
    public String country;
    @JsonProperty("Continent")
    @Column(name = "Continent")
    public String continent;
    @JsonProperty("TwoLetterSymbol")
    @Column(name = "TwoLetterSymbol")
    public String twoLetterSymbol;
    @JsonProperty("ThreeLetterSymbol")
    @Column(name = "ThreeLetterSymbol")
    public String threeLetterSymbol;
    @JsonProperty("Infection_Risk")
    @Column(name = "Infection_Risk")
    public Double infectionRisk;
    @JsonProperty("Case_Fatality_Rate")
    @Column(name = "Case_Fatality_Rate")
    public Double caseFatalityRate;
    @JsonProperty("Test_Percentage")
    @Column(name = "Test_Percentage")
    public Double testPercentage;
    @JsonProperty("Recovery_Proporation")
    @Column(name = "Recovery_Proporation")
    public Double recoveryProporation;
    @JsonProperty("TotalCases")
    @Column(name = "TotalCases")
    public Integer totalCases;
    @JsonProperty("NewCases")
    @Column(name = "NewCases")
    public Integer newCases;
    @JsonProperty("TotalDeaths")
    @Column(name = "TotalDeaths")
    public Integer totalDeaths;
    @JsonProperty("NewDeaths")
    @Column(name = "NewDeaths")
    public Integer newDeaths;
    @JsonProperty("TotalRecovered")
    @Column(name = "TotalRecovered")
    public String totalRecovered;
    @JsonProperty("NewRecovered")
    @Column(name = "NewRecovered")
    public Integer newRecovered;
    @JsonProperty("ActiveCases")
    @Column(name = "ActiveCases")
    public Integer activeCases;
    @JsonProperty("TotalTests")
    @Column(name = "TotalTests")
    public String totalTests;
    @JsonProperty("Population")
    @Column(name = "Population")
    public String population;
    @JsonProperty("one_Caseevery_X_ppl")
    @Column(name = "one_Caseevery_X_ppl")
    public Integer oneCaseeveryXPpl;
    @JsonProperty("one_Deathevery_X_ppl")
    @Column(name = "one_Deathevery_X_ppl")
    public Integer oneDeatheveryXPpl;
    @JsonProperty("one_Testevery_X_ppl")
    @Column(name = "one_Testevery_X_ppl")
    public Integer oneTesteveryXPpl;
    @JsonProperty("Deaths_1M_pop")
    @Column(name = "Deaths_1M_pop")
    public Integer deaths1MPop;
    @JsonProperty("Serious_Critical")
    @Column(name = "Serious_Critical")
    public Integer seriousCritical;
    @JsonProperty("Tests_1M_Pop")
    @Column(name = "Tests_1M_Pop")
    public Integer tests1MPop;
    @JsonProperty("TotCases_1M_Pop")
    @Column(name = "TotCases_1M_Pop")
    public Integer totCases1MPop;
}
