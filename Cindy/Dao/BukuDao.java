/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cindy.Dao;
import Cindy.model.Buku;
import java.util.List;
import Cindy.model.Buku;
/**
 *
 * @author LENOVO
 */
public interface BukuDao {
    Buku save (Buku buku);
    void update(int index,Buku buku);
    void delete (int index); 
    Buku getBuku (int index);
    List <Buku> getAllBuku ();
}
