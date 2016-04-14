
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
    "sigId",
    "sigName",
    "sigInst",
    "sigMimeType",
    "sigChunkSize",
    "sigBody"
})
public class Signature {

    @JsonProperty("sigId")
    private String sigId;
    @JsonProperty("sigName")
    private String sigName;
    @JsonProperty("sigInst")
    private String sigInst;
    @JsonProperty("sigMimeType")
    private String sigMimeType;
    @JsonProperty("sigChunkSize")
    private Integer sigChunkSize;
    @JsonProperty("sigBody")
    private String sigBody;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The sigId
     */
    @JsonProperty("sigId")
    public String getSigId() {
        return sigId;
    }

    /**
     * 
     * @param sigId
     *     The sigId
     */
    @JsonProperty("sigId")
    public void setSigId(String sigId) {
        this.sigId = sigId;
    }

    /**
     * 
     * @return
     *     The sigName
     */
    @JsonProperty("sigName")
    public String getSigName() {
        return sigName;
    }

    /**
     * 
     * @param sigName
     *     The sigName
     */
    @JsonProperty("sigName")
    public void setSigName(String sigName) {
        this.sigName = sigName;
    }

    /**
     * 
     * @return
     *     The sigInst
     */
    @JsonProperty("sigInst")
    public String getSigInst() {
        return sigInst;
    }

    /**
     * 
     * @param sigInst
     *     The sigInst
     */
    @JsonProperty("sigInst")
    public void setSigInst(String sigInst) {
        this.sigInst = sigInst;
    }

    /**
     * 
     * @return
     *     The sigMimeType
     */
    @JsonProperty("sigMimeType")
    public String getSigMimeType() {
        return sigMimeType;
    }

    /**
     * 
     * @param sigMimeType
     *     The sigMimeType
     */
    @JsonProperty("sigMimeType")
    public void setSigMimeType(String sigMimeType) {
        this.sigMimeType = sigMimeType;
    }

    /**
     * 
     * @return
     *     The sigChunkSize
     */
    @JsonProperty("sigChunkSize")
    public Integer getSigChunkSize() {
        return sigChunkSize;
    }

    /**
     * 
     * @param sigChunkSize
     *     The sigChunkSize
     */
    @JsonProperty("sigChunkSize")
    public void setSigChunkSize(Integer sigChunkSize) {
        this.sigChunkSize = sigChunkSize;
    }

    /**
     * 
     * @return
     *     The sigBody
     */
    @JsonProperty("sigBody")
    public String getSigBody() {
        return sigBody;
    }

    /**
     * 
     * @param sigBody
     *     The sigBody
     */
    @JsonProperty("sigBody")
    public void setSigBody(String sigBody) {
        this.sigBody = sigBody;
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
        return new HashCodeBuilder().append(sigId).append(sigName).append(sigInst).append(sigMimeType).append(sigChunkSize).append(sigBody).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Signature) == false) {
            return false;
        }
        Signature rhs = ((Signature) other);
        return new EqualsBuilder().append(sigId, rhs.sigId).append(sigName, rhs.sigName).append(sigInst, rhs.sigInst).append(sigMimeType, rhs.sigMimeType).append(sigChunkSize, rhs.sigChunkSize).append(sigBody, rhs.sigBody).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
