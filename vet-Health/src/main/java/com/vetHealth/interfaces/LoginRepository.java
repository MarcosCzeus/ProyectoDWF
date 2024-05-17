package com.vetHealth.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vetHealth.modelo.login;
public interface LoginRepository extends JpaRepository<login, Long> {
    login findByUsuario(String usuario);
}
