package edu.uade.apd.tpo.repository.stub;

public class UsuarioStub extends BaseStub {

    protected long id;
    protected String email;
    protected String password;
    protected RolStub rol;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RolStub getRol() {
        return rol;
    }

    public void setRol(RolStub rol) {
        this.rol = rol;
    }
}
