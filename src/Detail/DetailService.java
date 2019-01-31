
package Detail;

import Config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DetailService implements DetailInterface {
    
        String sql = "";
    private DefaultTableModel dtm;
    
    Koneksi koneksi = new Koneksi();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void read(JTable jTable) {
        String kolom[]={"NO", "ID BARANG", "ID SUPLIER", "NAMABARANG", "NAMA SUPLIER"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM detail";
        try{
            rs = koneksi.getStm().executeQuery(sql);
            while (rs.next()){
            Object o[]=new Object[5];
            o[0] = rs.getString("no");
            o[1] = rs.getString("id_barang");
            o[2] = rs.getString("id_suplier");
            o[3] = rs.getString("nm_barang");
            o[4] = rs.getString("nm_suplier");
            dtm.addRow(o);
            }
            jTable.setModel(dtm);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }

    @Override
    public void create(Detail detail) {
        sql = "insert into detail values(?,?,?,?,?)";
        try{
            ps = koneksi.getKon().prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, detail.getIdBarang());
            ps.setString(3, detail.getIdSuplier());
            ps.setString(4, detail.getNamaBarang());
            ps.setString(5, detail.getNamaSuplier());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void update(int id, Detail detail) {

    }

    @Override
    public void delete(int id) {
        sql = "delete from detail where no = ?";
    try{
        ps = koneksi.getKon().prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    } catch (SQLException ex) {
        
    }
    }

    @Override
    public void find(JTable jTable, String key) {

    }
    
}
