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

goog.provide('proto.io.openisms.v1.ConnectedAccount');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.io.openisms.v1.ConnectedAccount = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.io.openisms.v1.ConnectedAccount.repeatedFields_, null);
};
goog.inherits(proto.io.openisms.v1.ConnectedAccount, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.io.openisms.v1.ConnectedAccount.displayName = 'proto.io.openisms.v1.ConnectedAccount';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.io.openisms.v1.ConnectedAccount.repeatedFields_ = [6];



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
proto.io.openisms.v1.ConnectedAccount.prototype.toObject = function(opt_includeInstance) {
  return proto.io.openisms.v1.ConnectedAccount.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.io.openisms.v1.ConnectedAccount} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.io.openisms.v1.ConnectedAccount.toObject = function(includeInstance, msg) {
  var f, obj = {
    appId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    appName: jspb.Message.getFieldWithDefault(msg, 2, ""),
    appType: jspb.Message.getFieldWithDefault(msg, 3, ""),
    appUrl: jspb.Message.getFieldWithDefault(msg, 4, ""),
    userId: jspb.Message.getFieldWithDefault(msg, 5, ""),
    scopesList: (f = jspb.Message.getRepeatedField(msg, 6)) == null ? undefined : f
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
 * @return {!proto.io.openisms.v1.ConnectedAccount}
 */
proto.io.openisms.v1.ConnectedAccount.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.io.openisms.v1.ConnectedAccount;
  return proto.io.openisms.v1.ConnectedAccount.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.io.openisms.v1.ConnectedAccount} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.io.openisms.v1.ConnectedAccount}
 */
proto.io.openisms.v1.ConnectedAccount.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAppId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAppName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAppType(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAppUrl(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setUserId(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.addScopes(value);
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
proto.io.openisms.v1.ConnectedAccount.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.io.openisms.v1.ConnectedAccount.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.io.openisms.v1.ConnectedAccount} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.io.openisms.v1.ConnectedAccount.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAppName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAppType();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAppUrl();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getUserId();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getScopesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      6,
      f
    );
  }
};


/**
 * optional string app_id = 1;
 * @return {string}
 */
proto.io.openisms.v1.ConnectedAccount.prototype.getAppId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.setAppId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string app_name = 2;
 * @return {string}
 */
proto.io.openisms.v1.ConnectedAccount.prototype.getAppName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.setAppName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string app_type = 3;
 * @return {string}
 */
proto.io.openisms.v1.ConnectedAccount.prototype.getAppType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.setAppType = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string app_url = 4;
 * @return {string}
 */
proto.io.openisms.v1.ConnectedAccount.prototype.getAppUrl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.setAppUrl = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string user_id = 5;
 * @return {string}
 */
proto.io.openisms.v1.ConnectedAccount.prototype.getUserId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.setUserId = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * repeated string scopes = 6;
 * @return {!Array<string>}
 */
proto.io.openisms.v1.ConnectedAccount.prototype.getScopesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 6));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.setScopesList = function(value) {
  return jspb.Message.setField(this, 6, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.addScopes = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 6, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.io.openisms.v1.ConnectedAccount} returns this
 */
proto.io.openisms.v1.ConnectedAccount.prototype.clearScopesList = function() {
  return this.setScopesList([]);
};

