/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IirefConstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -849080567;

	/**
	 * The singleton instance of <code>$ingres.iiref_constraints</code>
	 */
	public static final org.jooq.util.ingres.ingres.tables.IirefConstraints IIREF_CONSTRAINTS = new org.jooq.util.ingres.ingres.tables.IirefConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>$ingres.iiref_constraints.ref_constraint_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REF_CONSTRAINT_NAME = createField("ref_constraint_name", org.jooq.impl.SQLDataType.CHAR.length(256), IIREF_CONSTRAINTS);

	/**
	 * The column <code>$ingres.iiref_constraints.ref_schema_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REF_SCHEMA_NAME = createField("ref_schema_name", org.jooq.impl.SQLDataType.CHAR.length(32), IIREF_CONSTRAINTS);

	/**
	 * The column <code>$ingres.iiref_constraints.ref_table_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REF_TABLE_NAME = createField("ref_table_name", org.jooq.impl.SQLDataType.CHAR.length(256), IIREF_CONSTRAINTS);

	/**
	 * The column <code>$ingres.iiref_constraints.unique_constraint_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_CONSTRAINT_NAME = createField("unique_constraint_name", org.jooq.impl.SQLDataType.CHAR.length(256), IIREF_CONSTRAINTS);

	/**
	 * The column <code>$ingres.iiref_constraints.unique_schema_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_SCHEMA_NAME = createField("unique_schema_name", org.jooq.impl.SQLDataType.CHAR.length(32), IIREF_CONSTRAINTS);

	/**
	 * The column <code>$ingres.iiref_constraints.unique_table_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_TABLE_NAME = createField("unique_table_name", org.jooq.impl.SQLDataType.CHAR.length(256), IIREF_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private IirefConstraints() {
		super("iiref_constraints", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
