package com.projets.login.register.expenseTracker.service;

import com.projets.login.register.expenseTracker.controller.dto.UsuarioRegistroDTO;
import com.projets.login.register.expenseTracker.models.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


    public interface UsuarioServicio extends UserDetailsService {

        public Usuario guardar(UsuarioRegistroDTO registroDTO);

        public List<Usuario> listarUsuarios();

    }

