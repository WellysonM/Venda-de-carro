/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import org.jdesktop.observablecollections.ObservableCollections;

public class ClienteController {

    private Cliente cliente;
    private List<Cliente> clientes;
    private ClienteDAO dao;

    public ClienteController() throws Exception {
        dao = new ClienteDAO();
        clientes = ObservableCollections.observableList(new ArrayList<>());
        novo();
        pesquisar();
    }

    private void pesquisar() throws Exception {
        clientes.clear();
        clientes.addAll(dao.findAlll());
    }

    public void inserirCliente() throws Exception {
        if (dao.add(cliente) == true) {
            JOptionPane.showMessageDialog(null, "O Cliente foi cadastrar com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel cadastrar o Cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void removerCliente() throws Exception {
        if (cliente.getId() != 0) {
            dao.delete(cliente.getId());
            JOptionPane.showMessageDialog(null, "O Cliente foi excluido com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
            pesquisar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel excluir o Cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listarClientes() throws Exception {
        clientes = dao.findAll();
    }

    public void atualizarCliente() throws Exception {
        if (cliente.getCpf().isEmpty() || cliente.getNome().isEmpty() || cliente.getId() == 0) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possivel atualizar o Cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (dao.update(cliente)) {
                JOptionPane.showMessageDialog(null, "O Cliente foi atualizado com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
                pesquisar();
            }
            //JOptionPane.showMessageDialog(null, "Erro, não foi possivel atualizar o Carro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private void novo() {
        cliente = new Cliente();
        clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
