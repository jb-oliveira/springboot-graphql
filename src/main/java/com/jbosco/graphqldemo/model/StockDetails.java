package com.jbosco.graphqldemo.model;

import lombok.Data;

@Data
public class StockDetails {
    private String ticker;
    private String stockValue;
    private String volume;
    private String avarageVolume;
    private String PE_Ratio;
    private String EPS;
    private String dividend;
    private String marcketCap;
    private String previousOpen;
    private String previousClose;
}
