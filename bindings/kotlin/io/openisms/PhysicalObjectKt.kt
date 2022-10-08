//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializephysicalObject")
public inline fun physicalObject(block: io.openisms.PhysicalObjectKt.Dsl.() -> kotlin.Unit): io.openisms.Api.PhysicalObject =
  io.openisms.PhysicalObjectKt.Dsl._create(io.openisms.Api.PhysicalObject.newBuilder()).apply { block() }._build()
public object PhysicalObjectKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.PhysicalObject.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.PhysicalObject.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.PhysicalObject = _builder.build()

    /**
     * <code>string type = 1;</code>
     */
    public var type: kotlin.String
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <code>string type = 1;</code>
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
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
     * <code>string name = 2;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>string manufacturer = 3;</code>
     */
    public var manufacturer: kotlin.String
      @JvmName("getManufacturer")
      get() = _builder.getManufacturer()
      @JvmName("setManufacturer")
      set(value) {
        _builder.setManufacturer(value)
      }
    /**
     * <code>string manufacturer = 3;</code>
     */
    public fun clearManufacturer() {
      _builder.clearManufacturer()
    }

    /**
     * <code>string vendor = 4;</code>
     */
    public var vendor: kotlin.String
      @JvmName("getVendor")
      get() = _builder.getVendor()
      @JvmName("setVendor")
      set(value) {
        _builder.setVendor(value)
      }
    /**
     * <code>string vendor = 4;</code>
     */
    public fun clearVendor() {
      _builder.clearVendor()
    }

    /**
     * <pre>
     * company-internal
     * </pre>
     *
     * <code>string identifier = 5;</code>
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
     * company-internal
     * </pre>
     *
     * <code>string identifier = 5;</code>
     */
    public fun clearIdentifier() {
      _builder.clearIdentifier()
    }

    /**
     * <code>string serial_number = 6;</code>
     */
    public var serialNumber: kotlin.String
      @JvmName("getSerialNumber")
      get() = _builder.getSerialNumber()
      @JvmName("setSerialNumber")
      set(value) {
        _builder.setSerialNumber(value)
      }
    /**
     * <code>string serial_number = 6;</code>
     */
    public fun clearSerialNumber() {
      _builder.clearSerialNumber()
    }

    /**
     * <code>string imei = 7;</code>
     */
    public var imei: kotlin.String
      @JvmName("getImei")
      get() = _builder.getImei()
      @JvmName("setImei")
      set(value) {
        _builder.setImei(value)
      }
    /**
     * <code>string imei = 7;</code>
     */
    public fun clearImei() {
      _builder.clearImei()
    }

    /**
     * <code>string meid = 8;</code>
     */
    public var meid: kotlin.String
      @JvmName("getMeid")
      get() = _builder.getMeid()
      @JvmName("setMeid")
      set(value) {
        _builder.setMeid(value)
      }
    /**
     * <code>string meid = 8;</code>
     */
    public fun clearMeid() {
      _builder.clearMeid()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class NetworksProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.Network networks = 9;</code>
     */
     public val networks: com.google.protobuf.kotlin.DslList<io.openisms.Api.Network, NetworksProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNetworksList()
      )
    /**
     * <code>repeated .io.openisms.v1.Network networks = 9;</code>
     * @param value The networks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNetworks")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Network, NetworksProxy>.add(value: io.openisms.Api.Network) {
      _builder.addNetworks(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Network networks = 9;</code>
     * @param value The networks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNetworks")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Network, NetworksProxy>.plusAssign(value: io.openisms.Api.Network) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Network networks = 9;</code>
     * @param values The networks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNetworks")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Network, NetworksProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.Network>) {
      _builder.addAllNetworks(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Network networks = 9;</code>
     * @param values The networks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNetworks")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Network, NetworksProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.Network>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Network networks = 9;</code>
     * @param index The index to set the value at.
     * @param value The networks to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNetworks")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Network, NetworksProxy>.set(index: kotlin.Int, value: io.openisms.Api.Network) {
      _builder.setNetworks(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.Network networks = 9;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNetworks")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Network, NetworksProxy>.clear() {
      _builder.clearNetworks()
    }


    /**
     * <code>string hostname = 10;</code>
     */
    public var hostname: kotlin.String
      @JvmName("getHostname")
      get() = _builder.getHostname()
      @JvmName("setHostname")
      set(value) {
        _builder.setHostname(value)
      }
    /**
     * <code>string hostname = 10;</code>
     */
    public fun clearHostname() {
      _builder.clearHostname()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UserAccountsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string user_accounts = 11;</code>
     * @return A list containing the userAccounts.
     */
    public val userAccounts: com.google.protobuf.kotlin.DslList<kotlin.String, UserAccountsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getUserAccountsList()
      )
    /**
     * <code>repeated string user_accounts = 11;</code>
     * @param value The userAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUserAccounts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, UserAccountsProxy>.add(value: kotlin.String) {
      _builder.addUserAccounts(value)
    }
    /**
     * <code>repeated string user_accounts = 11;</code>
     * @param value The userAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUserAccounts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, UserAccountsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string user_accounts = 11;</code>
     * @param values The userAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUserAccounts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, UserAccountsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllUserAccounts(values)
    }
    /**
     * <code>repeated string user_accounts = 11;</code>
     * @param values The userAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUserAccounts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, UserAccountsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string user_accounts = 11;</code>
     * @param index The index to set the value at.
     * @param value The userAccounts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUserAccounts")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, UserAccountsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setUserAccounts(index, value)
    }/**
     * <code>repeated string user_accounts = 11;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUserAccounts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, UserAccountsProxy>.clear() {
      _builder.clearUserAccounts()
    }
    /**
     * <code>.io.openisms.v1.OperatingSystem os = 12;</code>
     */
    public var os: io.openisms.Api.OperatingSystem
      @JvmName("getOs")
      get() = _builder.getOs()
      @JvmName("setOs")
      set(value) {
        _builder.setOs(value)
      }
    /**
     * <code>.io.openisms.v1.OperatingSystem os = 12;</code>
     */
    public fun clearOs() {
      _builder.clearOs()
    }
    /**
     * <code>.io.openisms.v1.OperatingSystem os = 12;</code>
     * @return Whether the os field is set.
     */
    public fun hasOs(): kotlin.Boolean {
      return _builder.hasOs()
    }

    /**
     * <code>.io.openisms.v1.SecurityFeatures security = 13;</code>
     */
    public var security: io.openisms.Api.SecurityFeatures
      @JvmName("getSecurity")
      get() = _builder.getSecurity()
      @JvmName("setSecurity")
      set(value) {
        _builder.setSecurity(value)
      }
    /**
     * <code>.io.openisms.v1.SecurityFeatures security = 13;</code>
     */
    public fun clearSecurity() {
      _builder.clearSecurity()
    }
    /**
     * <code>.io.openisms.v1.SecurityFeatures security = 13;</code>
     * @return Whether the security field is set.
     */
    public fun hasSecurity(): kotlin.Boolean {
      return _builder.hasSecurity()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ProfilesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.Profile profiles = 14;</code>
     */
     public val profiles: com.google.protobuf.kotlin.DslList<io.openisms.Api.Profile, ProfilesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getProfilesList()
      )
    /**
     * <code>repeated .io.openisms.v1.Profile profiles = 14;</code>
     * @param value The profiles to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addProfiles")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Profile, ProfilesProxy>.add(value: io.openisms.Api.Profile) {
      _builder.addProfiles(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Profile profiles = 14;</code>
     * @param value The profiles to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignProfiles")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Profile, ProfilesProxy>.plusAssign(value: io.openisms.Api.Profile) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Profile profiles = 14;</code>
     * @param values The profiles to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllProfiles")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Profile, ProfilesProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.Profile>) {
      _builder.addAllProfiles(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Profile profiles = 14;</code>
     * @param values The profiles to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllProfiles")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Profile, ProfilesProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.Profile>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Profile profiles = 14;</code>
     * @param index The index to set the value at.
     * @param value The profiles to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setProfiles")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Profile, ProfilesProxy>.set(index: kotlin.Int, value: io.openisms.Api.Profile) {
      _builder.setProfiles(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.Profile profiles = 14;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearProfiles")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Profile, ProfilesProxy>.clear() {
      _builder.clearProfiles()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AppsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.Application apps = 15;</code>
     */
     public val apps: com.google.protobuf.kotlin.DslList<io.openisms.Api.Application, AppsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAppsList()
      )
    /**
     * <code>repeated .io.openisms.v1.Application apps = 15;</code>
     * @param value The apps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addApps")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Application, AppsProxy>.add(value: io.openisms.Api.Application) {
      _builder.addApps(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Application apps = 15;</code>
     * @param value The apps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignApps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Application, AppsProxy>.plusAssign(value: io.openisms.Api.Application) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Application apps = 15;</code>
     * @param values The apps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllApps")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Application, AppsProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.Application>) {
      _builder.addAllApps(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Application apps = 15;</code>
     * @param values The apps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllApps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Application, AppsProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.Application>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Application apps = 15;</code>
     * @param index The index to set the value at.
     * @param value The apps to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setApps")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Application, AppsProxy>.set(index: kotlin.Int, value: io.openisms.Api.Application) {
      _builder.setApps(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.Application apps = 15;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearApps")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Application, AppsProxy>.clear() {
      _builder.clearApps()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TagsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string tags = 20;</code>
     * @return A list containing the tags.
     */
    public val tags: com.google.protobuf.kotlin.DslList<kotlin.String, TagsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTagsList()
      )
    /**
     * <code>repeated string tags = 20;</code>
     * @param value The tags to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTags")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, TagsProxy>.add(value: kotlin.String) {
      _builder.addTags(value)
    }
    /**
     * <code>repeated string tags = 20;</code>
     * @param value The tags to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTags")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, TagsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string tags = 20;</code>
     * @param values The tags to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTags")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, TagsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllTags(values)
    }
    /**
     * <code>repeated string tags = 20;</code>
     * @param values The tags to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTags")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, TagsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string tags = 20;</code>
     * @param index The index to set the value at.
     * @param value The tags to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTags")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, TagsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setTags(index, value)
    }/**
     * <code>repeated string tags = 20;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTags")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, TagsProxy>.clear() {
      _builder.clearTags()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.PhysicalObject.copy(block: io.openisms.PhysicalObjectKt.Dsl.() -> kotlin.Unit): io.openisms.Api.PhysicalObject =
  io.openisms.PhysicalObjectKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.openisms.Api.PhysicalObjectOrBuilder.osOrNull: io.openisms.Api.OperatingSystem?
  get() = if (hasOs()) getOs() else null

val io.openisms.Api.PhysicalObjectOrBuilder.securityOrNull: io.openisms.Api.SecurityFeatures?
  get() = if (hasSecurity()) getSecurity() else null
