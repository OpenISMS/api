<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: io/openisms/api.proto

namespace GPBMetadata\Io\Openisms;

class Api
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        \GPBMetadata\Google\Protobuf\Wrappers::initOnce();
        $pool->internalAddGeneratedFile(
            '
�%
io/openisms/api.protoio.openisms.v1google/protobuf/wrappers.proto"�
Event"
meta (2.io.openisms.v1.Meta,
source (2.io.openisms.v1.SourceSystem#
users (2.io.openisms.v1.User/
devices (2.io.openisms.v1.PhysicalObject0
repositories (2.io.openisms.v1.Repository4
certification	 (2.io.openisms.v1.Certification(
pentest (2.io.openisms.v1.Pentest)
stats (2.io.openisms.v1.Statistics"U
Meta+
created (2.google.protobuf.Timestamp

identifier (	
etag (	"�
SourceSystem
name (	
vendor (	
url (	
logo_url (	5
type (2\'.io.openisms.v1.SourceSystem.SourceType"�

SourceType
	undefined 
identity_provider
source_control_management
cloud_provider
database
network
device_management

security_software
password_manager
communication
human_resources
content_management_system
	ticketing$
 customer_relationship_management
finance
	analytics"�
User&
person (2.io.openisms.v1.Person8
second_factor_active (2.google.protobuf.BoolValue:
second_factor_enforced (2.google.protobuf.BoolValue*
active (2.google.protobuf.BoolValue-
	suspended (2.google.protobuf.BoolValue,
disabled	 (2.google.protobuf.BoolValue+
deleted
 (2.google.protobuf.BoolValue
groups (	

privileges (	.

employment (2.io.openisms.v1.Employment<
connected_accounts (2 .io.openisms.v1.ConnectedAccount3
possessions (2.io.openisms.v1.PhysicalObject
tags( (	"�
Person

id (	"
name (2.io.openisms.v1.Name
primary_email (	
other_emails (	&
picture (2.io.openisms.v1.Photo
company (	+
created
 (2.google.protobuf.Timestamp+
updated (2.google.protobuf.Timestamp"q
Name

given_name (	
family_name (	
	full_name (	
title (	
position (	
role (	"�
Photo
url (	
base_64_encoded (	
	mime_type (	
etag (	1
last_modified (2.google.protobuf.Timestamp"v

Employment
contract (	
status (	#
begin (2.io.openisms.v1.Date!
end (2.io.openisms.v1.Date"x
ConnectedAccount
app_id (	
app_name (	
app_type (	
app_url (	
user_id (	
scopes (	"�
PhysicalObject
type (	
name (	
manufacturer (	
vendor (	

identifier (	
serial_number (	
imei (	
meid (	)
networks	 (2.io.openisms.v1.Network
hostname
 (	
user_accounts (	+
os (2.io.openisms.v1.OperatingSystem2
security (2 .io.openisms.v1.SecurityFeatures)
profiles (2.io.openisms.v1.Profile)
apps (2.io.openisms.v1.Application
tags (	"�
SecurityFeatures3
activation_lock (2.google.protobuf.BoolValue.

supervised (2.google.protobuf.BoolValue.

file_vault (2.google.protobuf.BoolValue8
full_disk_encryption (2.google.protobuf.BoolValue3
secure_password (2.google.protobuf.BoolValue9
automatic_screen_lock (2.google.protobuf.BoolValue6
screen_lock_after (2.google.protobuf.Int32Value4
firewall_enabled (2.google.protobuf.BoolValue5
automatic_updates	 (2.google.protobuf.BoolValue":
Network
name (	
type (	
mac_address (	"�
OperatingSystem<
os (20.io.openisms.v1.OperatingSystem.OperatingSystems
major_version (	
full_version (	"�
OperatingSystems
	undefined 	
macos
windows	
linux
unix
	chrome_os
ios

android
ros	
other"�
Application
name (	
path (	
vendor (	
url (	
description (	
version (	*
signed (2.google.protobuf.BoolValue.

system_app (2.google.protobuf.BoolValue
installation_source	 (	"�
Profile
name (	

identifier (	3
removal_allowed (2.google.protobuf.BoolValue
payload_type (	
payload_identifier (	"0
Date
year (
month (
day ("8
Certification
type (	
url (	
tags
 (	"p
Company
name (	
url (	
category (	\'
contact (2.io.openisms.v1.Person
address (	"�
Pentest

id (	#
begin (2.io.openisms.v1.Date!
end (2.io.openisms.v1.Date(
company (2.io.openisms.v1.Company
focus (	
passed (
result (	
url (	(
contacts	 (2.io.openisms.v1.Person
tags
 (	"�

Repository
name (	
url (	
description (	.

visibility (2.io.openisms.v1.Visibility\'
members (2.io.openisms.v1.Person
security_attributes (	
tags
 (	"N

Statistics

identifier (	
name (	
value (
comment (	*G

Visibility
	undefined 

public
internal
confidentialB&
io.openismsZgithub.com/openisms/apibproto3'
        , true);

        static::$is_initialized = true;
    }
}

