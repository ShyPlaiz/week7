package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

public class projectsApp {

	public static void main(String[] args) {
     @SuppressWarnings("unused")
	Connection n = DbConnection.getConnection();
	}

}
