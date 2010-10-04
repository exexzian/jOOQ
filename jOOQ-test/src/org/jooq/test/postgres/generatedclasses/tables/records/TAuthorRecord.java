/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.jooq.RecordMetaData;
import org.jooq.SelectQuery;
import org.jooq.impl.QueryFactory;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.TAuthor;
import org.jooq.test.postgres.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 */
public class TAuthorRecord extends UpdatableRecordImpl<TAuthorRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TAuthor.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TAuthor.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<TBookRecord> getTBooks(Connection connection) throws SQLException {
		SelectQuery<TBookRecord> q = QueryFactory.createSelectQuery(TBook.T_BOOK);
		q.addCompareCondition(TBook.AUTHOR_ID, getValue(TAuthor.ID));
		q.execute(connection);

		return q.getResult().getRecords();
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(String value) {
		setValue(TAuthor.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getFirstName() {
		return getValue(TAuthor.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(String value) {
		setValue(TAuthor.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getLastName() {
		return getValue(TAuthor.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDateOfBirth(Date value) {
		setValue(TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public Date getDateOfBirth() {
		return getValue(TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setYearOfBirth(Integer value) {
		setValue(TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getYearOfBirth() {
		return getValue(TAuthor.YEAR_OF_BIRTH);
	}

	public TAuthorRecord(RecordMetaData metaData) {
		super(metaData, TAuthor.T_AUTHOR);
	}
}
