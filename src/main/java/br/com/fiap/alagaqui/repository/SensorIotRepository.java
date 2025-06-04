package br.com.fiap.alagaqui.repository;

import br.com.fiap.alagaqui.entity.SensorIot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorIotRepository extends JpaRepository<SensorIot, Long> {
}
