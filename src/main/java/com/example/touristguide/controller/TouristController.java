package com.example.touristguide.controller;

import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.service.TouristService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "attractions")
public class TouristController {

    private TouristService touristService;

    public TouristController(){
        this.touristService = new TouristService();
    }

    @GetMapping(path = "tivoli")
    public ResponseEntity<List<TouristAttraction>> getAttractions(){
        List touristAttractions = touristService.getAttractions();

        return new ResponseEntity<List<TouristAttraction>>(touristAttractions, HttpStatus.OK);
    }

    @GetMapping(path = "tivoli/{id}")
    public ResponseEntity<String> getAttraction(@PathVariable int id){
        TouristAttraction touristAttraction = touristService.getTouristAttraction(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "text/html");

        return new ResponseEntity<String>("<html><body><h1>" + touristAttraction + "</h1></body></html>", responseHeaders, HttpStatus.OK);
    }

    @PostMapping(path = "tivoli/opret")
    public ResponseEntity<TouristAttraction> postAttraction(@RequestBody TouristAttraction touristAttraction){
        TouristAttraction returnTouristAttraction = touristService.postNewAttraction(touristAttraction);
        return new ResponseEntity<TouristAttraction>(returnTouristAttraction, HttpStatus.OK);
    }

    @PutMapping(path = "tivoli/ret")
    public ResponseEntity<TouristAttraction> putAttraction(@RequestBody TouristAttraction touristAttraction){
       TouristAttraction returnTouristAttraction =
    }
}
