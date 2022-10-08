#!/usr/bin/env bash

set -Eeuo pipefail

msg() {
  echo >&2 -e "${1-}"
}

# make sure protoc is installed
if ! command -v protoc &>/dev/null; then
  msg "protoc could not be found - install it via brew install protobuf"
  exit
fi

msg "Testing protobuf definition…"
protoc --encode io.openisms.v1.Event io/openisms/api.proto <test/payload.txt >test/proto.bin
protoc --decode_raw <test/proto.bin &>/dev/null
protoc --decode io.openisms.v1.Event io/openisms/api.proto <test/proto.bin &>/dev/null
msg "✅"

msg "Creating Bindings for Obj-C"
mkdir -p bindings/objc
protoc io/openisms/api.proto --objc_out=bindings/objc

msg "Creating Bindings for Java"
mkdir -p bindings/java
protoc io/openisms/api.proto --java_out=bindings/java

msg "Creating Bindings for C++"
mkdir -p bindings/cpp
protoc io/openisms/api.proto --cpp_out=bindings/cpp

msg "Creating Bindings for C#"
mkdir -p bindings/csharp
protoc io/openisms/api.proto --csharp_out=bindings/csharp

msg "Creating Bindings for Kotlin"
mkdir -p bindings/kotlin
protoc io/openisms/api.proto --kotlin_out=bindings/kotlin

msg "Creating Bindings for JavaScript"
mkdir -p bindings/javascript
protoc io/openisms/api.proto --js_out=bindings/javascript

msg "Creating Bindings for Python"
mkdir -p bindings/python
protoc io/openisms/api.proto --python_out=bindings/python

msg "Creating Bindings for PHP"
mkdir -p bindings/php
protoc io/openisms/api.proto --php_out=bindings/php

msg "Creating Bindings for Ruby"
mkdir -p bindings/ruby
protoc io/openisms/api.proto --ruby_out=bindings/ruby

if command -v protoc-gen-go --version &>/dev/null; then
  msg "Creating Bindings for Go"
  mkdir -p bindings/go
  protoc io/openisms/api.proto --go_out=bindings/go --go_opt=paths=source_relative
else
  msg "⚠️  protoc-gen-go could not be found - install it via brew install protoc-gen-go"
fi

if command -v protoc-gen-swift --version &>/dev/null; then
  msg "Creating Bindings for Swift"
  mkdir -p bindings/swift
  protoc io/openisms/api.proto --swift_out=bindings/swift
else
  msg "⚠️  protoc-gen-swift could not be found - install it via brew install protoc-gen-swift"
fi

msg "Creating Bindings for Scala"
mkdir -p bindings/scala
protoc io/openisms/api.proto --plugin=bindings/scala/protoc-gen-scala --scala_out=bindings/scala
