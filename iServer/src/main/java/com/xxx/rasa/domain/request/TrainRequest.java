
package com.xxx.rasa.domain.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rasa_nlu_data"
})
public class TrainRequest {

    @JsonProperty("rasa_nlu_data")
    private RasaNluData rasaNluData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rasa_nlu_data")
    public RasaNluData getRasaNluData() {
        return rasaNluData;
    }

    @JsonProperty("rasa_nlu_data")
    public void setRasaNluData(RasaNluData rasaNluData) {
        this.rasaNluData = rasaNluData;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
