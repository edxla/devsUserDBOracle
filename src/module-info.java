import com.devsUsersDB.user.auth.UserDatabaseAuthentication;

import devsUserDBOracle.com.devs.user.db.oracle.OracleAuthenticator;

module com.devs.user.db.oracle {
	requires com.amazarashi.devsUsersDB;
	provides UserDatabaseAuthentication with OracleAuthenticator;
}