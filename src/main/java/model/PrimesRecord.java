package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PrimesRecord {

    @Id
    @GeneratedValue
    private int id;

    private String customer;

    private String n;

    private boolean isPrime;

    public int getId() {
        return id;
    }

    public PrimesRecord() {

    }

    public PrimesRecord(int id, String customer, String n, boolean isPrime) {
        super();
        this.id = id;
        this.customer = customer;
        this.n = n;
        this.isPrime = isPrime;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean isPrime) {
        this.isPrime = isPrime;
    }

    public void setId(int id) {
        this.id = id;
    }

}