package devsUserDBOracle.com.devs.user.db.oracle;

import java.util.HashMap;
import java.util.Map;

import com.devsUsersDB.user.auth.UserDatabaseAuthentication;

public class OracleAuthenticator implements UserDatabaseAuthentication {

	private Map<String,String> users = new HashMap<>();


	public OracleAuthenticator() 
	{
		users.put("Raiden", "Java");
		users.put("devs", "password");
	}
	
	@Override
	public boolean authenticate(String username, String Password) 
	{
		System.out.println("Autenticacion con oracle");
		String pass = users.get(username);
		// ? true <- es verdadero devuelvo true si no false
		return (pass!=null && pass.equals(Password)) ? true:false;
	}

}
