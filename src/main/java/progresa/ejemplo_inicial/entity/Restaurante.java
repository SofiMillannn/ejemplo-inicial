package progresa.ejemplo_inicial.entity;


import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity //para decirle a la clase que es la entidad
@Table(name = "restaurante")
@Getter
@Setter
@NoArgsConstructor

public class Restaurante {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //pa crear columnas en la tabla Restaurante de la base de datos
    private Long id;
    @Column(name = "nombre")
    private String nombre;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "restaurante")
//    private Set<Imagen> imagenes;
//    @ManyToOne
//    @JoinColumn(name = "categoria_id", nullable = false)
//    private Categoria categoria;
//    @OneToOne
//    @JoinColumn(name = "restaurante_id")
//    @PrimaryKeyJoinColumn// con este las dos tablas comparten clave primaria
//    private Direccion direccion;
}
