package com.portfolio.dev.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "portfolio", schema = "portfolio")
public class Visitas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(columnDefinition = "bigserial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "ERROR: Nome esta em branco.")
    @Column(length = 30, nullable = false)
    private String nome;

    @NotBlank(message = "ERROR: e-mail esta em branco.")
    @Column(length = 45, nullable = false)
    private String email;

    @NotBlank(message = "ERROR: url esta em branco.")
    @Column(name = "url_github", nullable = false)
    private String url;




}
