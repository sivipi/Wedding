package com.example.owner.wedding;

import android.net.Uri;

/**
 * Created by Ram on 10/11/2015.
 */
public class Vendor {

    private String vendorName;
    private int vendorCategory;
    private Person[] contact;
    private Uri[] attachedFiles;

    //TODO addAttachesFile, removeAttachedFile, addContact, removeContact, editContact
    public Vendor(String vendorName, int vendorCategory) {
        this.vendorName = vendorName;
        this.vendorCategory = vendorCategory;
    }
    public Vendor(String vendorName, int vendorCategory, Person[] contact) {
        this(vendorName,vendorCategory);
        this.contact = contact;
    }

    public String getVendorName() { return vendorName; }

    public int getVendorCategory() {
        return vendorCategory;
    }

    public Person[] getContact() {
        return contact;
    }

    public Uri[] getAttachedFiles() {
        return attachedFiles;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorCategory(int vendorCategory) {
        this.vendorCategory = vendorCategory;
    }

    public void setContact(Person[] contact) { this.contact = contact; }

    public void setAttachedFiles(Uri[] attachedFiles) {
        this.attachedFiles = attachedFiles;
    }
}
