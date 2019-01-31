package Barang;

import javax.swing.JTable;

public interface BarangInterface {
    
    public void read(JTable jTable);
    public void create(Barang barang);
    public void update(int id, Barang barang);
    public void delete(int id);
    public void find(JTable jTable, String key);
}
