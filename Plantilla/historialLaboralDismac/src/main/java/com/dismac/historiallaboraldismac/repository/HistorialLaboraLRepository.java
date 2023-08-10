package com.dismac.historiallaboraldismac.repository;

import com.dismac.historiallaboraldismac.model.HistorialLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistorialLaboraLRepository extends JpaRepository<HistorialLaboral,Long> {

    List<HistorialLaboral> findAllByIdEmpleado(long id);

}
