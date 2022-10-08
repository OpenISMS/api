<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: io/openisms/api.proto

namespace Io\Openisms\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>io.openisms.v1.Meta</code>
 */
class Meta extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp created = 1;</code>
     */
    protected $created = null;
    /**
     * Generated from protobuf field <code>string identifier = 2;</code>
     */
    protected $identifier = '';
    /**
     * Generated from protobuf field <code>string etag = 3;</code>
     */
    protected $etag = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Protobuf\Timestamp $created
     *     @type string $identifier
     *     @type string $etag
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Io\Openisms\Api::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp created = 1;</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getCreated()
    {
        return $this->created;
    }

    public function hasCreated()
    {
        return isset($this->created);
    }

    public function clearCreated()
    {
        unset($this->created);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp created = 1;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setCreated($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->created = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string identifier = 2;</code>
     * @return string
     */
    public function getIdentifier()
    {
        return $this->identifier;
    }

    /**
     * Generated from protobuf field <code>string identifier = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setIdentifier($var)
    {
        GPBUtil::checkString($var, True);
        $this->identifier = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string etag = 3;</code>
     * @return string
     */
    public function getEtag()
    {
        return $this->etag;
    }

    /**
     * Generated from protobuf field <code>string etag = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setEtag($var)
    {
        GPBUtil::checkString($var, True);
        $this->etag = $var;

        return $this;
    }

}
