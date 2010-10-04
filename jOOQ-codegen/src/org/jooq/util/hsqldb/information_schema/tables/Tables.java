/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;


import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.hsqldb.information_schema.InformationSchema;
import org.jooq.util.hsqldb.information_schema.tables.records.TablesRecord;


/**
 * This class is generated by jOOQ.
 */
public class Tables extends TableImpl<TablesRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of TABLES
	 */
	public static final Tables TABLES = new Tables();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TablesRecord> RECORD_TYPE = TablesRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TablesRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_CATALOG = new TableFieldImpl<String>("TABLE_CATALOG", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_SCHEMA = new TableFieldImpl<String>("TABLE_SCHEMA", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_TYPE = new TableFieldImpl<String>("TABLE_TYPE", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SELF_REFERENCING_COLUMN_NAME = new TableFieldImpl<String>("SELF_REFERENCING_COLUMN_NAME", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> REFERENCE_GENERATION = new TableFieldImpl<String>("REFERENCE_GENERATION", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> USER_DEFINED_TYPE_CATALOG = new TableFieldImpl<String>("USER_DEFINED_TYPE_CATALOG", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> USER_DEFINED_TYPE_SCHEMA = new TableFieldImpl<String>("USER_DEFINED_TYPE_SCHEMA", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> USER_DEFINED_TYPE_NAME = new TableFieldImpl<String>("USER_DEFINED_TYPE_NAME", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> IS_INSERTABLE_INTO = new TableFieldImpl<String>("IS_INSERTABLE_INTO", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> IS_TYPED = new TableFieldImpl<String>("IS_TYPED", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COMMIT_ACTION = new TableFieldImpl<String>("COMMIT_ACTION", String.class, TABLES);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super("TABLES", InformationSchema.INFORMATION_SCHEMA);
	}

}
