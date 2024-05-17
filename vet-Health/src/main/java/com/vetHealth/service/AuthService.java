package com.vetHealth.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vetHealth.interfaces.LoginRepository;
import com.vetHealth.modelo.login;
@Service
public class AuthService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean login(String usuario, String password) {
        login login = loginRepository.findByUsuario(usuario);
        return login != null && login.getPassword().equals(password);
    }
}
