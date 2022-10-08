// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.openisms.api

/** from https://github.com/googleapis/googleapis/blob/master/google/type/date.proto
  *
  * @param year
  *   Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
  * @param month
  *   Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
  * @param day
  *   Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a
  *   year by itself or a year and month where the day isn't significant.
  */
@SerialVersionUID(0L)
final case class Date(
    year: _root_.scala.Int = 0,
    month: _root_.scala.Int = 0,
    day: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Date] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = year
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = month
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      
      {
        val __value = day
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
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
        val __v = year
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = month
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = day
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withYear(__v: _root_.scala.Int): Date = copy(year = __v)
    def withMonth(__v: _root_.scala.Int): Date = copy(month = __v)
    def withDay(__v: _root_.scala.Int): Date = copy(day = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = year
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = month
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = day
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(year)
        case 2 => _root_.scalapb.descriptors.PInt(month)
        case 3 => _root_.scalapb.descriptors.PInt(day)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: io.openisms.api.Date.type = io.openisms.api.Date
    // @@protoc_insertion_point(GeneratedMessage[io.openisms.v1.Date])
}

object Date extends scalapb.GeneratedMessageCompanion[io.openisms.api.Date] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.openisms.api.Date] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.openisms.api.Date = {
    var __year: _root_.scala.Int = 0
    var __month: _root_.scala.Int = 0
    var __day: _root_.scala.Int = 0
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __year = _input__.readInt32()
        case 16 =>
          __month = _input__.readInt32()
        case 24 =>
          __day = _input__.readInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    io.openisms.api.Date(
        year = __year,
        month = __month,
        day = __day,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.openisms.api.Date] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      io.openisms.api.Date(
        year = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        month = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        day = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes().get(15)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(15)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.openisms.api.Date(
    year = 0,
    month = 0,
    day = 0
  )
  implicit class DateLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.openisms.api.Date]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.openisms.api.Date](_l) {
    def year: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.year)((c_, f_) => c_.copy(year = f_))
    def month: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.month)((c_, f_) => c_.copy(month = f_))
    def day: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.day)((c_, f_) => c_.copy(day = f_))
  }
  final val YEAR_FIELD_NUMBER = 1
  final val MONTH_FIELD_NUMBER = 2
  final val DAY_FIELD_NUMBER = 3
  def of(
    year: _root_.scala.Int,
    month: _root_.scala.Int,
    day: _root_.scala.Int
  ): _root_.io.openisms.api.Date = _root_.io.openisms.api.Date(
    year,
    month,
    day
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[io.openisms.v1.Date])
}