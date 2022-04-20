package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;

public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String luogoDiNascita;
	private int partitaIva;
	
	@ManyToMany(mappedBy="docente")
	private List<Corso> corsi;
	
}   
