
public class TableData2 {
    private String type;
    private String model;
    private String brand;
    private String color;
    private int piece;
    private String purchase;
    private String sale;

    public TableData2(String type, String model, String brand, String color, int piece, String purchase, String sale) {
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.piece = piece;
        this.purchase = purchase;
        this.sale = sale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
