package br.com.petadota.entity;

import jakarta.persistence.*; 
import lombok.Data; 

@Entity 
@Table(name = "animais") 
@Data 
public class Animal {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false) 
    private String nome;

    @Column(nullable = false)
    private String tipo;

    private int idade;

    private String raca;

    @Enumerated(EnumType.STRING) 
    @Column(name = "status_adocao", nullable = false)
    private StatusAdocao status;

    @Column(length = 512) 
    private String descricao;
    
    private String imagemUrl;
}