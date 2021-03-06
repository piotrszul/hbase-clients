/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift.generated;

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
 * Holds row name and then a map of columns to cells.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-28")
public class TRowResult implements org.apache.thrift.TBase<TRowResult, TRowResult._Fields>, java.io.Serializable, Cloneable, Comparable<TRowResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRowResult");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField SORTED_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("sortedColumns", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TRowResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TRowResultTupleSchemeFactory());
  }

  public ByteBuffer row; // required
  public Map<ByteBuffer,TCell> columns; // optional
  public List<TColumn> sortedColumns; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    COLUMNS((short)2, "columns"),
    SORTED_COLUMNS((short)3, "sortedColumns");

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
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // SORTED_COLUMNS
          return SORTED_COLUMNS;
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
  private static final _Fields optionals[] = {_Fields.COLUMNS,_Fields.SORTED_COLUMNS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "Text"), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCell.class))));
    tmpMap.put(_Fields.SORTED_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("sortedColumns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumn.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRowResult.class, metaDataMap);
  }

  public TRowResult() {
  }

  public TRowResult(
    ByteBuffer row)
  {
    this();
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRowResult(TRowResult other) {
    if (other.isSetRow()) {
      this.row = other.row;
    }
    if (other.isSetColumns()) {
      Map<ByteBuffer,TCell> __this__columns = new HashMap<ByteBuffer,TCell>(other.columns.size());
      for (Map.Entry<ByteBuffer, TCell> other_element : other.columns.entrySet()) {

        ByteBuffer other_element_key = other_element.getKey();
        TCell other_element_value = other_element.getValue();

        ByteBuffer __this__columns_copy_key = other_element_key;

        TCell __this__columns_copy_value = new TCell(other_element_value);

        __this__columns.put(__this__columns_copy_key, __this__columns_copy_value);
      }
      this.columns = __this__columns;
    }
    if (other.isSetSortedColumns()) {
      List<TColumn> __this__sortedColumns = new ArrayList<TColumn>(other.sortedColumns.size());
      for (TColumn other_element : other.sortedColumns) {
        __this__sortedColumns.add(new TColumn(other_element));
      }
      this.sortedColumns = __this__sortedColumns;
    }
  }

  public TRowResult deepCopy() {
    return new TRowResult(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.columns = null;
    this.sortedColumns = null;
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public ByteBuffer bufferForRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  public TRowResult setRow(byte[] row) {
    this.row = row == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(row, row.length));
    return this;
  }

  public TRowResult setRow(ByteBuffer row) {
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

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public void putToColumns(ByteBuffer key, TCell val) {
    if (this.columns == null) {
      this.columns = new HashMap<ByteBuffer,TCell>();
    }
    this.columns.put(key, val);
  }

  public Map<ByteBuffer,TCell> getColumns() {
    return this.columns;
  }

  public TRowResult setColumns(Map<ByteBuffer,TCell> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getSortedColumnsSize() {
    return (this.sortedColumns == null) ? 0 : this.sortedColumns.size();
  }

  public java.util.Iterator<TColumn> getSortedColumnsIterator() {
    return (this.sortedColumns == null) ? null : this.sortedColumns.iterator();
  }

  public void addToSortedColumns(TColumn elem) {
    if (this.sortedColumns == null) {
      this.sortedColumns = new ArrayList<TColumn>();
    }
    this.sortedColumns.add(elem);
  }

  public List<TColumn> getSortedColumns() {
    return this.sortedColumns;
  }

  public TRowResult setSortedColumns(List<TColumn> sortedColumns) {
    this.sortedColumns = sortedColumns;
    return this;
  }

  public void unsetSortedColumns() {
    this.sortedColumns = null;
  }

  /** Returns true if field sortedColumns is set (has been assigned a value) and false otherwise */
  public boolean isSetSortedColumns() {
    return this.sortedColumns != null;
  }

  public void setSortedColumnsIsSet(boolean value) {
    if (!value) {
      this.sortedColumns = null;
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

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((Map<ByteBuffer,TCell>)value);
      }
      break;

    case SORTED_COLUMNS:
      if (value == null) {
        unsetSortedColumns();
      } else {
        setSortedColumns((List<TColumn>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case COLUMNS:
      return getColumns();

    case SORTED_COLUMNS:
      return getSortedColumns();

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
    case COLUMNS:
      return isSetColumns();
    case SORTED_COLUMNS:
      return isSetSortedColumns();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TRowResult)
      return this.equals((TRowResult)that);
    return false;
  }

  public boolean equals(TRowResult that) {
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

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_sortedColumns = true && this.isSetSortedColumns();
    boolean that_present_sortedColumns = true && that.isSetSortedColumns();
    if (this_present_sortedColumns || that_present_sortedColumns) {
      if (!(this_present_sortedColumns && that_present_sortedColumns))
        return false;
      if (!this.sortedColumns.equals(that.sortedColumns))
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

    boolean present_columns = true && (isSetColumns());
    list.add(present_columns);
    if (present_columns)
      list.add(columns);

    boolean present_sortedColumns = true && (isSetSortedColumns());
    list.add(present_sortedColumns);
    if (present_sortedColumns)
      list.add(sortedColumns);

    return list.hashCode();
  }

  @Override
  public int compareTo(TRowResult other) {
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
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSortedColumns()).compareTo(other.isSetSortedColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSortedColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sortedColumns, other.sortedColumns);
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
    StringBuilder sb = new StringBuilder("TRowResult(");
    boolean first = true;

    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.row, sb);
    }
    first = false;
    if (isSetColumns()) {
      if (!first) sb.append(", ");
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    if (isSetSortedColumns()) {
      if (!first) sb.append(", ");
      sb.append("sortedColumns:");
      if (this.sortedColumns == null) {
        sb.append("null");
      } else {
        sb.append(this.sortedColumns);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRowResultStandardSchemeFactory implements SchemeFactory {
    public TRowResultStandardScheme getScheme() {
      return new TRowResultStandardScheme();
    }
  }

  private static class TRowResultStandardScheme extends StandardScheme<TRowResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRowResult struct) throws org.apache.thrift.TException {
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
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.columns = new HashMap<ByteBuffer,TCell>(2*_map8.size);
                ByteBuffer _key9;
                TCell _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readBinary();
                  _val10 = new TCell();
                  _val10.read(iprot);
                  struct.columns.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SORTED_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
                struct.sortedColumns = new ArrayList<TColumn>(_list12.size);
                TColumn _elem13;
                for (int _i14 = 0; _i14 < _list12.size; ++_i14)
                {
                  _elem13 = new TColumn();
                  _elem13.read(iprot);
                  struct.sortedColumns.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setSortedColumnsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRowResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        oprot.writeFieldBegin(ROW_FIELD_DESC);
        oprot.writeBinary(struct.row);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        if (struct.isSetColumns()) {
          oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
            for (Map.Entry<ByteBuffer, TCell> _iter15 : struct.columns.entrySet())
            {
              oprot.writeBinary(_iter15.getKey());
              _iter15.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.sortedColumns != null) {
        if (struct.isSetSortedColumns()) {
          oprot.writeFieldBegin(SORTED_COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.sortedColumns.size()));
            for (TColumn _iter16 : struct.sortedColumns)
            {
              _iter16.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRowResultTupleSchemeFactory implements SchemeFactory {
    public TRowResultTupleScheme getScheme() {
      return new TRowResultTupleScheme();
    }
  }

  private static class TRowResultTupleScheme extends TupleScheme<TRowResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRowResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRow()) {
        optionals.set(0);
      }
      if (struct.isSetColumns()) {
        optionals.set(1);
      }
      if (struct.isSetSortedColumns()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRow()) {
        oprot.writeBinary(struct.row);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (Map.Entry<ByteBuffer, TCell> _iter17 : struct.columns.entrySet())
          {
            oprot.writeBinary(_iter17.getKey());
            _iter17.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetSortedColumns()) {
        {
          oprot.writeI32(struct.sortedColumns.size());
          for (TColumn _iter18 : struct.sortedColumns)
          {
            _iter18.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRowResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.row = iprot.readBinary();
        struct.setRowIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map19 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.columns = new HashMap<ByteBuffer,TCell>(2*_map19.size);
          ByteBuffer _key20;
          TCell _val21;
          for (int _i22 = 0; _i22 < _map19.size; ++_i22)
          {
            _key20 = iprot.readBinary();
            _val21 = new TCell();
            _val21.read(iprot);
            struct.columns.put(_key20, _val21);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.sortedColumns = new ArrayList<TColumn>(_list23.size);
          TColumn _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = new TColumn();
            _elem24.read(iprot);
            struct.sortedColumns.add(_elem24);
          }
        }
        struct.setSortedColumnsIsSet(true);
      }
    }
  }

}

