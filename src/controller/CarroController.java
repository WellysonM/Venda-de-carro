/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CarroDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Carro;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @Wellyson
 */
public class CarroController {

    private Carro carro;
    private List<Carro> carros;
    private CarroDAO dao;

    public CarroController() throws Exception {
        dao = new CarroDAO();
        novo();
        carros = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }

    private void pesquisar() throws Exception {
        carros.clear();
        carros.addAll(dao.findAlll());
    }

    public void inserirCarro() throws Exception {
        if (dao.add(carro) == true) {
            JOptionPane.showMessageDialog(null, "O Carro foi cadastrar com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel cadastrar o Carro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizarCarro() throws Exception {
        if (carro.getMarca().isEmpty() || carro.getModelo().isEmpty() || carro.getId() == 0) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel atualizar o Carro!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (dao.update(carro) == true) {
                JOptionPane.showMessageDialog(null, "O Carro foi atualizado com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
                pesquisar();
            }
           // JOptionPane.showMessageDialog(null, "Erro, não foi possivel atualizar o Carro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void removerCarro() throws Exception {
        if (carro.getId() != 0) {
            dao.delete(carro.getId());
            pesquisar();
            JOptionPane.showMessageDialog(null, "O Carro foi excluido com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel excluir o Carro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listarCarros() throws Exception {
        carros = dao.findAll();
    }

    public void listarCarrosD() throws Exception {
        carros = dao.findAlll();
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    private void novo() {
        carro = new Carro();
        carros = new ArrayList<>();
    }

    public List<Carro> getCarros() {
        return carros;
    }
}
