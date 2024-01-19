package com.josh.humansApp.controllers;

import com.josh.humansApp.dtos.HumanDto;
import com.josh.humansApp.entities.Human;
import com.josh.humansApp.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/humans")
public class HumanController {

    @Autowired
    HumanService humanService;

    @GetMapping("/")
    public ResponseEntity<List<HumanDto>> getAllHumans(){
        return new ResponseEntity<>(this.humanService.getAllHumans(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<HumanDto> createHuman(@RequestBody HumanDto humanDto){
        return new ResponseEntity<>(this.humanService.createHuman(humanDto),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HumanDto> updateHuman(@PathVariable long id, @RequestBody HumanDto humanDto){
        return new ResponseEntity<>(this.humanService.updateHuman(id, humanDto), HttpStatus.ACCEPTED);
    }


}
