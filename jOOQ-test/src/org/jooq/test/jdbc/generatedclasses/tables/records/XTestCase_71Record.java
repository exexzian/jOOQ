/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbc.generatedclasses.tables.records.XTestCase_71Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Short>, org.jooq.test.jdbc.generatedclasses.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = 829945539;

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.XTestCase_71.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.XTestCase_71.ID);
	}

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@Override
	public void setTestCase_64_69Id(java.lang.Short value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbc.generatedclasses.tables.XTestCase_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.jdbc.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getTestCase_64_69Id();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.jdbc.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}
}