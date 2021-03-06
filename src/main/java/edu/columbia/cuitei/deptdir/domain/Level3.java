package edu.columbia.cuitei.deptdir.domain;

import javax.persistence.Entity;

@Entity
public class Level3 extends Directory {

    private static final String LEVEL="LEVEL3";
    public String getLevel() { return LEVEL; }
    public void setLevel(String level) { super.setLevel(LEVEL); }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LEVEL).append("|")
                .append(getId()).append("|")
                .append(getName()).append("|")
                .append(getParent()).append("|")
                .append(getTieLine()).append("|")
                .append(getAddress()).append("|")
                .append(getMailCode()).append("|")
                .append(getPhoneType()).append("|")
                .append(getPhoneNumber());
        return sb.toString();
    }

}
