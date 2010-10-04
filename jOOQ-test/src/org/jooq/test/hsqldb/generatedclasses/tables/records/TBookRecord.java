/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.RecordMetaData;
import org.jooq.SelectQuery;
import org.jooq.impl.QueryFactory;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.TAuthor;
import org.jooq.test.hsqldb.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 */
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [AUTHOR_ID] REFERENCES T_AUTHOR [ID]
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [AUTHOR_ID] REFERENCES T_AUTHOR [ID]
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [AUTHOR_ID] REFERENCES T_AUTHOR [ID]
	 */
	public TAuthorRecord getTAuthor(Connection connection) throws SQLException {
		SelectQuery<TAuthorRecord> q = QueryFactory.createSelectQuery(TAuthor.T_AUTHOR);
		q.addCompareCondition(TAuthor.ID, getValue(TBook.AUTHOR_ID));
		q.execute(connection);

		List<TAuthorRecord> result = q.getResult().getRecords();
		return result.size() == 1 ? result.get(0) : null;
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	public TBookRecord(RecordMetaData metaData) {
		super(metaData, TBook.T_BOOK);
	}
}
