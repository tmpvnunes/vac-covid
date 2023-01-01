package com.codegate01.vaccovid.entities;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Country",
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
        "Serious_Critical"
})
@Entity(name = "COUNTRY")
public class Country implements Serializable{
    private final static long serialVersionUID = -373986465457092945L;

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @JsonProperty("Country")
    @Column(name = "Country")
    public String country;
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
    public Integer totalRecovered;
    @JsonProperty("NewRecovered")
    @Column(name = "NewRecovered")
    public Integer newRecovered;
    @JsonProperty("ActiveCases")
    @Column(name = "ActiveCases")
    public Integer activeCases;
    @JsonProperty("TotalTests")
    @Column(name = "TotalTests")
    public Integer totalTests;
    @JsonProperty("Population")
    @Column(name = "Population")
    public Integer population;
    @JsonProperty("Serious_Critical")
    @Column(name = "Serious_Critical")
    public Integer seriousCritical;

}
