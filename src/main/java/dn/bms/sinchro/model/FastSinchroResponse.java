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
    public static final String CREATE_PRODUCT = "create_stt";
    public static final String EDIT_PRODUCT = "edit_stt";
    public static final String PRODUCT_SALE_PRICE = "psp";
    public static final String CREATE_PRODUCT_COST_PRICE = "create_pcp";
    public static final String CREATE_STOCK = "create_stock";
    public static final String EDIT_STOCK = "edit_stock";



// bean.addMapValue("create_idd",identityDocumentService.getCreateByAfterDate(request.getLastUpdateDate(),currentDateUpdate));
//                bean.addMapValue("edit_idd",identityDocumentService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,false));
//                bean.addMapValue("create_actors",actorService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate));
//                bean.addMapValue("edit_actors",actorService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,false));
//                bean.addMapValue("create_rol",rolService.getCreateByAfterDate(request.getLastUpdateDate(),currentDateUpdate));
//                bean.addMapValue("edit_rol",rolService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,false));
//                bean.addMapValue("create_company",companyService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate));
//                bean.addMapValue("edit_company",companyService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,false));
//                bean.addMapValue("create_user",userService.getCreateByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode()));
//                bean.addMapValue("edit_user",userService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode(),false));
//                bean.addMapValue("create_uom",uomService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate));
//                bean.addMapValue("edit_uom",uomService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,false));
//                bean.addMapValue("create_stt",stockTypeService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate));
//                bean.addMapValue("edit_stt",stockTypeService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,false));
//                bean.addMapValue("create_product",productService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate));
//                bean.addMapValue("edit_product",productService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,false));
//                bean.addMapValue("psp",productSalePriceService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode()));
//                bean.addMapValue("create_pcp",productCostPriceService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode()));
//                bean.addMapValue("edit_pcp",productCostPriceService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode(),false));
//                bean.addMapValue("create_stock",stockService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode()));
//                bean.addMapValue("edit_stock",stockService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode(),false));
//                bean.addMapValue("create_ism",internalStockMovementService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode()));
//                bean.addMapValue("edit_ism",internalStockMovementService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode(),false));
//                bean.addMapValue("create_pcp",productCostPriceService.getCreatedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode()));
//                bean.addMapValue("edit_pcp",productCostPriceService.getEditedByAfterDate(request.getLastUpdateDate(),currentDateUpdate,request.getCompanyCode(),false));

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
