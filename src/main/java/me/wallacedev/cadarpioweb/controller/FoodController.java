/**
 * A anotação @RequestMapping faz o mapeamento do caminho base para a classe,
 * neste caso "food".
 * A anotação @GetMapping indica que, quando o caminho "/get" for acessado
 * através de uma solicitação GET, o método anotado será chamado.
 */
package me.wallacedev.cadarpioweb.controller;

import me.wallacedev.cadarpioweb.food.FoodRepository;
import me.wallacedev.cadarpioweb.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("food")
public class FoodController {
    /**
     * precisamos usar auto wired quando e necessário injetar dependências o que isso quer dizer por exemplo na minha classe food controller
     *preciso fazer o método getAll com o food repository que estende de uma biblioteca JpaRepository que ja contem métodos proprio
     * posso apenas declarando ela e usar os métodos que aquela interface ja me da
     *  O FoodRepository é usado para realizar operações CRUD no banco de dados.
     */
    @Autowired
    private FoodRepository repository;


    @GetMapping
    public List<FoodResponseDTO> getAll(){

        // O método findAll do repositório retorna uma lista de entidades Food.
        //o nosso repositório esta retornando uma entidade do tipo food precisamos transformar este dado.
        //nos usamos o método stream que e como se fosse um funil e todo objeto que cair dentro do funil a gente transfere para o tipo de dados correto.
        List<FoodResponseDTO> foodList = repository.findAll().stream()

                .map(FoodResponseDTO::new )//map(FoodResponseDTO::new): Aplica a transformação onde cada entidade Food é convertida em um FoodResponseDTO.


                .toList();//toList(): Coleta os resultados transformados em uma nova lista de FoodResponseDTO.


        return foodList;

    }

}
