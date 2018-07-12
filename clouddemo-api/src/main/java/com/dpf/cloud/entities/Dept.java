package com.dpf.cloud.entities;


/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;*/

import java.io.Serializable;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Accessors(chain=true)
public class Dept implements Serializable {
    private Long deptId;
    private String name;
    private String dbSource;

    public Dept() {
    }

    public Dept(Long deptId, String name, String dbSource) {
        this.deptId = deptId;
        this.name = name;
        this.dbSource = dbSource;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
