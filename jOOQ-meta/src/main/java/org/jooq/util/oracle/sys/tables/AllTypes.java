/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Description of types accessible to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllTypes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1084591710;

	/**
	 * The singleton instance of <code>SYS.ALL_TYPES</code>
	 */
	public static final org.jooq.util.oracle.sys.tables.AllTypes ALL_TYPES = new org.jooq.util.oracle.sys.tables.AllTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.ALL_TYPES.OWNER</code>. Owner of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.TYPE_NAME</code>. Name of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.TYPE_OID</code>. Object identifier (OID) of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> TYPE_OID = createField("TYPE_OID", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The column <code>SYS.ALL_TYPES.TYPECODE</code>. Typecode of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPECODE = createField("TYPECODE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.ATTRIBUTES</code>. Number of attributes in the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> ATTRIBUTES = createField("ATTRIBUTES", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TYPES.METHODS</code>. Number of methods in the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> METHODS = createField("METHODS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TYPES.PREDEFINED</code>. Is the type a predefined type?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PREDEFINED = createField("PREDEFINED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.INCOMPLETE</code>. Is the type an incomplete type?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INCOMPLETE = createField("INCOMPLETE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.FINAL</code>. Is the type a final type?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FINAL = createField("FINAL", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.INSTANTIABLE</code>. Is the type an instantiable type?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INSTANTIABLE = createField("INSTANTIABLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.SUPERTYPE_OWNER</code>. Owner of the supertype (null if type is not a subtype)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SUPERTYPE_OWNER = createField("SUPERTYPE_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.SUPERTYPE_NAME</code>. Name of the supertype (null if type is not a subtype)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SUPERTYPE_NAME = createField("SUPERTYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_TYPES.LOCAL_ATTRIBUTES</code>. Number of local (not inherited) attributes (if any) in the subtype
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> LOCAL_ATTRIBUTES = createField("LOCAL_ATTRIBUTES", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TYPES.LOCAL_METHODS</code>. Number of local (not inherited) methods (if any) in the subtype
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> LOCAL_METHODS = createField("LOCAL_METHODS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>SYS.ALL_TYPES.TYPEID</code>. Type id value of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> TYPEID = createField("TYPEID", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>SYS.ALL_TYPES</code> table reference
	 */
	public AllTypes() {
		super("ALL_TYPES", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * Create an aliased <code>SYS.ALL_TYPES</code> table reference
	 */
	public AllTypes(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllTypes.ALL_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.oracle.sys.tables.AllTypes as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllTypes(alias);
	}
}
