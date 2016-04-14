
package lk.rajith.fuse.examples.sap.entity;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "gpsValid",
    "latitude",
    "longitude",
    "gpsTms",
    "gpsColTms",
    "connType"
})
public class Gps {

    @JsonProperty("gpsValid")
    private Integer gpsValid;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("gpsTms")
    private String gpsTms;
    @JsonProperty("gpsColTms")
    private String gpsColTms;
    @JsonProperty("connType")
    private String connType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The gpsValid
     */
    @JsonProperty("gpsValid")
    public Integer getGpsValid() {
        return gpsValid;
    }

    /**
     * 
     * @param gpsValid
     *     The gpsValid
     */
    @JsonProperty("gpsValid")
    public void setGpsValid(Integer gpsValid) {
        this.gpsValid = gpsValid;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The gpsTms
     */
    @JsonProperty("gpsTms")
    public String getGpsTms() {
        return gpsTms;
    }

    /**
     * 
     * @param gpsTms
     *     The gpsTms
     */
    @JsonProperty("gpsTms")
    public void setGpsTms(String gpsTms) {
        this.gpsTms = gpsTms;
    }

    /**
     * 
     * @return
     *     The gpsColTms
     */
    @JsonProperty("gpsColTms")
    public String getGpsColTms() {
        return gpsColTms;
    }

    /**
     * 
     * @param gpsColTms
     *     The gpsColTms
     */
    @JsonProperty("gpsColTms")
    public void setGpsColTms(String gpsColTms) {
        this.gpsColTms = gpsColTms;
    }

    /**
     * 
     * @return
     *     The connType
     */
    @JsonProperty("connType")
    public String getConnType() {
        return connType;
    }

    /**
     * 
     * @param connType
     *     The connType
     */
    @JsonProperty("connType")
    public void setConnType(String connType) {
        this.connType = connType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
    public int hashCode() {
        return new HashCodeBuilder().append(gpsValid).append(latitude).append(longitude).append(gpsTms).append(gpsColTms).append(connType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gps) == false) {
            return false;
        }
        Gps rhs = ((Gps) other);
        return new EqualsBuilder().append(gpsValid, rhs.gpsValid).append(latitude, rhs.latitude).append(longitude, rhs.longitude).append(gpsTms, rhs.gpsTms).append(gpsColTms, rhs.gpsColTms).append(connType, rhs.connType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
