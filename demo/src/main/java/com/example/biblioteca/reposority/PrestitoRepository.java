package com.example.biblioteca.reposority;

import com.esempio.biblioteca.entity.Prestito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrestitoRepository extends JpaRepository<Prestito, Long> {
    List<Prestito> findByUtenteNumeroTessera(String numeroTessera);
    List<Prestito> findByDataRestituzioneEffettivaIsNullAndDataRestituzionePrevistaBefore(LocalDate data);
}