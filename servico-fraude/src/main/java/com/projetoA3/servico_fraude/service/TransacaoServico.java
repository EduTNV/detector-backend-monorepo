package com.projetoA3.servico_fraude.service;

import com.projetoA3.servico_fraude.dto.TransacaoDTO;
import com.projetoA3.servico_fraude.dto.TransacaoResponseDTO;
import com.projetoA3.servico_fraude.dto.TransacaoViewDTO; // <-- IMPORTAR

public interface TransacaoServico {

    /**
     * Registra uma nova transação.
     * Retorna um DTO de resposta que pode indicar um status PENDENTE.
     */
    TransacaoResponseDTO registrarTransacao(TransacaoDTO transacaoDto);

    
    // --- (ASSINATURA ATUALIZADA) ---
    /**
     * Confirma uma transação que estava pendente.
     * @param transacaoId O ID da transação pendente.
     * @param emailUsuarioLogado O email do usuário autenticado (para segurança).
     * @return A transação atualizada com status COMPLETED.
     */
    TransacaoViewDTO confirmarTransacao(Long transacaoId, String emailUsuarioLogado);

    // --- (ASSINATURA ATUALIZADA) ---
    /**
     * Nega (cancela) uma transação que estava pendente.
     * @param transacaoId O ID da transação pendente.
     * @param emailUsuarioLogado O email do usuário autenticado (para segurança).
     * @return A transação atualizada com status DENIED.
     */
    TransacaoViewDTO negarTransacao(Long transacaoId, String emailUsuarioLogado);
}