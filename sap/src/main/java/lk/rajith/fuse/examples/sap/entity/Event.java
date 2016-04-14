
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
    "evtId",
    "stopId",
    "items"
})
public class Event {

    @JsonProperty("evtId")
    private Integer evtId;
    @JsonProperty("stopId")
    private Integer stopId;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The evtId
     */
    @JsonProperty("evtId")
    public Integer getEvtId() {
        return evtId;
    }

    /**
     * 
     * @param evtId
     *     The evtId
     */
    @JsonProperty("evtId")
    public void setEvtId(Integer evtId) {
        this.evtId = evtId;
    }

    /**
     * 
     * @return
     *     The stopId
     */
    @JsonProperty("stopId")
    public Integer getStopId() {
        return stopId;
    }

    /**
     * 
     * @param stopId
     *     The stopId
     */
    @JsonProperty("stopId")
    public void setStopId(Integer stopId) {
        this.stopId = stopId;
    }

    /**
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
        return new HashCodeBuilder().append(evtId).append(stopId).append(items).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(evtId, rhs.evtId).append(stopId, rhs.stopId).append(items, rhs.items).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
