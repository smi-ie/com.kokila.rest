package com.kokila.dao;

import javax.naming.*;
import javax.sql.*;

public class Oracle308tube {
	
	private static DataSource oracle308tube=null;
	private static Context context = null;
	
	public static DataSource Oracle308tubeConn() throws Exception {
		if(oracle308tube !=null){
			return oracle308tube;
		}
		
		try {
			if(context == null){
				context = new InitialContext();
			}
			oracle308tube =(DataSource) context.lookup("restDerby");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return oracle308tube;
	}

}
