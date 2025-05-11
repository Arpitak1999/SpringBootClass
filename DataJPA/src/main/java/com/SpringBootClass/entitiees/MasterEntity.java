package com.SpringBootClass.entitiees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="CONTACT")


public class MasterEntity {

	@Id
	@Column(name="CONTACT_ID")
	private Integer contactId;

	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_NUMBER", length = 100)
	private Long contactNum;
	


}
