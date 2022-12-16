package com.projectspringboot.projectspringboot;

public class Contact {

    private String id;

    private String name;

    private String cellPhone;

    public Contact(String id, String name, String cellPhone){
        this.id = id;
        this.name = name;
        this.cellPhone = cellPhone;

    }

    public boolean isNew(){
        return id == null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
