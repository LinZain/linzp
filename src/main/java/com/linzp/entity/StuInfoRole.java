package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dbo_Stu_Info")
public class StuInfoRole {
    @Id
    @Column(name="stu_no") 
    private String stuNO;
    
    @Column(name="stu_name") 
    private String stuName;
    
    @Column(name="stu_sex") 
    private String stuSex;

    public String getStuNO() {
        return stuNO;
    }

    public void setStuNO(String stuNO) {
        this.stuNO = stuNO;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((stuNO == null) ? 0 : stuNO.hashCode());
        result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
        result = prime * result + ((stuSex == null) ? 0 : stuSex.hashCode());
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
        StuInfoRole other = (StuInfoRole) obj;
        if (stuNO == null) {
            if (other.stuNO != null)
                return false;
        } else if (!stuNO.equals(other.stuNO))
            return false;
        if (stuName == null) {
            if (other.stuName != null)
                return false;
        } else if (!stuName.equals(other.stuName))
            return false;
        if (stuSex == null) {
            if (other.stuSex != null)
                return false;
        } else if (!stuSex.equals(other.stuSex))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "StuInfoRole [stuNO=" + stuNO + ", stuName=" + stuName + ", stuSex=" + stuSex + "]";
    }
    
}
