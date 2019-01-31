
package Suplier;

import Config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SuplierService implements SuplierInterface{
    
    String sql = "";
    private DefaultTableModel dtm;
    
    Koneksi koneksi = new Koneksi();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void read(JTable jTable) {
        String kolom[]={"ID", "NAMA SUPLIER", "ALAMAT", "TELPON"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM suplier";
        try{
            rs = koneksi.getStm().executeQuery(sql);
            while (rs.next()){
            Object o[]=new Object[4];
            o[0] = rs.getString("id_suplier");
            o[1] = rs.getString("nm_suplier");
            o[2] = rs.getString("alamat");
            o[3] = rs.getString("no_hp");
            dtm.addRow(o);
            }
            jTable.setModel(dtm);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }

    @Override
    public void create(Suplier suplier) {
    sql = "insert into suplier values(?,?,?,?)";
        try{
            ps = koneksi.getKon().prepareStatement(sql);
            ps.setString(1, suplier.getIdSuplier());
            ps.setString(2, suplier.getNamaSuplier());
            ps.setString(3, suplier.getAlamat());
            ps.setString(4, suplier.getTelpon());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void update(int id, Suplier suplier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        sql = "delete from suplier where id_suplier = ?";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
