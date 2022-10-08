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

goog.provide('proto.io.openisms.v1.PhysicalObject');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.io.openisms.v1.Application');
goog.require('proto.io.openisms.v1.Network');
goog.require('proto.io.openisms.v1.OperatingSystem');
goog.require('proto.io.openisms.v1.Profile');
goog.require('proto.io.openisms.v1.SecurityFeatures');

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
proto.io.openisms.v1.PhysicalObject = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.io.openisms.v1.PhysicalObject.repeatedFields_, null);
};
goog.inherits(proto.io.openisms.v1.PhysicalObject, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.io.openisms.v1.PhysicalObject.displayName = 'proto.io.openisms.v1.PhysicalObject';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.io.openisms.v1.PhysicalObject.repeatedFields_ = [9,11,14,15,20];



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
proto.io.openisms.v1.PhysicalObject.prototype.toObject = function(opt_includeInstance) {
  return proto.io.openisms.v1.PhysicalObject.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.io.openisms.v1.PhysicalObject} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.io.openisms.v1.PhysicalObject.toObject = function(includeInstance, msg) {
  var f, obj = {
    type: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    manufacturer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    vendor: jspb.Message.getFieldWithDefault(msg, 4, ""),
    identifier: jspb.Message.getFieldWithDefault(msg, 5, ""),
    serialNumber: jspb.Message.getFieldWithDefault(msg, 6, ""),
    imei: jspb.Message.getFieldWithDefault(msg, 7, ""),
    meid: jspb.Message.getFieldWithDefault(msg, 8, ""),
    networksList: jspb.Message.toObjectList(msg.getNetworksList(),
    proto.io.openisms.v1.Network.toObject, includeInstance),
    hostname: jspb.Message.getFieldWithDefault(msg, 10, ""),
    userAccountsList: (f = jspb.Message.getRepeatedField(msg, 11)) == null ? undefined : f,
    os: (f = msg.getOs()) && proto.io.openisms.v1.OperatingSystem.toObject(includeInstance, f),
    security: (f = msg.getSecurity()) && proto.io.openisms.v1.SecurityFeatures.toObject(includeInstance, f),
    profilesList: jspb.Message.toObjectList(msg.getProfilesList(),
    proto.io.openisms.v1.Profile.toObject, includeInstance),
    appsList: jspb.Message.toObjectList(msg.getAppsList(),
    proto.io.openisms.v1.Application.toObject, includeInstance),
    tagsList: (f = jspb.Message.getRepeatedField(msg, 20)) == null ? undefined : f
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
 * @return {!proto.io.openisms.v1.PhysicalObject}
 */
proto.io.openisms.v1.PhysicalObject.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.io.openisms.v1.PhysicalObject;
  return proto.io.openisms.v1.PhysicalObject.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.io.openisms.v1.PhysicalObject} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.io.openisms.v1.PhysicalObject}
 */
proto.io.openisms.v1.PhysicalObject.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setType(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setManufacturer(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setVendor(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setIdentifier(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setSerialNumber(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setImei(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setMeid(value);
      break;
    case 9:
      var value = new proto.io.openisms.v1.Network;
      reader.readMessage(value,proto.io.openisms.v1.Network.deserializeBinaryFromReader);
      msg.addNetworks(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostname(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.addUserAccounts(value);
      break;
    case 12:
      var value = new proto.io.openisms.v1.OperatingSystem;
      reader.readMessage(value,proto.io.openisms.v1.OperatingSystem.deserializeBinaryFromReader);
      msg.setOs(value);
      break;
    case 13:
      var value = new proto.io.openisms.v1.SecurityFeatures;
      reader.readMessage(value,proto.io.openisms.v1.SecurityFeatures.deserializeBinaryFromReader);
      msg.setSecurity(value);
      break;
    case 14:
      var value = new proto.io.openisms.v1.Profile;
      reader.readMessage(value,proto.io.openisms.v1.Profile.deserializeBinaryFromReader);
      msg.addProfiles(value);
      break;
    case 15:
      var value = new proto.io.openisms.v1.Application;
      reader.readMessage(value,proto.io.openisms.v1.Application.deserializeBinaryFromReader);
      msg.addApps(value);
      break;
    case 20:
      var value = /** @type {string} */ (reader.readString());
      msg.addTags(value);
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
proto.io.openisms.v1.PhysicalObject.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.io.openisms.v1.PhysicalObject.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.io.openisms.v1.PhysicalObject} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.io.openisms.v1.PhysicalObject.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getType();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getManufacturer();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getVendor();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getIdentifier();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getSerialNumber();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getImei();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getMeid();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getNetworksList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.io.openisms.v1.Network.serializeBinaryToWriter
    );
  }
  f = message.getHostname();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getUserAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      11,
      f
    );
  }
  f = message.getOs();
  if (f != null) {
    writer.writeMessage(
      12,
      f,
      proto.io.openisms.v1.OperatingSystem.serializeBinaryToWriter
    );
  }
  f = message.getSecurity();
  if (f != null) {
    writer.writeMessage(
      13,
      f,
      proto.io.openisms.v1.SecurityFeatures.serializeBinaryToWriter
    );
  }
  f = message.getProfilesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      14,
      f,
      proto.io.openisms.v1.Profile.serializeBinaryToWriter
    );
  }
  f = message.getAppsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      15,
      f,
      proto.io.openisms.v1.Application.serializeBinaryToWriter
    );
  }
  f = message.getTagsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      20,
      f
    );
  }
};


/**
 * optional string type = 1;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setType = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string manufacturer = 3;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getManufacturer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setManufacturer = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string vendor = 4;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getVendor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setVendor = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string identifier = 5;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getIdentifier = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setIdentifier = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string serial_number = 6;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getSerialNumber = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setSerialNumber = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string imei = 7;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getImei = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setImei = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string meid = 8;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getMeid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setMeid = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * repeated Network networks = 9;
 * @return {!Array<!proto.io.openisms.v1.Network>}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getNetworksList = function() {
  return /** @type{!Array<!proto.io.openisms.v1.Network>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.io.openisms.v1.Network, 9));
};


/**
 * @param {!Array<!proto.io.openisms.v1.Network>} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
*/
proto.io.openisms.v1.PhysicalObject.prototype.setNetworksList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.io.openisms.v1.Network=} opt_value
 * @param {number=} opt_index
 * @return {!proto.io.openisms.v1.Network}
 */
proto.io.openisms.v1.PhysicalObject.prototype.addNetworks = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.io.openisms.v1.Network, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.clearNetworksList = function() {
  return this.setNetworksList([]);
};


/**
 * optional string hostname = 10;
 * @return {string}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getHostname = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setHostname = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * repeated string user_accounts = 11;
 * @return {!Array<string>}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getUserAccountsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 11));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setUserAccountsList = function(value) {
  return jspb.Message.setField(this, 11, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.addUserAccounts = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 11, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.clearUserAccountsList = function() {
  return this.setUserAccountsList([]);
};


/**
 * optional OperatingSystem os = 12;
 * @return {?proto.io.openisms.v1.OperatingSystem}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getOs = function() {
  return /** @type{?proto.io.openisms.v1.OperatingSystem} */ (
    jspb.Message.getWrapperField(this, proto.io.openisms.v1.OperatingSystem, 12));
};


/**
 * @param {?proto.io.openisms.v1.OperatingSystem|undefined} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
*/
proto.io.openisms.v1.PhysicalObject.prototype.setOs = function(value) {
  return jspb.Message.setWrapperField(this, 12, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.clearOs = function() {
  return this.setOs(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.io.openisms.v1.PhysicalObject.prototype.hasOs = function() {
  return jspb.Message.getField(this, 12) != null;
};


/**
 * optional SecurityFeatures security = 13;
 * @return {?proto.io.openisms.v1.SecurityFeatures}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getSecurity = function() {
  return /** @type{?proto.io.openisms.v1.SecurityFeatures} */ (
    jspb.Message.getWrapperField(this, proto.io.openisms.v1.SecurityFeatures, 13));
};


/**
 * @param {?proto.io.openisms.v1.SecurityFeatures|undefined} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
*/
proto.io.openisms.v1.PhysicalObject.prototype.setSecurity = function(value) {
  return jspb.Message.setWrapperField(this, 13, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.clearSecurity = function() {
  return this.setSecurity(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.io.openisms.v1.PhysicalObject.prototype.hasSecurity = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * repeated Profile profiles = 14;
 * @return {!Array<!proto.io.openisms.v1.Profile>}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getProfilesList = function() {
  return /** @type{!Array<!proto.io.openisms.v1.Profile>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.io.openisms.v1.Profile, 14));
};


/**
 * @param {!Array<!proto.io.openisms.v1.Profile>} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
*/
proto.io.openisms.v1.PhysicalObject.prototype.setProfilesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 14, value);
};


/**
 * @param {!proto.io.openisms.v1.Profile=} opt_value
 * @param {number=} opt_index
 * @return {!proto.io.openisms.v1.Profile}
 */
proto.io.openisms.v1.PhysicalObject.prototype.addProfiles = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 14, opt_value, proto.io.openisms.v1.Profile, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.clearProfilesList = function() {
  return this.setProfilesList([]);
};


/**
 * repeated Application apps = 15;
 * @return {!Array<!proto.io.openisms.v1.Application>}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getAppsList = function() {
  return /** @type{!Array<!proto.io.openisms.v1.Application>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.io.openisms.v1.Application, 15));
};


/**
 * @param {!Array<!proto.io.openisms.v1.Application>} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
*/
proto.io.openisms.v1.PhysicalObject.prototype.setAppsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 15, value);
};


/**
 * @param {!proto.io.openisms.v1.Application=} opt_value
 * @param {number=} opt_index
 * @return {!proto.io.openisms.v1.Application}
 */
proto.io.openisms.v1.PhysicalObject.prototype.addApps = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 15, opt_value, proto.io.openisms.v1.Application, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.clearAppsList = function() {
  return this.setAppsList([]);
};


/**
 * repeated string tags = 20;
 * @return {!Array<string>}
 */
proto.io.openisms.v1.PhysicalObject.prototype.getTagsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 20));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.setTagsList = function(value) {
  return jspb.Message.setField(this, 20, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.addTags = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 20, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.io.openisms.v1.PhysicalObject} returns this
 */
proto.io.openisms.v1.PhysicalObject.prototype.clearTagsList = function() {
  return this.setTagsList([]);
};


