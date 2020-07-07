// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/types/album.proto

package com.google.photos.types.proto;

public final class AlbumProto {
  private AlbumProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_photos_types_Album_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_photos_types_Album_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_photos_types_ShareInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_photos_types_ShareInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_photos_types_SharedAlbumOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_photos_types_SharedAlbumOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/photos/types/album.proto\022\023googl"
          + "e.photos.types\"\335\001\n\005Album\022\n\n\002id\030\001 \001(\t\022\r\n\005"
          + "title\030\002 \001(\t\022\023\n\013product_url\030\003 \001(\t\022\024\n\014is_w"
          + "riteable\030\004 \001(\010\0222\n\nshare_info\030\005 \001(\0132\036.goo"
          + "gle.photos.types.ShareInfo\022\031\n\021media_item"
          + "s_count\030\006 \001(\003\022\034\n\024cover_photo_base_url\030\007 "
          + "\001(\t\022!\n\031cover_photo_media_item_id\030\010 \001(\t\"\270"
          + "\001\n\tShareInfo\022E\n\024shared_album_options\030\001 \001"
          + "(\0132\'.google.photos.types.SharedAlbumOpti"
          + "ons\022\025\n\rshareable_url\030\002 \001(\t\022\023\n\013share_toke"
          + "n\030\003 \001(\t\022\021\n\tis_joined\030\004 \001(\010\022\020\n\010is_owned\030\005"
          + " \001(\010\022\023\n\013is_joinable\030\006 \001(\010\"F\n\022SharedAlbum"
          + "Options\022\030\n\020is_collaborative\030\001 \001(\010\022\026\n\016is_"
          + "commentable\030\002 \001(\010Bg\n\035com.google.photos.t"
          + "ypes.protoB\nAlbumProtoP\001Z8google.golang."
          + "org/genproto/googleapis/photos/types;typ"
          + "esb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_photos_types_Album_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_photos_types_Album_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_photos_types_Album_descriptor,
            new java.lang.String[] {
              "Id",
              "Title",
              "ProductUrl",
              "IsWriteable",
              "ShareInfo",
              "MediaItemsCount",
              "CoverPhotoBaseUrl",
              "CoverPhotoMediaItemId",
            });
    internal_static_google_photos_types_ShareInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_photos_types_ShareInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_photos_types_ShareInfo_descriptor,
            new java.lang.String[] {
              "SharedAlbumOptions",
              "ShareableUrl",
              "ShareToken",
              "IsJoined",
              "IsOwned",
              "IsJoinable",
            });
    internal_static_google_photos_types_SharedAlbumOptions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_photos_types_SharedAlbumOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_photos_types_SharedAlbumOptions_descriptor,
            new java.lang.String[] {
              "IsCollaborative", "IsCommentable",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
