package com.example.demo.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tutorial")
public class Tutorial {

@Id
@Column(name="ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(length = 128, nullable = false)
private String title;

@Column(length = 256)
private String description;

@Column(nullable = false)
private int level;

@Column
private boolean published;
}
