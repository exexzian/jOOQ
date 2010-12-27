/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.SimpleSelectQuery;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.enums.TLanguage;
import org.jooq.test.oracle.generatedclasses.tables.TAuthor;
import org.jooq.test.oracle.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = -281604816;

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [TEST.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [TEST.T_AUTHOR.ID]
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [TEST.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [TEST.T_AUTHOR.ID]
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [TEST.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [TEST.T_AUTHOR.ID]
	 */
	public TAuthorRecord getTAuthor() throws SQLException {
		SimpleSelectQuery<TAuthorRecord> q = create().selectQuery(TAuthor.T_AUTHOR);
		q.addCompareCondition(TAuthor.ID, getValue(TBook.AUTHOR_ID));
		q.execute();

		List<TAuthorRecord> result = q.getResult().getRecords();
		return result.size() == 1 ? result.get(0) : null;
	}

	/**
	 * The book's title
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	public void setPublishedIn(Integer value) {
		setValue(TBook.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	public Integer getPublishedIn() {
		return getValue(TBook.PUBLISHED_IN);
	}

	/**
	 * The language of the book
	 * 
	 * FOREIGN KEY [TEST.T_BOOK.LANGUAGE_ID] REFERENCES T_LANGUAGE [TEST.T_LANGUAGE.ID]
	 */
	public void setLanguageId(TLanguage value) {
		setValue(TBook.LANGUAGE_ID, value);
	}

	/**
	 * The language of the book
	 * 
	 * FOREIGN KEY [TEST.T_BOOK.LANGUAGE_ID] REFERENCES T_LANGUAGE [TEST.T_LANGUAGE.ID]
	 */
	public TLanguage getLanguageId() {
		return getValue(TBook.LANGUAGE_ID);
	}

	/**
	 * Some textual content of the book
	 */
	public void setContentText(String value) {
		setValue(TBook.CONTENT_TEXT, value);
	}

	/**
	 * Some textual content of the book
	 */
	public String getContentText() {
		return getValue(TBook.CONTENT_TEXT);
	}

	/**
	 * Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(TBook.CONTENT_PDF, value);
	}

	/**
	 * Some binary content of the book
	 */
	public byte[] getContentPdf() {
		return getValue(TBook.CONTENT_PDF);
	}

	public TBookRecord(Configuration configuration) {
		super(configuration, TBook.T_BOOK);
	}
}
