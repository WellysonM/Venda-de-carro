/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VendaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Venda;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Wellyson
 */
public class VendaController {

    private Venda venda;
    private List<Venda> vendas;
    private List<Venda> vendasEfetuadas;
    private VendaDAO dao;

    public VendaController() throws Exception {
        dao = new VendaDAO();
        novo();
        vendas = ObservableCollections.observableList(new ArrayList<>());
        vendasEfetuadas = ObservableCollections.observableList(new ArrayList<>());
    }

    public void pesquisar() throws Exception {
        vendasEfetuadas.clear();
        vendasEfetuadas.addAll(dao.findAllDate());
    }

    public void pesquisarTudo() throws Exception {
        vendas.clear();
        vendas.addAll(dao.findAll());
    }

    public void inserirVenda() throws Exception {
        if (dao.add(venda) == true) {
            JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!", "Venda", JOptionPane.INFORMATION_MESSAGE);
            pesquisar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel efetuar a Venda!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizarVenda() throws Exception {
        if (venda.getData().isEmpty() || venda.getId() == 0) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel atualizar a Data da venda!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (dao.update(venda) == true) {
                pesquisar();
                JOptionPane.showMessageDialog(null, "A Data da venda foi atualizado com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
                pesquisar();
            }
            //JOptionPane.showMessageDialog(null, "Erro, não foi possivel atualizar a Data da venda!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizaStatus() throws Exception {
        if (venda.getId() != 0) {
            dao.status(venda);
            pesquisar();
            JOptionPane.showMessageDialog(null, "A Venda foi atualizada com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel atualizar a Venda!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void listarVendas() throws Exception {
        vendas = dao.findAll();
    }

    public void listarVendasD() throws Exception {
        vendas = dao.findAlll();
    }

    public void buscarVendasData() throws Exception {
        vendas = dao.findAllDate();
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void novo() {
        venda = new Venda();
        vendas = new ArrayList<>();
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public List<Venda> getVendasEfetuadas() {
        return vendasEfetuadas;
    }

    public void setVendasEfetuadas(List<Venda> vendasEfetuadas) {
        this.vendasEfetuadas = vendasEfetuadas;
    }

}
