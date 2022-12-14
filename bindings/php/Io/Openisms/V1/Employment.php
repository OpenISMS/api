<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: io/openisms/api.proto

namespace Io\Openisms\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>io.openisms.v1.Employment</code>
 */
class Employment extends \Google\Protobuf\Internal\Message
{
    /**
     * full-time, intern, consultant
     *
     * Generated from protobuf field <code>string contract = 1;</code>
     */
    protected $contract = '';
    /**
     * candidate, hired, active, hiatus, terminated, left
     *
     * Generated from protobuf field <code>string status = 2;</code>
     */
    protected $status = '';
    /**
     * Generated from protobuf field <code>.io.openisms.v1.Date begin = 3;</code>
     */
    protected $begin = null;
    /**
     * Generated from protobuf field <code>.io.openisms.v1.Date end = 4;</code>
     */
    protected $end = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $contract
     *           full-time, intern, consultant
     *     @type string $status
     *           candidate, hired, active, hiatus, terminated, left
     *     @type \Io\Openisms\V1\Date $begin
     *     @type \Io\Openisms\V1\Date $end
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Io\Openisms\Api::initOnce();
        parent::__construct($data);
    }

    /**
     * full-time, intern, consultant
     *
     * Generated from protobuf field <code>string contract = 1;</code>
     * @return string
     */
    public function getContract()
    {
        return $this->contract;
    }

    /**
     * full-time, intern, consultant
     *
     * Generated from protobuf field <code>string contract = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setContract($var)
    {
        GPBUtil::checkString($var, True);
        $this->contract = $var;

        return $this;
    }

    /**
     * candidate, hired, active, hiatus, terminated, left
     *
     * Generated from protobuf field <code>string status = 2;</code>
     * @return string
     */
    public function getStatus()
    {
        return $this->status;
    }

    /**
     * candidate, hired, active, hiatus, terminated, left
     *
     * Generated from protobuf field <code>string status = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setStatus($var)
    {
        GPBUtil::checkString($var, True);
        $this->status = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.Date begin = 3;</code>
     * @return \Io\Openisms\V1\Date|null
     */
    public function getBegin()
    {
        return $this->begin;
    }

    public function hasBegin()
    {
        return isset($this->begin);
    }

    public function clearBegin()
    {
        unset($this->begin);
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.Date begin = 3;</code>
     * @param \Io\Openisms\V1\Date $var
     * @return $this
     */
    public function setBegin($var)
    {
        GPBUtil::checkMessage($var, \Io\Openisms\V1\Date::class);
        $this->begin = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.Date end = 4;</code>
     * @return \Io\Openisms\V1\Date|null
     */
    public function getEnd()
    {
        return $this->end;
    }

    public function hasEnd()
    {
        return isset($this->end);
    }

    public function clearEnd()
    {
        unset($this->end);
    }

    /**
     * Generated from protobuf field <code>.io.openisms.v1.Date end = 4;</code>
     * @param \Io\Openisms\V1\Date $var
     * @return $this
     */
    public function setEnd($var)
    {
        GPBUtil::checkMessage($var, \Io\Openisms\V1\Date::class);
        $this->end = $var;

        return $this;
    }

}

