/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguage extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1759806079;

	/**
	 * The singleton instance of <code>T_LANGUAGE</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.access.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The column <code>T_LANGUAGE.CD</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.VARCHAR.length(2), T_LANGUAGE);

	/**
	 * The column <code>T_LANGUAGE.DESCR</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCR = createField("DESCR", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("DESCRIPTION_ENGLISH", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>T_LANGUAGE.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_LANGUAGE);

	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		super("T_LANGUAGE", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord> getPrimaryKey() {
		return org.jooq.test.access.generatedclasses.Keys.PK_T_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.access.generatedclasses.Keys.PK_T_LANGUAGE);
	}
}
