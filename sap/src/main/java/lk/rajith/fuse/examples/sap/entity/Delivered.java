
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
    "transId",
    "transTms",
    "recCnt",
    "userId",
    "clientId",
    "wc",
    "route",
    "diaEvtType",
    "sapRcType",
    "events",
    "trnInd",
    "version"
})
public class Delivered {

    @JsonProperty("transId")
    private String transId;
    @JsonProperty("transTms")
    private String transTms;
    @JsonProperty("recCnt")
    private Integer recCnt;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("wc")
    private String wc;
    @JsonProperty("route")
    private String route;
    @JsonProperty("diaEvtType")
    private Integer diaEvtType;
    @JsonProperty("sapRcType")
    private Integer sapRcType;
    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    @JsonProperty("trnInd")
    private Integer trnInd;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The transId
     */
    @JsonProperty("transId")
    public String getTransId() {
        return transId;
    }

    /**
     * 
     * @param transId
     *     The transId
     */
    @JsonProperty("transId")
    public void setTransId(String transId) {
        this.transId = transId;
    }

    /**
     * 
     * @return
     *     The transTms
     */
    @JsonProperty("transTms")
    public String getTransTms() {
        return transTms;
    }

    /**
     * 
     * @param transTms
     *     The transTms
     */
    @JsonProperty("transTms")
    public void setTransTms(String transTms) {
        this.transTms = transTms;
    }

    /**
     * 
     * @return
     *     The recCnt
     */
    @JsonProperty("recCnt")
    public Integer getRecCnt() {
        return recCnt;
    }

    /**
     * 
     * @param recCnt
     *     The recCnt
     */
    @JsonProperty("recCnt")
    public void setRecCnt(Integer recCnt) {
        this.recCnt = recCnt;
    }

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The clientId
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * 
     * @param clientId
     *     The clientId
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 
     * @return
     *     The wc
     */
    @JsonProperty("wc")
    public String getWc() {
        return wc;
    }

    /**
     * 
     * @param wc
     *     The wc
     */
    @JsonProperty("wc")
    public void setWc(String wc) {
        this.wc = wc;
    }

    /**
     * 
     * @return
     *     The route
     */
    @JsonProperty("route")
    public String getRoute() {
        return route;
    }

    /**
     * 
     * @param route
     *     The route
     */
    @JsonProperty("route")
    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * 
     * @return
     *     The diaEvtType
     */
    @JsonProperty("diaEvtType")
    public Integer getDiaEvtType() {
        return diaEvtType;
    }

    /**
     * 
     * @param diaEvtType
     *     The diaEvtType
     */
    @JsonProperty("diaEvtType")
    public void setDiaEvtType(Integer diaEvtType) {
        this.diaEvtType = diaEvtType;
    }

    /**
     * 
     * @return
     *     The sapRcType
     */
    @JsonProperty("sapRcType")
    public Integer getSapRcType() {
        return sapRcType;
    }

    /**
     * 
     * @param sapRcType
     *     The sapRcType
     */
    @JsonProperty("sapRcType")
    public void setSapRcType(Integer sapRcType) {
        this.sapRcType = sapRcType;
    }

    /**
     * 
     * @return
     *     The events
     */
    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    /**
     * 
     * @return
     *     The trnInd
     */
    @JsonProperty("trnInd")
    public Integer getTrnInd() {
        return trnInd;
    }

    /**
     * 
     * @param trnInd
     *     The trnInd
     */
    @JsonProperty("trnInd")
    public void setTrnInd(Integer trnInd) {
        this.trnInd = trnInd;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
        return new HashCodeBuilder().append(transId).append(transTms).append(recCnt).append(userId).append(clientId).append(wc).append(route).append(diaEvtType).append(sapRcType).append(events).append(trnInd).append(version).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Delivered) == false) {
            return false;
        }
        Delivered rhs = ((Delivered) other);
        return new EqualsBuilder().append(transId, rhs.transId).append(transTms, rhs.transTms).append(recCnt, rhs.recCnt).append(userId, rhs.userId).append(clientId, rhs.clientId).append(wc, rhs.wc).append(route, rhs.route).append(diaEvtType, rhs.diaEvtType).append(sapRcType, rhs.sapRcType).append(events, rhs.events).append(trnInd, rhs.trnInd).append(version, rhs.version).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
