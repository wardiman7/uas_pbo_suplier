package Barang;

import Config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BarangService implements BarangInterface {

    String sql = "";
    private DefaultTableModel dtm;
    
    Koneksi koneksi = new Koneksi();
    PreparedStatement ps;
    ResultSet rs;
    
    
    @Override
    public void read(JTable jTable) {
        String kolom[]={"ID", "NAMA BARANG", "HARGA", "STOK"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM barang";
        try{
            rs = koneksi.getStm().executeQuery(sql);
            while (rs.next()){
            Object o[]=new Object[4];
            o[0] = rs.getString("id_barang");
            o[1] = rs.getString("nm_barang");
            o[2] = rs.getString("harga_barang");
            o[3] = rs.getString("stok");
            dtm.addRow(o);
            }
            jTable.setModel(dtm);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }

    @Override
    public void create(Barang barang) {
        sql = "insert into barang values(?,?,?,?)";
        try{
            ps = koneksi.getKon().prepareStatement(sql);
            ps.setString(1, barang.getIdBarang());
            ps.setString(2, barang.getNamaBarang());
            ps.setDouble(3, barang.getHarga());
            ps.setInt(4, barang.getStok());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void update(int id, Barang barang) {
    
    }

    @Override
    public void delete(int id) {
    sql = "delete from barang where id_barang = ?";
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
