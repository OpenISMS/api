//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializestatistics")
public inline fun statistics(block: io.openisms.StatisticsKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Statistics =
  io.openisms.StatisticsKt.Dsl._create(io.openisms.Api.Statistics.newBuilder()).apply { block() }._build()
public object StatisticsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.Statistics.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.Statistics.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.Statistics = _builder.build()

    /**
     * <pre>
     * accounts:num_users, device_management:num_30day_desktop_linux_managed_devices
     * </pre>
     *
     * <code>string identifier = 1;</code>
     */
    public var identifier: kotlin.String
      @JvmName("getIdentifier")
      get() = _builder.getIdentifier()
      @JvmName("setIdentifier")
      set(value) {
        _builder.setIdentifier(value)
      }
    /**
     * <pre>
     * accounts:num_users, device_management:num_30day_desktop_linux_managed_devices
     * </pre>
     *
     * <code>string identifier = 1;</code>
     */
    public fun clearIdentifier() {
      _builder.clearIdentifier()
    }

    /**
     * <pre>
     * Number of users
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * Number of users
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <pre>
     * 42
     * </pre>
     *
     * <code>int32 value = 3;</code>
     */
    public var value: kotlin.Int
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <pre>
     * 42
     * </pre>
     *
     * <code>int32 value = 3;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }

    /**
     * <pre>
     * "Does not include suspended users"
     * </pre>
     *
     * <code>string comment = 4;</code>
     */
    public var comment: kotlin.String
      @JvmName("getComment")
      get() = _builder.getComment()
      @JvmName("setComment")
      set(value) {
        _builder.setComment(value)
      }
    /**
     * <pre>
     * "Does not include suspended users"
     * </pre>
     *
     * <code>string comment = 4;</code>
     */
    public fun clearComment() {
      _builder.clearComment()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.Statistics.copy(block: io.openisms.StatisticsKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Statistics =
  io.openisms.StatisticsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
