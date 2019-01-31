
package Detail;

import javax.swing.JTable;

public interface DetailInterface {

    public void read(JTable jTable);
    public void create(Detail detail);
    public void update(int id, Detail detail);
    public void delete(int id);
    public void find(JTable jTable, String key);
    
}
