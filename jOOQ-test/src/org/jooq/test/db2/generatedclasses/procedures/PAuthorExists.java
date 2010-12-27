/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.db2.generatedclasses.Lukas;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PAuthorExists extends StoredProcedureImpl {

	private static final long serialVersionUID = 1391008929;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>(SQLDialect.DB2, "AUTHOR_NAME", String.class);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> RESULT = new ParameterImpl<Integer>(SQLDialect.DB2, "RESULT", Integer.class);

	/**
	 * No further instances allowed
	 */
	public PAuthorExists() {
		super(SQLDialect.DB2, "P_AUTHOR_EXISTS", Lukas.LUKAS);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	public Integer getResult() {
		return getValue(RESULT);
	}
}
