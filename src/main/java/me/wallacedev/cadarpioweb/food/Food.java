/**
 * A classe Entity representa uma tabela no banco de dados relacional.
 * Ela é responsável por mapear todas as colunas da tabela transformando em um objeto Java,
 * permitindo que possamos acessar e manipular os dados da tabela diretamente pelo código.
 * Por exemplo, podemos usar uma query como "SELECT * FROM food" ou "SELECT title, price, image FROM food".
 */
package me.wallacedev.cadarpioweb.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Table (name = "foods")
@Entity(name = "foods")
public class Food {
    @id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String title;
    private Integer price;
}
