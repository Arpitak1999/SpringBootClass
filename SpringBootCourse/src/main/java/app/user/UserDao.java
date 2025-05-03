package app.user;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public UserDao() {
 	   System.out.println("UserDao@....Constructor");
    }
    public String findByName(int id) {
    	if (id ==100) {
    		return "AK";
    	} else if(id == 101) {
    		return "ak1";
    	}else {
    		return "Invalid Id";
    	}
    	
		
	}

}
