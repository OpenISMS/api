//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializesourceSystem")
public inline fun sourceSystem(block: io.openisms.SourceSystemKt.Dsl.() -> kotlin.Unit): io.openisms.Api.SourceSystem =
  io.openisms.SourceSystemKt.Dsl._create(io.openisms.Api.SourceSystem.newBuilder()).apply { block() }._build()
public object SourceSystemKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.SourceSystem.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.SourceSystem.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.SourceSystem = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>string vendor = 2;</code>
     */
    public var vendor: kotlin.String
      @JvmName("getVendor")
      get() = _builder.getVendor()
      @JvmName("setVendor")
      set(value) {
        _builder.setVendor(value)
      }
    /**
     * <code>string vendor = 2;</code>
     */
    public fun clearVendor() {
      _builder.clearVendor()
    }

    /**
     * <code>string url = 3;</code>
     */
    public var url: kotlin.String
      @JvmName("getUrl")
      get() = _builder.getUrl()
      @JvmName("setUrl")
      set(value) {
        _builder.setUrl(value)
      }
    /**
     * <code>string url = 3;</code>
     */
    public fun clearUrl() {
      _builder.clearUrl()
    }

    /**
     * <code>string logo_url = 4;</code>
     */
    public var logoUrl: kotlin.String
      @JvmName("getLogoUrl")
      get() = _builder.getLogoUrl()
      @JvmName("setLogoUrl")
      set(value) {
        _builder.setLogoUrl(value)
      }
    /**
     * <code>string logo_url = 4;</code>
     */
    public fun clearLogoUrl() {
      _builder.clearLogoUrl()
    }

    /**
     * <code>.io.openisms.v1.SourceSystem.SourceType type = 5;</code>
     */
    public var type: io.openisms.Api.SourceSystem.SourceType
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <code>.io.openisms.v1.SourceSystem.SourceType type = 5;</code>
     */
    public fun clearType() {
      _builder.clearType()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.SourceSystem.copy(block: io.openisms.SourceSystemKt.Dsl.() -> kotlin.Unit): io.openisms.Api.SourceSystem =
  io.openisms.SourceSystemKt.Dsl._create(this.toBuilder()).apply { block() }._build()
