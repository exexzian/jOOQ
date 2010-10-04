/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;

import org.jooq.RecordMetaData;
import org.jooq.impl.RecordImpl;
import org.jooq.test.oracle.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XUnusedRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 *
	 * PRIMARY KEY 'SYS_C0012927'
	 */
	public void setId(Integer value) {
		setValue(XUnused.ID, value);
	}

	/**
	 * An uncommented item
	 *
	 * PRIMARY KEY 'SYS_C0012927'
	 */
	public Integer getId() {
		return getValue(XUnused.ID);
	}

	/**
	 * An uncommented item
	 *
	 * PRIMARY KEY 'SYS_C0012927'
	 */
	public void setName(String value) {
		setValue(XUnused.NAME, value);
	}

	/**
	 * An uncommented item
	 *
	 * PRIMARY KEY 'SYS_C0012927'
	 */
	public String getName() {
		return getValue(XUnused.NAME);
	}

	/**
	 * An uncommented item
	 *
	 * FOREIGN KEY 'SYS_C0012927' [ID_REF, NAME_REF] REFERENCES X_UNUSED [ID, NAME]
	 */
	public void setIdRef(Integer value) {
		setValue(XUnused.ID_REF, value);
	}

	/**
	 * An uncommented item
	 *
	 * FOREIGN KEY 'SYS_C0012927' [ID_REF, NAME_REF] REFERENCES X_UNUSED [ID, NAME]
	 */
	public Integer getIdRef() {
		return getValue(XUnused.ID_REF);
	}

	/**
	 * An uncommented item
	 *
	 * FOREIGN KEY 'SYS_C0012927' [ID_REF, NAME_REF] REFERENCES X_UNUSED [ID, NAME]
	 */
	public void setNameRef(String value) {
		setValue(XUnused.NAME_REF, value);
	}

	/**
	 * An uncommented item
	 *
	 * FOREIGN KEY 'SYS_C0012927' [ID_REF, NAME_REF] REFERENCES X_UNUSED [ID, NAME]
	 */
	public String getNameRef() {
		return getValue(XUnused.NAME_REF);
	}

	public XUnusedRecord(RecordMetaData result) {
		super(result);
	}
}
