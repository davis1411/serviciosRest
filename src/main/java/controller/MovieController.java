package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
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
}
