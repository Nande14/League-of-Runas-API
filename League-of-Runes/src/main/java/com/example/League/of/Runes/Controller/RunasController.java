package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.NotFoundEntityException;
import com.example.League.of.Runes.model.Runas;
import com.example.League.of.Runes.service.RunasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/runas")
public class RunasController {
    @Autowired
private RunasService runasService;

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/create", method= RequestMethod.POST)
public ResponseEntity<Runas> createRunas
        (@RequestBody Runas runas) {
    return ResponseEntity.status(HttpStatus.OK)
            .body(runasService.createRunas(runas));
}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/create", method= {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
public ResponseEntity<String> createRunasError() {
    String message = "O método deve ser post.";
    return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
            .body(message);
}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/list", method=RequestMethod.GET)
public ResponseEntity<List<Runas>> readRunas() {
    return ResponseEntity.status(HttpStatus.OK)
            .body(runasService.getAllRunas());
}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/list", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public ResponseEntity<String> readRunasError() {
    String message = "O método deve ser get.";
    return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
            .body(message);
}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/update/{runasId}", method=RequestMethod.PUT)
public ResponseEntity<Runas> updateRunas(
        @PathVariable(value = "runasId") Integer id,
        @RequestBody Runas runas) throws ChangeSetPersister.NotFoundException, NotFoundEntityException {
    return ResponseEntity.status(HttpStatus.OK).body(runasService.updateRunas(id, runas));

}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/update/{runasId}", method= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public ResponseEntity<String> updateRunasError() {
    String message = "O método deve ser put.";
    return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);

}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/delete/{runasId}", method=RequestMethod.DELETE)
public ResponseEntity<Runas> deleteRunas(
        @PathVariable(value = "runasId") Integer id) {
    runasService.deleteRunas(id);
    return ResponseEntity.status(HttpStatus.OK).body(null);
}  


}