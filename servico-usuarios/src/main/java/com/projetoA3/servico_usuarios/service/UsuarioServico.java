package com.projetoA3.servico_usuarios.service;

import com.projetoA3.servico_usuarios.dto.UsuarioDTO;
import com.projetoA3.servico_usuarios.dto.HorarioHabitualDTO;
import com.projetoA3.servico_usuarios.entity.HistoricoUsuario;
import com.projetoA3.servico_usuarios.entity.UsuarioOmitido;
import com.projetoA3.servico_usuarios.entity.Usuarios;
import com.projetoA3.servico_usuarios.entity.Transacao;

import java.util.List;
import java.util.Optional;

/**
 * Esta é a INTERFACE. 
 * Ela deve listar TODOS os métodos que a sua classe UsuarioServicoImpl implementa.
 * Se algum método estiver em falta aqui, o projeto não compila.
 */
public interface UsuarioServico {

    Usuarios criarUsuario(Usuarios usuario);
    
    List<Usuarios> listarTodos();
    
    List<HistoricoUsuario> listarHistorico(Long id);
    
    Optional<Usuarios> atualizarUsuario(Long id, UsuarioDTO usuarioDTO);
    
    boolean omitirUsuario(Long id);
    
    List<UsuarioOmitido> listarOmitidos();

    void atualizarPadroesUsuario(Usuarios usuario, Transacao novaTransacao);

    Usuarios definirHorarioHabitual(String emailUsuarioLogado, HorarioHabitualDTO horarioDTO);
}
