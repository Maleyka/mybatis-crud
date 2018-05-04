package com.model;

public class Ages {

    private Integer clientId;
    private Integer currentAge;
    private Boolean alreadyRetired;


    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(Integer currentAge) {
        this.currentAge = currentAge;
    }

    public Boolean getAlreadyRetired() {
        return alreadyRetired;
    }

    public void setAlreadyRetired(Boolean alreadyRetired) {
        this.alreadyRetired = alreadyRetired;
    }

    @Override
    public String toString() {
        return "Ages{" +
                "clientId=" + clientId +
                ", currentAge=" + currentAge +
                ", alreadyRetired=" + alreadyRetired +
                '}';
    }
}
