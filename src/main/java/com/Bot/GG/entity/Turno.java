package com.Bot.GG.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="turnos")
public class Turno {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @ManyToOne @JoinColumn(name="id_usuario") private Usuario usuario;
  @ManyToOne @JoinColumn(name="id_servicio") private Servicio servicio;
  @ManyToOne @JoinColumn(name="id_profesional") private Profesional profesional;
  private LocalDate fecha;
  private LocalTime hora;
  @Enumerated(EnumType.STRING)
  private EstadoTurno estado = EstadoTurno.pendiente;
  public enum EstadoTurno { pendiente, confirmado, cancelado }
  // Getters y setters
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
public Servicio getServicio() {
	return servicio;
}
public void setServicio(Servicio servicio) {
	this.servicio = servicio;
}
public Profesional getProfesional() {
	return profesional;
}
public void setProfesional(Profesional profesional) {
	this.profesional = profesional;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public LocalTime getHora() {
	return hora;
}
public void setHora(LocalTime hora) {
	this.hora = hora;
}
public EstadoTurno getEstado() {
	return estado;
}
public void setEstado(EstadoTurno estado) {
	this.estado = estado;
}
  
}
