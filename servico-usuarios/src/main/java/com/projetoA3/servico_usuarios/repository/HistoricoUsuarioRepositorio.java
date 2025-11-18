package com.projetoA3.servico_usuarios.repository;

import com.projetoA3.servico_usuarios.entity.HistoricoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HistoricoUsuarioRepositorio extends JpaRepository<HistoricoUsuario, Long> {

    // Método para encontrar todo o histórico de um usuário específico, ordenado pela data
    List<HistoricoUsuario> findByUsuarioIdOrderByDataModificacaoDesc(Long usuarioId);
}
