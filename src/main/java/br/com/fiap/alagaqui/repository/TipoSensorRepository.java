package br.com.fiap.alagaqui.repository;

import br.com.fiap.alagaqui.entity.TipoSensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSensorRepository extends JpaRepository<TipoSensor, Long> {
}
