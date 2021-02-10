package be.vdab.mail.repositories;

import be.vdab.mail.domain.Lid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

public interface LidRepository extends JpaRepository<Lid, Long> {
    @Async
    Lid save(Lid lid);
}
