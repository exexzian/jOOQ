/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses;


import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.test.mysql.generatedclasses.functions.FAuthorExists;


/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored functions in test2
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public final class Functions {

	/**
	 * Invoke F_AUTHOR_EXISTS
	 *
	 * @param authorName
	 */
	public static Byte fAuthorExists(Connection connection, String authorName) throws SQLException {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(connection);
		return f.getReturnValue();
	}

	/**
	 * Get F_AUTHOR_EXISTS as a field
	 *
	 * @param authorName
	 */
	public static Field<Byte> fAuthorExists(String authorName) {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * No instances
	 */
	private Functions() {}
}
