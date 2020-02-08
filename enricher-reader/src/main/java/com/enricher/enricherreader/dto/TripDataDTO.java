package com.enricher.enricherreader.dto;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;

public class TripDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3752315103550511761L;
	@CsvBindByName(column = "VendorID")
    private int vedorId;
	@CsvBindByName(column = "tpep_pickup_datetime")
    private String tpepPickupDatetime;
	@CsvBindByName(column = "tpep_dropoff_datetime")
    private String tpepDropoffDatetime;
	@CsvBindByName(column = "passenger_count")
    private int passengerCount;
	@CsvBindByName(column = "trip_distance")
    private double tripDistance;
	@CsvBindByName(column = "RatecodeID")
    private int ratecodeID;
	@CsvBindByName(column = "store_and_fwd_flag")
    private String storeFwdFlag;
	@CsvBindByName(column = "PULocationID")
    private int puLocationID;
	@CsvBindByName(column = "DOLocationID")
    private int doLocationID;
	@CsvBindByName(column = "payment_type")
    private int paymentType; 
	@CsvBindByName(column = "fare_amount")
    private double fareAmount;
	@CsvBindByName(column = "extra")
    private double extra;
	@CsvBindByName(column = "mta_tax")
    private double mtaTax;
	@CsvBindByName(column = "tip_amount")
    private double tipAmount;
	@CsvBindByName(column = "tolls_amount")
    private double tollsAmount;
	@CsvBindByName(column = "improvement_surcharge")
    private double improvementSurcharge;
	@CsvBindByName(column = "total_amount")
    private double totalAmount;
	
	public int getVedorId() {
		return vedorId;
	}
	public void setVedorId(int vedorId) {
		this.vedorId = vedorId;
	}
	public String getTpepPickupDatetime() {
		return tpepPickupDatetime;
	}
	public void setTpepPickupDatetime(String tpepPickupDatetime) {
		this.tpepPickupDatetime = tpepPickupDatetime;
	}
	public String getTpepDropoffDatetime() {
		return tpepDropoffDatetime;
	}
	public void setTpepDropoffDatetime(String tpepDropoffDatetime) {
		this.tpepDropoffDatetime = tpepDropoffDatetime;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public double getTripDistance() {
		return tripDistance;
	}
	public void setTripDistance(double tripDistance) {
		this.tripDistance = tripDistance;
	}
	public int getRatecodeID() {
		return ratecodeID;
	}
	public void setRatecodeID(int ratecodeID) {
		this.ratecodeID = ratecodeID;
	}
	public String getStoreFwdFlag() {
		return storeFwdFlag;
	}
	public void setStoreFwdFlag(String storeFwdFlag) {
		this.storeFwdFlag = storeFwdFlag;
	}
	public int getPuLocationID() {
		return puLocationID;
	}
	public void setPuLocationID(int puLocationID) {
		this.puLocationID = puLocationID;
	}
	public int getDoLocationID() {
		return doLocationID;
	}
	public void setDoLocationID(int doLocationID) {
		this.doLocationID = doLocationID;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public double getFareAmount() {
		return fareAmount;
	}
	public void setFareAmount(double fareAmount) {
		this.fareAmount = fareAmount;
	}
	public double getExtra() {
		return extra;
	}
	public void setExtra(double extra) {
		this.extra = extra;
	}
	public double getMtaTax() {
		return mtaTax;
	}
	public void setMtaTax(double mtaTax) {
		this.mtaTax = mtaTax;
	}
	public double getTipAmount() {
		return tipAmount;
	}
	public void setTipAmount(double tipAmount) {
		this.tipAmount = tipAmount;
	}
	public double getTollsAmount() {
		return tollsAmount;
	}
	public void setTollsAmount(double tollsAmount) {
		this.tollsAmount = tollsAmount;
	}
	public double getImprovementSurcharge() {
		return improvementSurcharge;
	}
	public void setImprovementSurcharge(double improvementSurcharge) {
		this.improvementSurcharge = improvementSurcharge;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TripDataDTO [vedorId=").append(vedorId).append(", tpepPickupDatetime=")
				.append(tpepPickupDatetime).append(", tpepDropoffDatetime=").append(tpepDropoffDatetime)
				.append(", passengerCount=").append(passengerCount).append(", tripDistance=").append(tripDistance)
				.append(", ratecodeID=").append(ratecodeID).append(", storeFwdFlag=").append(storeFwdFlag)
				.append(", puLocationID=").append(puLocationID).append(", doLocationID=").append(doLocationID)
				.append(", paymentType=").append(paymentType).append(", fareAmount=").append(fareAmount)
				.append(", extra=").append(extra).append(", mtaTax=").append(mtaTax).append(", tipAmount=")
				.append(tipAmount).append(", tollsAmount=").append(tollsAmount).append(", improvementSurcharge=")
				.append(improvementSurcharge).append(", totalAmount=").append(totalAmount).append("]");
		return builder.toString();
	}
    
}