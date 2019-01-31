
package Suplier;

import javax.swing.JTable;

public interface SuplierInterface {
 
    public void read(JTable jTable);
    public void create(Suplier barang);
    public void update(int id, Suplier barang);
    public void delete(int id);
    public void find(JTable jTable, String key);
}
