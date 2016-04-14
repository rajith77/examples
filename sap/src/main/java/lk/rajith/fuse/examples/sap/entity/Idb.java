
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
    "idbNbr",
    "site",
    "date",
    "idbLineNbr"
})
public class Idb {

    @JsonProperty("idbNbr")
    private String idbNbr;
    @JsonProperty("site")
    private String site;
    @JsonProperty("date")
    private String date;
    @JsonProperty("idbLineNbr")
    private Integer idbLineNbr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The idbNbr
     */
    @JsonProperty("idbNbr")
    public String getIdbNbr() {
        return idbNbr;
    }

    /**
     * 
     * @param idbNbr
     *     The idbNbr
     */
    @JsonProperty("idbNbr")
    public void setIdbNbr(String idbNbr) {
        this.idbNbr = idbNbr;
    }

    /**
     * 
     * @return
     *     The site
     */
    @JsonProperty("site")
    public String getSite() {
        return site;
    }

    /**
     * 
     * @param site
     *     The site
     */
    @JsonProperty("site")
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The idbLineNbr
     */
    @JsonProperty("idbLineNbr")
    public Integer getIdbLineNbr() {
        return idbLineNbr;
    }

    /**
     * 
     * @param idbLineNbr
     *     The idbLineNbr
     */
    @JsonProperty("idbLineNbr")
    public void setIdbLineNbr(Integer idbLineNbr) {
        this.idbLineNbr = idbLineNbr;
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
        return new HashCodeBuilder().append(idbNbr).append(site).append(date).append(idbLineNbr).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Idb) == false) {
            return false;
        }
        Idb rhs = ((Idb) other);
        return new EqualsBuilder().append(idbNbr, rhs.idbNbr).append(site, rhs.site).append(date, rhs.date).append(idbLineNbr, rhs.idbLineNbr).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
