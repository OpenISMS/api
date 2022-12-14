// source: io/openisms/api.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.io.openisms.v1.Company');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.io.openisms.v1.Person');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.io.openisms.v1.Company = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.io.openisms.v1.Company.repeatedFields_, null);
};
goog.inherits(proto.io.openisms.v1.Company, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.io.openisms.v1.Company.displayName = 'proto.io.openisms.v1.Company';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.io.openisms.v1.Company.repeatedFields_ = [5];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.io.openisms.v1.Company.prototype.toObject = function(opt_includeInstance) {
  return proto.io.openisms.v1.Company.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.io.openisms.v1.Company} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.io.openisms.v1.Company.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    url: jspb.Message.getFieldWithDefault(msg, 2, ""),
    category: jspb.Message.getFieldWithDefault(msg, 3, ""),
    contact: (f = msg.getContact()) && proto.io.openisms.v1.Person.toObject(includeInstance, f),
    addressList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.io.openisms.v1.Company}
 */
proto.io.openisms.v1.Company.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.io.openisms.v1.Company;
  return proto.io.openisms.v1.Company.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.io.openisms.v1.Company} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.io.openisms.v1.Company}
 */
proto.io.openisms.v1.Company.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setUrl(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCategory(value);
      break;
    case 4:
      var value = new proto.io.openisms.v1.Person;
      reader.readMessage(value,proto.io.openisms.v1.Person.deserializeBinaryFromReader);
      msg.setContact(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.addAddress(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.io.openisms.v1.Company.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.io.openisms.v1.Company.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.io.openisms.v1.Company} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.io.openisms.v1.Company.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getUrl();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCategory();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getContact();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.io.openisms.v1.Person.serializeBinaryToWriter
    );
  }
  f = message.getAddressList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      5,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.io.openisms.v1.Company.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.Company} returns this
 */
proto.io.openisms.v1.Company.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string url = 2;
 * @return {string}
 */
proto.io.openisms.v1.Company.prototype.getUrl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.Company} returns this
 */
proto.io.openisms.v1.Company.prototype.setUrl = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string category = 3;
 * @return {string}
 */
proto.io.openisms.v1.Company.prototype.getCategory = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.Company} returns this
 */
proto.io.openisms.v1.Company.prototype.setCategory = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional Person contact = 4;
 * @return {?proto.io.openisms.v1.Person}
 */
proto.io.openisms.v1.Company.prototype.getContact = function() {
  return /** @type{?proto.io.openisms.v1.Person} */ (
    jspb.Message.getWrapperField(this, proto.io.openisms.v1.Person, 4));
};


/**
 * @param {?proto.io.openisms.v1.Person|undefined} value
 * @return {!proto.io.openisms.v1.Company} returns this
*/
proto.io.openisms.v1.Company.prototype.setContact = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.io.openisms.v1.Company} returns this
 */
proto.io.openisms.v1.Company.prototype.clearContact = function() {
  return this.setContact(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.io.openisms.v1.Company.prototype.hasContact = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * repeated string address = 5;
 * @return {!Array<string>}
 */
proto.io.openisms.v1.Company.prototype.getAddressList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.io.openisms.v1.Company} returns this
 */
proto.io.openisms.v1.Company.prototype.setAddressList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.io.openisms.v1.Company} returns this
 */
proto.io.openisms.v1.Company.prototype.addAddress = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.io.openisms.v1.Company} returns this
 */
proto.io.openisms.v1.Company.prototype.clearAddressList = function() {
  return this.setAddressList([]);
};


