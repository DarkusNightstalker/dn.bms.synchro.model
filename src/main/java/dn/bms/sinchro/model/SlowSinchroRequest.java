/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dn.bms.sinchro.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Darkus Nightmare
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class SlowSinchroRequest implements java.io.Serializable{

    public static final String ACTOR = "actor";
    public static final String SALE = "sale";
    public static final String PURCHASE = "purchase";
    public static final String CUSTOMER_RETURN = "customer_resturn";
    public static final String SUPPLIER_RETURN = "supplier_return";
    public static final String PAYMENT = "payment";
    public static final String INTERNAL_STOCK_MOVEMENT = "ism";

    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private Date requestInstant;
    @NonNull
    private String companyCode;
    @NonNull
    private HashMap<String, List<Map<String,Object>>> mapValues = new HashMap();
}
