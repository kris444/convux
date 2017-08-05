
package com.xxx.rasa.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "config",
    "data",
    "duckling_dimensions",
    "emulate",
    "entity_crf_BILOU_flag",
    "entity_crf_features",
    "language",
    "log_file",
    "log_level",
    "max_number_of_ngrams",
    "mitie_file",
    "name",
    "num_threads",
    "path",
    "pipeline",
    "port",
    "response_log",
    "server_model_dirs",
    "spacy_model_name",
    "token"
})
public class Config {

    @JsonProperty("config")
    private String config;
    @JsonProperty("data")
    private String data;
    @JsonProperty("duckling_dimensions")
    private Object ducklingDimensions;
    @JsonProperty("emulate")
    private Object emulate;
    @JsonProperty("entity_crf_BILOU_flag")
    private Boolean entityCrfBILOUFlag;
    @JsonProperty("entity_crf_features")
    private List<List<String>> entityCrfFeatures = null;
    @JsonProperty("language")
    private String language;
    @JsonProperty("log_file")
    private Object logFile;
    @JsonProperty("log_level")
    private String logLevel;
    @JsonProperty("max_number_of_ngrams")
    private Integer maxNumberOfNgrams;
    @JsonProperty("mitie_file")
    private String mitieFile;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("num_threads")
    private Integer numThreads;
    @JsonProperty("path")
    private String path;
    @JsonProperty("pipeline")
    private List<String> pipeline = null;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("response_log")
    private String responseLog;
    @JsonProperty("server_model_dirs")
    private String serverModelDirs;
    @JsonProperty("spacy_model_name")
    private Object spacyModelName;
    @JsonProperty("token")
    private Object token;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("config")
    public String getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(String config) {
        this.config = config;
    }

    @JsonProperty("data")
    public String getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    @JsonProperty("duckling_dimensions")
    public Object getDucklingDimensions() {
        return ducklingDimensions;
    }

    @JsonProperty("duckling_dimensions")
    public void setDucklingDimensions(Object ducklingDimensions) {
        this.ducklingDimensions = ducklingDimensions;
    }

    @JsonProperty("emulate")
    public Object getEmulate() {
        return emulate;
    }

    @JsonProperty("emulate")
    public void setEmulate(Object emulate) {
        this.emulate = emulate;
    }

    @JsonProperty("entity_crf_BILOU_flag")
    public Boolean getEntityCrfBILOUFlag() {
        return entityCrfBILOUFlag;
    }

    @JsonProperty("entity_crf_BILOU_flag")
    public void setEntityCrfBILOUFlag(Boolean entityCrfBILOUFlag) {
        this.entityCrfBILOUFlag = entityCrfBILOUFlag;
    }

    @JsonProperty("entity_crf_features")
    public List<List<String>> getEntityCrfFeatures() {
        return entityCrfFeatures;
    }

    @JsonProperty("entity_crf_features")
    public void setEntityCrfFeatures(List<List<String>> entityCrfFeatures) {
        this.entityCrfFeatures = entityCrfFeatures;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("log_file")
    public Object getLogFile() {
        return logFile;
    }

    @JsonProperty("log_file")
    public void setLogFile(Object logFile) {
        this.logFile = logFile;
    }

    @JsonProperty("log_level")
    public String getLogLevel() {
        return logLevel;
    }

    @JsonProperty("log_level")
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    @JsonProperty("max_number_of_ngrams")
    public Integer getMaxNumberOfNgrams() {
        return maxNumberOfNgrams;
    }

    @JsonProperty("max_number_of_ngrams")
    public void setMaxNumberOfNgrams(Integer maxNumberOfNgrams) {
        this.maxNumberOfNgrams = maxNumberOfNgrams;
    }

    @JsonProperty("mitie_file")
    public String getMitieFile() {
        return mitieFile;
    }

    @JsonProperty("mitie_file")
    public void setMitieFile(String mitieFile) {
        this.mitieFile = mitieFile;
    }

    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    @JsonProperty("num_threads")
    public Integer getNumThreads() {
        return numThreads;
    }

    @JsonProperty("num_threads")
    public void setNumThreads(Integer numThreads) {
        this.numThreads = numThreads;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("pipeline")
    public List<String> getPipeline() {
        return pipeline;
    }

    @JsonProperty("pipeline")
    public void setPipeline(List<String> pipeline) {
        this.pipeline = pipeline;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @JsonProperty("response_log")
    public String getResponseLog() {
        return responseLog;
    }

    @JsonProperty("response_log")
    public void setResponseLog(String responseLog) {
        this.responseLog = responseLog;
    }

    @JsonProperty("server_model_dirs")
    public String getServerModelDirs() {
        return serverModelDirs;
    }

    @JsonProperty("server_model_dirs")
    public void setServerModelDirs(String serverModelDirs) {
        this.serverModelDirs = serverModelDirs;
    }

    @JsonProperty("spacy_model_name")
    public Object getSpacyModelName() {
        return spacyModelName;
    }

    @JsonProperty("spacy_model_name")
    public void setSpacyModelName(Object spacyModelName) {
        this.spacyModelName = spacyModelName;
    }

    @JsonProperty("token")
    public Object getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(Object token) {
        this.token = token;
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
