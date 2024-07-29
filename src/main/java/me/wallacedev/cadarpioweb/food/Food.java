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
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "foods")
@Entity(name = "foods")

/**
 * @Getter: Gera automaticamente os métodos getters para todos os campos.
 * @NoArgsConstructor: Gera um construtor sem argumentos.
 * @AllArgsConstructor: Gera um construtor com todos os argumentos.
 * @EqualsAndHashCode(of = "id"): a anotação e apena para sinalizar que o id e a representação unica de food
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String title;
    private Integer price;

    public Food (FoodRequestDTO data ){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
