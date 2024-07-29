/** Em geral, um DTO é uma representação simplificada de uma entidade, contendo apenas os campos necessários
 * para uma determinada operação. O objetivo principal de usar um DTO é
 * Encapsulamento de Dados: Proteger a entidade original e expor apenas os campos necessários
 */


package me.wallacedev.cadarpioweb.food;

public record FoodResponseDTO(Long id,String title,String image,Integer price){


    public FoodResponseDTO(Food food){
        this(food.getId(),food.getTitle(), food.getImage(), food.getPrice());
    }
}
