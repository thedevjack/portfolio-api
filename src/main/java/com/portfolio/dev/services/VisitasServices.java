package com.portfolio.dev.services;


import com.portfolio.dev.model.Visitas;
import com.portfolio.dev.repository.VisitasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VisitasServices {

    private final VisitasRepository visitasRepository;


    public List<Visitas> findAll(){
        List<Visitas> getAll = visitasRepository.findAll();
        return getAll;
    }

    public Optional<Visitas> findById(Long id) {
        Optional<Visitas> getId = visitasRepository.findById(id);
        return getId;
    }

    public Visitas createPerfil(Visitas visitas) {
        Visitas newPerfil = visitasRepository.save(visitas);
        return newPerfil;
    }

//    public boolean existById(Visitas visitas) {
//        boolean existPerfil = visitasRepository.existsById(visitas.getId());
//        return existPerfil;
//    }


}
