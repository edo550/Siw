package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name= "findAllCorsi", query="SELECT c FROM Corso c")
public class Corso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(length=2000)
	private String nome;
	
	@Column(nullable = false)
	private LocalDate dataDiInizio;
	private int durataInMesi;
	
	@OneToMany(mappedBy="corsi")
	private List<Allievo> allievi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Docente docente;
	
	public Corso()
	{}	
	
	public Corso(String nome, LocalDate dataDiInizio, int durataInMesi) {
		this.nome = nome;
		this.dataDiInizio = dataDiInizio;
		this.durataInMesi = durataInMesi;
	}
	
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public int getDurataInMesi() {
		return this.durataInMesi;
	}

	public void setDurataInMesi(int durataInMesi) {
		this.durataInMesi = durataInMesi;
	}
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }



	@Override
	public boolean equals(Object obj) {
		Corso corso = (Corso) obj;
		return this.getId().equals(corso.getId());
	}
	
	public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Corso");
        sb.append("{id=").append(id);
        sb.append(", nome='").append(nome);
        sb.append(", dataDiInizio=").append(dataDiInizio);
        sb.append(", durataInMesi='").append(durataInMesi);
        sb.append("}\n");
        return sb.toString();
    }
    
}
