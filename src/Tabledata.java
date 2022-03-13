
public class Tabledata {
    
    private String glass_type;
    private String brand;
    private String sph;
    private String cyl;
    private int piece;
    private String purchase;
    private String sale;
    
    public Tabledata(String glass_type, String brand, String sph, String cyl, int piece, String purchase, String sale) {
        this.glass_type = glass_type;
        this.brand = brand;
        this.sph = sph;
        this.cyl = cyl;
        this.piece = piece;
        this.purchase = purchase;
        this.sale = sale;
    }

    Tabledata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGlass_type() {
        return glass_type;
    }

    public void setGlass_type(String glass_type) {
        this.glass_type = glass_type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSph() {
        return sph;
    }

    public void setSph(String sph) {
        this.sph = sph;
    }

    public String getCyl() {
        return cyl;
    }

    public void setCyl(String cyl) {
        this.cyl = cyl;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }
    
    
}
