package it.uniroma3.siw.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Allievo {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matricola;	
    
    @Column(nullable = false)
    private String nome;
    private String cognome;
    private LocalDateTime dataDiNascita;
    private String luogoDiNascita;
    private String email;
    
    @OneToMany (fetch = FetchType.LAZY)
	private Corso corsi;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Societa societa;
}
