package com.dempe.forest.core;


/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/11/30
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public class ExtendUtil {


    public static byte getExtend(SerializeType serializeType, CompressType invokeType, MessageType messageType) {
        return (byte) (serializeType.getValue() | invokeType.getValue() | messageType.getValue());

    }

}
