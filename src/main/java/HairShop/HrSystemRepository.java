package HairShop;

import org.springframework.data.repository.CrudRepository;

public interface HrSystemRepository extends CrudRepository<HrSystem, Integer> {
    void findByName(String stylistName);
}
