package com.cadastroclientespring.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "sq_cliente", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;
    @Column(name = "CPF", nullable = false, unique = true)
    private Long cpf;
    @Column(name = "RG", nullable = false)
    private Long rg;
    @Column(name = "TELEFONE", nullable = false)
    private Long telefone;
    @Column(name = "ENDERECO", nullable = false, length = 100)
    private String endereco;
    @Column(name = "NUMERO", nullable = false)
    private Integer numero;
    @Column(name = "CIDADE", nullable = false, length = 100)
    private String cidade;
    @Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;

}
