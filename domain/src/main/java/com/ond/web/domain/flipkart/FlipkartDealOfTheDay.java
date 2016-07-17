package com.ond.web.domain.flipkart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "dotdList"
})
public class FlipkartDealOfTheDay {

    @JsonProperty("dotdList")
    private List<DotdList> dotdList = new ArrayList<DotdList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The dotdList
     */
    @JsonProperty("dotdList")
    public List<DotdList> getDotdList() {
        return dotdList;
    }

    /**
     * @param dotdList The dotdList
     */
    @JsonProperty("dotdList")
    public void setDotdList(List<DotdList> dotdList) {
        this.dotdList = dotdList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "FlipkartDealOfTheDay{" +
                "dotdList=" + dotdList +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
