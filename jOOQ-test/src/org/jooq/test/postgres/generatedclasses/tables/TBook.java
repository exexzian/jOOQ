/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 */
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of t_book
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TBookRecord> RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("id", Integer.class, T_BOOK);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [author_id] REFERENCES t_author [id]
	 */
	public static final TableField<Integer> AUTHOR_ID = new TableFieldImpl<Integer>("author_id", Integer.class, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TITLE = new TableFieldImpl<String>("title", String.class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK.addToPrimaryKey(ID);
	}

}
