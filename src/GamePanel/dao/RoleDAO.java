package GamePanel.dao;

import GamePanel.model.Role;
import GamePanel.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RoleDAO {

    @Autowired
    private EntityManager entityManager;

    public List<String> getRoles(Long userId){

        String sql = "SELECT ur.roleName FROM "+ UserRole.class.getName() +" ur WHERE user_id = :userId";

        Query query = this.entityManager.createQuery(sql, String.class);
        query.setParameter("userId", userId);
        return query.getResultList();

    }
}
