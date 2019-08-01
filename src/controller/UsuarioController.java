/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Wellyson
 */
public class UsuarioController {

    private Usuario usuario;
    private UsuarioDAO dao;
    private List<Usuario> usuarios;

    public boolean login() throws Exception {
      return dao.login(usuario); 
    };

    public void inserir() throws Exception {
        dao.add(usuario);
        pesquisar();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public UsuarioController() throws Exception {
        usuario = new Usuario();
        dao = new UsuarioDAO();
        usuarios = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }

    private void pesquisar() throws Exception {
        usuarios.clear();
        usuarios.addAll(dao.findAll());
    }

}
