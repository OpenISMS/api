// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.openisms.api

/** @param installationSource
  *   App Store; homebrew; MDM
  */
@SerialVersionUID(0L)
final case class Application(
    name: _root_.scala.Predef.String = "",
    path: _root_.scala.Predef.String = "",
    vendor: _root_.scala.Predef.String = "",
    url: _root_.scala.Predef.String = "",
    description: _root_.scala.Predef.String = "",
    version: _root_.scala.Predef.String = "",
    signed: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    systemApp: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    installationSource: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Application] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = path
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = vendor
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = url
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = description
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      
      {
        val __value = version
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
        }
      };
      if (signed.isDefined) {
        val __value = io.openisms.api.Application._typemapper_signed.toBase(signed.get)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (systemApp.isDefined) {
        val __value = io.openisms.api.Application._typemapper_systemApp.toBase(systemApp.get)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = installationSource
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(9, __value)
        }
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
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = path
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = vendor
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = url
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = description
        if (!__v.isEmpty) {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = version
        if (!__v.isEmpty) {
          _output__.writeString(6, __v)
        }
      };
      signed.foreach { __v =>
        val __m = io.openisms.api.Application._typemapper_signed.toBase(__v)
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      systemApp.foreach { __v =>
        val __m = io.openisms.api.Application._typemapper_systemApp.toBase(__v)
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = installationSource
        if (!__v.isEmpty) {
          _output__.writeString(9, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): Application = copy(name = __v)
    def withPath(__v: _root_.scala.Predef.String): Application = copy(path = __v)
    def withVendor(__v: _root_.scala.Predef.String): Application = copy(vendor = __v)
    def withUrl(__v: _root_.scala.Predef.String): Application = copy(url = __v)
    def withDescription(__v: _root_.scala.Predef.String): Application = copy(description = __v)
    def withVersion(__v: _root_.scala.Predef.String): Application = copy(version = __v)
    def getSigned: _root_.scala.Boolean = signed.getOrElse(io.openisms.api.Application._typemapper_signed.toCustom(com.google.protobuf.wrappers.BoolValue.defaultInstance))
    def clearSigned: Application = copy(signed = _root_.scala.None)
    def withSigned(__v: _root_.scala.Boolean): Application = copy(signed = Option(__v))
    def getSystemApp: _root_.scala.Boolean = systemApp.getOrElse(io.openisms.api.Application._typemapper_systemApp.toCustom(com.google.protobuf.wrappers.BoolValue.defaultInstance))
    def clearSystemApp: Application = copy(systemApp = _root_.scala.None)
    def withSystemApp(__v: _root_.scala.Boolean): Application = copy(systemApp = Option(__v))
    def withInstallationSource(__v: _root_.scala.Predef.String): Application = copy(installationSource = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = path
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = vendor
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = url
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = description
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = version
          if (__t != "") __t else null
        }
        case 7 => signed.map(io.openisms.api.Application._typemapper_signed.toBase(_)).orNull
        case 8 => systemApp.map(io.openisms.api.Application._typemapper_systemApp.toBase(_)).orNull
        case 9 => {
          val __t = installationSource
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(path)
        case 3 => _root_.scalapb.descriptors.PString(vendor)
        case 4 => _root_.scalapb.descriptors.PString(url)
        case 5 => _root_.scalapb.descriptors.PString(description)
        case 6 => _root_.scalapb.descriptors.PString(version)
        case 7 => signed.map(io.openisms.api.Application._typemapper_signed.toBase(_).toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => systemApp.map(io.openisms.api.Application._typemapper_systemApp.toBase(_).toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => _root_.scalapb.descriptors.PString(installationSource)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: io.openisms.api.Application.type = io.openisms.api.Application
    // @@protoc_insertion_point(GeneratedMessage[io.openisms.v1.Application])
}

object Application extends scalapb.GeneratedMessageCompanion[io.openisms.api.Application] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.openisms.api.Application] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.openisms.api.Application = {
    var __name: _root_.scala.Predef.String = ""
    var __path: _root_.scala.Predef.String = ""
    var __vendor: _root_.scala.Predef.String = ""
    var __url: _root_.scala.Predef.String = ""
    var __description: _root_.scala.Predef.String = ""
    var __version: _root_.scala.Predef.String = ""
    var __signed: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    var __systemApp: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    var __installationSource: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case 18 =>
          __path = _input__.readStringRequireUtf8()
        case 26 =>
          __vendor = _input__.readStringRequireUtf8()
        case 34 =>
          __url = _input__.readStringRequireUtf8()
        case 42 =>
          __description = _input__.readStringRequireUtf8()
        case 50 =>
          __version = _input__.readStringRequireUtf8()
        case 58 =>
          __signed = Option(io.openisms.api.Application._typemapper_signed.toCustom(__signed.map(io.openisms.api.Application._typemapper_signed.toBase(_)).fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.wrappers.BoolValue](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _))))
        case 66 =>
          __systemApp = Option(io.openisms.api.Application._typemapper_systemApp.toCustom(__systemApp.map(io.openisms.api.Application._typemapper_systemApp.toBase(_)).fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.wrappers.BoolValue](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _))))
        case 74 =>
          __installationSource = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    io.openisms.api.Application(
        name = __name,
        path = __path,
        vendor = __vendor,
        url = __url,
        description = __description,
        version = __version,
        signed = __signed,
        systemApp = __systemApp,
        installationSource = __installationSource,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.openisms.api.Application] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      io.openisms.api.Application(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        path = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        vendor = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        url = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        description = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        version = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        signed = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.wrappers.BoolValue]]).map(io.openisms.api.Application._typemapper_signed.toCustom(_)),
        systemApp = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.wrappers.BoolValue]]).map(io.openisms.api.Application._typemapper_systemApp.toCustom(_)),
        installationSource = __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes().get(13)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(13)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 7 => __out = com.google.protobuf.wrappers.BoolValue
      case 8 => __out = com.google.protobuf.wrappers.BoolValue
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.openisms.api.Application(
    name = "",
    path = "",
    vendor = "",
    url = "",
    description = "",
    version = "",
    signed = _root_.scala.None,
    systemApp = _root_.scala.None,
    installationSource = ""
  )
  implicit class ApplicationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.openisms.api.Application]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.openisms.api.Application](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def path: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.path)((c_, f_) => c_.copy(path = f_))
    def vendor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.vendor)((c_, f_) => c_.copy(vendor = f_))
    def url: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.url)((c_, f_) => c_.copy(url = f_))
    def description: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.description)((c_, f_) => c_.copy(description = f_))
    def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def signed: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getSigned)((c_, f_) => c_.copy(signed = Option(f_)))
    def optionalSigned: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.signed)((c_, f_) => c_.copy(signed = f_))
    def systemApp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getSystemApp)((c_, f_) => c_.copy(systemApp = Option(f_)))
    def optionalSystemApp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.systemApp)((c_, f_) => c_.copy(systemApp = f_))
    def installationSource: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.installationSource)((c_, f_) => c_.copy(installationSource = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val PATH_FIELD_NUMBER = 2
  final val VENDOR_FIELD_NUMBER = 3
  final val URL_FIELD_NUMBER = 4
  final val DESCRIPTION_FIELD_NUMBER = 5
  final val VERSION_FIELD_NUMBER = 6
  final val SIGNED_FIELD_NUMBER = 7
  final val SYSTEM_APP_FIELD_NUMBER = 8
  final val INSTALLATION_SOURCE_FIELD_NUMBER = 9
  @transient
  private[api] val _typemapper_signed: _root_.scalapb.TypeMapper[com.google.protobuf.wrappers.BoolValue, _root_.scala.Boolean] = implicitly[_root_.scalapb.TypeMapper[com.google.protobuf.wrappers.BoolValue, _root_.scala.Boolean]]
  @transient
  private[api] val _typemapper_systemApp: _root_.scalapb.TypeMapper[com.google.protobuf.wrappers.BoolValue, _root_.scala.Boolean] = implicitly[_root_.scalapb.TypeMapper[com.google.protobuf.wrappers.BoolValue, _root_.scala.Boolean]]
  def of(
    name: _root_.scala.Predef.String,
    path: _root_.scala.Predef.String,
    vendor: _root_.scala.Predef.String,
    url: _root_.scala.Predef.String,
    description: _root_.scala.Predef.String,
    version: _root_.scala.Predef.String,
    signed: _root_.scala.Option[_root_.scala.Boolean],
    systemApp: _root_.scala.Option[_root_.scala.Boolean],
    installationSource: _root_.scala.Predef.String
  ): _root_.io.openisms.api.Application = _root_.io.openisms.api.Application(
    name,
    path,
    vendor,
    url,
    description,
    version,
    signed,
    systemApp,
    installationSource
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[io.openisms.v1.Application])
}
