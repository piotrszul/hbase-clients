/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Used to perform Put operations for a single row.
 * 
 * Add column values to this object and they'll be added.
 * You can provide a default timestamp if the column values
 * don't have one. If you don't provide a default timestamp
 * the current time is inserted.
 * 
 * You can specify how this Put should be written to the write-ahead Log (WAL)
 * by changing the durability. If you don't provide durability, it defaults to
 * column family's default setting for durability.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-28")
public class TPut implements org.apache.thrift.TBase<TPut, TPut._Fields>, java.io.Serializable, Cloneable, Comparable<TPut> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPut");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("columnValues", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("attributes", org.apache.thrift.protocol.TType.MAP, (short)5);
  private static final org.apache.thrift.protocol.TField DURABILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("durability", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField CELL_VISIBILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("cellVisibility", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPutStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPutTupleSchemeFactory());
  }

  public ByteBuffer row; // required
  public List<TColumnValue> columnValues; // required
  public long timestamp; // optional
  public Map<ByteBuffer,ByteBuffer> attributes; // optional
  /**
   * 
   * @see TDurability
   */
  public TDurability durability; // optional
  public TCellVisibility cellVisibility; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    COLUMN_VALUES((short)2, "columnValues"),
    TIMESTAMP((short)3, "timestamp"),
    ATTRIBUTES((short)5, "attributes"),
    /**
     * 
     * @see TDurability
     */
    DURABILITY((short)6, "durability"),
    CELL_VISIBILITY((short)7, "cellVisibility");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW
          return ROW;
        case 2: // COLUMN_VALUES
          return COLUMN_VALUES;
        case 3: // TIMESTAMP
          return TIMESTAMP;
        case 5: // ATTRIBUTES
          return ATTRIBUTES;
        case 6: // DURABILITY
          return DURABILITY;
        case 7: // CELL_VISIBILITY
          return CELL_VISIBILITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIMESTAMP,_Fields.ATTRIBUTES,_Fields.DURABILITY,_Fields.CELL_VISIBILITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMN_VALUES, new org.apache.thrift.meta_data.FieldMetaData("columnValues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnValue.class))));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("attributes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.DURABILITY, new org.apache.thrift.meta_data.FieldMetaData("durability", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDurability.class)));
    tmpMap.put(_Fields.CELL_VISIBILITY, new org.apache.thrift.meta_data.FieldMetaData("cellVisibility", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCellVisibility.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPut.class, metaDataMap);
  }

  public TPut() {
  }

  public TPut(
    ByteBuffer row,
    List<TColumnValue> columnValues)
  {
    this();
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    this.columnValues = columnValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPut(TPut other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRow()) {
      this.row = org.apache.thrift.TBaseHelper.copyBinary(other.row);
    }
    if (other.isSetColumnValues()) {
      List<TColumnValue> __this__columnValues = new ArrayList<TColumnValue>(other.columnValues.size());
      for (TColumnValue other_element : other.columnValues) {
        __this__columnValues.add(new TColumnValue(other_element));
      }
      this.columnValues = __this__columnValues;
    }
    this.timestamp = other.timestamp;
    if (other.isSetAttributes()) {
      Map<ByteBuffer,ByteBuffer> __this__attributes = new HashMap<ByteBuffer,ByteBuffer>(other.attributes);
      this.attributes = __this__attributes;
    }
    if (other.isSetDurability()) {
      this.durability = other.durability;
    }
    if (other.isSetCellVisibility()) {
      this.cellVisibility = new TCellVisibility(other.cellVisibility);
    }
  }

  public TPut deepCopy() {
    return new TPut(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.columnValues = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.attributes = null;
    this.durability = null;
    this.cellVisibility = null;
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public ByteBuffer bufferForRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  public TPut setRow(byte[] row) {
    this.row = row == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(row, row.length));
    return this;
  }

  public TPut setRow(ByteBuffer row) {
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getColumnValuesSize() {
    return (this.columnValues == null) ? 0 : this.columnValues.size();
  }

  public java.util.Iterator<TColumnValue> getColumnValuesIterator() {
    return (this.columnValues == null) ? null : this.columnValues.iterator();
  }

  public void addToColumnValues(TColumnValue elem) {
    if (this.columnValues == null) {
      this.columnValues = new ArrayList<TColumnValue>();
    }
    this.columnValues.add(elem);
  }

  public List<TColumnValue> getColumnValues() {
    return this.columnValues;
  }

  public TPut setColumnValues(List<TColumnValue> columnValues) {
    this.columnValues = columnValues;
    return this;
  }

  public void unsetColumnValues() {
    this.columnValues = null;
  }

  /** Returns true if field columnValues is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnValues() {
    return this.columnValues != null;
  }

  public void setColumnValuesIsSet(boolean value) {
    if (!value) {
      this.columnValues = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public TPut setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public void putToAttributes(ByteBuffer key, ByteBuffer val) {
    if (this.attributes == null) {
      this.attributes = new HashMap<ByteBuffer,ByteBuffer>();
    }
    this.attributes.put(key, val);
  }

  public Map<ByteBuffer,ByteBuffer> getAttributes() {
    return this.attributes;
  }

  public TPut setAttributes(Map<ByteBuffer,ByteBuffer> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  /**
   * 
   * @see TDurability
   */
  public TDurability getDurability() {
    return this.durability;
  }

  /**
   * 
   * @see TDurability
   */
  public TPut setDurability(TDurability durability) {
    this.durability = durability;
    return this;
  }

  public void unsetDurability() {
    this.durability = null;
  }

  /** Returns true if field durability is set (has been assigned a value) and false otherwise */
  public boolean isSetDurability() {
    return this.durability != null;
  }

  public void setDurabilityIsSet(boolean value) {
    if (!value) {
      this.durability = null;
    }
  }

  public TCellVisibility getCellVisibility() {
    return this.cellVisibility;
  }

  public TPut setCellVisibility(TCellVisibility cellVisibility) {
    this.cellVisibility = cellVisibility;
    return this;
  }

  public void unsetCellVisibility() {
    this.cellVisibility = null;
  }

  /** Returns true if field cellVisibility is set (has been assigned a value) and false otherwise */
  public boolean isSetCellVisibility() {
    return this.cellVisibility != null;
  }

  public void setCellVisibilityIsSet(boolean value) {
    if (!value) {
      this.cellVisibility = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        setRow((ByteBuffer)value);
      }
      break;

    case COLUMN_VALUES:
      if (value == null) {
        unsetColumnValues();
      } else {
        setColumnValues((List<TColumnValue>)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((Map<ByteBuffer,ByteBuffer>)value);
      }
      break;

    case DURABILITY:
      if (value == null) {
        unsetDurability();
      } else {
        setDurability((TDurability)value);
      }
      break;

    case CELL_VISIBILITY:
      if (value == null) {
        unsetCellVisibility();
      } else {
        setCellVisibility((TCellVisibility)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case COLUMN_VALUES:
      return getColumnValues();

    case TIMESTAMP:
      return getTimestamp();

    case ATTRIBUTES:
      return getAttributes();

    case DURABILITY:
      return getDurability();

    case CELL_VISIBILITY:
      return getCellVisibility();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROW:
      return isSetRow();
    case COLUMN_VALUES:
      return isSetColumnValues();
    case TIMESTAMP:
      return isSetTimestamp();
    case ATTRIBUTES:
      return isSetAttributes();
    case DURABILITY:
      return isSetDurability();
    case CELL_VISIBILITY:
      return isSetCellVisibility();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPut)
      return this.equals((TPut)that);
    return false;
  }

  public boolean equals(TPut that) {
    if (that == null)
      return false;

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_columnValues = true && this.isSetColumnValues();
    boolean that_present_columnValues = true && that.isSetColumnValues();
    if (this_present_columnValues || that_present_columnValues) {
      if (!(this_present_columnValues && that_present_columnValues))
        return false;
      if (!this.columnValues.equals(that.columnValues))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    boolean this_present_durability = true && this.isSetDurability();
    boolean that_present_durability = true && that.isSetDurability();
    if (this_present_durability || that_present_durability) {
      if (!(this_present_durability && that_present_durability))
        return false;
      if (!this.durability.equals(that.durability))
        return false;
    }

    boolean this_present_cellVisibility = true && this.isSetCellVisibility();
    boolean that_present_cellVisibility = true && that.isSetCellVisibility();
    if (this_present_cellVisibility || that_present_cellVisibility) {
      if (!(this_present_cellVisibility && that_present_cellVisibility))
        return false;
      if (!this.cellVisibility.equals(that.cellVisibility))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_row = true && (isSetRow());
    list.add(present_row);
    if (present_row)
      list.add(row);

    boolean present_columnValues = true && (isSetColumnValues());
    list.add(present_columnValues);
    if (present_columnValues)
      list.add(columnValues);

    boolean present_timestamp = true && (isSetTimestamp());
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    boolean present_attributes = true && (isSetAttributes());
    list.add(present_attributes);
    if (present_attributes)
      list.add(attributes);

    boolean present_durability = true && (isSetDurability());
    list.add(present_durability);
    if (present_durability)
      list.add(durability.getValue());

    boolean present_cellVisibility = true && (isSetCellVisibility());
    list.add(present_cellVisibility);
    if (present_cellVisibility)
      list.add(cellVisibility);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPut other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRow()).compareTo(other.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, other.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnValues()).compareTo(other.isSetColumnValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnValues, other.columnValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurability()).compareTo(other.isSetDurability());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurability()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durability, other.durability);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCellVisibility()).compareTo(other.isSetCellVisibility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellVisibility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellVisibility, other.cellVisibility);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TPut(");
    boolean first = true;

    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.row, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnValues:");
    if (this.columnValues == null) {
      sb.append("null");
    } else {
      sb.append(this.columnValues);
    }
    first = false;
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    if (isSetDurability()) {
      if (!first) sb.append(", ");
      sb.append("durability:");
      if (this.durability == null) {
        sb.append("null");
      } else {
        sb.append(this.durability);
      }
      first = false;
    }
    if (isSetCellVisibility()) {
      if (!first) sb.append(", ");
      sb.append("cellVisibility:");
      if (this.cellVisibility == null) {
        sb.append("null");
      } else {
        sb.append(this.cellVisibility);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (row == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'row' was not present! Struct: " + toString());
    }
    if (columnValues == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columnValues' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (cellVisibility != null) {
      cellVisibility.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPutStandardSchemeFactory implements SchemeFactory {
    public TPutStandardScheme getScheme() {
      return new TPutStandardScheme();
    }
  }

  private static class TPutStandardScheme extends StandardScheme<TPut> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPut struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.columnValues = new ArrayList<TColumnValue>(_list34.size);
                TColumnValue _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = new TColumnValue();
                  _elem35.read(iprot);
                  struct.columnValues.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setColumnValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map37 = iprot.readMapBegin();
                struct.attributes = new HashMap<ByteBuffer,ByteBuffer>(2*_map37.size);
                ByteBuffer _key38;
                ByteBuffer _val39;
                for (int _i40 = 0; _i40 < _map37.size; ++_i40)
                {
                  _key38 = iprot.readBinary();
                  _val39 = iprot.readBinary();
                  struct.attributes.put(_key38, _val39);
                }
                iprot.readMapEnd();
              }
              struct.setAttributesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DURABILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durability = org.apache.hadoop.hbase.thrift2.generated.TDurability.findByValue(iprot.readI32());
              struct.setDurabilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CELL_VISIBILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cellVisibility = new TCellVisibility();
              struct.cellVisibility.read(iprot);
              struct.setCellVisibilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPut struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        oprot.writeFieldBegin(ROW_FIELD_DESC);
        oprot.writeBinary(struct.row);
        oprot.writeFieldEnd();
      }
      if (struct.columnValues != null) {
        oprot.writeFieldBegin(COLUMN_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columnValues.size()));
          for (TColumnValue _iter41 : struct.columnValues)
          {
            _iter41.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimestamp()) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.timestamp);
        oprot.writeFieldEnd();
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.attributes.size()));
            for (Map.Entry<ByteBuffer, ByteBuffer> _iter42 : struct.attributes.entrySet())
            {
              oprot.writeBinary(_iter42.getKey());
              oprot.writeBinary(_iter42.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.durability != null) {
        if (struct.isSetDurability()) {
          oprot.writeFieldBegin(DURABILITY_FIELD_DESC);
          oprot.writeI32(struct.durability.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.cellVisibility != null) {
        if (struct.isSetCellVisibility()) {
          oprot.writeFieldBegin(CELL_VISIBILITY_FIELD_DESC);
          struct.cellVisibility.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPutTupleSchemeFactory implements SchemeFactory {
    public TPutTupleScheme getScheme() {
      return new TPutTupleScheme();
    }
  }

  private static class TPutTupleScheme extends TupleScheme<TPut> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPut struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.row);
      {
        oprot.writeI32(struct.columnValues.size());
        for (TColumnValue _iter43 : struct.columnValues)
        {
          _iter43.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetTimestamp()) {
        optionals.set(0);
      }
      if (struct.isSetAttributes()) {
        optionals.set(1);
      }
      if (struct.isSetDurability()) {
        optionals.set(2);
      }
      if (struct.isSetCellVisibility()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (Map.Entry<ByteBuffer, ByteBuffer> _iter44 : struct.attributes.entrySet())
          {
            oprot.writeBinary(_iter44.getKey());
            oprot.writeBinary(_iter44.getValue());
          }
        }
      }
      if (struct.isSetDurability()) {
        oprot.writeI32(struct.durability.getValue());
      }
      if (struct.isSetCellVisibility()) {
        struct.cellVisibility.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPut struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.row = iprot.readBinary();
      struct.setRowIsSet(true);
      {
        org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.columnValues = new ArrayList<TColumnValue>(_list45.size);
        TColumnValue _elem46;
        for (int _i47 = 0; _i47 < _list45.size; ++_i47)
        {
          _elem46 = new TColumnValue();
          _elem46.read(iprot);
          struct.columnValues.add(_elem46);
        }
      }
      struct.setColumnValuesIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map48 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.attributes = new HashMap<ByteBuffer,ByteBuffer>(2*_map48.size);
          ByteBuffer _key49;
          ByteBuffer _val50;
          for (int _i51 = 0; _i51 < _map48.size; ++_i51)
          {
            _key49 = iprot.readBinary();
            _val50 = iprot.readBinary();
            struct.attributes.put(_key49, _val50);
          }
        }
        struct.setAttributesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.durability = org.apache.hadoop.hbase.thrift2.generated.TDurability.findByValue(iprot.readI32());
        struct.setDurabilityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.cellVisibility = new TCellVisibility();
        struct.cellVisibility.read(iprot);
        struct.setCellVisibilityIsSet(true);
      }
    }
  }

}

