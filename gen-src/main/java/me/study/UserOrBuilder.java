// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package me.study;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();
}
