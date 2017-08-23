/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dn.bms.sinchro.model;

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
public class SlowSinchroRequest implements java.io.Serializable{
    
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private Date requestInstant;
    @NonNull
    private String companyCode;
    @NonNull
    private HashMap<String, List<Object[]>> mapValues = new HashMap();
}
