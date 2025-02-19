// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuminanceStoneChallengeSettleNotify.proto

package emu.grasscutter.net.proto;

public final class LuminanceStoneChallengeSettleNotifyOuterClass {
  private LuminanceStoneChallengeSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LuminanceStoneChallengeSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LuminanceStoneChallengeSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo getSettleInfo();
    /**
     * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
     */
    emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfoOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>uint32 gallery_id = 2;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 8565
   * Obf: JPGNPPEDCAP
   * </pre>
   *
   * Protobuf type {@code LuminanceStoneChallengeSettleNotify}
   */
  public static final class LuminanceStoneChallengeSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LuminanceStoneChallengeSettleNotify)
      LuminanceStoneChallengeSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LuminanceStoneChallengeSettleNotify.newBuilder() to construct.
    private LuminanceStoneChallengeSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LuminanceStoneChallengeSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LuminanceStoneChallengeSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LuminanceStoneChallengeSettleNotify(
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
            case 16: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.Builder subBuilder = null;
              if (settleInfo_ != null) {
                subBuilder = settleInfo_.toBuilder();
              }
              settleInfo_ = input.readMessage(emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(settleInfo_);
                settleInfo_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.internal_static_LuminanceStoneChallengeSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.internal_static_LuminanceStoneChallengeSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify.class, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify.Builder.class);
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo settleInfo_;
    /**
     * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfoOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 2;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 2;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(2, galleryId_);
      }
      if (settleInfo_ != null) {
        output.writeMessage(7, getSettleInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, galleryId_);
      }
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getSettleInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify other = (emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify) obj;

      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify prototype) {
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
     * <pre>
     * CmdId: 8565
     * Obf: JPGNPPEDCAP
     * </pre>
     *
     * Protobuf type {@code LuminanceStoneChallengeSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LuminanceStoneChallengeSettleNotify)
        emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.internal_static_LuminanceStoneChallengeSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.internal_static_LuminanceStoneChallengeSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify.class, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify.newBuilder()
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
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.internal_static_LuminanceStoneChallengeSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify build() {
        emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify buildPartial() {
        emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify result = new emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify(this);
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
        }
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify other) {
        if (other == emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify.getDefaultInstance()) return this;
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.Builder, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       * @return The settleInfo.
       */
      public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
          } else {
            settleInfo_ = value;
          }
          onChanged();
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
          onChanged();
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       */
      public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       */
      public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.LuminanceStoneChallengeSettleInfo settle_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.Builder, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfo.Builder, emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.LuminanceStoneChallengeSettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 2;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 2;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LuminanceStoneChallengeSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:LuminanceStoneChallengeSettleNotify)
    private static final emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify();
    }

    public static emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LuminanceStoneChallengeSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<LuminanceStoneChallengeSettleNotify>() {
      @java.lang.Override
      public LuminanceStoneChallengeSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LuminanceStoneChallengeSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LuminanceStoneChallengeSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LuminanceStoneChallengeSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LuminanceStoneChallengeSettleNotifyOuterClass.LuminanceStoneChallengeSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LuminanceStoneChallengeSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LuminanceStoneChallengeSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)LuminanceStoneChallengeSettleNotify.pr" +
      "oto\032\'LuminanceStoneChallengeSettleInfo.p" +
      "roto\"r\n#LuminanceStoneChallengeSettleNot" +
      "ify\0227\n\013settle_info\030\007 \001(\0132\".LuminanceSton" +
      "eChallengeSettleInfo\022\022\n\ngallery_id\030\002 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_LuminanceStoneChallengeSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LuminanceStoneChallengeSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LuminanceStoneChallengeSettleNotify_descriptor,
        new java.lang.String[] { "SettleInfo", "GalleryId", });
    emu.grasscutter.net.proto.LuminanceStoneChallengeSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
