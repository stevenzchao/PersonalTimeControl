package com.example.demo.pageable.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Monster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long ID;
	
	@Column
	private String name;
	
	@Column
	private String color;
	
	@Column
	private String height;
	
	@Column
	private String weught;
	
	@Column
	private String maxMp;
	
	@Column
	private String mp;
	
	@OneToMany(mappedBy ="monster",cascade = CascadeType.ALL)
	private List<Move> moves;
	
	
}
