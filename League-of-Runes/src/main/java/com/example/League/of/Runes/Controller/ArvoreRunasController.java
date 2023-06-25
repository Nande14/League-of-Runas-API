package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.NotFoundEntityException;
import com.example.League.of.Runes.model.ArvoreRunas;
import com.example.League.of.Runes.service.ArvoreRunasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/arvorerunas")
public class ArvoreRunasController {

     @Autowired
    private  ArvoreRunasService arvoreRunasService;

    @CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/create", method= RequestMethod.POST)
public ResponseEntity<ArvoreRunas> createArvoreRunas
        (@RequestBody ArvoreRunas arvoreRunas) {
    return ResponseEntity.status(HttpStatus.OK)
            .body(arvoreRunasService.createArvoreRunas(arvoreRunas));
}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/create", method={RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
public ResponseEntity<String> createArvoreRunasError(){
    String message="O método deve ser post.";
    return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);
}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/list", method=RequestMethod.GET)
public ResponseEntity<List<ArvoreRunas>> readArvoreRunas() {
    return ResponseEntity.status(HttpStatus.OK)
            .body(arvoreRunasService.getAllArvoreRunas());

}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/list", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public ResponseEntity<String> readArvoreRunasError() {
    String message="O método deve ser get.";
    return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
            .body(message);

}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/update/{arvoreRunasId}", method=RequestMethod.PUT)
public ResponseEntity<ArvoreRunas> updateArvoreRunas(
        @PathVariable(value = "arvoreRunasId") Integer id,
        @RequestBody ArvoreRunas arvoreRunas) throws ChangeSetPersister.NotFoundException, NotFoundEntityException {
    return ResponseEntity.status(HttpStatus.OK).body(arvoreRunasService.updateArvoreRunas(id, arvoreRunas));

}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/update/{arvoreRunasId}", method= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public ResponseEntity<String> updateArvoreRunasError(){
        String message="O método deve ser put.";
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);

}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/delete/{arvoreRunasId}", method=RequestMethod.DELETE)
public ResponseEntity<ArvoreRunas> deleteArvoreRunas(
        @PathVariable(value = "arvoreRunasId") Integer id) {
    arvoreRunasService.deleteArvoreRunas(id);
    return ResponseEntity.status(HttpStatus.OK).body(null);
}

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping(value="/delete/{arvoreRunasId}", method={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public ResponseEntity<String> deleteArvoreRunas(){
    String message = "O método deve ser delete.";
    return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(message);
}

    

    
}


