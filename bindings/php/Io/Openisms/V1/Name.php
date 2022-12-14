<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: io/openisms/api.proto

namespace Io\Openisms\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>io.openisms.v1.Name</code>
 */
class Name extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string given_name = 1;</code>
     */
    protected $given_name = '';
    /**
     * Generated from protobuf field <code>string family_name = 2;</code>
     */
    protected $family_name = '';
    /**
     * Generated from protobuf field <code>string full_name = 3;</code>
     */
    protected $full_name = '';
    /**
     * Dr., Sir
     *
     * Generated from protobuf field <code>string title = 4;</code>
     */
    protected $title = '';
    /**
     * CEO, CTO
     *
     * Generated from protobuf field <code>string position = 5;</code>
     */
    protected $position = '';
    /**
     * Developer, Customer Support Agent
     *
     * Generated from protobuf field <code>string role = 6;</code>
     */
    protected $role = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $given_name
     *     @type string $family_name
     *     @type string $full_name
     *     @type string $title
     *           Dr., Sir
     *     @type string $position
     *           CEO, CTO
     *     @type string $role
     *           Developer, Customer Support Agent
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Io\Openisms\Api::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string given_name = 1;</code>
     * @return string
     */
    public function getGivenName()
    {
        return $this->given_name;
    }

    /**
     * Generated from protobuf field <code>string given_name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setGivenName($var)
    {
        GPBUtil::checkString($var, True);
        $this->given_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string family_name = 2;</code>
     * @return string
     */
    public function getFamilyName()
    {
        return $this->family_name;
    }

    /**
     * Generated from protobuf field <code>string family_name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setFamilyName($var)
    {
        GPBUtil::checkString($var, True);
        $this->family_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string full_name = 3;</code>
     * @return string
     */
    public function getFullName()
    {
        return $this->full_name;
    }

    /**
     * Generated from protobuf field <code>string full_name = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setFullName($var)
    {
        GPBUtil::checkString($var, True);
        $this->full_name = $var;

        return $this;
    }

    /**
     * Dr., Sir
     *
     * Generated from protobuf field <code>string title = 4;</code>
     * @return string
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * Dr., Sir
     *
     * Generated from protobuf field <code>string title = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setTitle($var)
    {
        GPBUtil::checkString($var, True);
        $this->title = $var;

        return $this;
    }

    /**
     * CEO, CTO
     *
     * Generated from protobuf field <code>string position = 5;</code>
     * @return string
     */
    public function getPosition()
    {
        return $this->position;
    }

    /**
     * CEO, CTO
     *
     * Generated from protobuf field <code>string position = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setPosition($var)
    {
        GPBUtil::checkString($var, True);
        $this->position = $var;

        return $this;
    }

    /**
     * Developer, Customer Support Agent
     *
     * Generated from protobuf field <code>string role = 6;</code>
     * @return string
     */
    public function getRole()
    {
        return $this->role;
    }

    /**
     * Developer, Customer Support Agent
     *
     * Generated from protobuf field <code>string role = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setRole($var)
    {
        GPBUtil::checkString($var, True);
        $this->role = $var;

        return $this;
    }

}

