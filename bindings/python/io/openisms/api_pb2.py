# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: io/openisms/api.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x15io/openisms/api.proto\x12\x0eio.openisms.v1\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xec\x02\n\x05\x45vent\x12\"\n\x04meta\x18\x01 \x01(\x0b\x32\x14.io.openisms.v1.Meta\x12,\n\x06source\x18\x02 \x01(\x0b\x32\x1c.io.openisms.v1.SourceSystem\x12#\n\x05users\x18\x03 \x03(\x0b\x32\x14.io.openisms.v1.User\x12/\n\x07\x64\x65vices\x18\x04 \x03(\x0b\x32\x1e.io.openisms.v1.PhysicalObject\x12\x30\n\x0crepositories\x18\x07 \x03(\x0b\x32\x1a.io.openisms.v1.Repository\x12\x34\n\rcertification\x18\t \x03(\x0b\x32\x1d.io.openisms.v1.Certification\x12(\n\x07pentest\x18\x0b \x03(\x0b\x32\x17.io.openisms.v1.Pentest\x12)\n\x05stats\x18\r \x03(\x0b\x32\x1a.io.openisms.v1.Statistics\"U\n\x04Meta\x12+\n\x07\x63reated\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x12\n\nidentifier\x18\x02 \x01(\t\x12\x0c\n\x04\x65tag\x18\x03 \x01(\t\"\xe1\x03\n\x0cSourceSystem\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0e\n\x06vendor\x18\x02 \x01(\t\x12\x0b\n\x03url\x18\x03 \x01(\t\x12\x10\n\x08logo_url\x18\x04 \x01(\t\x12\x35\n\x04type\x18\x05 \x01(\x0e\x32\'.io.openisms.v1.SourceSystem.SourceType\"\xdc\x02\n\nSourceType\x12\r\n\tundefined\x10\x00\x12\x15\n\x11identity_provider\x10\x01\x12\x1d\n\x19source_control_management\x10\x02\x12\x12\n\x0e\x63loud_provider\x10\x03\x12\x0c\n\x08\x64\x61tabase\x10\x04\x12\x0b\n\x07network\x10\x05\x12\x15\n\x11\x64\x65vice_management\x10\n\x12\x15\n\x11security_software\x10\x0b\x12\x14\n\x10password_manager\x10\x0c\x12\x11\n\rcommunication\x10\x14\x12\x13\n\x0fhuman_resources\x10\x15\x12\x1d\n\x19\x63ontent_management_system\x10\x16\x12\r\n\tticketing\x10\x17\x12$\n customer_relationship_management\x10\x18\x12\x0b\n\x07\x66inance\x10\x19\x12\r\n\tanalytics\x10\x1a\"\xaf\x04\n\x04User\x12&\n\x06person\x18\x01 \x01(\x0b\x32\x16.io.openisms.v1.Person\x12\x38\n\x14second_factor_active\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12:\n\x16second_factor_enforced\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12*\n\x06\x61\x63tive\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12-\n\tsuspended\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12,\n\x08\x64isabled\x18\t \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12+\n\x07\x64\x65leted\x18\n \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x0e\n\x06groups\x18\x0f \x03(\t\x12\x12\n\nprivileges\x18\x10 \x03(\t\x12.\n\nemployment\x18\x14 \x01(\x0b\x32\x1a.io.openisms.v1.Employment\x12<\n\x12\x63onnected_accounts\x18\x15 \x03(\x0b\x32 .io.openisms.v1.ConnectedAccount\x12\x33\n\x0bpossessions\x18\x16 \x03(\x0b\x32\x1e.io.openisms.v1.PhysicalObject\x12\x0c\n\x04tags\x18( \x03(\t\"\xf8\x01\n\x06Person\x12\n\n\x02id\x18\x01 \x01(\t\x12\"\n\x04name\x18\x02 \x01(\x0b\x32\x14.io.openisms.v1.Name\x12\x15\n\rprimary_email\x18\x03 \x01(\t\x12\x14\n\x0cother_emails\x18\x04 \x03(\t\x12&\n\x07picture\x18\x05 \x01(\x0b\x32\x15.io.openisms.v1.Photo\x12\x0f\n\x07\x63ompany\x18\x06 \x01(\t\x12+\n\x07\x63reated\x18\n \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12+\n\x07updated\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"q\n\x04Name\x12\x12\n\ngiven_name\x18\x01 \x01(\t\x12\x13\n\x0b\x66\x61mily_name\x18\x02 \x01(\t\x12\x11\n\tfull_name\x18\x03 \x01(\t\x12\r\n\x05title\x18\x04 \x01(\t\x12\x10\n\x08position\x18\x05 \x01(\t\x12\x0c\n\x04role\x18\x06 \x01(\t\"\x81\x01\n\x05Photo\x12\x0b\n\x03url\x18\x01 \x01(\t\x12\x17\n\x0f\x62\x61se_64_encoded\x18\x02 \x01(\t\x12\x11\n\tmime_type\x18\x03 \x01(\t\x12\x0c\n\x04\x65tag\x18\x04 \x01(\t\x12\x31\n\rlast_modified\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"v\n\nEmployment\x12\x10\n\x08\x63ontract\x18\x01 \x01(\t\x12\x0e\n\x06status\x18\x02 \x01(\t\x12#\n\x05\x62\x65gin\x18\x03 \x01(\x0b\x32\x14.io.openisms.v1.Date\x12!\n\x03\x65nd\x18\x04 \x01(\x0b\x32\x14.io.openisms.v1.Date\"x\n\x10\x43onnectedAccount\x12\x0e\n\x06\x61pp_id\x18\x01 \x01(\t\x12\x10\n\x08\x61pp_name\x18\x02 \x01(\t\x12\x10\n\x08\x61pp_type\x18\x03 \x01(\t\x12\x0f\n\x07\x61pp_url\x18\x04 \x01(\t\x12\x0f\n\x07user_id\x18\x05 \x01(\t\x12\x0e\n\x06scopes\x18\x06 \x03(\t\"\xb2\x03\n\x0ePhysicalObject\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x14\n\x0cmanufacturer\x18\x03 \x01(\t\x12\x0e\n\x06vendor\x18\x04 \x01(\t\x12\x12\n\nidentifier\x18\x05 \x01(\t\x12\x15\n\rserial_number\x18\x06 \x01(\t\x12\x0c\n\x04imei\x18\x07 \x01(\t\x12\x0c\n\x04meid\x18\x08 \x01(\t\x12)\n\x08networks\x18\t \x03(\x0b\x32\x17.io.openisms.v1.Network\x12\x10\n\x08hostname\x18\n \x01(\t\x12\x15\n\ruser_accounts\x18\x0b \x03(\t\x12+\n\x02os\x18\x0c \x01(\x0b\x32\x1f.io.openisms.v1.OperatingSystem\x12\x32\n\x08security\x18\r \x01(\x0b\x32 .io.openisms.v1.SecurityFeatures\x12)\n\x08profiles\x18\x0e \x03(\x0b\x32\x17.io.openisms.v1.Profile\x12)\n\x04\x61pps\x18\x0f \x03(\x0b\x32\x1b.io.openisms.v1.Application\x12\x0c\n\x04tags\x18\x14 \x03(\t\"\xf6\x03\n\x10SecurityFeatures\x12\x33\n\x0f\x61\x63tivation_lock\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12.\n\nsupervised\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12.\n\nfile_vault\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x38\n\x14\x66ull_disk_encryption\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x33\n\x0fsecure_password\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x39\n\x15\x61utomatic_screen_lock\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x36\n\x11screen_lock_after\x18\x07 \x01(\x0b\x32\x1b.google.protobuf.Int32Value\x12\x34\n\x10\x66irewall_enabled\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x35\n\x11\x61utomatic_updates\x18\t \x01(\x0b\x32\x1a.google.protobuf.BoolValue\":\n\x07Network\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x13\n\x0bmac_address\x18\x03 \x01(\t\"\x86\x02\n\x0fOperatingSystem\x12<\n\x02os\x18\x01 \x01(\x0e\x32\x30.io.openisms.v1.OperatingSystem.OperatingSystems\x12\x15\n\rmajor_version\x18\x02 \x01(\t\x12\x14\n\x0c\x66ull_version\x18\x03 \x01(\t\"\x87\x01\n\x10OperatingSystems\x12\r\n\tundefined\x10\x00\x12\t\n\x05macos\x10\x01\x12\x0b\n\x07windows\x10\x02\x12\t\n\x05linux\x10\x03\x12\x08\n\x04unix\x10\x04\x12\r\n\tchrome_os\x10\x05\x12\x07\n\x03ios\x10\n\x12\x0b\n\x07\x61ndroid\x10\x0b\x12\x07\n\x03ros\x10\x0e\x12\t\n\x05other\x10\x0f\"\xe5\x01\n\x0b\x41pplication\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04path\x18\x02 \x01(\t\x12\x0e\n\x06vendor\x18\x03 \x01(\t\x12\x0b\n\x03url\x18\x04 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\x12\x0f\n\x07version\x18\x06 \x01(\t\x12*\n\x06signed\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12.\n\nsystem_app\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x1b\n\x13installation_source\x18\t \x01(\t\"\x92\x01\n\x07Profile\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\nidentifier\x18\x02 \x01(\t\x12\x33\n\x0fremoval_allowed\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x14\n\x0cpayload_type\x18\x04 \x01(\t\x12\x1a\n\x12payload_identifier\x18\x05 \x01(\t\"0\n\x04\x44\x61te\x12\x0c\n\x04year\x18\x01 \x01(\x05\x12\r\n\x05month\x18\x02 \x01(\x05\x12\x0b\n\x03\x64\x61y\x18\x03 \x01(\x05\"8\n\rCertification\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x0b\n\x03url\x18\x02 \x01(\t\x12\x0c\n\x04tags\x18\n \x03(\t\"p\n\x07\x43ompany\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0b\n\x03url\x18\x02 \x01(\t\x12\x10\n\x08\x63\x61tegory\x18\x03 \x01(\t\x12\'\n\x07\x63ontact\x18\x04 \x01(\x0b\x32\x16.io.openisms.v1.Person\x12\x0f\n\x07\x61\x64\x64ress\x18\x05 \x03(\t\"\xfb\x01\n\x07Pentest\x12\n\n\x02id\x18\x01 \x01(\t\x12#\n\x05\x62\x65gin\x18\x02 \x01(\x0b\x32\x14.io.openisms.v1.Date\x12!\n\x03\x65nd\x18\x03 \x01(\x0b\x32\x14.io.openisms.v1.Date\x12(\n\x07\x63ompany\x18\x04 \x01(\x0b\x32\x17.io.openisms.v1.Company\x12\r\n\x05\x66ocus\x18\x05 \x01(\t\x12\x0e\n\x06passed\x18\x06 \x01(\x08\x12\x0e\n\x06result\x18\x07 \x01(\t\x12\x0b\n\x03url\x18\x08 \x01(\t\x12(\n\x08\x63ontacts\x18\t \x03(\x0b\x32\x16.io.openisms.v1.Person\x12\x0c\n\x04tags\x18\n \x03(\t\"\xc0\x01\n\nRepository\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0b\n\x03url\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12.\n\nvisibility\x18\x04 \x01(\x0e\x32\x1a.io.openisms.v1.Visibility\x12\'\n\x07members\x18\x05 \x03(\x0b\x32\x16.io.openisms.v1.Person\x12\x1b\n\x13security_attributes\x18\x06 \x03(\t\x12\x0c\n\x04tags\x18\n \x03(\t\"N\n\nStatistics\x12\x12\n\nidentifier\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\r\n\x05value\x18\x03 \x01(\x05\x12\x0f\n\x07\x63omment\x18\x04 \x01(\t*G\n\nVisibility\x12\r\n\tundefined\x10\x00\x12\n\n\x06public\x10\x01\x12\x0c\n\x08internal\x10\x02\x12\x10\n\x0c\x63onfidential\x10\x03\x42&\n\x0bio.openismsZ\x17github.com/openisms/apib\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'io.openisms.api_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\013io.openismsZ\027github.com/openisms/api'
  _VISIBILITY._serialized_start=4745
  _VISIBILITY._serialized_end=4816
  _EVENT._serialized_start=107
  _EVENT._serialized_end=471
  _META._serialized_start=473
  _META._serialized_end=558
  _SOURCESYSTEM._serialized_start=561
  _SOURCESYSTEM._serialized_end=1042
  _SOURCESYSTEM_SOURCETYPE._serialized_start=694
  _SOURCESYSTEM_SOURCETYPE._serialized_end=1042
  _USER._serialized_start=1045
  _USER._serialized_end=1604
  _PERSON._serialized_start=1607
  _PERSON._serialized_end=1855
  _NAME._serialized_start=1857
  _NAME._serialized_end=1970
  _PHOTO._serialized_start=1973
  _PHOTO._serialized_end=2102
  _EMPLOYMENT._serialized_start=2104
  _EMPLOYMENT._serialized_end=2222
  _CONNECTEDACCOUNT._serialized_start=2224
  _CONNECTEDACCOUNT._serialized_end=2344
  _PHYSICALOBJECT._serialized_start=2347
  _PHYSICALOBJECT._serialized_end=2781
  _SECURITYFEATURES._serialized_start=2784
  _SECURITYFEATURES._serialized_end=3286
  _NETWORK._serialized_start=3288
  _NETWORK._serialized_end=3346
  _OPERATINGSYSTEM._serialized_start=3349
  _OPERATINGSYSTEM._serialized_end=3611
  _OPERATINGSYSTEM_OPERATINGSYSTEMS._serialized_start=3476
  _OPERATINGSYSTEM_OPERATINGSYSTEMS._serialized_end=3611
  _APPLICATION._serialized_start=3614
  _APPLICATION._serialized_end=3843
  _PROFILE._serialized_start=3846
  _PROFILE._serialized_end=3992
  _DATE._serialized_start=3994
  _DATE._serialized_end=4042
  _CERTIFICATION._serialized_start=4044
  _CERTIFICATION._serialized_end=4100
  _COMPANY._serialized_start=4102
  _COMPANY._serialized_end=4214
  _PENTEST._serialized_start=4217
  _PENTEST._serialized_end=4468
  _REPOSITORY._serialized_start=4471
  _REPOSITORY._serialized_end=4663
  _STATISTICS._serialized_start=4665
  _STATISTICS._serialized_end=4743
# @@protoc_insertion_point(module_scope)
