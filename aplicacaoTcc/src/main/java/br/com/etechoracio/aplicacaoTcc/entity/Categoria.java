package br.com.etechoracio.aplicacaoTcc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;

    @Column(name = "NOME_CATEGORIA")
    private String nomeCategoria;

    @ManyToOne
    @JoinColumn(name = "ID_SERVICO")
    private Servico idServico;

    @ManyToMany(mappedBy = "categorias")
    private List<Prestador> prestadores;


}
