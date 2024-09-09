package com.pandevs.pandevs.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_order")
	private Long id;
	@Column(name = "fecha_orden", length = 16, nullable = false, unique = false)
	private Date fechaDePedido;
	@Column(name = "total", length = 10, nullable = false, unique = false)
	private BigDecimal total;
	@Column(name = "estatus", length = 16, nullable = false, unique = false)
	private OrderStatus estatus;
	@Column(name = "factura", nullable = false, unique = false)
	private byte[] factura;
	
	// Definir las relaciones entre las entidades ( N : 1 ) 
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	public Order() {
	}

	public Order(Long id, Date fechaDePedido, BigDecimal total, OrderStatus estatus, byte[] factura) {
		this.id = id;
		this.fechaDePedido = fechaDePedido;
		this.total = total;
		this.estatus = estatus;
		this.factura = factura;
	}
	
}
