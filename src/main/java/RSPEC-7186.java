import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

interface ItemRepository extends JpaRepository<Item, Long> {
    Page<Item> findItems(); // Noncompliant, no Pageable parameter
}

class Item {}
