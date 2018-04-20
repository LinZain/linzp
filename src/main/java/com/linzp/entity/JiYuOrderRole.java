package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_jiyu_appointment")   
public class JiYuOrderRole {
    @Id
    @Column(name="customer_name") 
    private String customerName;
    
    @Column(name="phone") 
    private String customerPhone;
    
    @Column(name="address") 
    private String customerAddress;
    
    @Column(name="appointment_tpye") 
    private String customerType;
    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
        result = prime * result + ((customerType == null) ? 0 : customerType.hashCode());
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
        JiYuOrderRole other = (JiYuOrderRole) obj;
        if (customerAddress == null) {
            if (other.customerAddress != null)
                return false;
        } else if (!customerAddress.equals(other.customerAddress))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        if (customerPhone == null) {
            if (other.customerPhone != null)
                return false;
        } else if (!customerPhone.equals(other.customerPhone))
            return false;
        if (customerType == null) {
            if (other.customerType != null)
                return false;
        } else if (!customerType.equals(other.customerType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "JiYuOrderRole [customerName=" + customerName + ", customerPhone=" + customerPhone + ", customerAddress=" + customerAddress + ", customerType="
                + customerType + "]";
    }




}
