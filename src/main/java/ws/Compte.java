package ws;
import java.util.Date;
public class Compte {
  private int code;
  private double solde;
  private Date creatDate;
    public Compte(int code) {
        this.code = code;
    }
    public Compte() {
    }
    public Compte(int code, double solde, Date creatDate) {
        this.code = code;
        this.solde = solde;
        this.creatDate = creatDate;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }
}
