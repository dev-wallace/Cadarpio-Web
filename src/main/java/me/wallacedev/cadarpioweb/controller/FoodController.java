/**
 * A anotação @RequestMapping faz o mapeamento do caminho base para a classe,
 * neste caso "food".
 * A anotação @GetMapping indica que, quando o caminho "/get" for acessado
 * através de uma solicitação GET, o método anotado será chamado.
 */
package me.wallacedev.cadarpioweb.controller;
import me.wallacedev.cadarpioweb.food.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("food")
public class FoodController {


    @GetMapping
    public void getAll(){

    }

}
