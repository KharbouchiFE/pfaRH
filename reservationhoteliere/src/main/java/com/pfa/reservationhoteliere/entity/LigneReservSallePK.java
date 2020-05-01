package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LigneReservSallePK implements Serializable {
	@Column(name = "salle")
	private int salle;
	@Column(name = "reservation")
	private int reservation;

	public LigneReservSallePK() {
		super();
	}

	public LigneReservSallePK(int salle, int reservation) {
		super();
		this.salle = salle;
		this.reservation = reservation;
	}

	public int getSalle() {
		return salle;
	}

	public void setSalle(int salle) {
		this.salle = salle;
	}

	public int getReservation() {
		return reservation;
	}

	public void setReservation(int reservation) {
		this.reservation = reservation;
	}

}
