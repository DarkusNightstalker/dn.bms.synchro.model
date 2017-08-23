/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dn.bms.sinchro.model;

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
public class FastSinchroPoint implements java.io.Serializable{
    
    @NonNull
    private String identityNumber;
    @NonNull
    private Long points;
    
}
