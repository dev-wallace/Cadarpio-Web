/**
 * A classe Repository é uma interface usada para manipular operações CRUD (Create, Read, Update, Delete).
 * Ela nos permite criar dados (Create), ler dados (Read) do banco de dados, atualizar dados (Update) e deletar dados (Delete).
 */
package me.wallacedev.cadarpioweb.food;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
