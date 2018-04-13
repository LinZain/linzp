package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_product")
public class Product {
    @Id
    @Column(name="pdt_id") 
    private int pdtId;
    
    @Column(name="pdt_pic") 
    private String pdtPic;
    
    @Column(name="pdt_title")
    private String pdtTitle;
    
    @Column(name="pdt_price")
    private String pdtPrice;
    
    @Column(name="promotion_price")
    private String promotionPrice;
    
    @Column(name="pdt_brand")
    private String pdtBrand;
    
    @Column(name="pdt_category")
    private String pdtCategory;
    
    @Column(name="pdt_detial")
    private String pdtDetial;
    
    @Column(name="pdt_describe")
    private String pdtDescribe;
    
    @Column(name="pic_dir")
    private String picDir;
    
    @Column(name="pdt_inventory")
    private int pdtInventory;
    
    @Column(name="pdt_status")
    private int pdtStatus;
    
    @Column(name="pdt_lastUpdate")
    private String pdtLastUpdate;

    public int getPdtId() {
        return pdtId;
    }

    public void setPdtId(int pdtId) {
        this.pdtId = pdtId;
    }

    public String getPdtPic() {
        return pdtPic;
    }

    public void setPdtPic(String pdtPic) {
        this.pdtPic = pdtPic;
    }

    public String getPdtTitle() {
        return pdtTitle;
    }

    public void setPdtTitle(String pdtTitle) {
        this.pdtTitle = pdtTitle;
    }

    public String getPdtPrice() {
        return pdtPrice;
    }

    public void setPdtPrice(String pdtPrice) {
        this.pdtPrice = pdtPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getPdtBrand() {
        return pdtBrand;
    }

    public void setPdtBrand(String pdtBrand) {
        this.pdtBrand = pdtBrand;
    }

    public String getPdtCategory() {
        return pdtCategory;
    }

    public void setPdtCategory(String pdtCategory) {
        this.pdtCategory = pdtCategory;
    }

    public String getPdtDetial() {
        return pdtDetial;
    }

    public void setPdtDetial(String pdtDetial) {
        this.pdtDetial = pdtDetial;
    }

    public String getPdtDescribe() {
        return pdtDescribe;
    }

    public void setPdtDescribe(String pdtDescribe) {
        this.pdtDescribe = pdtDescribe;
    }

    public String getPicDir() {
        return picDir;
    }

    public void setPicDir(String picDir) {
        this.picDir = picDir;
    }

    public int getPdtInventory() {
        return pdtInventory;
    }

    public void setPdtInventory(int pdtInventory) {
        this.pdtInventory = pdtInventory;
    }

    public int getPdtStatus() {
        return pdtStatus;
    }

    public void setPdtStatus(int pdtStatus) {
        this.pdtStatus = pdtStatus;
    }

    public String getPdtLastUpdate() {
        return pdtLastUpdate;
    }

    public void setPdtLastUpdate(String pdtLastUpdate) {
        this.pdtLastUpdate = pdtLastUpdate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pdtBrand == null) ? 0 : pdtBrand.hashCode());
        result = prime * result + ((pdtCategory == null) ? 0 : pdtCategory.hashCode());
        result = prime * result + ((pdtDescribe == null) ? 0 : pdtDescribe.hashCode());
        result = prime * result + ((pdtDetial == null) ? 0 : pdtDetial.hashCode());
        result = prime * result + pdtId;
        result = prime * result + pdtInventory;
        result = prime * result + ((pdtLastUpdate == null) ? 0 : pdtLastUpdate.hashCode());
        result = prime * result + ((pdtPic == null) ? 0 : pdtPic.hashCode());
        result = prime * result + ((pdtPrice == null) ? 0 : pdtPrice.hashCode());
        result = prime * result + pdtStatus;
        result = prime * result + ((pdtTitle == null) ? 0 : pdtTitle.hashCode());
        result = prime * result + ((picDir == null) ? 0 : picDir.hashCode());
        result = prime * result + ((promotionPrice == null) ? 0 : promotionPrice.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (pdtBrand == null) {
            if (other.pdtBrand != null)
                return false;
        } else if (!pdtBrand.equals(other.pdtBrand))
            return false;
        if (pdtCategory == null) {
            if (other.pdtCategory != null)
                return false;
        } else if (!pdtCategory.equals(other.pdtCategory))
            return false;
        if (pdtDescribe == null) {
            if (other.pdtDescribe != null)
                return false;
        } else if (!pdtDescribe.equals(other.pdtDescribe))
            return false;
        if (pdtDetial == null) {
            if (other.pdtDetial != null)
                return false;
        } else if (!pdtDetial.equals(other.pdtDetial))
            return false;
        if (pdtId != other.pdtId)
            return false;
        if (pdtInventory != other.pdtInventory)
            return false;
        if (pdtLastUpdate == null) {
            if (other.pdtLastUpdate != null)
                return false;
        } else if (!pdtLastUpdate.equals(other.pdtLastUpdate))
            return false;
        if (pdtPic == null) {
            if (other.pdtPic != null)
                return false;
        } else if (!pdtPic.equals(other.pdtPic))
            return false;
        if (pdtPrice == null) {
            if (other.pdtPrice != null)
                return false;
        } else if (!pdtPrice.equals(other.pdtPrice))
            return false;
        if (pdtStatus != other.pdtStatus)
            return false;
        if (pdtTitle == null) {
            if (other.pdtTitle != null)
                return false;
        } else if (!pdtTitle.equals(other.pdtTitle))
            return false;
        if (picDir == null) {
            if (other.picDir != null)
                return false;
        } else if (!picDir.equals(other.picDir))
            return false;
        if (promotionPrice == null) {
            if (other.promotionPrice != null)
                return false;
        } else if (!promotionPrice.equals(other.promotionPrice))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product [pdtId=" + pdtId + ", pdtPic=" + pdtPic + ", pdtTitle=" + pdtTitle + ", pdtPrice=" + pdtPrice + ", promotionPrice=" + promotionPrice
                + ", pdtBrand=" + pdtBrand + ", pdtCategory=" + pdtCategory + ", pdtDetial=" + pdtDetial + ", pdtDescribe=" + pdtDescribe + ", picDir=" + picDir
                + ", pdtInventory=" + pdtInventory + ", pdtStatus=" + pdtStatus + ", pdtLastUpdate=" + pdtLastUpdate + "]";
    }
    
    
    
}
