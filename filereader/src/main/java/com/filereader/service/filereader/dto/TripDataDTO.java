package com.filereader.service.filereader.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripDataDTO implements Serializable {
	private static final long serialVersionUID = -3752315103550511761L;
    private int VendorID;
    private String tpep_pickup_datetime;
    private String tpep_dropoff_datetime;
    private int passenger_count;
    private double trip_distance;
    private int RatecodeID;
    private String store_and_fwd_flag;
    private int PULocationID;
    private int DOLocationID;
    private int payment_type;    
    private double fare_amount;
    private double extra;
    private double mta_tax;
    private double tip_amount;
    private double tolls_amount;
    private double improvement_surcharge;
    private double total_amount;
}