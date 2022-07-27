package ca.jrvs.apps.trading.model.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"avgTotalVolume",
"calculationPrice",
"change",
"changePercent",
"close",
"closeTime",
"companyName",
"delayedPrice",
"delayedPriceTime",
"extendedChange",
"extendedChangePercent",
"extendedPrice",
"extendedPriceTime",
"high",
"iexAskPrice",
"iexAskSize",
"iexBidPrice",
"iexBidSize",
"iexLastUpdated",
"iexRealtimePrice",
"iexRealtimeSize",
"iexVolume",
"latestPrice",
"latestSource",
"latestTime",
"latestUpdate",
"latestVolume",
"low",
"open",
"openTime",
"peRatio",
"previousClose",
"primaryExchange",
"sector",
"symbol",
"week52High",
"week52Low",
"ytdChange"
})
@Generated("jsonschema2pojo")
public class IexQuote {

@JsonProperty("avgTotalVolume")
private String avgTotalVolume;
@JsonProperty("calculationPrice")
private String calculationPrice;
@JsonProperty("change")
private String change;
@JsonProperty("changePercent")
private String changePercent;
@JsonProperty("close")
private String close;
@JsonProperty("closeTime")
private String closeTime;
@JsonProperty("companyName")
private String companyName;
@JsonProperty("delayedPrice")
private String delayedPrice;
@JsonProperty("delayedPriceTime")
private String delayedPriceTime;
@JsonProperty("extendedChange")
private String extendedChange;
@JsonProperty("extendedChangePercent")
private String extendedChangePercent;
@JsonProperty("extendedPrice")
private String extendedPrice;
@JsonProperty("extendedPriceTime")
private String extendedPriceTime;
@JsonProperty("high")
private String high;
@JsonProperty("iexAskPrice")
private String iexAskPrice;
@JsonProperty("iexAskSize")
private String iexAskSize;
@JsonProperty("iexBidPrice")
private String iexBidPrice;
@JsonProperty("iexBidSize")
private String iexBidSize;
@JsonProperty("iexLastUpdated")
private String iexLastUpdated;
@JsonProperty("iexRealtimePrice")
private String iexRealtimePrice;
@JsonProperty("iexRealtimeSize")
private String iexRealtimeSize;
@JsonProperty("iexVolume")
private String iexVolume;
@JsonProperty("latestPrice")
private String latestPrice;
@JsonProperty("latestSource")
private String latestSource;
@JsonProperty("latestTime")
private String latestTime;
@JsonProperty("latestUpdate")
private String latestUpdate;
@JsonProperty("latestVolume")
private String latestVolume;
@JsonProperty("low")
private String low;
@JsonProperty("open")
private String open;
@JsonProperty("openTime")
private String openTime;
@JsonProperty("peRatio")
private String peRatio;
@JsonProperty("previousClose")
private String previousClose;
@JsonProperty("primaryExchange")
private String primaryExchange;
@JsonProperty("sector")
private String sector;
@JsonProperty("symbol")
private String symbol;
@JsonProperty("week52High")
private String week52High;
@JsonProperty("week52Low")
private String week52Low;
@JsonProperty("ytdChange")
private String ytdChange;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public IexQuote() {
}

/**
*
* @param symbol
* @param avgTotalVolume
* @param companyName
* @param delayedPrice
* @param iexRealtimePrice
* @param calculationPrice
* @param extendedChangePercent
* @param latestSource
* @param primaryExchange
* @param latestUpdate
* @param iexBidPrice
* @param previousClose
* @param high
* @param peRatio
* @param delayedPriceTime
* @param extendedPrice
* @param low
* @param extendedPriceTime
* @param week52Low
* @param changePercent
* @param closeTime
* @param week52High
* @param openTime
* @param close
* @param sector
* @param latestPrice
* @param iexRealtimeSize
* @param iexLastUpdated
* @param change
* @param iexAskPrice
* @param latestVolume
* @param ytdChange
* @param iexVolume
* @param iexAskSize
* @param extendedChange
* @param latestTime
* @param iexBidSize
* @param open
*/
public IexQuote(String avgTotalVolume, String calculationPrice, String change, String changePercent, String close, String closeTime, String companyName, String delayedPrice, String delayedPriceTime, String extendedChange, String extendedChangePercent, String extendedPrice, String extendedPriceTime, String high, String iexAskPrice, String iexAskSize, String iexBidPrice, String iexBidSize, String iexLastUpdated, String iexRealtimePrice, String iexRealtimeSize, String iexVolume, String latestPrice, String latestSource, String latestTime, String latestUpdate, String latestVolume, String low, String open, String openTime, String peRatio, String previousClose, String primaryExchange, String sector, String symbol, String week52High, String week52Low, String ytdChange) {
super();
this.avgTotalVolume = avgTotalVolume;
this.calculationPrice = calculationPrice;
this.change = change;
this.changePercent = changePercent;
this.close = close;
this.closeTime = closeTime;
this.companyName = companyName;
this.delayedPrice = delayedPrice;
this.delayedPriceTime = delayedPriceTime;
this.extendedChange = extendedChange;
this.extendedChangePercent = extendedChangePercent;
this.extendedPrice = extendedPrice;
this.extendedPriceTime = extendedPriceTime;
this.high = high;
this.iexAskPrice = iexAskPrice;
this.iexAskSize = iexAskSize;
this.iexBidPrice = iexBidPrice;
this.iexBidSize = iexBidSize;
this.iexLastUpdated = iexLastUpdated;
this.iexRealtimePrice = iexRealtimePrice;
this.iexRealtimeSize = iexRealtimeSize;
this.iexVolume = iexVolume;
this.latestPrice = latestPrice;
this.latestSource = latestSource;
this.latestTime = latestTime;
this.latestUpdate = latestUpdate;
this.latestVolume = latestVolume;
this.low = low;
this.open = open;
this.openTime = openTime;
this.peRatio = peRatio;
this.previousClose = previousClose;
this.primaryExchange = primaryExchange;
this.sector = sector;
this.symbol = symbol;
this.week52High = week52High;
this.week52Low = week52Low;
this.ytdChange = ytdChange;
}

@JsonProperty("avgTotalVolume")
public String getAvgTotalVolume() {
return avgTotalVolume;
}

@JsonProperty("avgTotalVolume")
public void setAvgTotalVolume(String avgTotalVolume) {
this.avgTotalVolume = avgTotalVolume;
}

@JsonProperty("calculationPrice")
public String getCalculationPrice() {
return calculationPrice;
}

@JsonProperty("calculationPrice")
public void setCalculationPrice(String calculationPrice) {
this.calculationPrice = calculationPrice;
}

@JsonProperty("change")
public String getChange() {
return change;
}

@JsonProperty("change")
public void setChange(String change) {
this.change = change;
}

@JsonProperty("changePercent")
public String getChangePercent() {
return changePercent;
}

@JsonProperty("changePercent")
public void setChangePercent(String changePercent) {
this.changePercent = changePercent;
}

@JsonProperty("close")
public String getClose() {
return close;
}

@JsonProperty("close")
public void setClose(String close) {
this.close = close;
}

@JsonProperty("closeTime")
public String getCloseTime() {
return closeTime;
}

@JsonProperty("closeTime")
public void setCloseTime(String closeTime) {
this.closeTime = closeTime;
}

@JsonProperty("companyName")
public String getCompanyName() {
return companyName;
}

@JsonProperty("companyName")
public void setCompanyName(String companyName) {
this.companyName = companyName;
}

@JsonProperty("delayedPrice")
public String getDelayedPrice() {
return delayedPrice;
}

@JsonProperty("delayedPrice")
public void setDelayedPrice(String delayedPrice) {
this.delayedPrice = delayedPrice;
}

@JsonProperty("delayedPriceTime")
public String getDelayedPriceTime() {
return delayedPriceTime;
}

@JsonProperty("delayedPriceTime")
public void setDelayedPriceTime(String delayedPriceTime) {
this.delayedPriceTime = delayedPriceTime;
}

@JsonProperty("extendedChange")
public String getExtendedChange() {
return extendedChange;
}

@JsonProperty("extendedChange")
public void setExtendedChange(String extendedChange) {
this.extendedChange = extendedChange;
}

@JsonProperty("extendedChangePercent")
public String getExtendedChangePercent() {
return extendedChangePercent;
}

@JsonProperty("extendedChangePercent")
public void setExtendedChangePercent(String extendedChangePercent) {
this.extendedChangePercent = extendedChangePercent;
}

@JsonProperty("extendedPrice")
public String getExtendedPrice() {
return extendedPrice;
}

@JsonProperty("extendedPrice")
public void setExtendedPrice(String extendedPrice) {
this.extendedPrice = extendedPrice;
}

@JsonProperty("extendedPriceTime")
public String getExtendedPriceTime() {
return extendedPriceTime;
}

@JsonProperty("extendedPriceTime")
public void setExtendedPriceTime(String extendedPriceTime) {
this.extendedPriceTime = extendedPriceTime;
}

@JsonProperty("high")
public String getHigh() {
return high;
}

@JsonProperty("high")
public void setHigh(String high) {
this.high = high;
}

@JsonProperty("iexAskPrice")
public String getIexAskPrice() {
return iexAskPrice;
}

@JsonProperty("iexAskPrice")
public void setIexAskPrice(String iexAskPrice) {
this.iexAskPrice = iexAskPrice;
}

@JsonProperty("iexAskSize")
public String getIexAskSize() {
return iexAskSize;
}

@JsonProperty("iexAskSize")
public void setIexAskSize(String iexAskSize) {
this.iexAskSize = iexAskSize;
}

@JsonProperty("iexBidPrice")
public String getIexBidPrice() {
return iexBidPrice;
}

@JsonProperty("iexBidPrice")
public void setIexBidPrice(String iexBidPrice) {
this.iexBidPrice = iexBidPrice;
}

@JsonProperty("iexBidSize")
public String getIexBidSize() {
return iexBidSize;
}

@JsonProperty("iexBidSize")
public void setIexBidSize(String iexBidSize) {
this.iexBidSize = iexBidSize;
}

@JsonProperty("iexLastUpdated")
public String getIexLastUpdated() {
return iexLastUpdated;
}

@JsonProperty("iexLastUpdated")
public void setIexLastUpdated(String iexLastUpdated) {
this.iexLastUpdated = iexLastUpdated;
}

@JsonProperty("iexRealtimePrice")
public String getIexRealtimePrice() {
return iexRealtimePrice;
}

@JsonProperty("iexRealtimePrice")
public void setIexRealtimePrice(String iexRealtimePrice) {
this.iexRealtimePrice = iexRealtimePrice;
}

@JsonProperty("iexRealtimeSize")
public String getIexRealtimeSize() {
return iexRealtimeSize;
}

@JsonProperty("iexRealtimeSize")
public void setIexRealtimeSize(String iexRealtimeSize) {
this.iexRealtimeSize = iexRealtimeSize;
}

@JsonProperty("iexVolume")
public String getIexVolume() {
return iexVolume;
}

@JsonProperty("iexVolume")
public void setIexVolume(String iexVolume) {
this.iexVolume = iexVolume;
}

@JsonProperty("latestPrice")
public String getLatestPrice() {
return latestPrice;
}

@JsonProperty("latestPrice")
public void setLatestPrice(String latestPrice) {
this.latestPrice = latestPrice;
}

@JsonProperty("latestSource")
public String getLatestSource() {
return latestSource;
}

@JsonProperty("latestSource")
public void setLatestSource(String latestSource) {
this.latestSource = latestSource;
}

@JsonProperty("latestTime")
public String getLatestTime() {
return latestTime;
}

@JsonProperty("latestTime")
public void setLatestTime(String latestTime) {
this.latestTime = latestTime;
}

@JsonProperty("latestUpdate")
public String getLatestUpdate() {
return latestUpdate;
}

@JsonProperty("latestUpdate")
public void setLatestUpdate(String latestUpdate) {
this.latestUpdate = latestUpdate;
}

@JsonProperty("latestVolume")
public String getLatestVolume() {
return latestVolume;
}

@JsonProperty("latestVolume")
public void setLatestVolume(String latestVolume) {
this.latestVolume = latestVolume;
}

@JsonProperty("low")
public String getLow() {
return low;
}

@JsonProperty("low")
public void setLow(String low) {
this.low = low;
}

@JsonProperty("open")
public String getOpen() {
return open;
}

@JsonProperty("open")
public void setOpen(String open) {
this.open = open;
}

@JsonProperty("openTime")
public String getOpenTime() {
return openTime;
}

@JsonProperty("openTime")
public void setOpenTime(String openTime) {
this.openTime = openTime;
}

@JsonProperty("peRatio")
public String getPeRatio() {
return peRatio;
}

@JsonProperty("peRatio")
public void setPeRatio(String peRatio) {
this.peRatio = peRatio;
}

@JsonProperty("previousClose")
public String getPreviousClose() {
return previousClose;
}

@JsonProperty("previousClose")
public void setPreviousClose(String previousClose) {
this.previousClose = previousClose;
}

@JsonProperty("primaryExchange")
public String getPrimaryExchange() {
return primaryExchange;
}

@JsonProperty("primaryExchange")
public void setPrimaryExchange(String primaryExchange) {
this.primaryExchange = primaryExchange;
}

@JsonProperty("sector")
public String getSector() {
return sector;
}

@JsonProperty("sector")
public void setSector(String sector) {
this.sector = sector;
}

@JsonProperty("symbol")
public String getSymbol() {
return symbol;
}

@JsonProperty("symbol")
public void setSymbol(String symbol) {
this.symbol = symbol;
}

@JsonProperty("week52High")
public String getWeek52High() {
return week52High;
}

@JsonProperty("week52High")
public void setWeek52High(String week52High) {
this.week52High = week52High;
}

@JsonProperty("week52Low")
public String getWeek52Low() {
return week52Low;
}

@JsonProperty("week52Low")
public void setWeek52Low(String week52Low) {
this.week52Low = week52Low;
}

@JsonProperty("ytdChange")
public String getYtdChange() {
return ytdChange;
}

@JsonProperty("ytdChange")
public void setYtdChange(String ytdChange) {
this.ytdChange = ytdChange;
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
StringBuilder sb = new StringBuilder();
sb.append(IexQuote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("avgTotalVolume");
sb.append('=');
sb.append(((this.avgTotalVolume == null)?"<null>":this.avgTotalVolume));
sb.append(',');
sb.append("calculationPrice");
sb.append('=');
sb.append(((this.calculationPrice == null)?"<null>":this.calculationPrice));
sb.append(',');
sb.append("change");
sb.append('=');
sb.append(((this.change == null)?"<null>":this.change));
sb.append(',');
sb.append("changePercent");
sb.append('=');
sb.append(((this.changePercent == null)?"<null>":this.changePercent));
sb.append(',');
sb.append("close");
sb.append('=');
sb.append(((this.close == null)?"<null>":this.close));
sb.append(',');
sb.append("closeTime");
sb.append('=');
sb.append(((this.closeTime == null)?"<null>":this.closeTime));
sb.append(',');
sb.append("companyName");
sb.append('=');
sb.append(((this.companyName == null)?"<null>":this.companyName));
sb.append(',');
sb.append("delayedPrice");
sb.append('=');
sb.append(((this.delayedPrice == null)?"<null>":this.delayedPrice));
sb.append(',');
sb.append("delayedPriceTime");
sb.append('=');
sb.append(((this.delayedPriceTime == null)?"<null>":this.delayedPriceTime));
sb.append(',');
sb.append("extendedChange");
sb.append('=');
sb.append(((this.extendedChange == null)?"<null>":this.extendedChange));
sb.append(',');
sb.append("extendedChangePercent");
sb.append('=');
sb.append(((this.extendedChangePercent == null)?"<null>":this.extendedChangePercent));
sb.append(',');
sb.append("extendedPrice");
sb.append('=');
sb.append(((this.extendedPrice == null)?"<null>":this.extendedPrice));
sb.append(',');
sb.append("extendedPriceTime");
sb.append('=');
sb.append(((this.extendedPriceTime == null)?"<null>":this.extendedPriceTime));
sb.append(',');
sb.append("high");
sb.append('=');
sb.append(((this.high == null)?"<null>":this.high));
sb.append(',');
sb.append("iexAskPrice");
sb.append('=');
sb.append(((this.iexAskPrice == null)?"<null>":this.iexAskPrice));
sb.append(',');
sb.append("iexAskSize");
sb.append('=');
sb.append(((this.iexAskSize == null)?"<null>":this.iexAskSize));
sb.append(',');
sb.append("iexBidPrice");
sb.append('=');
sb.append(((this.iexBidPrice == null)?"<null>":this.iexBidPrice));
sb.append(',');
sb.append("iexBidSize");
sb.append('=');
sb.append(((this.iexBidSize == null)?"<null>":this.iexBidSize));
sb.append(',');
sb.append("iexLastUpdated");
sb.append('=');
sb.append(((this.iexLastUpdated == null)?"<null>":this.iexLastUpdated));
sb.append(',');
sb.append("iexRealtimePrice");
sb.append('=');
sb.append(((this.iexRealtimePrice == null)?"<null>":this.iexRealtimePrice));
sb.append(',');
sb.append("iexRealtimeSize");
sb.append('=');
sb.append(((this.iexRealtimeSize == null)?"<null>":this.iexRealtimeSize));
sb.append(',');
sb.append("iexVolume");
sb.append('=');
sb.append(((this.iexVolume == null)?"<null>":this.iexVolume));
sb.append(',');
sb.append("latestPrice");
sb.append('=');
sb.append(((this.latestPrice == null)?"<null>":this.latestPrice));
sb.append(',');
sb.append("latestSource");
sb.append('=');
sb.append(((this.latestSource == null)?"<null>":this.latestSource));
sb.append(',');
sb.append("latestTime");
sb.append('=');
sb.append(((this.latestTime == null)?"<null>":this.latestTime));
sb.append(',');
sb.append("latestUpdate");
sb.append('=');
sb.append(((this.latestUpdate == null)?"<null>":this.latestUpdate));
sb.append(',');
sb.append("latestVolume");
sb.append('=');
sb.append(((this.latestVolume == null)?"<null>":this.latestVolume));
sb.append(',');
sb.append("low");
sb.append('=');
sb.append(((this.low == null)?"<null>":this.low));
sb.append(',');
sb.append("open");
sb.append('=');
sb.append(((this.open == null)?"<null>":this.open));
sb.append(',');
sb.append("openTime");
sb.append('=');
sb.append(((this.openTime == null)?"<null>":this.openTime));
sb.append(',');
sb.append("peRatio");
sb.append('=');
sb.append(((this.peRatio == null)?"<null>":this.peRatio));
sb.append(',');
sb.append("previousClose");
sb.append('=');
sb.append(((this.previousClose == null)?"<null>":this.previousClose));
sb.append(',');
sb.append("primaryExchange");
sb.append('=');
sb.append(((this.primaryExchange == null)?"<null>":this.primaryExchange));
sb.append(',');
sb.append("sector");
sb.append('=');
sb.append(((this.sector == null)?"<null>":this.sector));
sb.append(',');
sb.append("symbol");
sb.append('=');
sb.append(((this.symbol == null)?"<null>":this.symbol));
sb.append(',');
sb.append("week52High");
sb.append('=');
sb.append(((this.week52High == null)?"<null>":this.week52High));
sb.append(',');
sb.append("week52Low");
sb.append('=');
sb.append(((this.week52Low == null)?"<null>":this.week52Low));
sb.append(',');
sb.append("ytdChange");
sb.append('=');
sb.append(((this.ytdChange == null)?"<null>":this.ytdChange));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

@Override
public int hashCode() {
int result = 1;
result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
result = ((result* 31)+((this.avgTotalVolume == null)? 0 :this.avgTotalVolume.hashCode()));
result = ((result* 31)+((this.companyName == null)? 0 :this.companyName.hashCode()));
result = ((result* 31)+((this.delayedPrice == null)? 0 :this.delayedPrice.hashCode()));
result = ((result* 31)+((this.iexRealtimePrice == null)? 0 :this.iexRealtimePrice.hashCode()));
result = ((result* 31)+((this.calculationPrice == null)? 0 :this.calculationPrice.hashCode()));
result = ((result* 31)+((this.extendedChangePercent == null)? 0 :this.extendedChangePercent.hashCode()));
result = ((result* 31)+((this.latestSource == null)? 0 :this.latestSource.hashCode()));
result = ((result* 31)+((this.primaryExchange == null)? 0 :this.primaryExchange.hashCode()));
result = ((result* 31)+((this.latestUpdate == null)? 0 :this.latestUpdate.hashCode()));
result = ((result* 31)+((this.iexBidPrice == null)? 0 :this.iexBidPrice.hashCode()));
result = ((result* 31)+((this.previousClose == null)? 0 :this.previousClose.hashCode()));
result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
result = ((result* 31)+((this.peRatio == null)? 0 :this.peRatio.hashCode()));
result = ((result* 31)+((this.delayedPriceTime == null)? 0 :this.delayedPriceTime.hashCode()));
result = ((result* 31)+((this.extendedPrice == null)? 0 :this.extendedPrice.hashCode()));
result = ((result* 31)+((this.low == null)? 0 :this.low.hashCode()));
result = ((result* 31)+((this.extendedPriceTime == null)? 0 :this.extendedPriceTime.hashCode()));
result = ((result* 31)+((this.week52Low == null)? 0 :this.week52Low.hashCode()));
result = ((result* 31)+((this.changePercent == null)? 0 :this.changePercent.hashCode()));
result = ((result* 31)+((this.closeTime == null)? 0 :this.closeTime.hashCode()));
result = ((result* 31)+((this.week52High == null)? 0 :this.week52High.hashCode()));
result = ((result* 31)+((this.openTime == null)? 0 :this.openTime.hashCode()));
result = ((result* 31)+((this.close == null)? 0 :this.close.hashCode()));
result = ((result* 31)+((this.sector == null)? 0 :this.sector.hashCode()));
result = ((result* 31)+((this.latestPrice == null)? 0 :this.latestPrice.hashCode()));
result = ((result* 31)+((this.iexRealtimeSize == null)? 0 :this.iexRealtimeSize.hashCode()));
result = ((result* 31)+((this.iexLastUpdated == null)? 0 :this.iexLastUpdated.hashCode()));
result = ((result* 31)+((this.change == null)? 0 :this.change.hashCode()));
result = ((result* 31)+((this.iexAskPrice == null)? 0 :this.iexAskPrice.hashCode()));
result = ((result* 31)+((this.latestVolume == null)? 0 :this.latestVolume.hashCode()));
result = ((result* 31)+((this.ytdChange == null)? 0 :this.ytdChange.hashCode()));
result = ((result* 31)+((this.iexVolume == null)? 0 :this.iexVolume.hashCode()));
result = ((result* 31)+((this.iexAskSize == null)? 0 :this.iexAskSize.hashCode()));
result = ((result* 31)+((this.extendedChange == null)? 0 :this.extendedChange.hashCode()));
result = ((result* 31)+((this.latestTime == null)? 0 :this.latestTime.hashCode()));
result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
result = ((result* 31)+((this.iexBidSize == null)? 0 :this.iexBidSize.hashCode()));
result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
return result;
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof IexQuote) == false) {
return false;
}
IexQuote rhs = ((IexQuote) other);
return ((((((((((((((((((((((((((((((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.avgTotalVolume == rhs.avgTotalVolume)||((this.avgTotalVolume!= null)&&this.avgTotalVolume.equals(rhs.avgTotalVolume))))&&((this.companyName == rhs.companyName)||((this.companyName!= null)&&this.companyName.equals(rhs.companyName))))&&((this.delayedPrice == rhs.delayedPrice)||((this.delayedPrice!= null)&&this.delayedPrice.equals(rhs.delayedPrice))))&&((this.iexRealtimePrice == rhs.iexRealtimePrice)||((this.iexRealtimePrice!= null)&&this.iexRealtimePrice.equals(rhs.iexRealtimePrice))))&&((this.calculationPrice == rhs.calculationPrice)||((this.calculationPrice!= null)&&this.calculationPrice.equals(rhs.calculationPrice))))&&((this.extendedChangePercent == rhs.extendedChangePercent)||((this.extendedChangePercent!= null)&&this.extendedChangePercent.equals(rhs.extendedChangePercent))))&&((this.latestSource == rhs.latestSource)||((this.latestSource!= null)&&this.latestSource.equals(rhs.latestSource))))&&((this.primaryExchange == rhs.primaryExchange)||((this.primaryExchange!= null)&&this.primaryExchange.equals(rhs.primaryExchange))))&&((this.latestUpdate == rhs.latestUpdate)||((this.latestUpdate!= null)&&this.latestUpdate.equals(rhs.latestUpdate))))&&((this.iexBidPrice == rhs.iexBidPrice)||((this.iexBidPrice!= null)&&this.iexBidPrice.equals(rhs.iexBidPrice))))&&((this.previousClose == rhs.previousClose)||((this.previousClose!= null)&&this.previousClose.equals(rhs.previousClose))))&&((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high))))&&((this.peRatio == rhs.peRatio)||((this.peRatio!= null)&&this.peRatio.equals(rhs.peRatio))))&&((this.delayedPriceTime == rhs.delayedPriceTime)||((this.delayedPriceTime!= null)&&this.delayedPriceTime.equals(rhs.delayedPriceTime))))&&((this.extendedPrice == rhs.extendedPrice)||((this.extendedPrice!= null)&&this.extendedPrice.equals(rhs.extendedPrice))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.extendedPriceTime == rhs.extendedPriceTime)||((this.extendedPriceTime!= null)&&this.extendedPriceTime.equals(rhs.extendedPriceTime))))&&((this.week52Low == rhs.week52Low)||((this.week52Low!= null)&&this.week52Low.equals(rhs.week52Low))))&&((this.changePercent == rhs.changePercent)||((this.changePercent!= null)&&this.changePercent.equals(rhs.changePercent))))&&((this.closeTime == rhs.closeTime)||((this.closeTime!= null)&&this.closeTime.equals(rhs.closeTime))))&&((this.week52High == rhs.week52High)||((this.week52High!= null)&&this.week52High.equals(rhs.week52High))))&&((this.openTime == rhs.openTime)||((this.openTime!= null)&&this.openTime.equals(rhs.openTime))))&&((this.close == rhs.close)||((this.close!= null)&&this.close.equals(rhs.close))))&&((this.sector == rhs.sector)||((this.sector!= null)&&this.sector.equals(rhs.sector))))&&((this.latestPrice == rhs.latestPrice)||((this.latestPrice!= null)&&this.latestPrice.equals(rhs.latestPrice))))&&((this.iexRealtimeSize == rhs.iexRealtimeSize)||((this.iexRealtimeSize!= null)&&this.iexRealtimeSize.equals(rhs.iexRealtimeSize))))&&((this.iexLastUpdated == rhs.iexLastUpdated)||((this.iexLastUpdated!= null)&&this.iexLastUpdated.equals(rhs.iexLastUpdated))))&&((this.change == rhs.change)||((this.change!= null)&&this.change.equals(rhs.change))))&&((this.iexAskPrice == rhs.iexAskPrice)||((this.iexAskPrice!= null)&&this.iexAskPrice.equals(rhs.iexAskPrice))))&&((this.latestVolume == rhs.latestVolume)||((this.latestVolume!= null)&&this.latestVolume.equals(rhs.latestVolume))))&&((this.ytdChange == rhs.ytdChange)||((this.ytdChange!= null)&&this.ytdChange.equals(rhs.ytdChange))))&&((this.iexVolume == rhs.iexVolume)||((this.iexVolume!= null)&&this.iexVolume.equals(rhs.iexVolume))))&&((this.iexAskSize == rhs.iexAskSize)||((this.iexAskSize!= null)&&this.iexAskSize.equals(rhs.iexAskSize))))&&((this.extendedChange == rhs.extendedChange)||((this.extendedChange!= null)&&this.extendedChange.equals(rhs.extendedChange))))&&((this.latestTime == rhs.latestTime)||((this.latestTime!= null)&&this.latestTime.equals(rhs.latestTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.iexBidSize == rhs.iexBidSize)||((this.iexBidSize!= null)&&this.iexBidSize.equals(rhs.iexBidSize))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))));
}

}