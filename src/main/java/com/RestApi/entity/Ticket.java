package com.RestApi.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tikcet_details")
public class Ticket {

	@Id
	@Column(name = "Ticket_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketId;

	@Column(name = "Trian_Num")
	private Integer trainNum;

	@Column(name = "Ticket_Pnr")
	private String ticketPnr;

	@Column(name = "Ticket_Status")
	private String ticketStatus;

}
