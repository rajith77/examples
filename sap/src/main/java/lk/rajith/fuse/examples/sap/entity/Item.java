
package lk.rajith.fuse.examples.sap.entity;

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
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "itemId",
    "scanTms",
    "clNbr",
    "rsnCd",
    "delMode",
    "dncNbr",
    "alerts",
    "cc",
    "rsnCarded",
    "sapRcNbr",
    "idb",
    "gps",
    "signature"
})
public class Item {

    @JsonProperty("itemId")
    private String itemId;
    @JsonProperty("scanTms")
    private String scanTms;
    @JsonProperty("clNbr")
    private String clNbr;
    @JsonProperty("rsnCd")
    private String rsnCd;
    @JsonProperty("delMode")
    private Integer delMode;
    @JsonProperty("dncNbr")
    private String dncNbr;
    @JsonProperty("alerts")
    private List<Alert> alerts = new ArrayList<Alert>();
    @JsonProperty("cc")
    private Cc cc;
    @JsonProperty("rsnCarded")
    private Integer rsnCarded;
    @JsonProperty("sapRcNbr")
    private Integer sapRcNbr;
    @JsonProperty("idb")
    private Idb idb;
    @JsonProperty("gps")
    private Gps gps;
    @JsonProperty("signature")
    private Signature signature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The itemId
     */
    @JsonProperty("itemId")
    public String getItemId() {
        return itemId;
    }

    /**
     * 
     * @param itemId
     *     The itemId
     */
    @JsonProperty("itemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 
     * @return
     *     The scanTms
     */
    @JsonProperty("scanTms")
    public String getScanTms() {
        return scanTms;
    }

    /**
     * 
     * @param scanTms
     *     The scanTms
     */
    @JsonProperty("scanTms")
    public void setScanTms(String scanTms) {
        this.scanTms = scanTms;
    }

    /**
     * 
     * @return
     *     The clNbr
     */
    @JsonProperty("clNbr")
    public String getClNbr() {
        return clNbr;
    }

    /**
     * 
     * @param clNbr
     *     The clNbr
     */
    @JsonProperty("clNbr")
    public void setClNbr(String clNbr) {
        this.clNbr = clNbr;
    }

    /**
     * 
     * @return
     *     The rsnCd
     */
    @JsonProperty("rsnCd")
    public String getRsnCd() {
        return rsnCd;
    }

    /**
     * 
     * @param rsnCd
     *     The rsnCd
     */
    @JsonProperty("rsnCd")
    public void setRsnCd(String rsnCd) {
        this.rsnCd = rsnCd;
    }

    /**
     * 
     * @return
     *     The delMode
     */
    @JsonProperty("delMode")
    public Integer getDelMode() {
        return delMode;
    }

    /**
     * 
     * @param delMode
     *     The delMode
     */
    @JsonProperty("delMode")
    public void setDelMode(Integer delMode) {
        this.delMode = delMode;
    }

    /**
     * 
     * @return
     *     The dncNbr
     */
    @JsonProperty("dncNbr")
    public String getDncNbr() {
        return dncNbr;
    }

    /**
     * 
     * @param dncNbr
     *     The dncNbr
     */
    @JsonProperty("dncNbr")
    public void setDncNbr(String dncNbr) {
        this.dncNbr = dncNbr;
    }

    /**
     * 
     * @return
     *     The alerts
     */
    @JsonProperty("alerts")
    public List<Alert> getAlerts() {
        return alerts;
    }

    /**
     * 
     * @param alerts
     *     The alerts
     */
    @JsonProperty("alerts")
    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    /**
     * 
     * @return
     *     The cc
     */
    @JsonProperty("cc")
    public Cc getCc() {
        return cc;
    }

    /**
     * 
     * @param cc
     *     The cc
     */
    @JsonProperty("cc")
    public void setCc(Cc cc) {
        this.cc = cc;
    }

    /**
     * 
     * @return
     *     The rsnCarded
     */
    @JsonProperty("rsnCarded")
    public Integer getRsnCarded() {
        return rsnCarded;
    }

    /**
     * 
     * @param rsnCarded
     *     The rsnCarded
     */
    @JsonProperty("rsnCarded")
    public void setRsnCarded(Integer rsnCarded) {
        this.rsnCarded = rsnCarded;
    }

    /**
     * 
     * @return
     *     The sapRcNbr
     */
    @JsonProperty("sapRcNbr")
    public Integer getSapRcNbr() {
        return sapRcNbr;
    }

    /**
     * 
     * @param sapRcNbr
     *     The sapRcNbr
     */
    @JsonProperty("sapRcNbr")
    public void setSapRcNbr(Integer sapRcNbr) {
        this.sapRcNbr = sapRcNbr;
    }

    /**
     * 
     * @return
     *     The idb
     */
    @JsonProperty("idb")
    public Idb getIdb() {
        return idb;
    }

    /**
     * 
     * @param idb
     *     The idb
     */
    @JsonProperty("idb")
    public void setIdb(Idb idb) {
        this.idb = idb;
    }

    /**
     * 
     * @return
     *     The gps
     */
    @JsonProperty("gps")
    public Gps getGps() {
        return gps;
    }

    /**
     * 
     * @param gps
     *     The gps
     */
    @JsonProperty("gps")
    public void setGps(Gps gps) {
        this.gps = gps;
    }

    /**
     * 
     * @return
     *     The signature
     */
    @JsonProperty("signature")
    public Signature getSignature() {
        return signature;
    }

    /**
     * 
     * @param signature
     *     The signature
     */
    @JsonProperty("signature")
    public void setSignature(Signature signature) {
        this.signature = signature;
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
        return new HashCodeBuilder().append(itemId).append(scanTms).append(clNbr).append(rsnCd).append(delMode).append(dncNbr).append(alerts).append(cc).append(rsnCarded).append(sapRcNbr).append(idb).append(gps).append(signature).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(itemId, rhs.itemId).append(scanTms, rhs.scanTms).append(clNbr, rhs.clNbr).append(rsnCd, rhs.rsnCd).append(delMode, rhs.delMode).append(dncNbr, rhs.dncNbr).append(alerts, rhs.alerts).append(cc, rhs.cc).append(rsnCarded, rhs.rsnCarded).append(sapRcNbr, rhs.sapRcNbr).append(idb, rhs.idb).append(gps, rhs.gps).append(signature, rhs.signature).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
