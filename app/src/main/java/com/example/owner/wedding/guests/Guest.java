package com.example.owner.wedding.guests;

import java.util.List;

/**
 * Created by Shelly on 11/10/2015.
 */
public class Guest {
    private Person contactPerson;
    private int subGuestsNumber;
    private String extraInformation;
    private int category;
    private Boolean whatsappRsvp;
    private List<Guest> restrictionsList;
    private int whatsappRsvpStatus;

    public Guest(Person contactPerson, int subGuestsNumber, String extraInformation, Boolean whatsappRsvp) {
        this.contactPerson = contactPerson;
        this.subGuestsNumber = subGuestsNumber;
        this.extraInformation = extraInformation;
        this.whatsappRsvp = whatsappRsvp;
    }

    public int getWhatsappRsvpStatus() {
        return whatsappRsvpStatus;
    }

    public void setWhatsappRsvpStatus(int whatsappRsvpStatus) {
        this.whatsappRsvpStatus = whatsappRsvpStatus;
    }

    public void setRestriction(Guest guest) {
        guest.restrictionsList.add(this);
        this.restrictionsList.add(guest);
    }

    public void removeRestriction(Guest guest) {

        guest.restrictionsList.remove(this);
        this.restrictionsList.remove(guest);
    }

    public List<Guest> getRestrictionsList() {
        return restrictionsList;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }

    public int getSubGuestsNumber() {
        return subGuestsNumber;
    }

    public void setSubGuestsNumber(int subGuestsNumber) {
        this.subGuestsNumber = subGuestsNumber;
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Boolean getWhatsappRsvp() {
        return whatsappRsvp;
    }

    public void setWhatsappRsvp(Boolean whatsappRsvp) {
        this.whatsappRsvp = whatsappRsvp;
    }
}
