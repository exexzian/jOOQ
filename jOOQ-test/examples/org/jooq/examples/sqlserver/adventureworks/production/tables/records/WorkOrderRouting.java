/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "WorkOrderRouting", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"WorkOrderID", "ProductID", "OperationSequence"})
})
public class WorkOrderRouting extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> implements org.jooq.Record12<java.lang.Integer, java.lang.Integer, java.lang.Short, java.lang.Short, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> {

	private static final long serialVersionUID = -1782274863;

	/**
	 * Setter for <code>Production.WorkOrderRouting.WorkOrderID</code>. 
	 */
	public void setWorkOrderID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.WorkOrderID, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.WorkOrderID</code>. 
	 */
	@javax.persistence.Column(name = "WorkOrderID", nullable = false, precision = 10)
	public java.lang.Integer getWorkOrderID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.WorkOrderID);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ProductID</code>. 
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ProductID, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ProductID</code>. 
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ProductID);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.OperationSequence</code>. 
	 */
	public void setOperationSequence(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.OperationSequence, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.OperationSequence</code>. 
	 */
	@javax.persistence.Column(name = "OperationSequence", nullable = false, precision = 5)
	public java.lang.Short getOperationSequence() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.OperationSequence);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.LocationID</code>. 
	 */
	public void setLocationID(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.LocationID, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.LocationID</code>. 
	 */
	@javax.persistence.Column(name = "LocationID", nullable = false, precision = 5)
	public java.lang.Short getLocationID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.LocationID);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ScheduledStartDate</code>. 
	 */
	public void setScheduledStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledStartDate, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ScheduledStartDate</code>. 
	 */
	@javax.persistence.Column(name = "ScheduledStartDate", nullable = false)
	public java.sql.Timestamp getScheduledStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledStartDate);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ScheduledEndDate</code>. 
	 */
	public void setScheduledEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledEndDate, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ScheduledEndDate</code>. 
	 */
	@javax.persistence.Column(name = "ScheduledEndDate", nullable = false)
	public java.sql.Timestamp getScheduledEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledEndDate);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ActualStartDate</code>. 
	 */
	public void setActualStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualStartDate, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ActualStartDate</code>. 
	 */
	@javax.persistence.Column(name = "ActualStartDate")
	public java.sql.Timestamp getActualStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualStartDate);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ActualEndDate</code>. 
	 */
	public void setActualEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualEndDate, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ActualEndDate</code>. 
	 */
	@javax.persistence.Column(name = "ActualEndDate")
	public java.sql.Timestamp getActualEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualEndDate);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ActualResourceHrs</code>. 
	 */
	public void setActualResourceHrs(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualResourceHrs, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ActualResourceHrs</code>. 
	 */
	@javax.persistence.Column(name = "ActualResourceHrs", precision = 9, scale = 4)
	public java.math.BigDecimal getActualResourceHrs() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualResourceHrs);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.PlannedCost</code>. 
	 */
	public void setPlannedCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.PlannedCost, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.PlannedCost</code>. 
	 */
	@javax.persistence.Column(name = "PlannedCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getPlannedCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.PlannedCost);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ActualCost</code>. 
	 */
	public void setActualCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualCost, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ActualCost</code>. 
	 */
	@javax.persistence.Column(name = "ActualCost", precision = 19, scale = 4)
	public java.math.BigDecimal getActualCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualCost);
	}

	/**
	 * Setter for <code>Production.WorkOrderRouting.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Production.WorkOrderRouting.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Short> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.Integer, java.lang.Short, java.lang.Short, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11(), field12());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Integer, java.lang.Integer, java.lang.Short, java.lang.Short, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10(), value11(), value12());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.WorkOrderID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ProductID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field3() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.OperationSequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field4() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.LocationID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledStartDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledEndDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualStartDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualEndDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field9() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualResourceHrs;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field10() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.PlannedCost;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field11() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualCost;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field12() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getWorkOrderID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getProductID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value3() {
		return getOperationSequence();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value4() {
		return getLocationID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getScheduledStartDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getScheduledEndDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getActualStartDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getActualEndDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value9() {
		return getActualResourceHrs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value10() {
		return getPlannedCost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value11() {
		return getActualCost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value12() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WorkOrderRouting
	 */
	public WorkOrderRouting() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting);
	}
}
