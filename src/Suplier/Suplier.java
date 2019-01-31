package Suplier;

public class Suplier {
    String idSuplier;
    String namaSuplier;
    String alamat;
    String telpon;

    public String getIdSuplier() {
        return idSuplier;
    }

    public void setIdSuplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public String getNamaSuplier() {
        return namaSuplier;
    }

    public void setNamaSuplier(String namaSuplier) {
        this.namaSuplier = namaSuplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
    
    public Suplier(){
    }
    
    public Suplier(String idSuplier, String namaSuplier, String alamat, String telpon){
        this.idSuplier = idSuplier;
        this.namaSuplier = namaSuplier;
        this.alamat = alamat;
        this.telpon = telpon;
    }
            
    
}
