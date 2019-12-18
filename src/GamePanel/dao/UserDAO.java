package GamePanel.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import GamePanel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class UserDAO {

    @Autowired
    private EntityManager entityManager;

    public User findUser(String login) {
        try {
            String sql = "SELECT u FROM "+User.class.getName()+" u WHERE login = :login";

            Query query = entityManager.createQuery(sql, User.class);
            query.setParameter("login", login);

            return (User) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
