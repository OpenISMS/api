<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: io/openisms/api.proto

namespace Io\Openisms\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>io.openisms.v1.OperatingSystem</code>
 */
class OperatingSystem extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.io.openisms.v1.OperatingSystem.OperatingSystems os = 1;</code>
     */
    protected $os = 0;
    /**
     * Generated from protobuf field <code>string major_version = 2;</code>
     */
    protected $major_version = '';
    /**
     * Generated from protobuf field <code>string full_version = 3;</code>
     */
    protected $full_version = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $os
     *     @type string $major_version
     *     @type string $full_version
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Io\Openisms\Api::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.OperatingSystem.OperatingSystems os = 1;</code>
     * @return int
     */
    public function getOs()
    {
        return $this->os;
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.OperatingSystem.OperatingSystems os = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setOs($var)
    {
        GPBUtil::checkEnum($var, \Io\Openisms\V1\OperatingSystem\OperatingSystems::class);
        $this->os = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string major_version = 2;</code>
     * @return string
     */
    public function getMajorVersion()
    {
        return $this->major_version;
    }

    /**
     * Generated from protobuf field <code>string major_version = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setMajorVersion($var)
    {
        GPBUtil::checkString($var, True);
        $this->major_version = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string full_version = 3;</code>
     * @return string
     */
    public function getFullVersion()
    {
        return $this->full_version;
    }

    /**
     * Generated from protobuf field <code>string full_version = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setFullVersion($var)
    {
        GPBUtil::checkString($var, True);
        $this->full_version = $var;

        return $this;
    }

}

