package it.uniroma3.siw.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Societa {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ragioneSociale;
    
    @Column(nullable = false)
    private String via;
    private int numeroCivico;
    private String comune;
    private int cap;
    private String provincia;
    private int numeroDiTelefono;
  

}
