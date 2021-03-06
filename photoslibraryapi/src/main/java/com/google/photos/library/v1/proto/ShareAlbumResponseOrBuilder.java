// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ShareAlbumResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ShareAlbumResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Information about the shared album.
   * </pre>
   *
   * <code>.google.photos.types.ShareInfo share_info = 1;</code>
   *
   * @return Whether the shareInfo field is set.
   */
  boolean hasShareInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information about the shared album.
   * </pre>
   *
   * <code>.google.photos.types.ShareInfo share_info = 1;</code>
   *
   * @return The shareInfo.
   */
  com.google.photos.types.proto.ShareInfo getShareInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information about the shared album.
   * </pre>
   *
   * <code>.google.photos.types.ShareInfo share_info = 1;</code>
   */
  com.google.photos.types.proto.ShareInfoOrBuilder getShareInfoOrBuilder();
}
