package com.projetoA3.servico_usuarios.repository;

import com.projetoA3.servico_usuarios.entity.UsuarioOmitido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioOmitidoRepositorio extends JpaRepository<UsuarioOmitido, Long> {
}
