/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;


import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.SimpleSelectQuery;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.tables.TAuthor;
import org.jooq.test.oracle.generatedclasses.tables.TBook;
import org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TAuthorRecord extends UpdatableRecordImpl<TAuthorRecord> {

	private static final long serialVersionUID = -188303749;

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TAuthor.ID, value);
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TAuthor.ID);
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public List<TBookRecord> getTBooks() throws SQLException {
		SimpleSelectQuery<TBookRecord> q = create().selectQuery(TBook.T_BOOK);
		q.addCompareCondition(TBook.AUTHOR_ID, getValue(TAuthor.ID));
		q.execute();

		return q.getResult().getRecords();
	}

	/**
	 * The author's first name
	 */
	public void setFirstName(String value) {
		setValue(TAuthor.FIRST_NAME, value);
	}

	/**
	 * The author's first name
	 */
	public String getFirstName() {
		return getValue(TAuthor.FIRST_NAME);
	}

	/**
	 * The author's last name
	 */
	public void setLastName(String value) {
		setValue(TAuthor.LAST_NAME, value);
	}

	/**
	 * The author's last name
	 */
	public String getLastName() {
		return getValue(TAuthor.LAST_NAME);
	}

	/**
	 * The author's date of birth
	 */
	public void setDateOfBirth(Date value) {
		setValue(TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * The author's date of birth
	 */
	public Date getDateOfBirth() {
		return getValue(TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * The author's year of birth
	 */
	public void setYearOfBirth(Integer value) {
		setValue(TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * The author's year of birth
	 */
	public Integer getYearOfBirth() {
		return getValue(TAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * The author's address
	 */
	public void setAddress(UAddressTypeRecord value) {
		setValue(TAuthor.ADDRESS, value);
	}

	/**
	 * The author's address
	 */
	public UAddressTypeRecord getAddress() {
		return getValue(TAuthor.ADDRESS);
	}

	public TAuthorRecord(Configuration configuration) {
		super(configuration, TAuthor.T_AUTHOR);
	}
}
