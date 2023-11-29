package com.portfolio.dev.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visitas")
public class VisitasController {

//    private final PerfilRepository perfilRepository;
//
//    private final PerfilService perfilService;
//
//    @GetMapping
//    public ResponseEntity<?> getAll() {
//        if (perfilService.findAll().size() > 0) {
//            return ResponseEntity.ok(perfilService.findAll());
//        }
//        throw new BadRequestException("ERROR: Nenhum perfil foi encontrado.");
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<?> getById(@PathVariable Long id) {
//        return ResponseEntity.ok(perfilService.findById(id).orElseThrow(() -> {
//            throw new NotFoundException("ERROR: ID não encontrado ou não existe.");
//        }));
//    }
//
//    @PostMapping
//    public ResponseEntity<?> registerPerfil(@RequestBody Perfil perfil) {
//        if (perfil.getId() == null && !perfilService.existById(perfil)) {
//            Perfil newPerfil = perfilService.createPerfil(perfil);
//            return ResponseEntity.created(URI.create("/perfis/" + newPerfil.getId())).build();
//        }
//        throw new ConflictException("ERROR: perfil já está criado.");
//    }
//
//    @PutMapping
//    public ResponseEntity<?> attPerfil(@RequestBody @Valid Perfil perfil) {
//        if (perfil.getId() != null && perfilService.existById(perfil)) {
//            try {
//                perfilService.createPerfil(perfil);
//                return ResponseEntity.ok("Perfil Atualizado");
//            } catch (Exception validationException) {
//                validationException.printStackTrace();
//                throw new BadRequestException("ERROR: Dados inseridos estão incorretos (" + validationException.getMessage() + ")");
//            }
//        }
//        throw new NotFoundException("ERROR perfil não existe");
//    }
//
//    @DeleteMapping(path = {"/{id}"})
//    public ResponseEntity<?> deletePerfil(@PathVariable Long id) {
//        if (perfilRepository.existsById(id)) {
//            perfilRepository.deleteById(id);
//            return ResponseEntity.ok("Excluído com sucesso!");
//        }
//        throw new NotFoundException("ERROR: ID invalido");
//    }



}
