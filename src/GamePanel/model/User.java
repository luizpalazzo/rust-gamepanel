package GamePanel.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "USERS", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "USERS_UC", columnNames = "login") })
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "O campo login é obrigatório")
    private String login;

    @NotEmpty(message = "O campo senha é obrigatório")
    private String password;

    private String ip;

    @NotEmpty(message = "O campo email é obrigatório")
    private String email;

    @NotEmpty(message = "O campo nome é obrigatório")
    private String name;

    private int paymentDay;

    public User() {

    }

    public User(long id, String login, String password, String email, String name) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(int paymentDay) {
        this.paymentDay = paymentDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", ip='" + ip + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", paymentDay=" + paymentDay +
                '}';
    }
}
