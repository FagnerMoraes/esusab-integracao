/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.atividadecoletiva;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2021-08-02")
public class ProfissionalCboRowItemThrift implements org.apache.thrift.TBase<ProfissionalCboRowItemThrift, ProfissionalCboRowItemThrift._Fields>, java.io.Serializable, Cloneable, Comparable<ProfissionalCboRowItemThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProfissionalCboRowItemThrift");

  private static final org.apache.thrift.protocol.TField CNS_PROFISSIONAL_FIELD_DESC = new org.apache.thrift.protocol.TField("cnsProfissional", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CODIGO_CBO2002_FIELD_DESC = new org.apache.thrift.protocol.TField("codigoCbo2002", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProfissionalCboRowItemThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProfissionalCboRowItemThriftTupleSchemeFactory());
  }

  private String cnsProfissional; // optional
  private String codigoCbo2002; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CNS_PROFISSIONAL((short)1, "cnsProfissional"),
    CODIGO_CBO2002((short)2, "codigoCbo2002");

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
        case 1: // CNS_PROFISSIONAL
          return CNS_PROFISSIONAL;
        case 2: // CODIGO_CBO2002
          return CODIGO_CBO2002;
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
  private static final _Fields optionals[] = {_Fields.CNS_PROFISSIONAL,_Fields.CODIGO_CBO2002};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CNS_PROFISSIONAL, new org.apache.thrift.meta_data.FieldMetaData("cnsProfissional", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODIGO_CBO2002, new org.apache.thrift.meta_data.FieldMetaData("codigoCbo2002", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProfissionalCboRowItemThrift.class, metaDataMap);
  }

  public ProfissionalCboRowItemThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProfissionalCboRowItemThrift(ProfissionalCboRowItemThrift other) {
    if (other.isSetCnsProfissional()) {
      this.cnsProfissional = other.cnsProfissional;
    }
    if (other.isSetCodigoCbo2002()) {
      this.codigoCbo2002 = other.codigoCbo2002;
    }
  }

  public ProfissionalCboRowItemThrift deepCopy() {
    return new ProfissionalCboRowItemThrift(this);
  }

  @Override
  public void clear() {
    this.cnsProfissional = null;
    this.codigoCbo2002 = null;
  }

  public String getCnsProfissional() {
    return this.cnsProfissional;
  }

  public void setCnsProfissional(String cnsProfissional) {
    this.cnsProfissional = cnsProfissional;
  }

  public void unsetCnsProfissional() {
    this.cnsProfissional = null;
  }

  /** Returns true if field cnsProfissional is set (has been assigned a value) and false otherwise */
  public boolean isSetCnsProfissional() {
    return this.cnsProfissional != null;
  }

  public void setCnsProfissionalIsSet(boolean value) {
    if (!value) {
      this.cnsProfissional = null;
    }
  }

  public String getCodigoCbo2002() {
    return this.codigoCbo2002;
  }

  public void setCodigoCbo2002(String codigoCbo2002) {
    this.codigoCbo2002 = codigoCbo2002;
  }

  public void unsetCodigoCbo2002() {
    this.codigoCbo2002 = null;
  }

  /** Returns true if field codigoCbo2002 is set (has been assigned a value) and false otherwise */
  public boolean isSetCodigoCbo2002() {
    return this.codigoCbo2002 != null;
  }

  public void setCodigoCbo2002IsSet(boolean value) {
    if (!value) {
      this.codigoCbo2002 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CNS_PROFISSIONAL:
      if (value == null) {
        unsetCnsProfissional();
      } else {
        setCnsProfissional((String)value);
      }
      break;

    case CODIGO_CBO2002:
      if (value == null) {
        unsetCodigoCbo2002();
      } else {
        setCodigoCbo2002((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CNS_PROFISSIONAL:
      return getCnsProfissional();

    case CODIGO_CBO2002:
      return getCodigoCbo2002();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CNS_PROFISSIONAL:
      return isSetCnsProfissional();
    case CODIGO_CBO2002:
      return isSetCodigoCbo2002();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProfissionalCboRowItemThrift)
      return this.equals((ProfissionalCboRowItemThrift)that);
    return false;
  }

  public boolean equals(ProfissionalCboRowItemThrift that) {
    if (that == null)
      return false;

    boolean this_present_cnsProfissional = true && this.isSetCnsProfissional();
    boolean that_present_cnsProfissional = true && that.isSetCnsProfissional();
    if (this_present_cnsProfissional || that_present_cnsProfissional) {
      if (!(this_present_cnsProfissional && that_present_cnsProfissional))
        return false;
      if (!this.cnsProfissional.equals(that.cnsProfissional))
        return false;
    }

    boolean this_present_codigoCbo2002 = true && this.isSetCodigoCbo2002();
    boolean that_present_codigoCbo2002 = true && that.isSetCodigoCbo2002();
    if (this_present_codigoCbo2002 || that_present_codigoCbo2002) {
      if (!(this_present_codigoCbo2002 && that_present_codigoCbo2002))
        return false;
      if (!this.codigoCbo2002.equals(that.codigoCbo2002))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cnsProfissional = true && (isSetCnsProfissional());
    list.add(present_cnsProfissional);
    if (present_cnsProfissional)
      list.add(cnsProfissional);

    boolean present_codigoCbo2002 = true && (isSetCodigoCbo2002());
    list.add(present_codigoCbo2002);
    if (present_codigoCbo2002)
      list.add(codigoCbo2002);

    return list.hashCode();
  }

  @Override
  public int compareTo(ProfissionalCboRowItemThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCnsProfissional()).compareTo(other.isSetCnsProfissional());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCnsProfissional()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cnsProfissional, other.cnsProfissional);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCodigoCbo2002()).compareTo(other.isSetCodigoCbo2002());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodigoCbo2002()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codigoCbo2002, other.codigoCbo2002);
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
    StringBuilder sb = new StringBuilder("ProfissionalCboRowItemThrift(");
    boolean first = true;

    if (isSetCnsProfissional()) {
      sb.append("cnsProfissional:");
      if (this.cnsProfissional == null) {
        sb.append("null");
      } else {
        sb.append(this.cnsProfissional);
      }
      first = false;
    }
    if (isSetCodigoCbo2002()) {
      if (!first) sb.append(", ");
      sb.append("codigoCbo2002:");
      if (this.codigoCbo2002 == null) {
        sb.append("null");
      } else {
        sb.append(this.codigoCbo2002);
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

  private static class ProfissionalCboRowItemThriftStandardSchemeFactory implements SchemeFactory {
    public ProfissionalCboRowItemThriftStandardScheme getScheme() {
      return new ProfissionalCboRowItemThriftStandardScheme();
    }
  }

  private static class ProfissionalCboRowItemThriftStandardScheme extends StandardScheme<ProfissionalCboRowItemThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProfissionalCboRowItemThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CNS_PROFISSIONAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cnsProfissional = iprot.readString();
              struct.setCnsProfissionalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODIGO_CBO2002
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.codigoCbo2002 = iprot.readString();
              struct.setCodigoCbo2002IsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProfissionalCboRowItemThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cnsProfissional != null) {
        if (struct.isSetCnsProfissional()) {
          oprot.writeFieldBegin(CNS_PROFISSIONAL_FIELD_DESC);
          oprot.writeString(struct.cnsProfissional);
          oprot.writeFieldEnd();
        }
      }
      if (struct.codigoCbo2002 != null) {
        if (struct.isSetCodigoCbo2002()) {
          oprot.writeFieldBegin(CODIGO_CBO2002_FIELD_DESC);
          oprot.writeString(struct.codigoCbo2002);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfissionalCboRowItemThriftTupleSchemeFactory implements SchemeFactory {
    public ProfissionalCboRowItemThriftTupleScheme getScheme() {
      return new ProfissionalCboRowItemThriftTupleScheme();
    }
  }

  private static class ProfissionalCboRowItemThriftTupleScheme extends TupleScheme<ProfissionalCboRowItemThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProfissionalCboRowItemThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCnsProfissional()) {
        optionals.set(0);
      }
      if (struct.isSetCodigoCbo2002()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCnsProfissional()) {
        oprot.writeString(struct.cnsProfissional);
      }
      if (struct.isSetCodigoCbo2002()) {
        oprot.writeString(struct.codigoCbo2002);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProfissionalCboRowItemThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.cnsProfissional = iprot.readString();
        struct.setCnsProfissionalIsSet(true);
      }
      if (incoming.get(1)) {
        struct.codigoCbo2002 = iprot.readString();
        struct.setCodigoCbo2002IsSet(true);
      }
    }
  }

}

