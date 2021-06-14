package com.example.demo.basic1.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.example.demo.commonmodel.UserAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Component
@Table(name="incident")
public class Incident {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="incidentID")
	private Integer incidentID;
	
	@Column(name="incidentName")
	private String incidentName;
	
	@Column(name="incidentDate")
	private Date incidentDate;
	
	@Column(name="progress")
	private boolean progress;
	
	@Column(name="fk_userAccount")
	@Transient
	private Integer fk_userAccount;
	
//	@Column(name="fk_sonIncidentsList")
//	private Integer fk_sonIncidentsList;
	
	@ManyToOne
	@JsonIgnore
	private UserAccount userAccount;
	
}
