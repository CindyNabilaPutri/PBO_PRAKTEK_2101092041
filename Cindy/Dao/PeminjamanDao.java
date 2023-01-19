/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cindy.Dao;
import Cindy.model.Peminjaman;
import java.util.List;
import Cindy.Dao.AnggotaDao;
import Cindy.Dao.BukuDao;
/**
 *
 * @author LENOVO
 */
public interface PeminjamanDao {
    Peminjaman save (Peminjaman peminjaman);
    Peminjaman update (int index,Peminjaman peminjaman);
    Peminjaman delete (int index);
    Peminjaman getPeminjaman (int index);
    List <Peminjaman> getAllPeminjaman ();
}
