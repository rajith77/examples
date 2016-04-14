
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
    "id",
    "typeId",
    "typeVal",
    "pmtTypeId"
})
public class Alert {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("typeId")
    private Integer typeId;
    @JsonProperty("typeVal")
    private Integer typeVal;
    @JsonProperty("pmtTypeId")
    private Integer pmtTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The typeId
     */
    @JsonProperty("typeId")
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 
     * @param typeId
     *     The typeId
     */
    @JsonProperty("typeId")
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 
     * @return
     *     The typeVal
     */
    @JsonProperty("typeVal")
    public Integer getTypeVal() {
        return typeVal;
    }

    /**
     * 
     * @param typeVal
     *     The typeVal
     */
    @JsonProperty("typeVal")
    public void setTypeVal(Integer typeVal) {
        this.typeVal = typeVal;
    }

    /**
     * 
     * @return
     *     The pmtTypeId
     */
    @JsonProperty("pmtTypeId")
    public Integer getPmtTypeId() {
        return pmtTypeId;
    }

    /**
     * 
     * @param pmtTypeId
     *     The pmtTypeId
     */
    @JsonProperty("pmtTypeId")
    public void setPmtTypeId(Integer pmtTypeId) {
        this.pmtTypeId = pmtTypeId;
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
        return new HashCodeBuilder().append(id).append(typeId).append(typeVal).append(pmtTypeId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alert) == false) {
            return false;
        }
        Alert rhs = ((Alert) other);
        return new EqualsBuilder().append(id, rhs.id).append(typeId, rhs.typeId).append(typeVal, rhs.typeVal).append(pmtTypeId, rhs.pmtTypeId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
