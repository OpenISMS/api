<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: io/openisms/api.proto

namespace Io\Openisms\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>io.openisms.v1.SourceSystem</code>
 */
class SourceSystem extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string name = 1;</code>
     */
    protected $name = '';
    /**
     * Generated from protobuf field <code>string vendor = 2;</code>
     */
    protected $vendor = '';
    /**
     * Generated from protobuf field <code>string url = 3;</code>
     */
    protected $url = '';
    /**
     * Generated from protobuf field <code>string logo_url = 4;</code>
     */
    protected $logo_url = '';
    /**
     * Generated from protobuf field <code>.io.openisms.v1.SourceSystem.SourceType type = 5;</code>
     */
    protected $type = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *     @type string $vendor
     *     @type string $url
     *     @type string $logo_url
     *     @type int $type
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Io\Openisms\Api::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string vendor = 2;</code>
     * @return string
     */
    public function getVendor()
    {
        return $this->vendor;
    }

    /**
     * Generated from protobuf field <code>string vendor = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setVendor($var)
    {
        GPBUtil::checkString($var, True);
        $this->vendor = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string url = 3;</code>
     * @return string
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * Generated from protobuf field <code>string url = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->url = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string logo_url = 4;</code>
     * @return string
     */
    public function getLogoUrl()
    {
        return $this->logo_url;
    }

    /**
     * Generated from protobuf field <code>string logo_url = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setLogoUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->logo_url = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.SourceSystem.SourceType type = 5;</code>
     * @return int
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.SourceSystem.SourceType type = 5;</code>
     * @param int $var
     * @return $this
     */
    public function setType($var)
    {
        GPBUtil::checkEnum($var, \Io\Openisms\V1\SourceSystem\SourceType::class);
        $this->type = $var;

        return $this;
    }

}

