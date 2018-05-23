/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.sql.Date;

/**
 *
 * @author drens
 */
class Termini {
    
    private int termini;
    private String emriMbiemri;
    private String pershkrimi;
    private String kohaFillimit;
    private String kohaMbarimit;
    private Date data;
    private String nrTelefonit;

    public Termini(int termini, String emriMbiemri, String pershkrimi, String kohaFillimit, String kohaMbarimit, Date data, String nrTelefonit) {
        this.termini = termini;
        this.emriMbiemri = emriMbiemri;
        this.pershkrimi = pershkrimi;
        this.kohaFillimit = kohaFillimit;
        this.kohaMbarimit = kohaMbarimit;
        this.data = data;
        this.nrTelefonit = nrTelefonit;
    }

    public void setTermini(int termini) {
        this.termini = termini;
    }

    public int getTermini() {
        return termini;
    }

    public String getEmriMbiemri() {
        return emriMbiemri;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public String getKohaFillimit() {
        return kohaFillimit;
    }

    public String getKohaMbarimit() {
        return kohaMbarimit;
    }

    public Date getData() {
        return data;
    }

    public String getNrTelefonit() {
        return nrTelefonit;
    }

    public void setEmriMbiemri(String emriMbiemri) {
        this.emriMbiemri = emriMbiemri;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public void setKohaFillimit(String kohaFillimit) {
        this.kohaFillimit = kohaFillimit;
    }

    public void setKohaMbarimit(String kohaMbarimit) {
        this.kohaMbarimit = kohaMbarimit;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setNrTelefonit(String nrTelefonit) {
        this.nrTelefonit = nrTelefonit;
    }
    
    
    
}
