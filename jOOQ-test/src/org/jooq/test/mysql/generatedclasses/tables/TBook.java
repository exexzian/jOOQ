/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.mysql.generatedclasses.Test2;
import org.jooq.test.mysql.generatedclasses.enums.TBookStatus;
import org.jooq.test.mysql.generatedclasses.enums.TLanguage;
import org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 974276217;

	/**
	 * The singleton instance of t_book
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookRecord> __RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.MYSQL, "ID", Integer.class, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [test2.t_book.AUTHOR_ID] REFERENCES t_author [test2.t_author.ID]
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.MYSQL, "AUTHOR_ID", Integer.class, T_BOOK);

	/**
	 * The book's title
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>(SQLDialect.MYSQL, "TITLE", String.class, T_BOOK);

	/**
	 * The year the book was published in
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.MYSQL, "PUBLISHED_IN", Integer.class, T_BOOK);

	/**
	 * The language of the book
	 * 
	 * FOREIGN KEY [test2.t_book.LANGUAGE_ID] REFERENCES t_language [test2.t_language.ID]
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>(SQLDialect.MYSQL, "LANGUAGE_ID", TLanguage.class, T_BOOK);

	/**
	 * Some textual content of the book
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>(SQLDialect.MYSQL, "CONTENT_TEXT", String.class, T_BOOK);

	/**
	 * Some binary content of the book
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>(SQLDialect.MYSQL, "CONTENT_PDF", byte[].class, T_BOOK);

	/**
	 * The book's stock status
	 */
	public static final TableField<TBookRecord, TBookStatus> STATUS = new TableFieldImpl<TBookRecord, TBookStatus>(SQLDialect.MYSQL, "STATUS", TBookStatus.class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super(SQLDialect.MYSQL, "t_book", Test2.TEST2);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK.addToPrimaryKey(ID);
	}

}
