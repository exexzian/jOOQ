/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TAuthor extends UpdatableTableImpl<TAuthorRecord> {

	private static final long serialVersionUID = -197582525;

	/**
	 * The singleton instance of t_author
	 */
	public static final TAuthor T_AUTHOR = new TAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TAuthorRecord> __RECORD_TYPE = TAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TAuthorRecord, Integer> ID = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.SQLITE, "ID", Integer.class, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> FIRST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.SQLITE, "FIRST_NAME", String.class, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> LAST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.SQLITE, "LAST_NAME", String.class, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, Date> DATE_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Date>(SQLDialect.SQLITE, "DATE_OF_BIRTH", Date.class, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, Integer> YEAR_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.SQLITE, "YEAR_OF_BIRTH", Integer.class, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final TableField<TAuthorRecord, String> ADDRESS = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.SQLITE, "ADDRESS", String.class, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super(SQLDialect.SQLITE, "t_author");
	}

	/*
	 * static initialiser
	 */
	static {
		T_AUTHOR.addToPrimaryKey(ID);
	}

}
