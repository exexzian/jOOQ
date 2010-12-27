/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.procedures;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.oracle.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PUnused extends StoredProcedureImpl {

	private static final long serialVersionUID = -859112989;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> IN1 = new ParameterImpl<String>(SQLDialect.ORACLE, "IN1", String.class);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> OUT1 = new ParameterImpl<BigDecimal>(SQLDialect.ORACLE, "OUT1", BigDecimal.class);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> OUT2 = new ParameterImpl<BigDecimal>(SQLDialect.ORACLE, "OUT2", BigDecimal.class);

	/**
	 * No further instances allowed
	 */
	public PUnused() {
		super(SQLDialect.ORACLE, "P_UNUSED", Test.TEST);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	public void setIn1(String value) {
		setValue(IN1, value);
	}

	public void setOut2(BigDecimal value) {
		setValue(OUT2, value);
	}

	public BigDecimal getOut1() {
		return getValue(OUT1);
	}

	public BigDecimal getOut2() {
		return getValue(OUT2);
	}
}
