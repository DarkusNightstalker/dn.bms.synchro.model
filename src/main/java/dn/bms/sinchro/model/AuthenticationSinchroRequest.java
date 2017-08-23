/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dn.bms.sinchro.model;

import java.util.Date;
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
public class AuthenticationSinchroRequest {
    @NonNull
    private Date requestInstant;
    @NonNull
    private String username;
    @NonNull
    private String password;
}
