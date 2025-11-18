package com.projetoA3.servico_fraude.entity;

public enum TransacaoStatus {
    PENDING,   // Aguardando confirmação do usuário
    COMPLETED, // Aprovada (seja direto ou após confirmação)
    DENIED     // Negada pelo usuário
}