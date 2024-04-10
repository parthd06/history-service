package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rokala.historyservice.model.PrimesRecord;



@Repository
public interface PrimesHistoryRepository extends CrudRepository<PrimesRecord, Integer> {

    List<PrimesRecord> findAllByCustomer(String customer);
}