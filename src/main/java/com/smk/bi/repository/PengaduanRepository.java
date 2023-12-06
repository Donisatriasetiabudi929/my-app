package com.smk.bi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smk.bi.model.Pengaduan;

public interface PengaduanRepository extends JpaRepository<Pengaduan, Long> {
    List<Pengaduan> findByNik(String nik);
}
