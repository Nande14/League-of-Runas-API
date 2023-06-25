package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.NotFoundEntityException;
import com.example.League.of.Runes.model.Campeoes;
import com.example.League.of.Runes.service.CampeoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/campeoes")
public class CampeoesController {

    @Autowired
    private CampeoesService campeoesService;

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/create", method=RequestMethod.POST)
    public ResponseEntity<Campeoes> createCampeoes(@RequestBody Campeoes campeoes) {
        return ResponseEntity.status(HttpStatus.OK).body(campeoesService.createCampeoes(campeoes));
    }

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/create", method={RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
    public ResponseEntity<String> createCampeoesError() {
        String message = "O método deve ser post.";
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);
    }

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ResponseEntity<List<Campeoes>> readCampeoes() {
        return ResponseEntity.status(HttpStatus.OK).body(campeoesService.getAllCampeoes());
    }

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/list", method={RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    public ResponseEntity<String> readCampeoesError() {
        String message = "O método deve ser get.";
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);
    }

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/update/{campeoesId}", method=RequestMethod.PUT)
    public ResponseEntity<Campeoes> updateCampeoes(
            @PathVariable(value = "campeoesId") Integer id,
            @RequestBody Campeoes campeoes) throws ChangeSetPersister.NotFoundException, NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(campeoesService.updateCampeoes(id, campeoes));
    }

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/update/{campeoesId}", method={RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
    public ResponseEntity<String> updateCampeoesError(){
        String message = "O método deve ser put.";
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);
    }

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/delete/{campeoesId}", method=RequestMethod.DELETE)
    public ResponseEntity<Campeoes> deleteCampeoes(
            @PathVariable(value = "campeoesId") Integer id) throws NotFoundEntityException {
        campeoesService.deleteCampeoes(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @CrossOrigin(origins="*", allowedHeaders="*")
    @RequestMapping(value="/delete/{campeoesId}", method={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<String> deleteCampeoesError(){
        String message = "O método deve ser delete.";
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);
    }
}


