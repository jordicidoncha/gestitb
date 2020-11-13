package cat.itb.gestitb;

import java.util.Date;

public class MissedAttendance {
    String nameStudent;
    String moduleName;
    Date date;
    boolean isJustified;

    public MissedAttendance() {
        this.nameStudent = "";
        this.moduleName = "";
        this.date = new Date();
        this.isJustified = false;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isJustified() {
        return isJustified;
    }

    public void setJustified(boolean justified) {
        isJustified = justified;
    }
}
