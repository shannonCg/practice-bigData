/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.shaice.bigdata.superwebanalytics.schema;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-07-12")
public class PersonPropertyValue extends org.apache.thrift.TUnion<PersonPropertyValue, PersonPropertyValue._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PersonPropertyValue");
  private static final org.apache.thrift.protocol.TField FULL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("full_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FULL_NAME((short)1, "full_name"),
    /**
     * 
     * @see GenderType
     */
    GENDER((short)2, "gender"),
    LOCATION((short)3, "location");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FULL_NAME
          return FULL_NAME;
        case 2: // GENDER
          return GENDER;
        case 3: // LOCATION
          return LOCATION;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FULL_NAME, new org.apache.thrift.meta_data.FieldMetaData("full_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GenderType.class)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Location.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PersonPropertyValue.class, metaDataMap);
  }

  public PersonPropertyValue() {
    super();
  }

  public PersonPropertyValue(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public PersonPropertyValue(PersonPropertyValue other) {
    super(other);
  }
  public PersonPropertyValue deepCopy() {
    return new PersonPropertyValue(this);
  }

  public static PersonPropertyValue full_name(java.lang.String value) {
    PersonPropertyValue x = new PersonPropertyValue();
    x.set_full_name(value);
    return x;
  }

  public static PersonPropertyValue gender(GenderType value) {
    PersonPropertyValue x = new PersonPropertyValue();
    x.set_gender(value);
    return x;
  }

  public static PersonPropertyValue location(Location value) {
    PersonPropertyValue x = new PersonPropertyValue();
    x.set_location(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case FULL_NAME:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'full_name', but got " + value.getClass().getSimpleName());
      case GENDER:
        if (value instanceof GenderType) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type GenderType for field 'gender', but got " + value.getClass().getSimpleName());
      case LOCATION:
        if (value instanceof Location) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type Location for field 'location', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case FULL_NAME:
          if (field.type == FULL_NAME_FIELD_DESC.type) {
            java.lang.String full_name;
            full_name = iprot.readString();
            return full_name;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case GENDER:
          if (field.type == GENDER_FIELD_DESC.type) {
            GenderType gender;
            gender = com.shaice.bigdata.superwebanalytics.schema.GenderType.findByValue(iprot.readI32());
            return gender;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LOCATION:
          if (field.type == LOCATION_FIELD_DESC.type) {
            Location location;
            location = new Location();
            location.read(iprot);
            return location;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case FULL_NAME:
        java.lang.String full_name = (java.lang.String)value_;
        oprot.writeString(full_name);
        return;
      case GENDER:
        GenderType gender = (GenderType)value_;
        oprot.writeI32(gender.getValue());
        return;
      case LOCATION:
        Location location = (Location)value_;
        location.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case FULL_NAME:
          java.lang.String full_name;
          full_name = iprot.readString();
          return full_name;
        case GENDER:
          GenderType gender;
          gender = com.shaice.bigdata.superwebanalytics.schema.GenderType.findByValue(iprot.readI32());
          return gender;
        case LOCATION:
          Location location;
          location = new Location();
          location.read(iprot);
          return location;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case FULL_NAME:
        java.lang.String full_name = (java.lang.String)value_;
        oprot.writeString(full_name);
        return;
      case GENDER:
        GenderType gender = (GenderType)value_;
        oprot.writeI32(gender.getValue());
        return;
      case LOCATION:
        Location location = (Location)value_;
        location.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case FULL_NAME:
        return FULL_NAME_FIELD_DESC;
      case GENDER:
        return GENDER_FIELD_DESC;
      case LOCATION:
        return LOCATION_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public java.lang.String get_full_name() {
    if (getSetField() == _Fields.FULL_NAME) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'full_name' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_full_name(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.FULL_NAME;
    value_ = value;
  }

  /**
   * 
   * @see GenderType
   */
  public GenderType get_gender() {
    if (getSetField() == _Fields.GENDER) {
      return (GenderType)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'gender' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * 
   * @see GenderType
   */
  public void set_gender(GenderType value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.GENDER;
    value_ = value;
  }

  public Location get_location() {
    if (getSetField() == _Fields.LOCATION) {
      return (Location)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'location' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_location(Location value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.LOCATION;
    value_ = value;
  }

  public boolean is_set_full_name() {
    return setField_ == _Fields.FULL_NAME;
  }


  public boolean is_set_gender() {
    return setField_ == _Fields.GENDER;
  }


  public boolean is_set_location() {
    return setField_ == _Fields.LOCATION;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof PersonPropertyValue) {
      return equals((PersonPropertyValue)other);
    } else {
      return false;
    }
  }

  public boolean equals(PersonPropertyValue other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(PersonPropertyValue other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
