//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializeoperatingSystem")
public inline fun operatingSystem(block: io.openisms.OperatingSystemKt.Dsl.() -> kotlin.Unit): io.openisms.Api.OperatingSystem =
  io.openisms.OperatingSystemKt.Dsl._create(io.openisms.Api.OperatingSystem.newBuilder()).apply { block() }._build()
public object OperatingSystemKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.OperatingSystem.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.OperatingSystem.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.OperatingSystem = _builder.build()

    /**
     * <code>.io.openisms.v1.OperatingSystem.OperatingSystems os = 1;</code>
     */
    public var os: io.openisms.Api.OperatingSystem.OperatingSystems
      @JvmName("getOs")
      get() = _builder.getOs()
      @JvmName("setOs")
      set(value) {
        _builder.setOs(value)
      }
    /**
     * <code>.io.openisms.v1.OperatingSystem.OperatingSystems os = 1;</code>
     */
    public fun clearOs() {
      _builder.clearOs()
    }

    /**
     * <code>string major_version = 2;</code>
     */
    public var majorVersion: kotlin.String
      @JvmName("getMajorVersion")
      get() = _builder.getMajorVersion()
      @JvmName("setMajorVersion")
      set(value) {
        _builder.setMajorVersion(value)
      }
    /**
     * <code>string major_version = 2;</code>
     */
    public fun clearMajorVersion() {
      _builder.clearMajorVersion()
    }

    /**
     * <code>string full_version = 3;</code>
     */
    public var fullVersion: kotlin.String
      @JvmName("getFullVersion")
      get() = _builder.getFullVersion()
      @JvmName("setFullVersion")
      set(value) {
        _builder.setFullVersion(value)
      }
    /**
     * <code>string full_version = 3;</code>
     */
    public fun clearFullVersion() {
      _builder.clearFullVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.OperatingSystem.copy(block: io.openisms.OperatingSystemKt.Dsl.() -> kotlin.Unit): io.openisms.Api.OperatingSystem =
  io.openisms.OperatingSystemKt.Dsl._create(this.toBuilder()).apply { block() }._build()

