package org.example.msbanqueapplication.entities;



import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum TypeCompte {
    @XmlEnumValue("COURNT")
    COURNT,
    @XmlEnumValue("EPARGNE")
    EPARGNE
}