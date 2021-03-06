/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-03-29")
public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable, Comparable<User> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASS_WORD_FIELD_DESC = new org.apache.thrift.protocol.TField("passWord", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("mail", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("phone", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField IS_LOGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("isLogin", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String userName; // optional
  public @org.apache.thrift.annotation.Nullable String passWord; // optional
  public @org.apache.thrift.annotation.Nullable String mail; // optional
  public long phone; // optional
  public boolean isLogin; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_NAME((short)1, "userName"),
    PASS_WORD((short)2, "passWord"),
    MAIL((short)3, "mail"),
    PHONE((short)4, "phone"),
    IS_LOGIN((short)5, "isLogin");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

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
        case 1: // USER_NAME
          return USER_NAME;
        case 2: // PASS_WORD
          return PASS_WORD;
        case 3: // MAIL
          return MAIL;
        case 4: // PHONE
          return PHONE;
        case 5: // IS_LOGIN
          return IS_LOGIN;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __PHONE_ISSET_ID = 0;
  private static final int __ISLOGIN_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USER_NAME,_Fields.PASS_WORD,_Fields.MAIL,_Fields.PHONE,_Fields.IS_LOGIN};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.PASS_WORD, new org.apache.thrift.meta_data.FieldMetaData("passWord", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.MAIL, new org.apache.thrift.meta_data.FieldMetaData("mail", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.PHONE, new org.apache.thrift.meta_data.FieldMetaData("phone", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
    tmpMap.put(_Fields.IS_LOGIN, new org.apache.thrift.meta_data.FieldMetaData("isLogin", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL        , "boolean")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
  }

  public User(String asd, String s, String s1, int i, boolean b) {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public User(User other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetPassWord()) {
      this.passWord = other.passWord;
    }
    if (other.isSetMail()) {
      this.mail = other.mail;
    }
    this.phone = other.phone;
    this.isLogin = other.isLogin;
  }

  public User deepCopy() {
    return new User(this);
  }

  @Override
  public void clear() {
    this.userName = null;
    this.passWord = null;
    this.mail = null;
    setPhoneIsSet(false);
    this.phone = 0;
    setIsLoginIsSet(false);
    this.isLogin = false;
  }

  @org.apache.thrift.annotation.Nullable
  public String getUserName() {
    return this.userName;
  }

  public User setUserName(@org.apache.thrift.annotation.Nullable String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getPassWord() {
    return this.passWord;
  }

  public User setPassWord(@org.apache.thrift.annotation.Nullable String passWord) {
    this.passWord = passWord;
    return this;
  }

  public void unsetPassWord() {
    this.passWord = null;
  }

  /** Returns true if field passWord is set (has been assigned a value) and false otherwise */
  public boolean isSetPassWord() {
    return this.passWord != null;
  }

  public void setPassWordIsSet(boolean value) {
    if (!value) {
      this.passWord = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getMail() {
    return this.mail;
  }

  public User setMail(@org.apache.thrift.annotation.Nullable String mail) {
    this.mail = mail;
    return this;
  }

  public void unsetMail() {
    this.mail = null;
  }

  /** Returns true if field mail is set (has been assigned a value) and false otherwise */
  public boolean isSetMail() {
    return this.mail != null;
  }

  public void setMailIsSet(boolean value) {
    if (!value) {
      this.mail = null;
    }
  }

  public long getPhone() {
    return this.phone;
  }

  public User setPhone(long phone) {
    this.phone = phone;
    setPhoneIsSet(true);
    return this;
  }

  public void unsetPhone() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PHONE_ISSET_ID);
  }

  /** Returns true if field phone is set (has been assigned a value) and false otherwise */
  public boolean isSetPhone() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PHONE_ISSET_ID);
  }

  public void setPhoneIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PHONE_ISSET_ID, value);
  }

  public boolean isIsLogin() {
    return this.isLogin;
  }

  public User setIsLogin(boolean isLogin) {
    this.isLogin = isLogin;
    setIsLoginIsSet(true);
    return this;
  }

  public void unsetIsLogin() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISLOGIN_ISSET_ID);
  }

  /** Returns true if field isLogin is set (has been assigned a value) and false otherwise */
  public boolean isSetIsLogin() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISLOGIN_ISSET_ID);
  }

  public void setIsLoginIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISLOGIN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case PASS_WORD:
      if (value == null) {
        unsetPassWord();
      } else {
        setPassWord((String)value);
      }
      break;

    case MAIL:
      if (value == null) {
        unsetMail();
      } else {
        setMail((String)value);
      }
      break;

    case PHONE:
      if (value == null) {
        unsetPhone();
      } else {
        setPhone((Long)value);
      }
      break;

    case IS_LOGIN:
      if (value == null) {
        unsetIsLogin();
      } else {
        setIsLogin((Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_NAME:
      return getUserName();

    case PASS_WORD:
      return getPassWord();

    case MAIL:
      return getMail();

    case PHONE:
      return getPhone();

    case IS_LOGIN:
      return isIsLogin();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_NAME:
      return isSetUserName();
    case PASS_WORD:
      return isSetPassWord();
    case MAIL:
      return isSetMail();
    case PHONE:
      return isSetPhone();
    case IS_LOGIN:
      return isSetIsLogin();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof User)
      return this.equals((User)that);
    return false;
  }

  public boolean equals(User that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_passWord = true && this.isSetPassWord();
    boolean that_present_passWord = true && that.isSetPassWord();
    if (this_present_passWord || that_present_passWord) {
      if (!(this_present_passWord && that_present_passWord))
        return false;
      if (!this.passWord.equals(that.passWord))
        return false;
    }

    boolean this_present_mail = true && this.isSetMail();
    boolean that_present_mail = true && that.isSetMail();
    if (this_present_mail || that_present_mail) {
      if (!(this_present_mail && that_present_mail))
        return false;
      if (!this.mail.equals(that.mail))
        return false;
    }

    boolean this_present_phone = true && this.isSetPhone();
    boolean that_present_phone = true && that.isSetPhone();
    if (this_present_phone || that_present_phone) {
      if (!(this_present_phone && that_present_phone))
        return false;
      if (this.phone != that.phone)
        return false;
    }

    boolean this_present_isLogin = true && this.isSetIsLogin();
    boolean that_present_isLogin = true && that.isSetIsLogin();
    if (this_present_isLogin || that_present_isLogin) {
      if (!(this_present_isLogin && that_present_isLogin))
        return false;
      if (this.isLogin != that.isLogin)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserName()) ? 131071 : 524287);
    if (isSetUserName())
      hashCode = hashCode * 8191 + userName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPassWord()) ? 131071 : 524287);
    if (isSetPassWord())
      hashCode = hashCode * 8191 + passWord.hashCode();

    hashCode = hashCode * 8191 + ((isSetMail()) ? 131071 : 524287);
    if (isSetMail())
      hashCode = hashCode * 8191 + mail.hashCode();

    hashCode = hashCode * 8191 + ((isSetPhone()) ? 131071 : 524287);
    if (isSetPhone())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(phone);

    hashCode = hashCode * 8191 + ((isSetIsLogin()) ? 131071 : 524287);
    if (isSetIsLogin())
      hashCode = hashCode * 8191 + ((isLogin) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(User other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassWord()).compareTo(other.isSetPassWord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassWord()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.passWord, other.passWord);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMail()).compareTo(other.isSetMail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mail, other.mail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhone()).compareTo(other.isSetPhone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phone, other.phone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsLogin()).compareTo(other.isSetIsLogin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsLogin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isLogin, other.isLogin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("User(");
    boolean first = true;

    if (isSetUserName()) {
      sb.append("userName:");
      if (this.userName == null) {
        sb.append("null");
      } else {
        sb.append(this.userName);
      }
      first = false;
    }
    if (isSetPassWord()) {
      if (!first) sb.append(", ");
      sb.append("passWord:");
      if (this.passWord == null) {
        sb.append("null");
      } else {
        sb.append(this.passWord);
      }
      first = false;
    }
    if (isSetMail()) {
      if (!first) sb.append(", ");
      sb.append("mail:");
      if (this.mail == null) {
        sb.append("null");
      } else {
        sb.append(this.mail);
      }
      first = false;
    }
    if (isSetPhone()) {
      if (!first) sb.append(", ");
      sb.append("phone:");
      sb.append(this.phone);
      first = false;
    }
    if (isSetIsLogin()) {
      if (!first) sb.append(", ");
      sb.append("isLogin:");
      sb.append(this.isLogin);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserStandardScheme getScheme() {
      return new UserStandardScheme();
    }
  }

  private static class UserStandardScheme extends org.apache.thrift.scheme.StandardScheme<User> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASS_WORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.passWord = iprot.readString();
              struct.setPassWordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mail = iprot.readString();
              struct.setMailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PHONE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.phone = iprot.readI64();
              struct.setPhoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_LOGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isLogin = iprot.readBool();
              struct.setIsLoginIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userName != null) {
        if (struct.isSetUserName()) {
          oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
          oprot.writeString(struct.userName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.passWord != null) {
        if (struct.isSetPassWord()) {
          oprot.writeFieldBegin(PASS_WORD_FIELD_DESC);
          oprot.writeString(struct.passWord);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mail != null) {
        if (struct.isSetMail()) {
          oprot.writeFieldBegin(MAIL_FIELD_DESC);
          oprot.writeString(struct.mail);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPhone()) {
        oprot.writeFieldBegin(PHONE_FIELD_DESC);
        oprot.writeI64(struct.phone);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsLogin()) {
        oprot.writeFieldBegin(IS_LOGIN_FIELD_DESC);
        oprot.writeBool(struct.isLogin);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserTupleScheme getScheme() {
      return new UserTupleScheme();
    }
  }

  private static class UserTupleScheme extends org.apache.thrift.scheme.TupleScheme<User> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUserName()) {
        optionals.set(0);
      }
      if (struct.isSetPassWord()) {
        optionals.set(1);
      }
      if (struct.isSetMail()) {
        optionals.set(2);
      }
      if (struct.isSetPhone()) {
        optionals.set(3);
      }
      if (struct.isSetIsLogin()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetUserName()) {
        oprot.writeString(struct.userName);
      }
      if (struct.isSetPassWord()) {
        oprot.writeString(struct.passWord);
      }
      if (struct.isSetMail()) {
        oprot.writeString(struct.mail);
      }
      if (struct.isSetPhone()) {
        oprot.writeI64(struct.phone);
      }
      if (struct.isSetIsLogin()) {
        oprot.writeBool(struct.isLogin);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.userName = iprot.readString();
        struct.setUserNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.passWord = iprot.readString();
        struct.setPassWordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mail = iprot.readString();
        struct.setMailIsSet(true);
      }
      if (incoming.get(3)) {
        struct.phone = iprot.readI64();
        struct.setPhoneIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isLogin = iprot.readBool();
        struct.setIsLoginIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

