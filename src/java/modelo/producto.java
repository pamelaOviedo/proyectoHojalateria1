/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class producto {
    int id;
    int idcategoria;
    String nchapa;
    String colorfabricaoartesanal;
    String canaleta;
    int medidas;
    int precios;

    public producto() {
        
        
        
    }

    public producto(int idproducto, String nchapa, String colorfabricaoartesanal, String canaleta, int medidas, int precios) {
        this.id=id;
        this.idcategoria = idproducto;
        this.nchapa = nchapa;
        this.colorfabricaoartesanal = colorfabricaoartesanal;
        this.canaleta = canaleta;
        this.medidas = medidas;
        this.precios = precios;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getidcategoria() {
        return idcategoria;
    }

    public void setidcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getnchapa() {
        return nchapa;
    }

    public void setnchapa(String nchapa) {
        this.nchapa = nchapa;
    }

    public String getcolorfabricaoartesanal() {
        return colorfabricaoartesanal;
    }

    public void setcolorfabricaoartesanal(String colorfabricaoartesanal) {
        this.colorfabricaoartesanal = colorfabricaoartesanal;
    }

    public String getcanaleta() {
        return canaleta;
    }

    public void setcanaleta(String canaleta) {
        this.canaleta = canaleta;
    }

    public int getmedidas() {
        return medidas;
    }

    public void setmedidas(int medidas) {
        this.medidas = medidas;
    }

    public int getprecios() {
        return precios;
    }

    public void setprecios(int precios) {
        this.precios = precios;
  

    }
}