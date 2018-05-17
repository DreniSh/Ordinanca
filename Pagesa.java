/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

/**
 *
 * @author drens
 */
public class Pagesa {

    private int id;
    private String emri;
    private String mbiemri;
    private int ineksionet;
    private double cmimi;

    public Pagesa(int id, String emri, String mbiemri, int ineksionet, double cmimi) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.ineksionet = ineksionet;
        this.cmimi = cmimi;
    }

    
    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getIneksionet() {
        return ineksionet;
    }

    public void setIneksionet(int ineksionet) {
        this.ineksionet = ineksionet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

}
