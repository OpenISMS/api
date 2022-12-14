//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializeperson")
public inline fun person(block: io.openisms.PersonKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Person =
  io.openisms.PersonKt.Dsl._create(io.openisms.Api.Person.newBuilder()).apply { block() }._build()
public object PersonKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.Person.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.Person.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.Person = _builder.build()

    /**
     * <code>string id = 1;</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1;</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>.io.openisms.v1.Name name = 2;</code>
     */
    public var name: io.openisms.Api.Name
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>.io.openisms.v1.Name name = 2;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * <code>.io.openisms.v1.Name name = 2;</code>
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * <code>string primary_email = 3;</code>
     */
    public var primaryEmail: kotlin.String
      @JvmName("getPrimaryEmail")
      get() = _builder.getPrimaryEmail()
      @JvmName("setPrimaryEmail")
      set(value) {
        _builder.setPrimaryEmail(value)
      }
    /**
     * <code>string primary_email = 3;</code>
     */
    public fun clearPrimaryEmail() {
      _builder.clearPrimaryEmail()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OtherEmailsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string other_emails = 4;</code>
     * @return A list containing the otherEmails.
     */
    public val otherEmails: com.google.protobuf.kotlin.DslList<kotlin.String, OtherEmailsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOtherEmailsList()
      )
    /**
     * <code>repeated string other_emails = 4;</code>
     * @param value The otherEmails to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOtherEmails")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, OtherEmailsProxy>.add(value: kotlin.String) {
      _builder.addOtherEmails(value)
    }
    /**
     * <code>repeated string other_emails = 4;</code>
     * @param value The otherEmails to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOtherEmails")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OtherEmailsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string other_emails = 4;</code>
     * @param values The otherEmails to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOtherEmails")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, OtherEmailsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllOtherEmails(values)
    }
    /**
     * <code>repeated string other_emails = 4;</code>
     * @param values The otherEmails to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOtherEmails")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OtherEmailsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string other_emails = 4;</code>
     * @param index The index to set the value at.
     * @param value The otherEmails to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOtherEmails")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OtherEmailsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setOtherEmails(index, value)
    }/**
     * <code>repeated string other_emails = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOtherEmails")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, OtherEmailsProxy>.clear() {
      _builder.clearOtherEmails()
    }
    /**
     * <code>.io.openisms.v1.Photo picture = 5;</code>
     */
    public var picture: io.openisms.Api.Photo
      @JvmName("getPicture")
      get() = _builder.getPicture()
      @JvmName("setPicture")
      set(value) {
        _builder.setPicture(value)
      }
    /**
     * <code>.io.openisms.v1.Photo picture = 5;</code>
     */
    public fun clearPicture() {
      _builder.clearPicture()
    }
    /**
     * <code>.io.openisms.v1.Photo picture = 5;</code>
     * @return Whether the picture field is set.
     */
    public fun hasPicture(): kotlin.Boolean {
      return _builder.hasPicture()
    }

    /**
     * <code>string company = 6;</code>
     */
    public var company: kotlin.String
      @JvmName("getCompany")
      get() = _builder.getCompany()
      @JvmName("setCompany")
      set(value) {
        _builder.setCompany(value)
      }
    /**
     * <code>string company = 6;</code>
     */
    public fun clearCompany() {
      _builder.clearCompany()
    }

    /**
     * <pre>
     * technical date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created = 10;</code>
     */
    public var created: com.google.protobuf.Timestamp
      @JvmName("getCreated")
      get() = _builder.getCreated()
      @JvmName("setCreated")
      set(value) {
        _builder.setCreated(value)
      }
    /**
     * <pre>
     * technical date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created = 10;</code>
     */
    public fun clearCreated() {
      _builder.clearCreated()
    }
    /**
     * <pre>
     * technical date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created = 10;</code>
     * @return Whether the created field is set.
     */
    public fun hasCreated(): kotlin.Boolean {
      return _builder.hasCreated()
    }

    /**
     * <pre>
     * technical date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated = 11;</code>
     */
    public var updated: com.google.protobuf.Timestamp
      @JvmName("getUpdated")
      get() = _builder.getUpdated()
      @JvmName("setUpdated")
      set(value) {
        _builder.setUpdated(value)
      }
    /**
     * <pre>
     * technical date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated = 11;</code>
     */
    public fun clearUpdated() {
      _builder.clearUpdated()
    }
    /**
     * <pre>
     * technical date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated = 11;</code>
     * @return Whether the updated field is set.
     */
    public fun hasUpdated(): kotlin.Boolean {
      return _builder.hasUpdated()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.Person.copy(block: io.openisms.PersonKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Person =
  io.openisms.PersonKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.openisms.Api.PersonOrBuilder.nameOrNull: io.openisms.Api.Name?
  get() = if (hasName()) getName() else null

val io.openisms.Api.PersonOrBuilder.pictureOrNull: io.openisms.Api.Photo?
  get() = if (hasPicture()) getPicture() else null

val io.openisms.Api.PersonOrBuilder.createdOrNull: com.google.protobuf.Timestamp?
  get() = if (hasCreated()) getCreated() else null

val io.openisms.Api.PersonOrBuilder.updatedOrNull: com.google.protobuf.Timestamp?
  get() = if (hasUpdated()) getUpdated() else null

