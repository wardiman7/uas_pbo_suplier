package Detail;

public class Detail {

int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
String idBarang;
String idSuplier;
String namaBarang;
String namaSuplier;

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getIdSuplier() {
        return idSuplier;
    }

    public void setIdSuplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaSuplier() {
        return namaSuplier;
    }

    public void setNamaSuplier(String namaSuplier) {
        this.namaSuplier = namaSuplier;
    }
    
    public Detail(){
    }
    
    public Detail(int no, String idBarang, String idSuplier, String namaBarang, String namaSuplier){
        this.no = no;
        this.idBarang = idBarang;
        this.idSuplier = idSuplier;
        this.namaBarang = namaBarang;
        this.namaSuplier = namaSuplier;
        
    }
    
}
