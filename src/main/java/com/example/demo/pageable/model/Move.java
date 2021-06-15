package com.example.demo.pageable.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Entity
@Table
public class Move {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long ID;
	
	@Column
	private String moveName;
	
	@Column
	private String mpConsume;
	
	@Column
	private String attackPower;
	
	@Transient
	private Integer fk_MonsterId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Monster monster;

}
