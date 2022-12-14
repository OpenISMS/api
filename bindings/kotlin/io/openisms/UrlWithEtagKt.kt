//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializeurlWithEtag")
public inline fun urlWithEtag(block: io.openisms.UrlWithEtagKt.Dsl.() -> kotlin.Unit): io.openisms.Api.UrlWithEtag =
  io.openisms.UrlWithEtagKt.Dsl._create(io.openisms.Api.UrlWithEtag.newBuilder()).apply { block() }._build()
public object UrlWithEtagKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.UrlWithEtag.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.UrlWithEtag.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.UrlWithEtag = _builder.build()

    /**
     * <code>string url = 1;</code>
     */
    public var url: kotlin.String
      @JvmName("getUrl")
      get() = _builder.getUrl()
      @JvmName("setUrl")
      set(value) {
        _builder.setUrl(value)
      }
    /**
     * <code>string url = 1;</code>
     */
    public fun clearUrl() {
      _builder.clearUrl()
    }

    /**
     * <code>string etag = 2;</code>
     */
    public var etag: kotlin.String
      @JvmName("getEtag")
      get() = _builder.getEtag()
      @JvmName("setEtag")
      set(value) {
        _builder.setEtag(value)
      }
    /**
     * <code>string etag = 2;</code>
     */
    public fun clearEtag() {
      _builder.clearEtag()
    }

    /**
     * <code>.google.protobuf.Timestamp last_modified = 3;</code>
     */
    public var lastModified: com.google.protobuf.Timestamp
      @JvmName("getLastModified")
      get() = _builder.getLastModified()
      @JvmName("setLastModified")
      set(value) {
        _builder.setLastModified(value)
      }
    /**
     * <code>.google.protobuf.Timestamp last_modified = 3;</code>
     */
    public fun clearLastModified() {
      _builder.clearLastModified()
    }
    /**
     * <code>.google.protobuf.Timestamp last_modified = 3;</code>
     * @return Whether the lastModified field is set.
     */
    public fun hasLastModified(): kotlin.Boolean {
      return _builder.hasLastModified()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.UrlWithEtag.copy(block: io.openisms.UrlWithEtagKt.Dsl.() -> kotlin.Unit): io.openisms.Api.UrlWithEtag =
  io.openisms.UrlWithEtagKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.openisms.Api.UrlWithEtagOrBuilder.lastModifiedOrNull: com.google.protobuf.Timestamp?
  get() = if (hasLastModified()) getLastModified() else null

