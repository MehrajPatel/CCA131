// ORM class for table 'accounts'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jul 10 19:44:23 PDT 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class accounts extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer acct_num;
  public Integer get_acct_num() {
    return acct_num;
  }
  public void set_acct_num(Integer acct_num) {
    this.acct_num = acct_num;
  }
  public accounts with_acct_num(Integer acct_num) {
    this.acct_num = acct_num;
    return this;
  }
  private java.sql.Timestamp acct_create_dt;
  public java.sql.Timestamp get_acct_create_dt() {
    return acct_create_dt;
  }
  public void set_acct_create_dt(java.sql.Timestamp acct_create_dt) {
    this.acct_create_dt = acct_create_dt;
  }
  public accounts with_acct_create_dt(java.sql.Timestamp acct_create_dt) {
    this.acct_create_dt = acct_create_dt;
    return this;
  }
  private java.sql.Timestamp acct_close_dt;
  public java.sql.Timestamp get_acct_close_dt() {
    return acct_close_dt;
  }
  public void set_acct_close_dt(java.sql.Timestamp acct_close_dt) {
    this.acct_close_dt = acct_close_dt;
  }
  public accounts with_acct_close_dt(java.sql.Timestamp acct_close_dt) {
    this.acct_close_dt = acct_close_dt;
    return this;
  }
  private String first_name;
  public String get_first_name() {
    return first_name;
  }
  public void set_first_name(String first_name) {
    this.first_name = first_name;
  }
  public accounts with_first_name(String first_name) {
    this.first_name = first_name;
    return this;
  }
  private String last_name;
  public String get_last_name() {
    return last_name;
  }
  public void set_last_name(String last_name) {
    this.last_name = last_name;
  }
  public accounts with_last_name(String last_name) {
    this.last_name = last_name;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public accounts with_address(String address) {
    this.address = address;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public accounts with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public accounts with_state(String state) {
    this.state = state;
    return this;
  }
  private String zipcode;
  public String get_zipcode() {
    return zipcode;
  }
  public void set_zipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  public accounts with_zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  private String phone_number;
  public String get_phone_number() {
    return phone_number;
  }
  public void set_phone_number(String phone_number) {
    this.phone_number = phone_number;
  }
  public accounts with_phone_number(String phone_number) {
    this.phone_number = phone_number;
    return this;
  }
  private java.sql.Timestamp created;
  public java.sql.Timestamp get_created() {
    return created;
  }
  public void set_created(java.sql.Timestamp created) {
    this.created = created;
  }
  public accounts with_created(java.sql.Timestamp created) {
    this.created = created;
    return this;
  }
  private java.sql.Timestamp modified;
  public java.sql.Timestamp get_modified() {
    return modified;
  }
  public void set_modified(java.sql.Timestamp modified) {
    this.modified = modified;
  }
  public accounts with_modified(java.sql.Timestamp modified) {
    this.modified = modified;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof accounts)) {
      return false;
    }
    accounts that = (accounts) o;
    boolean equal = true;
    equal = equal && (this.acct_num == null ? that.acct_num == null : this.acct_num.equals(that.acct_num));
    equal = equal && (this.acct_create_dt == null ? that.acct_create_dt == null : this.acct_create_dt.equals(that.acct_create_dt));
    equal = equal && (this.acct_close_dt == null ? that.acct_close_dt == null : this.acct_close_dt.equals(that.acct_close_dt));
    equal = equal && (this.first_name == null ? that.first_name == null : this.first_name.equals(that.first_name));
    equal = equal && (this.last_name == null ? that.last_name == null : this.last_name.equals(that.last_name));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.phone_number == null ? that.phone_number == null : this.phone_number.equals(that.phone_number));
    equal = equal && (this.created == null ? that.created == null : this.created.equals(that.created));
    equal = equal && (this.modified == null ? that.modified == null : this.modified.equals(that.modified));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof accounts)) {
      return false;
    }
    accounts that = (accounts) o;
    boolean equal = true;
    equal = equal && (this.acct_num == null ? that.acct_num == null : this.acct_num.equals(that.acct_num));
    equal = equal && (this.acct_create_dt == null ? that.acct_create_dt == null : this.acct_create_dt.equals(that.acct_create_dt));
    equal = equal && (this.acct_close_dt == null ? that.acct_close_dt == null : this.acct_close_dt.equals(that.acct_close_dt));
    equal = equal && (this.first_name == null ? that.first_name == null : this.first_name.equals(that.first_name));
    equal = equal && (this.last_name == null ? that.last_name == null : this.last_name.equals(that.last_name));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.phone_number == null ? that.phone_number == null : this.phone_number.equals(that.phone_number));
    equal = equal && (this.created == null ? that.created == null : this.created.equals(that.created));
    equal = equal && (this.modified == null ? that.modified == null : this.modified.equals(that.modified));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.acct_num = JdbcWritableBridge.readInteger(1, __dbResults);
    this.acct_create_dt = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.acct_close_dt = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.first_name = JdbcWritableBridge.readString(4, __dbResults);
    this.last_name = JdbcWritableBridge.readString(5, __dbResults);
    this.address = JdbcWritableBridge.readString(6, __dbResults);
    this.city = JdbcWritableBridge.readString(7, __dbResults);
    this.state = JdbcWritableBridge.readString(8, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(9, __dbResults);
    this.phone_number = JdbcWritableBridge.readString(10, __dbResults);
    this.created = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.modified = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.acct_num = JdbcWritableBridge.readInteger(1, __dbResults);
    this.acct_create_dt = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.acct_close_dt = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.first_name = JdbcWritableBridge.readString(4, __dbResults);
    this.last_name = JdbcWritableBridge.readString(5, __dbResults);
    this.address = JdbcWritableBridge.readString(6, __dbResults);
    this.city = JdbcWritableBridge.readString(7, __dbResults);
    this.state = JdbcWritableBridge.readString(8, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(9, __dbResults);
    this.phone_number = JdbcWritableBridge.readString(10, __dbResults);
    this.created = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.modified = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(acct_num, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(acct_create_dt, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(acct_close_dt, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(first_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(phone_number, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(acct_num, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(acct_create_dt, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(acct_close_dt, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(first_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(phone_number, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified, 12 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.acct_num = null;
    } else {
    this.acct_num = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.acct_create_dt = null;
    } else {
    this.acct_create_dt = new Timestamp(__dataIn.readLong());
    this.acct_create_dt.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.acct_close_dt = null;
    } else {
    this.acct_close_dt = new Timestamp(__dataIn.readLong());
    this.acct_close_dt.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.first_name = null;
    } else {
    this.first_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_name = null;
    } else {
    this.last_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zipcode = null;
    } else {
    this.zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.phone_number = null;
    } else {
    this.phone_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created = null;
    } else {
    this.created = new Timestamp(__dataIn.readLong());
    this.created.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.modified = null;
    } else {
    this.modified = new Timestamp(__dataIn.readLong());
    this.modified.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.acct_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.acct_num);
    }
    if (null == this.acct_create_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.acct_create_dt.getTime());
    __dataOut.writeInt(this.acct_create_dt.getNanos());
    }
    if (null == this.acct_close_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.acct_close_dt.getTime());
    __dataOut.writeInt(this.acct_close_dt.getNanos());
    }
    if (null == this.first_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_name);
    }
    if (null == this.last_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_name);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phone_number);
    }
    if (null == this.created) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created.getTime());
    __dataOut.writeInt(this.created.getNanos());
    }
    if (null == this.modified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified.getTime());
    __dataOut.writeInt(this.modified.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.acct_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.acct_num);
    }
    if (null == this.acct_create_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.acct_create_dt.getTime());
    __dataOut.writeInt(this.acct_create_dt.getNanos());
    }
    if (null == this.acct_close_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.acct_close_dt.getTime());
    __dataOut.writeInt(this.acct_close_dt.getNanos());
    }
    if (null == this.first_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_name);
    }
    if (null == this.last_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_name);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.phone_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phone_number);
    }
    if (null == this.created) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created.getTime());
    __dataOut.writeInt(this.created.getNanos());
    }
    if (null == this.modified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified.getTime());
    __dataOut.writeInt(this.modified.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(acct_num==null?"null":"" + acct_num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(acct_create_dt==null?"null":"" + acct_create_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(acct_close_dt==null?"null":"" + acct_close_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_name==null?"null":first_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_name==null?"null":last_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phone_number==null?"null":phone_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created==null?"null":"" + created, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified==null?"null":"" + modified, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(acct_num==null?"null":"" + acct_num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(acct_create_dt==null?"null":"" + acct_create_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(acct_close_dt==null?"null":"" + acct_close_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_name==null?"null":first_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_name==null?"null":last_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phone_number==null?"null":phone_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created==null?"null":"" + created, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified==null?"null":"" + modified, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.acct_num = null; } else {
      this.acct_num = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.acct_create_dt = null; } else {
      this.acct_create_dt = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.acct_close_dt = null; } else {
      this.acct_close_dt = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.first_name = null; } else {
      this.first_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.last_name = null; } else {
      this.last_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phone_number = null; } else {
      this.phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created = null; } else {
      this.created = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified = null; } else {
      this.modified = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.acct_num = null; } else {
      this.acct_num = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.acct_create_dt = null; } else {
      this.acct_create_dt = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.acct_close_dt = null; } else {
      this.acct_close_dt = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.first_name = null; } else {
      this.first_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.last_name = null; } else {
      this.last_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phone_number = null; } else {
      this.phone_number = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created = null; } else {
      this.created = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified = null; } else {
      this.modified = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    accounts o = (accounts) super.clone();
    o.acct_create_dt = (o.acct_create_dt != null) ? (java.sql.Timestamp) o.acct_create_dt.clone() : null;
    o.acct_close_dt = (o.acct_close_dt != null) ? (java.sql.Timestamp) o.acct_close_dt.clone() : null;
    o.created = (o.created != null) ? (java.sql.Timestamp) o.created.clone() : null;
    o.modified = (o.modified != null) ? (java.sql.Timestamp) o.modified.clone() : null;
    return o;
  }

  public void clone0(accounts o) throws CloneNotSupportedException {
    o.acct_create_dt = (o.acct_create_dt != null) ? (java.sql.Timestamp) o.acct_create_dt.clone() : null;
    o.acct_close_dt = (o.acct_close_dt != null) ? (java.sql.Timestamp) o.acct_close_dt.clone() : null;
    o.created = (o.created != null) ? (java.sql.Timestamp) o.created.clone() : null;
    o.modified = (o.modified != null) ? (java.sql.Timestamp) o.modified.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("acct_num", this.acct_num);
    __sqoop$field_map.put("acct_create_dt", this.acct_create_dt);
    __sqoop$field_map.put("acct_close_dt", this.acct_close_dt);
    __sqoop$field_map.put("first_name", this.first_name);
    __sqoop$field_map.put("last_name", this.last_name);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("phone_number", this.phone_number);
    __sqoop$field_map.put("created", this.created);
    __sqoop$field_map.put("modified", this.modified);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("acct_num", this.acct_num);
    __sqoop$field_map.put("acct_create_dt", this.acct_create_dt);
    __sqoop$field_map.put("acct_close_dt", this.acct_close_dt);
    __sqoop$field_map.put("first_name", this.first_name);
    __sqoop$field_map.put("last_name", this.last_name);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("phone_number", this.phone_number);
    __sqoop$field_map.put("created", this.created);
    __sqoop$field_map.put("modified", this.modified);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("acct_num".equals(__fieldName)) {
      this.acct_num = (Integer) __fieldVal;
    }
    else    if ("acct_create_dt".equals(__fieldName)) {
      this.acct_create_dt = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("acct_close_dt".equals(__fieldName)) {
      this.acct_close_dt = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("first_name".equals(__fieldName)) {
      this.first_name = (String) __fieldVal;
    }
    else    if ("last_name".equals(__fieldName)) {
      this.last_name = (String) __fieldVal;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("zipcode".equals(__fieldName)) {
      this.zipcode = (String) __fieldVal;
    }
    else    if ("phone_number".equals(__fieldName)) {
      this.phone_number = (String) __fieldVal;
    }
    else    if ("created".equals(__fieldName)) {
      this.created = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("modified".equals(__fieldName)) {
      this.modified = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("acct_num".equals(__fieldName)) {
      this.acct_num = (Integer) __fieldVal;
      return true;
    }
    else    if ("acct_create_dt".equals(__fieldName)) {
      this.acct_create_dt = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("acct_close_dt".equals(__fieldName)) {
      this.acct_close_dt = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("first_name".equals(__fieldName)) {
      this.first_name = (String) __fieldVal;
      return true;
    }
    else    if ("last_name".equals(__fieldName)) {
      this.last_name = (String) __fieldVal;
      return true;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
      return true;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
      return true;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
      return true;
    }
    else    if ("zipcode".equals(__fieldName)) {
      this.zipcode = (String) __fieldVal;
      return true;
    }
    else    if ("phone_number".equals(__fieldName)) {
      this.phone_number = (String) __fieldVal;
      return true;
    }
    else    if ("created".equals(__fieldName)) {
      this.created = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("modified".equals(__fieldName)) {
      this.modified = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
