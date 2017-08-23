/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dn.bms.sinchro.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Darkus Nightmare
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class FastSinchroResponse implements java.io.Serializable {

    public static final String CREATE_PAYMENT_PROOF = "create_pp";
    public static final String EDIT_PAYMENT_PROOF = "edit_pp";
    public static final String DOCUMENT_NUMBER = "dn";
    public static final String CREATE_IDENTITY_DOCUMENT = "create_idd";
    public static final String EDIT_IDENTITY_DOCUMENT = "edit_idd";
    public static final String CREATE_ACTOR = "create_actor";
    public static final String EDIT_ACTOR = "edit_actor";
    public static final String CREATE_ROL = "create_rol";
    public static final String EDIT_ROL = "edit_rol";
    public static final String CREATE_COMPANY = "create_cpy";
    public static final String EDIT_COMPANY = "edit_cpy";
    public static final String CREATE_USER = "create_user";
    public static final String EDIT_USER = "edit_user";
    public static final String CREATE_UOM = "create_uom";
    public static final String EDIT_UOM = "edit_uom";
    public static final String CREATE_STOCK_TYPE = "create_stt";
    public static final String EDIT_STOCK_TYPE = "edit_stt";
    public static final String CREATE_PRODUCT = "create_product";
    public static final String EDIT_PRODUCT = "edit_product";
    public static final String PRODUCT_SALE_PRICE = "psp";
    public static final String CREATE_PRODUCT_COST_PRICE = "create_pcp";
    public static final String EDIT_PRODUCT_COST_PRICE = "edit_pcp";
    public static final String CREATE_STOCK = "create_stock";
    public static final String EDIT_STOCK = "edit_stock";
    public static final String CREATE_INTERNAL_STOCK_MOVEMENT = "create_ism";
    public static final String EDIT_INTERNAL_STOCK_MOVEMENT = "edit_ism";
    public static final String CREATE_PRODUCT_LINE = "create_pl";
    public static final String EDIT_PRODUCT_LINE = "edit_pl";
    public static final String CREATE_SELLER = "create_sll";
    public static final String EDIT_SELLER = "edit_sll";
    public static final String CREATE_PAYMENT_VOUCHER = "create_pv";
    public static final String EDIT_PAYMENT_VOUCHER = "edit_pv";


    @NonNull
    private HashMap<String, List<Object[]>> mapValues = new HashMap();
    @NonNull
    private Date currentDateUpdate;

    public void addMapValue(String key, List<Object[]> data) {
        mapValues.put(key, data);
    }

    public List<Object[]> getMapValue(String key) {
        List<Object[]> data = mapValues.get(key);
        return data == null ? Collections.EMPTY_LIST : data;
    }
}
