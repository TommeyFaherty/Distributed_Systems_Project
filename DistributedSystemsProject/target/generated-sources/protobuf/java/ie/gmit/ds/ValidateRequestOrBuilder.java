// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Project.proto

package ie.gmit.ds;

public interface ValidateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ValidateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string password = 1;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 1;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>bytes hashedPass = 2;</code>
   */
  com.google.protobuf.ByteString getHashedPass();

  /**
   * <code>bytes salt = 3;</code>
   */
  com.google.protobuf.ByteString getSalt();
}
