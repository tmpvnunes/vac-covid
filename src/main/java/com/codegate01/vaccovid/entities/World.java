package com.codegate01.vaccovid.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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

@Entity(name = "WORLD")
public class World implements Serializable {
    private final static long serialVersionUID = -4177390940124811476L;
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recordID", nullable = false)
    private Long recordId;

    @JsonProperty("id")
    @JsonIgnore
    @Column(name = "id")
    private String id;

    @JsonProperty("rank")
    @Column(name = "Ranking")
    private int ranking;
    @JsonProperty("Country")
    @Column(name = "Country")
    private String country;
    @JsonProperty("Continent")
    @Column(name = "Continent")
    private String continent;

    @JsonProperty("TwoLetterSymbol")
    private String twoLetterSymbol;
    @JsonProperty("ThreeLetterSymbol")
    private String threeLetterSymbol;
    @JsonProperty("Infection_Risk")
    public Integer infectionRisk;
    @JsonProperty("Case_Fatality_Rate")
    public Double caseFatalityRate;
    @JsonProperty("Test_Percentage")
    public Integer testPercentage;
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
    public Double deaths1MPop;
    @JsonProperty("Serious_Critical")
    public Integer seriousCritical;
    @JsonProperty("Tests_1M_Pop")
    public Integer tests1MPop;
    @JsonProperty("TotCases_1M_Pop")
    public Integer totCases1MPop;


}
