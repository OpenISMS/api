//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/openisms/api.proto

package io.openisms;

@kotlin.jvm.JvmName("-initializeevent")
public inline fun event(block: io.openisms.EventKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Event =
  io.openisms.EventKt.Dsl._create(io.openisms.Api.Event.newBuilder()).apply { block() }._build()
public object EventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.openisms.Api.Event.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.openisms.Api.Event.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.openisms.Api.Event = _builder.build()

    /**
     * <code>.io.openisms.v1.Meta meta = 1;</code>
     */
    public var meta: io.openisms.Api.Meta
      @JvmName("getMeta")
      get() = _builder.getMeta()
      @JvmName("setMeta")
      set(value) {
        _builder.setMeta(value)
      }
    /**
     * <code>.io.openisms.v1.Meta meta = 1;</code>
     */
    public fun clearMeta() {
      _builder.clearMeta()
    }
    /**
     * <code>.io.openisms.v1.Meta meta = 1;</code>
     * @return Whether the meta field is set.
     */
    public fun hasMeta(): kotlin.Boolean {
      return _builder.hasMeta()
    }

    /**
     * <code>.io.openisms.v1.SourceSystem source = 2;</code>
     */
    public var source: io.openisms.Api.SourceSystem
      @JvmName("getSource")
      get() = _builder.getSource()
      @JvmName("setSource")
      set(value) {
        _builder.setSource(value)
      }
    /**
     * <code>.io.openisms.v1.SourceSystem source = 2;</code>
     */
    public fun clearSource() {
      _builder.clearSource()
    }
    /**
     * <code>.io.openisms.v1.SourceSystem source = 2;</code>
     * @return Whether the source field is set.
     */
    public fun hasSource(): kotlin.Boolean {
      return _builder.hasSource()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UsersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.User users = 3;</code>
     */
     public val users: com.google.protobuf.kotlin.DslList<io.openisms.Api.User, UsersProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getUsersList()
      )
    /**
     * <code>repeated .io.openisms.v1.User users = 3;</code>
     * @param value The users to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUsers")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.User, UsersProxy>.add(value: io.openisms.Api.User) {
      _builder.addUsers(value)
    }
    /**
     * <code>repeated .io.openisms.v1.User users = 3;</code>
     * @param value The users to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUsers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.User, UsersProxy>.plusAssign(value: io.openisms.Api.User) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.User users = 3;</code>
     * @param values The users to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUsers")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.User, UsersProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.User>) {
      _builder.addAllUsers(values)
    }
    /**
     * <code>repeated .io.openisms.v1.User users = 3;</code>
     * @param values The users to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUsers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.User, UsersProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.User>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.User users = 3;</code>
     * @param index The index to set the value at.
     * @param value The users to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUsers")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.User, UsersProxy>.set(index: kotlin.Int, value: io.openisms.Api.User) {
      _builder.setUsers(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.User users = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUsers")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.User, UsersProxy>.clear() {
      _builder.clearUsers()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DevicesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.PhysicalObject devices = 4;</code>
     */
     public val devices: com.google.protobuf.kotlin.DslList<io.openisms.Api.PhysicalObject, DevicesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDevicesList()
      )
    /**
     * <code>repeated .io.openisms.v1.PhysicalObject devices = 4;</code>
     * @param value The devices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDevices")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.PhysicalObject, DevicesProxy>.add(value: io.openisms.Api.PhysicalObject) {
      _builder.addDevices(value)
    }
    /**
     * <code>repeated .io.openisms.v1.PhysicalObject devices = 4;</code>
     * @param value The devices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDevices")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.PhysicalObject, DevicesProxy>.plusAssign(value: io.openisms.Api.PhysicalObject) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.PhysicalObject devices = 4;</code>
     * @param values The devices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDevices")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.PhysicalObject, DevicesProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.PhysicalObject>) {
      _builder.addAllDevices(values)
    }
    /**
     * <code>repeated .io.openisms.v1.PhysicalObject devices = 4;</code>
     * @param values The devices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDevices")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.PhysicalObject, DevicesProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.PhysicalObject>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.PhysicalObject devices = 4;</code>
     * @param index The index to set the value at.
     * @param value The devices to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDevices")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.PhysicalObject, DevicesProxy>.set(index: kotlin.Int, value: io.openisms.Api.PhysicalObject) {
      _builder.setDevices(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.PhysicalObject devices = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDevices")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.PhysicalObject, DevicesProxy>.clear() {
      _builder.clearDevices()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RepositoriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.Repository repositories = 7;</code>
     */
     public val repositories: com.google.protobuf.kotlin.DslList<io.openisms.Api.Repository, RepositoriesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRepositoriesList()
      )
    /**
     * <code>repeated .io.openisms.v1.Repository repositories = 7;</code>
     * @param value The repositories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRepositories")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Repository, RepositoriesProxy>.add(value: io.openisms.Api.Repository) {
      _builder.addRepositories(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Repository repositories = 7;</code>
     * @param value The repositories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRepositories")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Repository, RepositoriesProxy>.plusAssign(value: io.openisms.Api.Repository) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Repository repositories = 7;</code>
     * @param values The repositories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRepositories")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Repository, RepositoriesProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.Repository>) {
      _builder.addAllRepositories(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Repository repositories = 7;</code>
     * @param values The repositories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRepositories")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Repository, RepositoriesProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.Repository>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Repository repositories = 7;</code>
     * @param index The index to set the value at.
     * @param value The repositories to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRepositories")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Repository, RepositoriesProxy>.set(index: kotlin.Int, value: io.openisms.Api.Repository) {
      _builder.setRepositories(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.Repository repositories = 7;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRepositories")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Repository, RepositoriesProxy>.clear() {
      _builder.clearRepositories()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class CertificationProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.Certification certification = 9;</code>
     */
     public val certification: com.google.protobuf.kotlin.DslList<io.openisms.Api.Certification, CertificationProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCertificationList()
      )
    /**
     * <code>repeated .io.openisms.v1.Certification certification = 9;</code>
     * @param value The certification to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCertification")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Certification, CertificationProxy>.add(value: io.openisms.Api.Certification) {
      _builder.addCertification(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Certification certification = 9;</code>
     * @param value The certification to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCertification")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Certification, CertificationProxy>.plusAssign(value: io.openisms.Api.Certification) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Certification certification = 9;</code>
     * @param values The certification to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCertification")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Certification, CertificationProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.Certification>) {
      _builder.addAllCertification(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Certification certification = 9;</code>
     * @param values The certification to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCertification")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Certification, CertificationProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.Certification>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Certification certification = 9;</code>
     * @param index The index to set the value at.
     * @param value The certification to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCertification")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Certification, CertificationProxy>.set(index: kotlin.Int, value: io.openisms.Api.Certification) {
      _builder.setCertification(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.Certification certification = 9;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCertification")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Certification, CertificationProxy>.clear() {
      _builder.clearCertification()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PentestProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.Pentest pentest = 11;</code>
     */
     public val pentest: com.google.protobuf.kotlin.DslList<io.openisms.Api.Pentest, PentestProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPentestList()
      )
    /**
     * <code>repeated .io.openisms.v1.Pentest pentest = 11;</code>
     * @param value The pentest to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPentest")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Pentest, PentestProxy>.add(value: io.openisms.Api.Pentest) {
      _builder.addPentest(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Pentest pentest = 11;</code>
     * @param value The pentest to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPentest")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Pentest, PentestProxy>.plusAssign(value: io.openisms.Api.Pentest) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Pentest pentest = 11;</code>
     * @param values The pentest to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPentest")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Pentest, PentestProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.Pentest>) {
      _builder.addAllPentest(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Pentest pentest = 11;</code>
     * @param values The pentest to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPentest")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Pentest, PentestProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.Pentest>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Pentest pentest = 11;</code>
     * @param index The index to set the value at.
     * @param value The pentest to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPentest")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Pentest, PentestProxy>.set(index: kotlin.Int, value: io.openisms.Api.Pentest) {
      _builder.setPentest(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.Pentest pentest = 11;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPentest")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Pentest, PentestProxy>.clear() {
      _builder.clearPentest()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class StatsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.openisms.v1.Statistics stats = 13;</code>
     */
     public val stats: com.google.protobuf.kotlin.DslList<io.openisms.Api.Statistics, StatsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getStatsList()
      )
    /**
     * <code>repeated .io.openisms.v1.Statistics stats = 13;</code>
     * @param value The stats to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addStats")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Statistics, StatsProxy>.add(value: io.openisms.Api.Statistics) {
      _builder.addStats(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Statistics stats = 13;</code>
     * @param value The stats to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignStats")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Statistics, StatsProxy>.plusAssign(value: io.openisms.Api.Statistics) {
      add(value)
    }
    /**
     * <code>repeated .io.openisms.v1.Statistics stats = 13;</code>
     * @param values The stats to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllStats")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Statistics, StatsProxy>.addAll(values: kotlin.collections.Iterable<io.openisms.Api.Statistics>) {
      _builder.addAllStats(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Statistics stats = 13;</code>
     * @param values The stats to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllStats")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Statistics, StatsProxy>.plusAssign(values: kotlin.collections.Iterable<io.openisms.Api.Statistics>) {
      addAll(values)
    }
    /**
     * <code>repeated .io.openisms.v1.Statistics stats = 13;</code>
     * @param index The index to set the value at.
     * @param value The stats to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setStats")
    public operator fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Statistics, StatsProxy>.set(index: kotlin.Int, value: io.openisms.Api.Statistics) {
      _builder.setStats(index, value)
    }
    /**
     * <code>repeated .io.openisms.v1.Statistics stats = 13;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearStats")
    public fun com.google.protobuf.kotlin.DslList<io.openisms.Api.Statistics, StatsProxy>.clear() {
      _builder.clearStats()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.openisms.Api.Event.copy(block: io.openisms.EventKt.Dsl.() -> kotlin.Unit): io.openisms.Api.Event =
  io.openisms.EventKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.openisms.Api.EventOrBuilder.metaOrNull: io.openisms.Api.Meta?
  get() = if (hasMeta()) getMeta() else null

val io.openisms.Api.EventOrBuilder.sourceOrNull: io.openisms.Api.SourceSystem?
  get() = if (hasSource()) getSource() else null

