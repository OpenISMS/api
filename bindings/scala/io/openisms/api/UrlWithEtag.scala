// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.openisms.api

@SerialVersionUID(0L)
final case class UrlWithEtag(
    url: _root_.scala.Predef.String = "",
    etag: _root_.scala.Predef.String = "",
    lastModified: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[UrlWithEtag] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = url
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = etag
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      if (lastModified.isDefined) {
        val __value = lastModified.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = url
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = etag
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      lastModified.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withUrl(__v: _root_.scala.Predef.String): UrlWithEtag = copy(url = __v)
    def withEtag(__v: _root_.scala.Predef.String): UrlWithEtag = copy(etag = __v)
    def getLastModified: com.google.protobuf.timestamp.Timestamp = lastModified.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
    def clearLastModified: UrlWithEtag = copy(lastModified = _root_.scala.None)
    def withLastModified(__v: com.google.protobuf.timestamp.Timestamp): UrlWithEtag = copy(lastModified = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = url
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = etag
          if (__t != "") __t else null
        }
        case 3 => lastModified.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(url)
        case 2 => _root_.scalapb.descriptors.PString(etag)
        case 3 => lastModified.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: io.openisms.api.UrlWithEtag.type = io.openisms.api.UrlWithEtag
    // @@protoc_insertion_point(GeneratedMessage[io.openisms.v1.UrlWithEtag])
}

object UrlWithEtag extends scalapb.GeneratedMessageCompanion[io.openisms.api.UrlWithEtag] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.openisms.api.UrlWithEtag] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.openisms.api.UrlWithEtag = {
    var __url: _root_.scala.Predef.String = ""
    var __etag: _root_.scala.Predef.String = ""
    var __lastModified: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __url = _input__.readStringRequireUtf8()
        case 18 =>
          __etag = _input__.readStringRequireUtf8()
        case 26 =>
          __lastModified = Option(__lastModified.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.timestamp.Timestamp](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    io.openisms.api.UrlWithEtag(
        url = __url,
        etag = __etag,
        lastModified = __lastModified,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.openisms.api.UrlWithEtag] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      io.openisms.api.UrlWithEtag(
        url = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        etag = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        lastModified = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes().get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = com.google.protobuf.timestamp.Timestamp
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.openisms.api.UrlWithEtag(
    url = "",
    etag = "",
    lastModified = _root_.scala.None
  )
  implicit class UrlWithEtagLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.openisms.api.UrlWithEtag]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.openisms.api.UrlWithEtag](_l) {
    def url: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.url)((c_, f_) => c_.copy(url = f_))
    def etag: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.etag)((c_, f_) => c_.copy(etag = f_))
    def lastModified: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getLastModified)((c_, f_) => c_.copy(lastModified = Option(f_)))
    def optionalLastModified: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.lastModified)((c_, f_) => c_.copy(lastModified = f_))
  }
  final val URL_FIELD_NUMBER = 1
  final val ETAG_FIELD_NUMBER = 2
  final val LAST_MODIFIED_FIELD_NUMBER = 3
  def of(
    url: _root_.scala.Predef.String,
    etag: _root_.scala.Predef.String,
    lastModified: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]
  ): _root_.io.openisms.api.UrlWithEtag = _root_.io.openisms.api.UrlWithEtag(
    url,
    etag,
    lastModified
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[io.openisms.v1.UrlWithEtag])
}
