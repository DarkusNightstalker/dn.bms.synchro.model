/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dn.bms.sinchro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
public class FastSinchroRequest implements java.io.Serializable{

    @NonNull
    private HashMap<String, List<Object[]>> mapValues = new HashMap();
    @NonNull
    private Date lastUpdateDate;    
    @NonNull
    private String password;    
    @NonNull
    private String username;    
    @NonNull
    private String companyCode; 
    @NonNull
    private List<String> paymentVoucherCodes = new ArrayList();
    @NonNull
    private List<FastSinchroPoint> points = new ArrayList();
    
    public void add(String key, List<Object[]> data) {
        mapValues.put(key, data);
    }
}
