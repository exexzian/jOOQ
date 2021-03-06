/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class References extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1099311974;

	/**
	 * The singleton instance of <code>SYSCAT.REFERENCES</code>
	 */
	public static final org.jooq.util.db2.syscat.tables.References REFERENCES = new org.jooq.util.db2.syscat.tables.References();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYSCAT.REFERENCES.CONSTNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTNAME = createField("CONSTNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.TABSCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABSCHEMA = createField("TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.TABNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABNAME = createField("TABNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.OWNER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.OWNERTYPE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNERTYPE = createField("OWNERTYPE", org.jooq.impl.SQLDataType.CHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.REFKEYNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFKEYNAME = createField("REFKEYNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.REFTABSCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFTABSCHEMA = createField("REFTABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.REFTABNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFTABNAME = createField("REFTABNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.COLCOUNT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> COLCOUNT = createField("COLCOUNT", org.jooq.impl.SQLDataType.SMALLINT, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.DELETERULE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DELETERULE = createField("DELETERULE", org.jooq.impl.SQLDataType.CHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.UPDATERULE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UPDATERULE = createField("UPDATERULE", org.jooq.impl.SQLDataType.CHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.CREATE_TIME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.FK_COLNAMES</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> FK_COLNAMES = createField("FK_COLNAMES", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.PK_COLNAMES</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PK_COLNAMES = createField("PK_COLNAMES", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * The column <code>SYSCAT.REFERENCES.DEFINER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * No further instances allowed
	 */
	private References() {
		super("REFERENCES", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}
