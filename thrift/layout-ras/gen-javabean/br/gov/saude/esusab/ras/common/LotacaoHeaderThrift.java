/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.common;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2021-06-21")
public class LotacaoHeaderThrift implements org.apache.thrift.TBase<LotacaoHeaderThrift, LotacaoHeaderThrift._Fields>, java.io.Serializable, Cloneable, Comparable<LotacaoHeaderThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LotacaoHeaderThrift");

  private static final org.apache.thrift.protocol.TField PROFISSIONAL_CNS_FIELD_DESC = new org.apache.thrift.protocol.TField("profissionalCNS", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CBO_CODIGO_2002_FIELD_DESC = new org.apache.thrift.protocol.TField("cboCodigo_2002", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CNES_FIELD_DESC = new org.apache.thrift.protocol.TField("cnes", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField INE_FIELD_DESC = new org.apache.thrift.protocol.TField("ine", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LotacaoHeaderThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LotacaoHeaderThriftTupleSchemeFactory());
  }

  private String profissionalCNS; // optional
  private String cboCodigo_2002; // optional
  private String cnes; // optional
  private String ine; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROFISSIONAL_CNS((short)1, "profissionalCNS"),
    CBO_CODIGO_2002((short)2, "cboCodigo_2002"),
    CNES((short)3, "cnes"),
    INE((short)4, "ine");

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
        case 1: // PROFISSIONAL_CNS
          return PROFISSIONAL_CNS;
        case 2: // CBO_CODIGO_2002
          return CBO_CODIGO_2002;
        case 3: // CNES
          return CNES;
        case 4: // INE
          return INE;
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
  private static final _Fields optionals[] = {_Fields.PROFISSIONAL_CNS,_Fields.CBO_CODIGO_2002,_Fields.CNES,_Fields.INE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROFISSIONAL_CNS, new org.apache.thrift.meta_data.FieldMetaData("profissionalCNS", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CBO_CODIGO_2002, new org.apache.thrift.meta_data.FieldMetaData("cboCodigo_2002", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CNES, new org.apache.thrift.meta_data.FieldMetaData("cnes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INE, new org.apache.thrift.meta_data.FieldMetaData("ine", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LotacaoHeaderThrift.class, metaDataMap);
  }

  public LotacaoHeaderThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LotacaoHeaderThrift(LotacaoHeaderThrift other) {
    if (other.isSetProfissionalCNS()) {
      this.profissionalCNS = other.profissionalCNS;
    }
    if (other.isSetCboCodigo_2002()) {
      this.cboCodigo_2002 = other.cboCodigo_2002;
    }
    if (other.isSetCnes()) {
      this.cnes = other.cnes;
    }
    if (other.isSetIne()) {
      this.ine = other.ine;
    }
  }

  public LotacaoHeaderThrift deepCopy() {
    return new LotacaoHeaderThrift(this);
  }

  @Override
  public void clear() {
    this.profissionalCNS = null;
    this.cboCodigo_2002 = null;
    this.cnes = null;
    this.ine = null;
  }

  public String getProfissionalCNS() {
    return this.profissionalCNS;
  }

  public void setProfissionalCNS(String profissionalCNS) {
    this.profissionalCNS = profissionalCNS;
  }

  public void unsetProfissionalCNS() {
    this.profissionalCNS = null;
  }

  /** Returns true if field profissionalCNS is set (has been assigned a value) and false otherwise */
  public boolean isSetProfissionalCNS() {
    return this.profissionalCNS != null;
  }

  public void setProfissionalCNSIsSet(boolean value) {
    if (!value) {
      this.profissionalCNS = null;
    }
  }

  public String getCboCodigo_2002() {
    return this.cboCodigo_2002;
  }

  public void setCboCodigo_2002(String cboCodigo_2002) {
    this.cboCodigo_2002 = cboCodigo_2002;
  }

  public void unsetCboCodigo_2002() {
    this.cboCodigo_2002 = null;
  }

  /** Returns true if field cboCodigo_2002 is set (has been assigned a value) and false otherwise */
  public boolean isSetCboCodigo_2002() {
    return this.cboCodigo_2002 != null;
  }

  public void setCboCodigo_2002IsSet(boolean value) {
    if (!value) {
      this.cboCodigo_2002 = null;
    }
  }

  public String getCnes() {
    return this.cnes;
  }

  public void setCnes(String cnes) {
    this.cnes = cnes;
  }

  public void unsetCnes() {
    this.cnes = null;
  }

  /** Returns true if field cnes is set (has been assigned a value) and false otherwise */
  public boolean isSetCnes() {
    return this.cnes != null;
  }

  public void setCnesIsSet(boolean value) {
    if (!value) {
      this.cnes = null;
    }
  }

  public String getIne() {
    return this.ine;
  }

  public void setIne(String ine) {
    this.ine = ine;
  }

  public void unsetIne() {
    this.ine = null;
  }

  /** Returns true if field ine is set (has been assigned a value) and false otherwise */
  public boolean isSetIne() {
    return this.ine != null;
  }

  public void setIneIsSet(boolean value) {
    if (!value) {
      this.ine = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROFISSIONAL_CNS:
      if (value == null) {
        unsetProfissionalCNS();
      } else {
        setProfissionalCNS((String)value);
      }
      break;

    case CBO_CODIGO_2002:
      if (value == null) {
        unsetCboCodigo_2002();
      } else {
        setCboCodigo_2002((String)value);
      }
      break;

    case CNES:
      if (value == null) {
        unsetCnes();
      } else {
        setCnes((String)value);
      }
      break;

    case INE:
      if (value == null) {
        unsetIne();
      } else {
        setIne((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROFISSIONAL_CNS:
      return getProfissionalCNS();

    case CBO_CODIGO_2002:
      return getCboCodigo_2002();

    case CNES:
      return getCnes();

    case INE:
      return getIne();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROFISSIONAL_CNS:
      return isSetProfissionalCNS();
    case CBO_CODIGO_2002:
      return isSetCboCodigo_2002();
    case CNES:
      return isSetCnes();
    case INE:
      return isSetIne();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LotacaoHeaderThrift)
      return this.equals((LotacaoHeaderThrift)that);
    return false;
  }

  public boolean equals(LotacaoHeaderThrift that) {
    if (that == null)
      return false;

    boolean this_present_profissionalCNS = true && this.isSetProfissionalCNS();
    boolean that_present_profissionalCNS = true && that.isSetProfissionalCNS();
    if (this_present_profissionalCNS || that_present_profissionalCNS) {
      if (!(this_present_profissionalCNS && that_present_profissionalCNS))
        return false;
      if (!this.profissionalCNS.equals(that.profissionalCNS))
        return false;
    }

    boolean this_present_cboCodigo_2002 = true && this.isSetCboCodigo_2002();
    boolean that_present_cboCodigo_2002 = true && that.isSetCboCodigo_2002();
    if (this_present_cboCodigo_2002 || that_present_cboCodigo_2002) {
      if (!(this_present_cboCodigo_2002 && that_present_cboCodigo_2002))
        return false;
      if (!this.cboCodigo_2002.equals(that.cboCodigo_2002))
        return false;
    }

    boolean this_present_cnes = true && this.isSetCnes();
    boolean that_present_cnes = true && that.isSetCnes();
    if (this_present_cnes || that_present_cnes) {
      if (!(this_present_cnes && that_present_cnes))
        return false;
      if (!this.cnes.equals(that.cnes))
        return false;
    }

    boolean this_present_ine = true && this.isSetIne();
    boolean that_present_ine = true && that.isSetIne();
    if (this_present_ine || that_present_ine) {
      if (!(this_present_ine && that_present_ine))
        return false;
      if (!this.ine.equals(that.ine))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_profissionalCNS = true && (isSetProfissionalCNS());
    list.add(present_profissionalCNS);
    if (present_profissionalCNS)
      list.add(profissionalCNS);

    boolean present_cboCodigo_2002 = true && (isSetCboCodigo_2002());
    list.add(present_cboCodigo_2002);
    if (present_cboCodigo_2002)
      list.add(cboCodigo_2002);

    boolean present_cnes = true && (isSetCnes());
    list.add(present_cnes);
    if (present_cnes)
      list.add(cnes);

    boolean present_ine = true && (isSetIne());
    list.add(present_ine);
    if (present_ine)
      list.add(ine);

    return list.hashCode();
  }

  @Override
  public int compareTo(LotacaoHeaderThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProfissionalCNS()).compareTo(other.isSetProfissionalCNS());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfissionalCNS()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profissionalCNS, other.profissionalCNS);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCboCodigo_2002()).compareTo(other.isSetCboCodigo_2002());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCboCodigo_2002()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cboCodigo_2002, other.cboCodigo_2002);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCnes()).compareTo(other.isSetCnes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCnes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cnes, other.cnes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIne()).compareTo(other.isSetIne());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIne()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ine, other.ine);
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
    StringBuilder sb = new StringBuilder("LotacaoHeaderThrift(");
    boolean first = true;

    if (isSetProfissionalCNS()) {
      sb.append("profissionalCNS:");
      if (this.profissionalCNS == null) {
        sb.append("null");
      } else {
        sb.append(this.profissionalCNS);
      }
      first = false;
    }
    if (isSetCboCodigo_2002()) {
      if (!first) sb.append(", ");
      sb.append("cboCodigo_2002:");
      if (this.cboCodigo_2002 == null) {
        sb.append("null");
      } else {
        sb.append(this.cboCodigo_2002);
      }
      first = false;
    }
    if (isSetCnes()) {
      if (!first) sb.append(", ");
      sb.append("cnes:");
      if (this.cnes == null) {
        sb.append("null");
      } else {
        sb.append(this.cnes);
      }
      first = false;
    }
    if (isSetIne()) {
      if (!first) sb.append(", ");
      sb.append("ine:");
      if (this.ine == null) {
        sb.append("null");
      } else {
        sb.append(this.ine);
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

  private static class LotacaoHeaderThriftStandardSchemeFactory implements SchemeFactory {
    public LotacaoHeaderThriftStandardScheme getScheme() {
      return new LotacaoHeaderThriftStandardScheme();
    }
  }

  private static class LotacaoHeaderThriftStandardScheme extends StandardScheme<LotacaoHeaderThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LotacaoHeaderThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROFISSIONAL_CNS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.profissionalCNS = iprot.readString();
              struct.setProfissionalCNSIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CBO_CODIGO_2002
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cboCodigo_2002 = iprot.readString();
              struct.setCboCodigo_2002IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CNES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cnes = iprot.readString();
              struct.setCnesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ine = iprot.readString();
              struct.setIneIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LotacaoHeaderThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.profissionalCNS != null) {
        if (struct.isSetProfissionalCNS()) {
          oprot.writeFieldBegin(PROFISSIONAL_CNS_FIELD_DESC);
          oprot.writeString(struct.profissionalCNS);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cboCodigo_2002 != null) {
        if (struct.isSetCboCodigo_2002()) {
          oprot.writeFieldBegin(CBO_CODIGO_2002_FIELD_DESC);
          oprot.writeString(struct.cboCodigo_2002);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cnes != null) {
        if (struct.isSetCnes()) {
          oprot.writeFieldBegin(CNES_FIELD_DESC);
          oprot.writeString(struct.cnes);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ine != null) {
        if (struct.isSetIne()) {
          oprot.writeFieldBegin(INE_FIELD_DESC);
          oprot.writeString(struct.ine);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LotacaoHeaderThriftTupleSchemeFactory implements SchemeFactory {
    public LotacaoHeaderThriftTupleScheme getScheme() {
      return new LotacaoHeaderThriftTupleScheme();
    }
  }

  private static class LotacaoHeaderThriftTupleScheme extends TupleScheme<LotacaoHeaderThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LotacaoHeaderThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProfissionalCNS()) {
        optionals.set(0);
      }
      if (struct.isSetCboCodigo_2002()) {
        optionals.set(1);
      }
      if (struct.isSetCnes()) {
        optionals.set(2);
      }
      if (struct.isSetIne()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetProfissionalCNS()) {
        oprot.writeString(struct.profissionalCNS);
      }
      if (struct.isSetCboCodigo_2002()) {
        oprot.writeString(struct.cboCodigo_2002);
      }
      if (struct.isSetCnes()) {
        oprot.writeString(struct.cnes);
      }
      if (struct.isSetIne()) {
        oprot.writeString(struct.ine);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LotacaoHeaderThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.profissionalCNS = iprot.readString();
        struct.setProfissionalCNSIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cboCodigo_2002 = iprot.readString();
        struct.setCboCodigo_2002IsSet(true);
      }
      if (incoming.get(2)) {
        struct.cnes = iprot.readString();
        struct.setCnesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ine = iprot.readString();
        struct.setIneIsSet(true);
      }
    }
  }

}

