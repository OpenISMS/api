//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializenetwork")
public inline fun network(block: io.openisms.NetworkKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Network =
  io.openisms.NetworkKt.Dsl._create(io.openisms.Api.Network.newBuilder()).apply { block() }._build()
public object NetworkKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.Network.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.Network.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.Network = _builder.build()

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
     * <pre>
     * ethernet, bluetooth, virtual, gsm, vpc
     * </pre>
     *
     * <code>string type = 2;</code>
     */
    public var type: kotlin.String
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <pre>
     * ethernet, bluetooth, virtual, gsm, vpc
     * </pre>
     *
     * <code>string type = 2;</code>
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * <code>string mac_address = 3;</code>
     */
    public var macAddress: kotlin.String
      @JvmName("getMacAddress")
      get() = _builder.getMacAddress()
      @JvmName("setMacAddress")
      set(value) {
        _builder.setMacAddress(value)
      }
    /**
     * <code>string mac_address = 3;</code>
     */
    public fun clearMacAddress() {
      _builder.clearMacAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.Network.copy(block: io.openisms.NetworkKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Network =
  io.openisms.NetworkKt.Dsl._create(this.toBuilder()).apply { block() }._build()
