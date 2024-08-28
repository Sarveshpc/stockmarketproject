package stockmarketproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import stockmarketproject.dto.User;

public interface UserRepositories extends JpaRepository<User, Long>
{
	
	    User findByUsername(String username);
	    
}

	    
	    
	    
	
    

	



