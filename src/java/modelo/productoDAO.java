/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class productoDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    //OPERACIONES CRUD LISTAR AGREGAR ACTUALIZAR BORRAR
    public List listar() {
        String sql = "select * from producto";
        List<producto> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                producto pro = new producto();
                pro.setid(rs.getInt(1));
                pro.setidcategoria(rs.getInt(2));
                pro.setnchapa(rs.getString(3));
                pro.setcolorfabricaoartesanal(rs.getString(4));
                pro.setcanaleta(rs.getString(5));
                pro.setmedidas(rs.getInt(6));
                pro.setprecios(rs.getInt(7));
                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public producto listarId(int id) {
        producto pro = new producto();
        String sql = "select * from producto where id=" + id;

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                pro.setidcategoria(rs.getInt(2));
                pro.setnchapa(rs.getString(3));
                pro.setcolorfabricaoartesanal(rs.getString(4));
                pro.setcanaleta(rs.getString(5));
                pro.setmedidas(rs.getInt(6));
                pro.setprecios(rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return pro;
    }

    public void agregar(producto pro) {
        String sql = "insert into producto(id, idcategoria, nchapa,colorfabricaoartesanal,canaleta,medidas,precios)values(?,?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getid());
            ps.setInt(2, pro.getidcategoria());
            ps.setString(3, pro.getnchapa());
            ps.setString(4, pro.getcolorfabricaoartesanal());
            ps.setString(5, pro.getcanaleta());
            ps.setInt(6, pro.getmedidas());
            ps.setInt(7, pro.getprecios());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public int actualizar(producto pro) {
        String sql = "update producto set  idcategoria=?, nchapa=?,colorfabricaoartesanal=?,canaleta=?,medidas=?,precios=? where id=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, pro.getidcategoria());
            ps.setString(2, pro.getnchapa());
            ps.setString(3, pro.getcolorfabricaoartesanal());
            ps.setString(4, pro.getcanaleta());
            ps.setInt(5, pro.getmedidas());
            ps.setInt(6, pro.getprecios());
            ps.setInt(7, pro.getid());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void eliminar(int id) {
        String sql = "delete from producto where id" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
