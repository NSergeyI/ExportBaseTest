package com.yardox.testWork.entity;

import javax.persistence.*;

@Entity
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPhones")
    private int id;

    @Column(name = "idEmployee")
    private int idEmployee;

    @Column(name = "idTypePhones")
    private int idTypePhone;

    @Column(name = "number")
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdTypePhone() {
        return idTypePhone;
    }

    public void setIdTypePhone(int idTypePhone) {
        this.idTypePhone = idTypePhone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", idEmployee=" + idEmployee +
                ", idTypePhone=" + idTypePhone +
                ", number='" + number + '\'' +
                '}';
    }
}
