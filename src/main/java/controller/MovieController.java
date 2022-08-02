package controller;

import Model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @GetMapping(value="/listMovies")
    public List<String> getMovies(){
        List<String> movies = new ArrayList<>();
        movies.add("Capitán America");
        movies.add("Iron man");
        movies.add("Los vengadores");
        movies.add("Thor");
        movies.add("Guardianes de la galaxia");
        return movies;
    }

    @GetMapping("getMovieById/{id}")
    public Movie getMovieById(@PathVariable String id){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("1","Capitán America", "Accion"));
        movies.add(new Movie("2","Iron man", "Accion"));
        movies.add(new Movie("3","Los vengadores", "Accion"));
        movies.add(new Movie("4","Thor", "Accion"));
        movies.add(new Movie("5","Guardianes de la galaxia", "Accion"));

        for(Movie movie : movies){
            if(id.equals(movie.getId())){
                return movie;
            }
        }
        return null;
    }

    @PostMapping("/postWelcomeMovies")
    public String postMovies(@RequestBody String name){
        return "Bienvenido " + name + " a la cartelera de peliculas" ;
    }
}
