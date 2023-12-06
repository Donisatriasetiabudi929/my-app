package com.smk.bi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smk.bi.model.Masyarakat;

public interface MasyarakatRepository extends JpaRepository<Masyarakat, Long> {

    Masyarakat findByUsername(String username);

    Masyarakat findByNik(String nik);

}
