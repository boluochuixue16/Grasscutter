// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeBeHelpedData.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeBeHelpedDataOuterClass {
  private FurnitureMakeBeHelpedDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeBeHelpedDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeBeHelpedData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>.ProfilePicture profilePicture = 10;</code>
     * @return Whether the profilePicture field is set.
     */
    boolean hasProfilePicture();
    /**
     * <code>.ProfilePicture profilePicture = 10;</code>
     * @return The profilePicture.
     */
    emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture();
    /**
     * <code>.ProfilePicture profilePicture = 10;</code>
     */
    emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();

    /**
     * <code>uint32 icon = 13;</code>
     * @return The icon.
     */
    int getIcon();

    /**
     * <code>fixed32 time = 4;</code>
     * @return The time.
     */
    int getTime();

    /**
     * <code>string playerName = 6;</code>
     * @return The playerName.
     */
    java.lang.String getPlayerName();
    /**
     * <code>string playerName = 6;</code>
     * @return The bytes for playerName.
     */
    com.google.protobuf.ByteString
        getPlayerNameBytes();
  }
  /**
   * Protobuf type {@code FurnitureMakeBeHelpedData}
   */
  public static final class FurnitureMakeBeHelpedData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeBeHelpedData)
      FurnitureMakeBeHelpedDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeBeHelpedData.newBuilder() to construct.
    private FurnitureMakeBeHelpedData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeBeHelpedData() {
      playerName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeBeHelpedData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FurnitureMakeBeHelpedData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 37: {

              time_ = input.readFixed32();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              playerName_ = s;
              break;
            }
            case 56: {

              uid_ = input.readUInt32();
              break;
            }
            case 82: {
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder subBuilder = null;
              if (profilePicture_ != null) {
                subBuilder = profilePicture_.toBuilder();
              }
              profilePicture_ = input.readMessage(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(profilePicture_);
                profilePicture_ = subBuilder.buildPartial();
              }

              break;
            }
            case 104: {

              icon_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.class, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 7;
    private int uid_;
    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int PROFILEPICTURE_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
    /**
     * <code>.ProfilePicture profilePicture = 10;</code>
     * @return Whether the profilePicture field is set.
     */
    @java.lang.Override
    public boolean hasProfilePicture() {
      return profilePicture_ != null;
    }
    /**
     * <code>.ProfilePicture profilePicture = 10;</code>
     * @return The profilePicture.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
      return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
    }
    /**
     * <code>.ProfilePicture profilePicture = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
      return getProfilePicture();
    }

    public static final int ICON_FIELD_NUMBER = 13;
    private int icon_;
    /**
     * <code>uint32 icon = 13;</code>
     * @return The icon.
     */
    @java.lang.Override
    public int getIcon() {
      return icon_;
    }

    public static final int TIME_FIELD_NUMBER = 4;
    private int time_;
    /**
     * <code>fixed32 time = 4;</code>
     * @return The time.
     */
    @java.lang.Override
    public int getTime() {
      return time_;
    }

    public static final int PLAYERNAME_FIELD_NUMBER = 6;
    private volatile java.lang.Object playerName_;
    /**
     * <code>string playerName = 6;</code>
     * @return The playerName.
     */
    @java.lang.Override
    public java.lang.String getPlayerName() {
      java.lang.Object ref = playerName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        playerName_ = s;
        return s;
      }
    }
    /**
     * <code>string playerName = 6;</code>
     * @return The bytes for playerName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPlayerNameBytes() {
      java.lang.Object ref = playerName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (time_ != 0) {
        output.writeFixed32(4, time_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playerName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, playerName_);
      }
      if (uid_ != 0) {
        output.writeUInt32(7, uid_);
      }
      if (profilePicture_ != null) {
        output.writeMessage(10, getProfilePicture());
      }
      if (icon_ != 0) {
        output.writeUInt32(13, icon_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (time_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(4, time_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(playerName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, playerName_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, uid_);
      }
      if (profilePicture_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getProfilePicture());
      }
      if (icon_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, icon_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData other = (emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData) obj;

      if (getUid()
          != other.getUid()) return false;
      if (hasProfilePicture() != other.hasProfilePicture()) return false;
      if (hasProfilePicture()) {
        if (!getProfilePicture()
            .equals(other.getProfilePicture())) return false;
      }
      if (getIcon()
          != other.getIcon()) return false;
      if (getTime()
          != other.getTime()) return false;
      if (!getPlayerName()
          .equals(other.getPlayerName())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (hasProfilePicture()) {
        hash = (37 * hash) + PROFILEPICTURE_FIELD_NUMBER;
        hash = (53 * hash) + getProfilePicture().hashCode();
      }
      hash = (37 * hash) + ICON_FIELD_NUMBER;
      hash = (53 * hash) + getIcon();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime();
      hash = (37 * hash) + PLAYERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code FurnitureMakeBeHelpedData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeBeHelpedData)
        emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.class, emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = 0;

        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }
        icon_ = 0;

        time_ = 0;

        playerName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData build() {
        emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData buildPartial() {
        emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData result = new emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData(this);
        result.uid_ = uid_;
        if (profilePictureBuilder_ == null) {
          result.profilePicture_ = profilePicture_;
        } else {
          result.profilePicture_ = profilePictureBuilder_.build();
        }
        result.icon_ = icon_;
        result.time_ = time_;
        result.playerName_ = playerName_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData other) {
        if (other == emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.hasProfilePicture()) {
          mergeProfilePicture(other.getProfilePicture());
        }
        if (other.getIcon() != 0) {
          setIcon(other.getIcon());
        }
        if (other.getTime() != 0) {
          setTime(other.getTime());
        }
        if (!other.getPlayerName().isEmpty()) {
          playerName_ = other.playerName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 7;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       * @return Whether the profilePicture field is set.
       */
      public boolean hasProfilePicture() {
        return profilePictureBuilder_ != null || profilePicture_ != null;
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       * @return The profilePicture.
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
        if (profilePictureBuilder_ == null) {
          return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        } else {
          return profilePictureBuilder_.getMessage();
        }
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       */
      public Builder setProfilePicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          profilePicture_ = value;
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       */
      public Builder setProfilePicture(
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder builderForValue) {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = builderForValue.build();
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       */
      public Builder mergeProfilePicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (profilePicture_ != null) {
            profilePicture_ =
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.newBuilder(profilePicture_).mergeFrom(value).buildPartial();
          } else {
            profilePicture_ = value;
          }
          onChanged();
        } else {
          profilePictureBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       */
      public Builder clearProfilePicture() {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
          onChanged();
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
        
        onChanged();
        return getProfilePictureFieldBuilder().getBuilder();
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
        if (profilePictureBuilder_ != null) {
          return profilePictureBuilder_.getMessageOrBuilder();
        } else {
          return profilePicture_ == null ?
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        }
      }
      /**
       * <code>.ProfilePicture profilePicture = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> 
          getProfilePictureFieldBuilder() {
        if (profilePictureBuilder_ == null) {
          profilePictureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder>(
                  getProfilePicture(),
                  getParentForChildren(),
                  isClean());
          profilePicture_ = null;
        }
        return profilePictureBuilder_;
      }

      private int icon_ ;
      /**
       * <code>uint32 icon = 13;</code>
       * @return The icon.
       */
      @java.lang.Override
      public int getIcon() {
        return icon_;
      }
      /**
       * <code>uint32 icon = 13;</code>
       * @param value The icon to set.
       * @return This builder for chaining.
       */
      public Builder setIcon(int value) {
        
        icon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 icon = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIcon() {
        
        icon_ = 0;
        onChanged();
        return this;
      }

      private int time_ ;
      /**
       * <code>fixed32 time = 4;</code>
       * @return The time.
       */
      @java.lang.Override
      public int getTime() {
        return time_;
      }
      /**
       * <code>fixed32 time = 4;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(int value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        
        time_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object playerName_ = "";
      /**
       * <code>string playerName = 6;</code>
       * @return The playerName.
       */
      public java.lang.String getPlayerName() {
        java.lang.Object ref = playerName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          playerName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string playerName = 6;</code>
       * @return The bytes for playerName.
       */
      public com.google.protobuf.ByteString
          getPlayerNameBytes() {
        java.lang.Object ref = playerName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          playerName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string playerName = 6;</code>
       * @param value The playerName to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        playerName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string playerName = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerName() {
        
        playerName_ = getDefaultInstance().getPlayerName();
        onChanged();
        return this;
      }
      /**
       * <code>string playerName = 6;</code>
       * @param value The bytes for playerName to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        playerName_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FurnitureMakeBeHelpedData)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeBeHelpedData)
    private static final emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData();
    }

    public static emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeBeHelpedData>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeBeHelpedData>() {
      @java.lang.Override
      public FurnitureMakeBeHelpedData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FurnitureMakeBeHelpedData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FurnitureMakeBeHelpedData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeBeHelpedData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeBeHelpedData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037FurnitureMakeBeHelpedData.proto\032\024Profi" +
      "lePicture.proto\"\201\001\n\031FurnitureMakeBeHelpe" +
      "dData\022\013\n\003uid\030\007 \001(\r\022\'\n\016profilePicture\030\n \001" +
      "(\0132\017.ProfilePicture\022\014\n\004icon\030\r \001(\r\022\014\n\004tim" +
      "e\030\004 \001(\007\022\022\n\nplayerName\030\006 \001(\tB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ProfilePictureOuterClass.getDescriptor(),
        });
    internal_static_FurnitureMakeBeHelpedData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeBeHelpedData_descriptor,
        new java.lang.String[] { "Uid", "ProfilePicture", "Icon", "Time", "PlayerName", });
    emu.grasscutter.net.proto.ProfilePictureOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
