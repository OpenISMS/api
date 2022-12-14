// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.openisms.api

/** @param contract
  *   full-time, intern, consultant
  * @param status
  *   candidate, hired, active, hiatus, terminated, left
  */
@SerialVersionUID(0L)
final case class Employment(
    contract: _root_.scala.Predef.String = "",
    status: _root_.scala.Predef.String = "",
    begin: _root_.scala.Option[io.openisms.api.Date] = _root_.scala.None,
    end: _root_.scala.Option[io.openisms.api.Date] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Employment] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = contract
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = status
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      if (begin.isDefined) {
        val __value = begin.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (end.isDefined) {
        val __value = end.get
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
        val __v = contract
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = status
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      begin.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      end.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withContract(__v: _root_.scala.Predef.String): Employment = copy(contract = __v)
    def withStatus(__v: _root_.scala.Predef.String): Employment = copy(status = __v)
    def getBegin: io.openisms.api.Date = begin.getOrElse(io.openisms.api.Date.defaultInstance)
    def clearBegin: Employment = copy(begin = _root_.scala.None)
    def withBegin(__v: io.openisms.api.Date): Employment = copy(begin = Option(__v))
    def getEnd: io.openisms.api.Date = end.getOrElse(io.openisms.api.Date.defaultInstance)
    def clearEnd: Employment = copy(end = _root_.scala.None)
    def withEnd(__v: io.openisms.api.Date): Employment = copy(end = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = contract
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = status
          if (__t != "") __t else null
        }
        case 3 => begin.orNull
        case 4 => end.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(contract)
        case 2 => _root_.scalapb.descriptors.PString(status)
        case 3 => begin.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => end.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: io.openisms.api.Employment.type = io.openisms.api.Employment
    // @@protoc_insertion_point(GeneratedMessage[io.openisms.v1.Employment])
}

object Employment extends scalapb.GeneratedMessageCompanion[io.openisms.api.Employment] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.openisms.api.Employment] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.openisms.api.Employment = {
    var __contract: _root_.scala.Predef.String = ""
    var __status: _root_.scala.Predef.String = ""
    var __begin: _root_.scala.Option[io.openisms.api.Date] = _root_.scala.None
    var __end: _root_.scala.Option[io.openisms.api.Date] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __contract = _input__.readStringRequireUtf8()
        case 18 =>
          __status = _input__.readStringRequireUtf8()
        case 26 =>
          __begin = Option(__begin.fold(_root_.scalapb.LiteParser.readMessage[io.openisms.api.Date](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 34 =>
          __end = Option(__end.fold(_root_.scalapb.LiteParser.readMessage[io.openisms.api.Date](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    io.openisms.api.Employment(
        contract = __contract,
        status = __status,
        begin = __begin,
        end = __end,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.openisms.api.Employment] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      io.openisms.api.Employment(
        contract = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        status = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        begin = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[io.openisms.api.Date]]),
        end = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[io.openisms.api.Date]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes().get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = io.openisms.api.Date
      case 4 => __out = io.openisms.api.Date
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.openisms.api.Employment(
    contract = "",
    status = "",
    begin = _root_.scala.None,
    end = _root_.scala.None
  )
  implicit class EmploymentLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.openisms.api.Employment]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.openisms.api.Employment](_l) {
    def contract: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.contract)((c_, f_) => c_.copy(contract = f_))
    def status: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.status)((c_, f_) => c_.copy(status = f_))
    def begin: _root_.scalapb.lenses.Lens[UpperPB, io.openisms.api.Date] = field(_.getBegin)((c_, f_) => c_.copy(begin = Option(f_)))
    def optionalBegin: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[io.openisms.api.Date]] = field(_.begin)((c_, f_) => c_.copy(begin = f_))
    def end: _root_.scalapb.lenses.Lens[UpperPB, io.openisms.api.Date] = field(_.getEnd)((c_, f_) => c_.copy(end = Option(f_)))
    def optionalEnd: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[io.openisms.api.Date]] = field(_.end)((c_, f_) => c_.copy(end = f_))
  }
  final val CONTRACT_FIELD_NUMBER = 1
  final val STATUS_FIELD_NUMBER = 2
  final val BEGIN_FIELD_NUMBER = 3
  final val END_FIELD_NUMBER = 4
  def of(
    contract: _root_.scala.Predef.String,
    status: _root_.scala.Predef.String,
    begin: _root_.scala.Option[io.openisms.api.Date],
    end: _root_.scala.Option[io.openisms.api.Date]
  ): _root_.io.openisms.api.Employment = _root_.io.openisms.api.Employment(
    contract,
    status,
    begin,
    end
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[io.openisms.v1.Employment])
}
