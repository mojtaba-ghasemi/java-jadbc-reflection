package Model;

import MyDBManager.Column;
import MyDBManager.Table;
import MyDBManager.ModelMethodType;

import java.time.LocalDate;
import java.util.UUID;

@Table(dbTableName = "company")
public class Company implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    int companyID;
    UUID companyGUID;

    @Column(methodType = ModelMethodType.GETTER, dbFieldName = "ID", isIdentity = true, isPrimaryKey = true, dataType = "int")
    public int getCompanyID() {
        return companyID;
    }

    @Column(methodType = ModelMethodType.SETTER, dbFieldName = "ID", isIdentity = true, isPrimaryKey = true, dataType = "int")
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    @Column(methodType = ModelMethodType.GETTER, dbFieldName = "GUID", dataType = "UUID")
    public UUID getCompanyGUID() {
        return companyGUID;
    }

    @Column(methodType = ModelMethodType.SETTER, dbFieldName = "GUID", dataType = "UUID")
    public void setCompanyGUID(UUID companyGUID) {
        this.companyGUID = companyGUID;
    }


    @Column(methodType = ModelMethodType.GETTER, dbFieldName = "NAME")
    public String getName() {
        return name;
    }

    @Column(methodType = ModelMethodType.SETTER, dbFieldName = "NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Column(methodType = ModelMethodType.GETTER, dbFieldName = "START_ACTIVITY_DATE", dataType = "LocalDate")
    public LocalDate getStartActivityDate() {
        return startActivityDate;
    }

    @Column(methodType = ModelMethodType.SETTER, dbFieldName = "START_ACTIVITY_DATE", dataType = "LocalDate")
    public void setStartActivityDate(LocalDate startActivityDate) {
        this.startActivityDate = startActivityDate;
    }



    String name;
    LocalDate startActivityDate;


}
