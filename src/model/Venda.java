/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wellyson
 */
public class Venda {
    private int id;
    private String data;
    private int cliente_id;
    private int id_movel;
    private String tipo;
    private String status;
    
    public Venda(){
    }

    public Venda(String data, int cliente_id, int id_movel, String tipo, String status) {
        this.data = data;
        this.cliente_id = cliente_id;
        this.id_movel = id_movel;
        this.tipo = tipo;
        this.status = status;
    }

    public Venda(int id, String data, int cliente_id, int id_movel, String tipo, String status) {
        this.id = id;
        this.data = data;
        this.cliente_id = cliente_id;
        this.id_movel = id_movel;
        this.tipo = tipo;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getId_movel() {
        return id_movel;
    }

    public void setId_movel(int id_movel) {
        this.id_movel = id_movel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
