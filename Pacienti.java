package projekt;

import java.sql.Date;



public class Pacienti {
    
    private int id;
    private String emri;
    private String mbiemri;
    private String emriPrindit;
    private int mosha;
    private Date dataLindjes;

    public Pacienti(int id, String emri, String mbiemri, int mosha, String emriPrindit, Date dataLindjes) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.emriPrindit = emriPrindit;
        this.mosha = mosha;
        this.dataLindjes = dataLindjes;
    }

    public Date getDataLindjes() {
        return dataLindjes;
    }
    
    
   
    

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public String getEmriPrindit() {
        return emriPrindit;
    }

    public int getMosha() {
        return mosha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public void setEmriPrindit(String emriPrindit) {
        this.emriPrindit = emriPrindit;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

  
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Pacienti) {
            Pacienti p = (Pacienti)o;
            return p.getId() == id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        return hash;
    }
    
    @Override
    public String toString() {
        return "id " + id + " emri" + emri;
    }
        
}